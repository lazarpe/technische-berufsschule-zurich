package music;

/**
 * Created by lazar on 07.09.2021.
 * Project name: MusicCollection
 **/
public class Track {
    private String artist;
    private String title;
    private String filename;

    public Track(String artist, String title, String filename) {
        this.artist = artist;
        this.title = title;
        this.filename = filename;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
