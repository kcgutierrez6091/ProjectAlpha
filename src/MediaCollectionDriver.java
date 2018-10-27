/***
 * Author: Kyara Cruz Gutierrez
 * Date: 27 October 2018
 * FILE: MediaCollectionDriver
 * About: ###Steps 13, 14, 15, 16### Create a driver class that
 * will demonstrate that any class that implements the MultimediaControl Interface would be able to be
 * instantiated and use its methods used no matter if it was an audio or movie player.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MediaCollectionDriver {

    private static void print(List<Product> list) {
        for (Product p : list) {
            System.out.println(p + "\n");
        }
    }

    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<Product>();

        list.add(new AudioPlayer("my audio player 3", "audio spec1", ItemType.AUDIO));
        list.add(new MoviePlayer("my movie player 3"));

        list.add(new AudioPlayer("my audio player 1", "audio spec1", ItemType.AUDIO));
        list.add(new MoviePlayer("my movie player 1", new Screen("1024x768", 70, 20), MonitorType.LED));

        list.add(new AudioPlayer("my audio player 2", "audio spec1", ItemType.AUDIO));
        list.add(new MoviePlayer("my movie player 2"));
        // Collection sort method that shows its uses
        Collections.sort(list);

        print(list);

    }
}