/***
 * Author: Kyara Cruz Gutierrez
 * Date: 27 October 2018
 * FILE: MediaCollectionDemo
 * About: ###Steps 11### Create a class called MoviePlayer that extends Product and implements MultimediaControl.
 * Add 2 fields to this class called screen and monitor type and assign appropriate types to them.
 * Complete the methods from the MultimediaControl interface in a similar fashion to the audio player.
 * Create a toString method that calls the product toString, displays the monitor and the screen details.
 */

public class MoviePlayer extends Product implements MultimediaControl, Comparable<Item>{

    private Screen screen;

    private MonitorType montiorType;

    public MoviePlayer(String name)

    {

        super(name);

        screen = new Screen("1024x768", 60, 10);

        montiorType = MonitorType.LCD;



    }



    public MoviePlayer(String name, Screen screen, MonitorType type)

    {

        super(name);

        this.screen = screen;

        this.montiorType = type;

    }



    @Override

    public void play() {

        System.out.println("Playing Movie");

    }

    @Override

    public void stop() {

        System.out.println("Movie Stopped");

    }

    @Override

    public void previous() {

        System.out.println("Previous Movie");

    }

    @Override

    public void next() {

        System.out.println("Next Movie");

    }







    public String toString()

    {

        return super.toString() +"\n" +

                screen.toString() + "\n" +

                "Monitor Type: "+montiorType;

    }



}