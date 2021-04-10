import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    ArrayList<String> names = new ArrayList<>();
    for(int i=0;i<N;i++){
       String firstName = sc.next();
       String emailId = sc.next();

       if(emailId.contains("@gmail.com")){

           names.add(firstName);
       } 
    }

    Collections.sort(names);
    for(String name : names){
        System.out.println(name);
    }

    }
}
