
/**
 * This class solves Exercise 2 Chapter 18 ["Containers in Depth"] of the
 * book "Thinking in Java"
 * This exercise demonstrates using hashMaps
 * 
 * @author @nwokoyepraise
 */

import static util.Print.print;

import java.util.*;
public class Exercise2 {
    
    public static void main(String[] args) {
        Map<String,String> hashMap = new HashMap<String,String>();
      
		for(int i = 0; i < Countries.DATA.length; i++) {
            if (Countries.DATA[i][0].charAt(0) == 'A') {
                hashMap.put(Countries.DATA[i][0], Countries.DATA[i][1]);
            }	
		}
        print(hashMap);
    }
}
