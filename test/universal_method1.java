/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Voyager
 */
public class universal_method {
   public int adb_devices()
    {
        String cmd="adb devices -l";
        String line,source=null;
       
       try{
        Runtime run=Runtime.getRuntime();
       
       
           // You can also use append.
         
          Process pr;
           pr = run.exec(cmd);
       pr.waitFor();
      
BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        while (((line=buf.readLine())!=null)) {
                source=source + line;
               System.out.println(line);
 
        }
        
        }catch(Exception e)
                {
                e.printStackTrace();
                }
       
       if(source.contains("product"))
       {
            System.out.println("Connected");
           return 0;
          
           
       }else
       {
           System.out.println("not Connected");
           return 1;
       }
           
    }
      public void kill_server()
      {
          
        String cmd="adb kill-server";
        String line;
       
       try{
        Runtime run=Runtime.getRuntime();
       
       
           // You can also use append.
         
          Process pr;
           pr = run.exec(cmd);
          pr.waitFor();
      
BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        while (((line=buf.readLine())!=null)) {
               
              
 
        }
        
        }catch(Exception e)
                {
                e.printStackTrace();
                }
          
      }
      public void createFile()
      {
          try
          { 	
String get_user=System.getProperty("user.home");
String create_androsploit="\\Desktop\\Androspoilt";
String create_config="\\config";
String create_androiddata="\\AndroidData";
String create_screenshot="\\AndroidData\\Screenshot";
String create_screenrecord="\\AndroidData\\ScreenRecord";
String create_others="\\AndroidData\\Others";


String scapname="scapname:1";

String con=get_user.concat(create_androsploit);

Path path=Paths.get(con.concat(create_config));
Path path1=Paths.get(con.concat(create_androiddata));
Path path2=Paths.get(con.concat(create_screenshot));

Path path3=Paths.get(con.concat(create_screenrecord));
Path path4=Paths.get(con.concat(create_others));

     Files.createDirectories(path);
     Files.createDirectories(path1);
     Files.createDirectories(path2);
     Files.createDirectories(path3);
     Files.createDirectories(path4);
     

      String confile=con.concat(create_config);
      String configpath = confile.concat("\\configuration.txt");

	      File file = new File(configpath);

	      if (file.createNewFile()){
	        FileWriter fw =new FileWriter (configpath);
                BufferedWriter inject = new  BufferedWriter (fw);
               
                inject.write(scapname);
              
                 inject.close();
                 
	      }else{
	        System.out.println("File already exists.");
	      }
              Menu3 ob=new Menu3(con,configpath);
             
              } catch (IOException e) {
	      e.printStackTrace();
	}
                


      }
      
   
   public static void main(String args[])
   {
      
       universal_method ob=new universal_method();
        ob.createFile();
       ob.adb_devices();
   }
        }
    

