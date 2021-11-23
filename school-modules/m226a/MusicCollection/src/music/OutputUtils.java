package music;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

/**
 * Created by lazar on 17.03.2021.
 * Project name: 20210317-estheticOutput
 */

public class OutputUtils {
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_YELLOW = "\u001B[33m";

    public static void printArrayOfStringsAsList(String bulletpoint, boolean isOrderedList, String[] stringArrayValue) {
        if (isOrderedList) {
            for (int i = 1; i <= stringArrayValue.length; i++) {
                System.out.println(i + " " + stringArrayValue[i - 1]);
            }
        } else {
            for (String s : stringArrayValue) {
                System.out.println(bulletpoint + " " + s);
            }
        }
    }

    public static void drawBoxSurroundingElements(String stringValue, int boxSize) {
        if (stringValue.length() > boxSize) {
            boxSize = stringValue.length();
        }
        System.out.print("\n▛");
        for (int i = 0; i < boxSize; i++) {
            System.out.print("▀");
        }
        System.out.println("▜");
        System.out.print("▍");
        for (int i = 0; i < (boxSize - stringValue.length()) / 2; i++) {
            System.out.print(" ");
        }
        System.out.print(stringValue);
        for (int i = 0; i < (boxSize - stringValue.length()) / 2; i++) {
            System.out.print(" ");
        }
        if (stringValue.length() % 2 == 1 && boxSize % 2 == 0) {
            System.out.print(" ");
        }
        if (stringValue.length() < 5 && boxSize % 2 != 0) {
            System.out.print(" ");
        }
        System.out.println("▐");
        System.out.print("▙");
        for (int i = 0; i < boxSize; i++) {
            System.out.print("▃");
        }
        System.out.print("▟");
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void printCongratulationsMessage() {
        System.out.println(TEXT_RED +
                "██╗   ██╗ ██████╗ ██╗   ██╗\n" +
                "╚██╗ ██╔╝██╔═══██╗██║   ██║\n" +
                " ╚████╔╝ ██║   ██║██║   ██║\n" +
                "  ╚██╔╝  ██║   ██║██║   ██║\n" +
                "   ██║   ╚██████╔╝╚██████╔╝\n" +
                "   ╚═╝    ╚═════╝  ╚═════╝ " + TEXT_RESET);
        sleep(700);

        System.out.println(TEXT_YELLOW +
                " ██╗    ██╗██╗███╗   ██╗\n" +
                "██║    ██║██║████╗  ██║\n" +
                "██║ █╗ ██║██║██╔██╗ ██║\n" +
                "██║███╗██║██║██║╚██╗██║\n" +
                "╚███╔███╔╝██║██║ ╚████║\n" +
                " ╚══╝╚══╝ ╚═╝╚═╝  ╚═══╝" + TEXT_RESET);
        sleep(800);
    }

    private OutputUtils() {
    } // prevents creating instances
}
