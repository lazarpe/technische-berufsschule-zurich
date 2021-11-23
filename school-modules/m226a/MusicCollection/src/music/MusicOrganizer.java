package music;

import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Koelling
 *
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<Track> files;
    // A player for the music files.
    private MusicPlayer player;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<Track>();
        player = new MusicPlayer();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String artist, String title, String filename)
    {
        files.add(new Track(artist, title, filename));
        System.out.println(filename + " added to list of songs");
    }

    public String askForArtist() {
        System.out.println("Who is the artist?");
        return InputUtils.readString();
    }

    public String askForTitle() {
        System.out.println("What is the title?");
        return InputUtils.readString();
    }

    public String askForFilename() {
        System.out.println("What is the filename?");
        return InputUtils.readString();
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            String filename = files.get(index).getFilename();
            System.out.println(filename);
        }
    }

    public void listAllFiles() {
        System.out.println("Lis of all files:");
        int counter = 1;
        for (Track song : files) {
            System.out.println(counter + ") " +song.getTitle());
            counter++;
        }
    }

    /**
     * This method checks if wished song path is available in arraylist by userinput.
     */
    public boolean listMatching(String userInput) {
        //return files.contains(userInput);
        for (Track track : files) {
            if (track.getFilename().equals(userInput)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Find the index of the first file matching the given
     * search string.
     * @param searchString The string to match.
     * @return The index of the first occurrence, or -1 if
     *         no match is found.
     */
    public int findFirst(String searchString)
    {
        int index = 0;
        // Record that we will be searching until a match is found.
        boolean searching = true;
    
        while(searching && index < files.size()) {
            String filename = files.get(index).getFilename();
            if(filename.contains(searchString)) {
                // A match. We can stop searching.
                searching = false;
            }
            else {
                // Move on.
                index++;
            }
        }
        if(searching) {
            // We didn�t find it.
            return -1;
        }
        else {
            // Return where it was found.
            return index;
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        String filename = files.get(index).getFilename();
        player.startPlaying(filename);
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }

    public MusicPlayer getPlayer() {
        return player;
    }

    public void setPlayer(MusicPlayer player) {
        this.player = player;
    }
}
