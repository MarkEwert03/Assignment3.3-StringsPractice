//Mark Ewert
//Nov 10, 2020

import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input a string");
        String response = sc.nextLine();
        System.out.print("\"" + response + "\" is ");
        System.out.print(palindrome(cleanUp(response)));
    }

    public static String cleanUp(String str){
        String strC = str.toLowerCase();
        strC = strC.replaceAll(",", "").replaceAll(".", "").replaceAll(" ", "").replaceAll("_", "");
        return strC;
    }

    public static boolean palindrome(String str){
        String backwards = "";
        int len = str.length();
        for (int i = len-1; i >= 0; i--) backwards += str.charAt(i);
        if (str.equals(backwards)) return true;
        else return false;
    }
}
