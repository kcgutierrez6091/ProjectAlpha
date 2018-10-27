/***
 * Author: Kyara Cruz Gutierrez
 * Date: 29 September 2018
 * Updated: 27 October 2018
 * FILE: AudioPlayer
 * About: ##STEP 5## We require a concrete class that will allow us to capture the details of an audio player. Create a class
 * called AudioPlayer that is a subclass of Product and implements the MultimediaControl interface.
 */


public class AudioPlayer extends Product implements MultimediaControl {

    protected String audioSpecification;

    protected ItemType mediaType;




    public AudioPlayer(String name, String specification, ItemType mediaType) {


        super(name);

        audioSpecification = specification;

        this.mediaType = mediaType;

    }

    @Override

    public void play() {

        System.out.println("Playing");

    }

    @Override

    public void stop() {

        System.out.println("Stopped");

    }

    @Override

    public void previous() {

        System.out.println("Previous");

    }

    @Override

    public void next() {

        System.out.println("Next");

    }



    public String toString()

    {

        String str = super.toString() + "\n" ;

        str += "Audio Specification: " + audioSpecification + "\n" + "Type: " + mediaType ;

        return str;

    }



}