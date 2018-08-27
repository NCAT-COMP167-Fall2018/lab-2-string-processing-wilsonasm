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
        int currIndex=0;
        /*String[] recFirst=new String[records.length];
        String[] recLast=new String[records.length];
        String[] recGender=new String[records.length];
        int[] recAge=new int[records.length];
        String[] recPhone=new String[records.length];*/
        String[] recEmail=new String[records.length];
        try {
            Scanner reader =new Scanner(new File(filename));
            

            while(reader.hasNext())
            {
                String[] line = reader.nextLine().split(",");
                /*recFirst[currIndex]=line[0];
                recLast[currIndex]=line[1];
                recGender[currIndex]=line[2];
                recAge[currIndex]=Integer.parseInt(line[3]);
                recPhone[currIndex]=line[4];*/
                recEmail[currIndex]=line[5];
                currIndex++;
                //lineParse(records);
            }
            
        } 
        catch (FileNotFoundException ex) {
            System.err.println("Unable to read file");
        }
        //valRecFirst(recFirst);
        displayData(recEmail);
    }
    public static String[] valRecFirst(String[] recFirst)
    {
        String[] valFirst = new String[recFirst.length];
        for(int i=0; i<=recFirst.length;i++)
        {
            String toUpperCase = recFirst[i].toUpperCase();
        }
        return valFirst;
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
        fileReader(file, records);
        
        
    }
    
}
