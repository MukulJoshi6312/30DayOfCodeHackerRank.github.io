import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T;i++){
            
            int N = sc.nextInt();
            int K = sc.nextInt();
            System.out.println(slove(N,K));

        }
        sc.close();
    }

    static int slove(int N,int K){

        int result = 0;
        for(int A = 1; A <= N;A++)
        {
            for(int B = A+1;B<=N;B++){

                int current = A&B;
                if(current > result && current < K){

                    result = current;
                }
            }
        }
        return result;

    }


}
