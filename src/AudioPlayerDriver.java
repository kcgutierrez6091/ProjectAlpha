/***
 * Author: Kyara Cruz Gutierrez
 * Date: 29 September 2018
 * Updated: 27 October 2018
 * FILE: AudioPlayerDriver.java
 * About: ###STEP 6## Create a driver class for AudioPlayer that will test to see whether we can instantiate occurrences of it, use
 * the media controls and print out their details to the console.
 */

public class AudioPlayerDriver {

    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer("myplayer", "myspec",ItemType.AUDIO);
        System.out.println("Created an audio player and calling methods..");
        System.out.println(player);
        player.play();
        player.previous();
        player.next();
        player.stop();
    }
}