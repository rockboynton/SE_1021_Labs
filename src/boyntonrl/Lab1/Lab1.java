/*
 * SE1021-021
 * Winter 2017-18
 * Lab 1 - WavFile
 * Name: Rock Boynton
 * Created: 11/29/17
 */

package boyntonrl.Lab1;

import edu.msoe.taylor.audio.WavFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            choice = promptUser(input);
            switch (choice) {
                case 1 :
                    choice1(input);
                    break;
                case 2 :
                    choice2(input);
                    break;
                case 3 :
                    choice3(input);
                    break;
                default :
                    break;
            }
        } while (choice != 0);
    }

    /**
     * Method to prompt user, asking their choice of 4 possible options:
     * 1. Create a reversed .wav file
     * 2. Create a new .wav file containing one second of audio at a given frequency
     * 3. Create  a new .wav file containing one second of audio in stereo
     * 0. Exit
     * @param input Scanner object
     * @return the option the user chose as an integer
     */
    private static int promptUser(Scanner input) {
        int choice;
        String options = "Options: \n" +
                "\t1. Create a reversed .wav file\n" +
                "\t2. Create a new .wav file containing one second of audio at a given frequency\n" +
                "\t3. Create  a new .wav file containing one second of audio in stereo\n" +
                "\t0. Exit\n" +
                "Enter the number of the option you wish to choose: ";
        System.out.print(options);
        choice = input.nextInt();
        return choice;
    }

    private static void choice1(Scanner input) {
        String name;

        name = inputFileName(input);
        reverse(name);
    }

    private static void choice2(Scanner input) {
        String name;
        double frequency;

        name = inputFileName(input);
        frequency = inputFrequency(input);
        toneAtFrequency(name, frequency);
    }

    private static void choice3(Scanner input) {
        String name;
        double leftFrequency;
        double rightFrequency;

        name = inputFileName(input);
        System.out.print("What do you want the left speaker frequency to be? ");
        leftFrequency = inputFrequency(input);
        System.out.print("What do you want the right speaker frequency to be? ");
        rightFrequency = inputFrequency(input);
        toneAtFrequencyStereo(name, leftFrequency, rightFrequency);
    }


    /**
     * Method to create a separate .wav file with all of the audio samples placed in reverse order.
     * The new file is named "(originalName)Rev.wav"
     * @param name of file inputted by user without the .wav extension to be read and reversed
     */
    private static void reverse(String name) {
        String wavFile; // name with extension
        ArrayList<Double> samples;
        WavFile origFile; // original file to be read
        WavFile revFile; // reversed file to be written
        String newName; // adds "Rev" and extension (".wav") to new file name
        wavFile = name + ".wav";
        newName = name + "Rev.wav";
        origFile = new WavFile(wavFile); // reads the original .wav file
        samples = origFile.getSamples();
        Collections.reverse(samples);
        revFile = new WavFile(newName, origFile.getNumChannels(), origFile.getNumFrames(), // creates new .wav file
                origFile.getValidBits(), origFile.getSampleRate());
        revFile.setSamples(samples);
        revFile.close();
    }

    /**
     * Simple method to get the name of a file from the user without the .wav extension
     * @param input Scanner object
     * @return name of a file without the .wav extension
     */
    private static String inputFileName (Scanner input) {
        System.out.print("Enter a filename (without the .wav extension): ");
        return input.next();
    }

    /**
     * Method to create a 1 second .wav file at a specified frequency
     * @param name of file to be written without the .wav extension
     * @param frequency of the new file
     */
    private static void toneAtFrequency(String name, double frequency) {
        ArrayList<Double> samples = new ArrayList<>();
        String wavFile;
        WavFile file;
        wavFile = name + ".wav";
        file = new WavFile(wavFile, 2, 29016, 16, 22050);
        for (int i = 0; i < file.getSampleRate(); ++i) {
            // formula to generate sin wave at the specified frequency
            samples.add(Math.sin((2*Math.PI * i * (frequency/file.getSampleRate()))));
        }
        file.setSamples(samples);
        file.close();
    }

    /**
     * Simple method to get a frequency value from the user.
     * @param input Scanner object
     * @return frequency value, as a double
     */
    private static double inputFrequency (Scanner input) {
        System.out.print("Enter a frequency: ");
        return input.nextDouble();
    }

    /**
     * Method to create a 1 second .wav file in stereo at the specified frequency
     * @param name name of file to be written, without the .wav extension
     * @param leftFrequency left speaker frequency
     * @param rightFrequency right speaker frequency
     */
    private static void toneAtFrequencyStereo(String name, double leftFrequency, double rightFrequency) {
        ArrayList<Double> samples = new ArrayList<>();
        String wavFile;
        WavFile file;

        wavFile = name + ".wav";
        file = new WavFile(wavFile, 2, 29016, 16, 22050);
        for (int i = 0; i < file.getSampleRate(); ++i) {
            if (i%2 == 0) {
                samples.add(Math.sin((2 * Math.PI * i * (leftFrequency / file.getSampleRate()))));
            } else if (i%2 == 1) {
                samples.add(Math.sin((2 * Math.PI * i * (rightFrequency / file.getSampleRate()))));
            }
        }
        file.setSamples(samples);
        file.close();
    }

}
