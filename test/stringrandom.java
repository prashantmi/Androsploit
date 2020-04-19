
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Voyager
 */
public class stringrandom {
     private static final int RANDOM_STRING_LENGTH = 10;
     //- See more at: http://www.java2novice.com/java-collections-and-util/random/string/#sthash.VpGhyWqX.dpuf
    private static final String CHAR_LIST =
      "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
//- See more at: http://www.java2novice.com/java-collections-and-util/random/string/#sthash.VpGhyWqX.dpuf
    public static void main(String args[])
    {
        StringBuffer randStr = new StringBuffer();
        for(int i=0; i<RANDOM_STRING_LENGTH; i++){
            int number = getRandomNumber();
            char ch = CHAR_LIST.charAt(number);
            randStr.append(ch);
        }
    
        return randStr.toString();
- See more at: http://www.java2novice.com/java-collections-and-util/random/string/#sthash.VpGhyWqX.dpuf
    }
    
    
}
