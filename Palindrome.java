//Mark Ewert
//Nov 10, 2020

import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input a string");
        String response = sc.nextLine();
        System.out.print("“" + response + "” ");
        System.out.print(palChecker(cleanUp(response)));
    }

    public static String cleanUp(String str){
        String strC = str.toLowerCase();
        strC = strC.replaceAll(",", "").replaceAll(".", "").replaceAll(" ", "").replaceAll("_", "");
        System.out.println(strC);
        return strC;
    }

    public static String palChecker(String str){
        String outcome = "", backwards = "";
        int len = str.length();
        for (int i = str.length()-1; i >= 0; i--) backwards += str.charAt(i);
        if (str.equals(backwards)) outcome = "is ";
        else outcome = "is not ";
        return outcome + "a palindrome";
    }
}
