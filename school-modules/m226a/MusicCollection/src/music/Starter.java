package music;

public class Starter {

	public static void main(String[] args) {
		final String defaultFile = "audio/defaultSong.mp3";
		MusicPlayer musicPlayer = new MusicPlayer();
		MusicOrganizer musicOrganizer = new MusicOrganizer();

		musicOrganizer.addFile("Creative Dude", "Default song", defaultFile);
		musicOrganizer.listAllFiles();
		Menu.displayMainMenu(musicOrganizer);
	}
} 
