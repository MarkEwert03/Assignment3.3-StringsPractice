//Mark Ewert
//Nov 10, 2020

import java.util.Scanner;

public class PPAP{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input your lyrics using the syntax:");
        System.out.println("I have a <object 1>, I have a <object 2>");
        String lyrics = sc.nextLine();
        System.out.println(song(lyrics));
    }

    public static String song(String str){
        if (str.length() < 20) return "Too short";
        String ans = "Uh!";
        for (int i = str.length()-1; i > 3; i--){
            if (str.substring(i-3, i).equals(" a ")){
                ans += " " + str.substring(i, i+1).toUpperCase();
                if (str.indexOf(",") < i) ans += str.substring(i+1);
                else ans += str.substring(i+1, str.indexOf(","));
            }
        }
        return ans;
    }
}