package audioplayer;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class MainAudioPlayer {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		// audio player project
		
		// audio code
		File fileAudio = new File("Never Surrender - Anno Domini Beats.wav");
		AudioInputStream audio = AudioSystem.getAudioInputStream(fileAudio);
		Clip clip = AudioSystem.getClip();
		clip.open(audio);
		
		// user input
		Scanner userInput = new Scanner(System.in);
		String userResponse = "";
		
		while (!userResponse.equals("Q")) {
			System.out.println("Audio player:");
			System.out.println("Play (P) | Stop (S) | Reset(R) | Quit (Q)");
			
			System.out.print("Choice: ");
			userResponse = userInput.next();
			userResponse = userResponse.toUpperCase();
			
			switch (userResponse) {
			case "P":
				clip.start();
				System.out.println("Audio playing");
				break;
			case "S":
				clip.stop();
				System.out.println("Audio stop playing");
				break;
			case "R":
				clip.setMicrosecondPosition(0);
				System.out.println("Audio play at the start again");
				break;
			case "Q":
				clip.stop();
				System.out.println("Thank you for using the audio player program");
				break;

			default:
				System.out.println("Invalid response, try again with key letter");
				break;
			}
		}
		
	}

}
