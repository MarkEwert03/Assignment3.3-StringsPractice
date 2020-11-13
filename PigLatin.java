//Mark Ewert
//Nov 12, 2020

import java.util.Scanner;

public class PigLatin{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input your text");
        String text = sc.nextLine() + " ";
        System.out.println(pigLatinConverter(text));
    }

    public static String pigLatinConverter(String str){
        String ans = "", word = "";
        for (int i = 0; i < str.length(); i++){
            if (i == 0) word = str.substring(0, str.indexOf(" "));
            else if (' ' == str.charAt(i)) {
                if (i == str.lastIndexOf(" ")) word = str.substring(i+1);
                else word = str.substring(i+1, str.indexOf(" ", i+1));
            }
            
            if (!word.equals("")) {
                if (word.length() <= 2) ans += word + " ";
                else ans += word.substring(1) + word.charAt(0) + "ay ";
            }
            word = "";
        }
        return ans;
    }
}