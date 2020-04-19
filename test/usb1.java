/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Voyager
 */
import java.io.IOException;
import java.util.EventListener;
import java.util.logging.Level;
import java.util.logging.Logger;
public class usb1 {
    public void busAdded()throws java.io.IOException
    {
System.out.println("New bus added");
}
    public static void main(String args[])
    {
        usb1 ob=new usb1();
        try {
            ob.busAdded();
        } catch (IOException ex) {
            Logger.getLogger(usb1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
