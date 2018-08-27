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
    
    public static boolean valFirst(String recFirst)
    {
        String upperVal= recFirst.trim().toUpperCase();
        for (int i=0;i<upperVal.length();i++)
        {
            if(Character.isDigit(upperVal.charAt(i)))
            {
                return true;
            }
            else 
            {
                return false;
            }
    
        }
        return false;
    }
    public static boolean valLast(String recLast)
    {
        String upperVal= recLast.trim().toUpperCase();
        for (int i=0;i<upperVal.length();i++)
        {
            if(Character.isDigit(upperVal.charAt(i)))
            {
                return true;
            }
            else 
            {
                return false;
            }
    
        }
        return false;
    }
    public static boolean valGender(String recGender)
    {
        recGender = recGender.trim();
        if(recGender.equals("male")||recGender.equals("female"))
            return false;
        return true;
    }
    
    public static boolean valAge(String recAge)
    {
        int age= Integer.parseInt(recAge);
        if (age>130)
        {
            return true;
        }
        else if(age<1)
        {
            return true;
        }
        return false;
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
                if(valLast(recLast))
                {
                    System.out.println(records[currIndex]);
                }
                else if(valFirst(recFirst))
                {
                    System.out.println(records[currIndex]);
                }
                else if(valGender(recGender))
                {
                    System.out.println(records[currIndex]);
                }
                else{
                    System.out.println(records[currIndex]);
                }
                
                currIndex++;
                
            }
        }
        catch (FileNotFoundException ex) 
        {
            System.err.println("Unable to read file");
        }
        
        
        
    }
    
}
