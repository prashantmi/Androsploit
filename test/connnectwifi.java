
import Application.Main_menu;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Voyager
 */
public class connnectwifi {
   
	

	
	public void work (){
            String line;
		String current=null;
		  
		try {
			current = new File("./Resources\\apk\\app-debug.apk").getCanonicalPath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        System.out.println("Current dir:"+current);
                
  
   String abc="\""+current+"\"";
     String cmd="adb install -l ";
     
      String cmd1=cmd.concat(abc);
    //  String q="adb install -l \"D:\\Projects\\NetBeansProjects\\Android Forensic\\Resources\\apk\\app-debug.apk\"";
     System.out.println(abc); 
    System.out.println(cmd);
      Runtime run = Runtime.getRuntime();
     Process pr =null;
        try {
            pr = run.exec(cmd1);
        } catch (IOException ex) {
            Logger.getLogger(connnectwifi.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
          int waitFor = pr.waitFor();
        } catch (InterruptedException ex) {
            Logger.getLogger(connnectwifi.class.getName()).log(Level.SEVERE, null, ex);
        }

BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
       
          try {
              while ((line=buf.readLine())!=null) {
                  
                
                  System.out.println(line);
              }
          } catch (IOException ex) {
              Logger.getLogger(connnectwifi.class.getName()).log(Level.SEVERE, null, ex);
          }   
      
    }                                        


public static void main(String args[])
{
connnectwifi ob=new connnectwifi();
ob.work();
}
}