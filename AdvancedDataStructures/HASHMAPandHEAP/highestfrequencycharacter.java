import java.io.*;
import java.util.*;
public class highestfrequencycharacter{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the string: ");  //in this program we wil get a string 
        String str = scn.nextLine();                 //we have to give the character of highest frequency

        // for this we need to create a hashmap of character and integer
        // character to store the characters of string and integer to store its frequency
        // we run the loop in string, if character is new then will put it in hashmap with first frequency as 1
        // if its old then we will update its frequency with + 1 and will put pair of ch and updated frequency no.

        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0;i<str.length();i++){

            char ch =str.charAt(i);
            
            if(hm.containsKey(ch)){   // here ch is old but with new frequency so we update it here
                int of = hm.get(ch);         //hm.get(key)  function gives the value of key here it gives value as 
                int nf = of+1;               //             frequency to key as character
                hm.put(ch, nf);
            }
            else{
                hm.put(ch, 1);     // here ch is new with frequency 0 so we add new pair in hashmap
            }
        }
        char mfc = str.charAt(0);
        for(Character key: hm.keySet()){
            if(hm.get(key)>hm.get(mfc)){         //hm.get(key)  gives the value=frequency anwer
                mfc=key;
            }
        }

        System.out.println("the highest frequency character is: " + mfc);
    }
}