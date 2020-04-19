
package Application;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;

import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class universal_method {
   public int adb_devices()
    {
        String cmd="adb devices -l";
        String line,source=null;
       
       try{
        Runtime run=Runtime.getRuntime();
         
          Process pr;
           pr = run.exec(cmd);
       pr.waitFor();
      
BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        while (((line=buf.readLine())!=null)) {
                source=source + line;
              
 
        }
        
        }catch(Exception e)
                {
                e.printStackTrace();
                }
       
       if(source.contains("product"))
       {
           
           return 0;
          
           
       }else
       {
           
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
String create_androsploit="\\Desktop\\Androsploit";
String create_config="\\config";
String create_androiddata="\\AndroidData";
String create_screenshot="\\AndroidData\\Screenshot";
String create_screenrecord="\\AndroidData\\ScreenRecord";
String create_others="\\AndroidData\\Others";

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
      String configpath = confile.concat("\\configuration.xml");
      
    Path path5=Paths.get(configpath);

             if(Files.exists(path5))
             {
                 System.out.println("File exists");
             }
             else{
                 Properties prop=new Properties();
               prop.setProperty("screencap","1");
                OutputStream fw =Files.newOutputStream(Paths.get(configpath));
                prop.storeToXML(fw,"Screen shot n recording path....");
             }
	       
         
             Menu3 screeob = new Menu3 (configpath,path2.toString(),path3.toString(),path4.toString());
             
             file_browser browse = new file_browser(path4.toString());
             System.out.print(path4.toString());
              } catch (Exception e) {
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
    

