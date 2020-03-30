package nested_logic;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int aD, aM, aY;
        aD = sc.nextInt();
        aM = sc.nextInt();
        aY = sc.nextInt();
        int eD, eM, eY;
        eD = sc.nextInt();
        eM = sc.nextInt();
        eY = sc.nextInt();
        
        if(aY>eY){
            System.out.println(10000);
        }else if(aM>eM){
            System.out.println(500*(aM-eM));
        }else if(aD>eD){
            System.out.println(15*(aD-eD));
        }else{
            System.out.println(0);
        }
    }
}