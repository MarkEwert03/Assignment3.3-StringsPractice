//Mark Ewert
//Nov 12, 2020

import java.util.Scanner;

public class DecToBin{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input a positive integer");
        int num = sc.nextInt();
        System.out.println(binConverter(num));
    }

    public static String binConverter(int dec){
        if (dec <= 0) return "0";
        String binStr = "";
        for (int i = 0; dec > 0; i++){
            binStr = (dec%2) + binStr;
            dec /= 2;
        }
        return binStr;
    }
}