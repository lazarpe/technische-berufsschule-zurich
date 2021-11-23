package music;

import java.util.Scanner;

/**
 * Created by lazar on 17.03.2021.
 * Project name: 20210317-estheticOutput
 **/
public class InputUtils {
    private static int chose;
    private static Scanner sc = new Scanner(System.in);
    private static Scanner stringSc = new Scanner(System.in);

    public static String readString() {
        return stringSc.nextLine();
    }

    public static int chooseMenuNumber() {
        chose = sc.nextInt();
        return chose;
    }

    private InputUtils() {
    } // prevents creating instances
}
