package music;

/**
 * Created by lazar on 17.03.2021.
 * Project name: workspace.xml
 **/
public class Menu {
    private static int chose;
    private static String[] menuItems = {
            "  [1] Print out list of available songs  ",
            "  [2] Play song   ",
            "  [3] Check if song is available   ",
            "  [4] Add music files   ",
            "  [5] Exit program   "
    };

    private static int findLargestElement() {
        int max = menuItems[0].length();
        for (int i = 1; i < menuItems.length; i++) {
            if (menuItems[i].length() > max) {
                max = menuItems[i].length();
            }
        }
        return max;
    }

    public static void displayMainMenu(MusicOrganizer musicOrganizer) {
        int size = findLargestElement();
        while (true) {
            for (int i = 0; i < menuItems.length; i++) {
                OutputUtils.drawBoxSurroundingElements(menuItems[i], size);
            }
            System.out.println("\n\nChoose: ");
            chose = InputUtils.chooseMenuNumber();
            switch (chose) {
                case 1:
                    musicOrganizer.listAllFiles();
                    break;
                case 2:
                    try {
                        musicOrganizer.listAllFiles();
                        System.out.println("Select a song: ");
                        int chose = InputUtils.chooseMenuNumber();
                        musicOrganizer.startPlaying(chose - 1);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("Check if a song is available (by path, e.g audio/song1.mp3): ");
                    String chose = InputUtils.readString();
                    if (musicOrganizer.listMatching(chose)) {
                        System.out.println("Song available");
                    } else {
                        System.out.println("Song not available");
                    }
                    break;
                case 4:
                    System.out.println("Add new song");
                    musicOrganizer.addFile(musicOrganizer.askForArtist(), musicOrganizer.askForTitle(), musicOrganizer.askForFilename());
                    System.out.println("File added successfully");
                    break;
                case 5:
                    System.out.println("Program terminating...");
                    System.exit(0);
                    break;
            }
        }
    }


    public Menu() {
    }
}
