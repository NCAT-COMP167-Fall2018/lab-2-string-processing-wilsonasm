/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringprocessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Lobo
 */
public class StringProcessing {
    
    public static void fileReader(String filename, String[] records)
    {
        System.out.print("FIXME");
    }
    public static String valFirst(String recFirst)
    {
        String upperVal= recFirst.toUpperCase();
        if upperVal
    }
    public static void displayData(String []records)
    {
        for (String record : records) {
            System.out.println(record);
        }
    }
        
    public static void lineParse()
    {
        String[] recordList;
        System.out.print ("FIXME");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String file= "records.txt";
        String[] records= new String [100];
        try 
        {
            Scanner reader =new Scanner(new File(args[0]));
            int currIndex=0;
            while(reader.hasNext())
            {
                String[] line = reader.nextLine().split(",");
                String recFirst=line[0];
                String recLast=line[1];
                String recGender=line[2];
                String recAge=line[3];
                String recPhone=line[4];
                String recEmail=line[5];
                
                records[currIndex]=String.format("%-20s%-20s%20s%20s%20s%30s",recFirst,recLast,recGender,recAge,recPhone,recEmail);
                /*if(validFirst(recFirst))
                {
                    System.out.println(records[currIndex]);
                }*/
                System.out.println(records[currIndex]);
                currIndex++;
                
            }
        }
        catch (FileNotFoundException ex) 
        {
            System.err.println("Unable to read file");
        }
        
        
        
    }
    
}
