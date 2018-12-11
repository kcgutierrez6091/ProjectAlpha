/***
 * Author: Kyara Cruz Gutierrez
 * Date: 10 December 2018
 * FILE: ProcessFilesDriver
 */


import java.io.FileReader;

public class ProcessFilesDriver {
    public static void main(String[] args) {
        try {
            FileReader fr =
                    new FileReader("C:\\LineTests\\TestResults.txt");

            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception ex) {
            System.out.println("ERROR: File reader failed");
        }
    }
}





