package com.KamathInc;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        String pat1 =  s.nextLine();
        String pat2 = s.nextLine();


        System.out.println(indexOfDifference(pat1,pat2)+1);
    }
    public static String difference(String str1, String str2){

        if (str1 == null){
            return str2;
        }
        if (str2 == null){
            return str1;
        }
        int at = indexOfDifference(str1,str2);
        if (at == -1){
            return "";
        }
        return str2.substring(at);
    }
    public static int indexOfDifference(String str1, String str2){
        if (str1 == str2){
            return -1;
        }
        if(str1 == null || str2 == null){
            return 0;
        }
        int i;
        for (i =0 ;i <str1.length() && i < str2.length() ; ++i){
            if(str1.charAt(i) != str2.charAt(i)){
                break;
            }
        }
        if(i < str2.length() || i < str1.length()){
            return i;
        }
        return -1;
    }


}
