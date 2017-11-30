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

                    break;
                case 3 :

                    break;
                default :
                    break;
            }
        } while (choice != 0);
//        System.out.print(promptUser(input));
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
    public static int promptUser(Scanner input) {
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
    public static void reverse(Scanner input) {
//        System.out.println("in Reverse method"); // TODO remove debugging statement
        String wavFile;
        ArrayList<Double> samples;
        WavFile origFile;
        String origName;
        WavFile revFile;
        String newName;

        System.out.print("Enter a filename (without the .wav extension): ");
        origName = input.next();
        newName = origName + "Rev.wav";
        wavFile = origName + ".wav";
        origFile = new WavFile(wavFile);
        samples = origFile.getSamples();
        Collections.reverse(samples);
        revFile = new WavFile(newName, origFile.getNumChannels(), origFile.getNumFrames(), origFile.getValidBits(), origFile.getSampleRate());
        revFile.setSamples(samples);
        revFile.close();
    }




}
