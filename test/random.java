
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
public class random {
    private static final String CHAR_LIST =
        "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
//- See more at: http://www.java2novice.com/java-collections-and-util/random/string/#sthash.VpGhyWqX.dpuf
    public static void main(String args[])
    {
        int randomInt = 0;
    
        Random randomGenerator = new Random();
        randomInt = randomGenerator.nextInt(CHAR_LIST.length());
        if (randomInt - 1 == -1) {
            System.out.println(randomInt);
        } else {
           System.out.println(randomInt - 1);
        }
    }
//- See more at: http://www.java2novice.com/java-collections-and-util/random/string/#sthash.VpGhyWqX.dpuf
    
}
