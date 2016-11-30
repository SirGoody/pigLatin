//Created by Chase Goodman

import java.util.Scanner;

public class translator {

    public static void main(String[] args){
        System.out.println("----Pig Latin Translater----");
        String term = "quit";
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter an english word: ");
        String s = kb.nextLine();
        int len = s.length();
        kb.close();
        for(int i = 0; i < len; i++){
            char a = s.charAt(i);
            if (s==term.toLowerCase()){
                System.exit(1);
            }else if(recogVowel(a)==true && i == 0){
                System.out.print("Pig Latin: " + s.toLowerCase() + "way");
                return;
            }else if(recogVowel(a)==true && i > 0){
                String fir = s.substring(0, i);
                String sec = s.substring(i,len);
                System.out.println("Pig Latin: " + sec.toLowerCase() + fir.toLowerCase() + "ay");
                return;
            }else if(recogVowel(a)==false && i > 0 && (a=='y'||a=='Y')){
                String fir = s.substring(0, i);
                String sec = s.substring(i,len);
                System.out.println("Pig Latin: " + sec.toLowerCase() + fir.toLowerCase() + "ay");
                return;
            }
        }//End of for loop
        kb.close();
    }

    public static boolean recogVowel(char a){
        a = Character.toLowerCase(a);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
            return true;
        }else{
            return false;
        }
    }


}
