/***
 * Author: Kyara Cruz Gutierrez
 * Date: 29 September 2018
 * FILE: Item.java
 * This interface called Item that will force all classes to implement the following functions.
 */

import java.util.Date;

public interface Item {

    //A constant called manufacturer that would be set to “OracleProduction”
    final String manufacturer = "OracleProduction";

    //@param productionmember


    //A method setProductionNumber that would have one integer parameter
    public void setCurrentProductionNumber(int productionNumber);

    //A method setName that would have one String parameter
    public void setName(String na);

    //A method getName that would return a String
    public String getName();

    //A method getManufactureDate that would return a Date
    public Date getManufactureDate();


    //A method getSerialNumber that would return an int
    public int getSerialNumber();
}