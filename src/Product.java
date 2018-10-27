/***
 * Author: Kyara Cruz Gutierrez
 * Date: 29 September 2018
 * Updated: 27 October 2018
 * FILE: Product.java
 * Product implements the Item interface.  Product will implement the basic functionality that all items on a
 * production line should have.
 */
import java.util.Date;



//This will store the next number to be assigned to serialNumber.
public abstract class Product implements Item, Comparable<Item> {

    protected int serialNumber;
    protected String manufacturer = Item.manufacturer;
    protected Date manufacturedOn;
    protected String name;

   private static int currentProductionNumber = 1;


    /**Add a constructor that will take in the name of the product and set this to the field variable name. You
    will also assign a serial number from the currentProductionNumber. The currentProductionNumber
    should be incremented in readiness for the next instance.
     Set manufacturedOn as the current date and time.
    */

    public Product (String name) {
        setName(name);


        //Add an integer class variable called currentProductionNumber. This will store the next number to be
        //assigned to serialNumber.
        serialNumber = currentProductionNumber++; //unary operator

        //manufacturer = MANUFACTURER;


        //Set manufacturedOn as the current date and time.
        manufacturedOn = new Date(System.currentTimeMillis());

    }
    @Override

    public void setCurrentProductionNumber(int productionNumber) {

        serialNumber = productionNumber;

    }
    @Override
    public void setName(String name){

        this.name = name;

    }
    @Override
    public String getName() {
        return name;
    }

    public Date getManufactureDate(){
        return manufacturedOn;
    }

    @Override
    public int getSerialNumber(){

        return serialNumber;

    }

    //Add a toString method that will return the following
    public String toString(){

        return  "Manufacturer : " + manufacturer + "\n "
                + "Serial Number : " + serialNumber + "\n"
                + "Date : " + manufacturedOn + "\n"
                + "Name : " + name;



    }
        //step 14: comparing names
        @Override
        public int compareTo(Item o) {

            return name.compareTo(o.getName());

        }
}