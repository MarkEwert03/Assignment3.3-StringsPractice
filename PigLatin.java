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
        String ans = "";
        while (str.indexOf(" ") > 0) {
            String word = str.substring(0, str.indexOf(" "));
            if (word.length() > 2) ans += word.substring(1) + word.charAt(0) + "ay ";
            else ans += word + " ";
            str = str.substring(str.indexOf(" ") + 1);
        }

        return ans;
    }
}