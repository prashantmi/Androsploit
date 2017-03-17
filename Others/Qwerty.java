import java.io.File;
import java.io.IOException;


public class Qwerty {
	

	
	public void work (){
		
		 String current = null;
		try {
			current = new File( "./Resources/apk/app-debug.apk" ).getCanonicalPath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        System.out.println("Current dir:"+current);
   }

   

public static void main(String[] args) {
	qwert ob1=new qwert ();

	Qwerty ob= new Qwerty ();
	
	ob.work();
	
}
}
