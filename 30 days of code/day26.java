import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner (System.in);
        //first line input book 
        int day =sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        //second line input
        int day1 = sc.nextInt();
        int month1 = sc.nextInt();
        int year1 = sc.nextInt();

        int daydiff = day-day1;
        int monthdiff = month-month1;
        int yeardiff = year-year1;
        int diff = 0;

        if(yeardiff>0){
            diff = 10000;
        }else if(monthdiff>0 && yeardiff==0){
            diff = monthdiff*500;
        }
        else if(daydiff>0 && yeardiff==0){
            diff = daydiff*15;
        }
        else{
            diff = 0;
        }

        System.out.println(diff);

        
  }
}
