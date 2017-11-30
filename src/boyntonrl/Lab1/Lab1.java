package boyntonrl.Lab1;

import edu.msoe.taylor.audio.WavFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab1 {
    private static Scanner input = new Scanner(System.in);
    private static int choice;

    public static void main(String[] args) {
        do {
            choice = promptUser(input);
            switch (choice) {
                case 1 :
                    reverse(input);
                    break;
                case 2 :
                    toneAtFrequency(input);
                    break;
                case 3 :
                    toneAtFrequencyStereo(input);
                    break;
                default :
                    break;
            }
        } while (choice != 0);
    }

    /**
     * Method to prompt user, asking their choice of 4 possible options:
     * 0. Exit
     * 1. Create a reversed .wav file
     * 2. Create a new .wav file containing one second of audio at a given frequency
     * 3. Create  a new .wav file containing one second of audio in stereo
     * @param input Scanner object
     * @return the option the user chose as an integer
     */
    private static int promptUser(Scanner input) {
        int choice;
        String options = "Options: \n" +
                "\t0. Exit\n" +
                "\t1. Create a reversed .wav file\n" +
                "\t2. Create a new .wav file containing one second of audio at a given frequency\n" +
                "\t3. Create  a new .wav file containing one second of audio in stereo\n" + // Optional... do if you have time
                "Enter the number of the option you wish to choose: ";
        System.out.print(options);
        choice = input.nextInt();
        return choice;
    }

    /**
     * Method to create a separate .wav file with all of the audio samples placed in reverse order.
     * @param input Scanner object
     */
    private static void reverse(Scanner input) {
        String wavFile; // name with extension
        ArrayList<Double> samples;
        WavFile origFile;
        String origName;
        WavFile revFile;
        String newName; // adds "Rev" and extension (".wav") to new file name

        System.out.print("Enter a filename (without the .wav extension): ");
        origName = input.next();
        wavFile = origName + ".wav";
        newName = origName + "Rev.wav";
        origFile = new WavFile(wavFile);
        samples = origFile.getSamples();
        Collections.reverse(samples); //
        revFile = new WavFile(newName, origFile.getNumChannels(), origFile.getNumFrames(),
                origFile.getValidBits(), origFile.getSampleRate());
        revFile.setSamples(samples);
        revFile.close();
    }

    private static void toneAtFrequency(Scanner input) {
        ArrayList<Double> samples = new ArrayList<>();
        String wavFile;
        String name;
        double frequency;
        WavFile file;

        System.out.print("Enter a filename (without the .wav extension): ");
        name = input.next();
        wavFile = name + ".wav";
        file = new WavFile(wavFile, 2, 29016, 16, 22050);
        System.out.print("Enter a frequency: ");
        frequency = input.nextDouble();
        for (int i = 0; i < file.getSampleRate(); ++i) {
            samples.add(Math.sin((2*Math.PI * i * (frequency/file.getSampleRate()))));
        }
        file.setSamples(samples);
        file.close();
    }

    private static void toneAtFrequencyStereo(Scanner input) {
        ArrayList<Double> samples = new ArrayList<>();
        String wavFile;
        String name;
        double frequency1;
        double frequency2;
        WavFile file;

        System.out.print("Enter a filename (without the .wav extension): ");
        name = input.next();
        wavFile = name + ".wav";
        file = new WavFile(wavFile, 2, 29016, 16, 22050);
        System.out.print("Enter a frequency: ");
        frequency1 = input.nextDouble();
        System.out.print("Enter a frequency: ");
        frequency2 = input.nextDouble();
        for (int i = 0; i < file.getSampleRate(); ++i) {
            if (i%2 == 0) {
                samples.add(Math.sin((2 * Math.PI * i * (frequency1 / file.getSampleRate()))));
            } else if (i%2 == 1) {
                samples.add(Math.sin((2 * Math.PI * i * (frequency2 / file.getSampleRate()))));
            }
        }
        file.setSamples(samples);
        file.close();
    }


}
