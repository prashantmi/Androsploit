  
import java.io.File;
import java.io.IOException;


public class location {
	

	
	public void work (){
		
		 String current = null;
		try {
			current = new File( "./Resources/apk/app-debug.apk" ).getCanonicalPath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        System.out.println("Current dir:"+current);
                adb install -l +current
   }

   

public static void main(String[] args) {

	location ob= new location ();
	
	ob.work();
	
}
}
