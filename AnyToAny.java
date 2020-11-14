//Mark Ewert
//Nov 12, 2020

import java.util.Scanner;

public class AnyToAny{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //get input value
        String value = "";
        while (!value.matches("[0-9,A-F]+")) {
            System.out.print("Please input a value [0-9 & A-F] ");
            value = sc.nextLine();
        }

        //get base of the input value
        int inputBase = 0;
        while (inputBase <= largestDigit(value) || inputBase > 16) {
            System.out.print("Please enter the base you are converting from. [" + (largestDigit(value)+1) + "-16] ");
            inputBase = sc.nextInt();
        }

        //get base to convert to
        int outputBase = 0;
        while (outputBase < 2 || outputBase > 16){
            System.out.print("Please enter the base you wish to convert to. [2-16] ");
            outputBase = sc.nextInt();
        }

        //Return with calculations
        System.out.println(value + " in base " + inputBase + " to base " + outputBase + " is:");
        System.out.println(anyConverter(value, inputBase, outputBase));
    }

    public static int anyConverter(String strInputBase, int iBase, int oBase){
        //0 in base anything will be 0
        if (strInputBase.equals("0")) return 0;
        //input base to base 10
        int numBase10 = 0;
        for (int i = 0; i < strInputBase.length(); i++){
            String strIndex = strInputBase.substring(strInputBase.length()-i-1,strInputBase.length()-i);
            int numIndex = 0;
            //Hex values
            if (strIndex.equals("A")) numIndex = 10;
            else if (strIndex.equals("B")) numIndex = 11;
            else if (strIndex.equals("C")) numIndex = 12;
            else if (strIndex.equals("D")) numIndex = 13;
            else if (strIndex.equals("E")) numIndex = 14;
            else if (strIndex.equals("F")) numIndex = 15;
            else numIndex = Integer.parseInt(strIndex);
            numBase10 += numIndex*Math.pow(iBase, i);
        }

        //base 10 to output base
        String strOutputBase = "";
        while (numBase10 > 0){
            strOutputBase = (numBase10 % oBase) + strOutputBase;
            numBase10 /= oBase;
        }

        //returns value as an int
        int numOutputBase = Integer.parseInt(strOutputBase);
        return numOutputBase;
    }

    public static int largestDigit(String str){
        //hex cases
        if (str.contains("F")) return 15;
        if (str.contains("E")) return 14;
        if (str.contains("D")) return 13;
        if (str.contains("C")) return 12;
        if (str.contains("B")) return 11;
        if (str.contains("A")) return 10;

        int max = 0;
        int n = Integer.parseInt(str);
        while (n > 0){
            int r = n % 10;
            if (r > max) max = r;
            n /= 10;
        }
        return max;
    }
}