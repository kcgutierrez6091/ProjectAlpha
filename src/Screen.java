/***
 * Author: Kyara Cruz Gutierrez
 * Date: 27 October 2018
 * FILE: Screen
 * About: ###Steps 9### Create a class called Screen that implements ScreenSpec. Add three fields
 * String resolution
 * int refreshrate
 * int responsetime
 * Complete the methods from the ScreenSpec interface. Add a toString method that will return the details of the
 * 3 field in the same format as the Product Class.
 */

public class Screen implements ScreenSpec {

    protected String resolution;

    protected int refreshrate;

    protected int responsetime;



    public Screen(String resolution, int refreshrate, int responsetime)

    {

        this.resolution = resolution;

        this.refreshrate = refreshrate;

        this.responsetime = responsetime;

    }

    @Override

    public String getResolution() {

        return resolution;

    }

    @Override

    public int getRefreshRate() {

        return refreshrate;

    }

    @Override

    public int getResponseTime() {

        return responsetime;

    }

    public String toString()

    {

        return "Resolution: " + resolution + "\n" +

                "Refresh Rate: " + refreshrate + "\n" +

                "Response Time: " + responsetime ;

    }

}