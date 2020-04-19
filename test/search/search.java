/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Voyager
 */
public class search {
    public static void main(String args[])throws IOException
    {
       String sc="scapname:";
        String line;
        BufferedReader br=new BufferedReader(new FileReader(new File("C:\\Users\\Voyager\\Desktop\\Androspoilt\\config\\configuration.txt")));
        while (((line=br.readLine())!=null))
              
        {
         if(line.contains(sc))
              {
                  String extract=line.substring(sc.length());
                  System.out.println(extract);
            }
        }
    }
    
}
