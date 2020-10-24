import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DayTwenty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        scan.close();
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = (arr[i][j] + arr[i][j + 1] +  
                       arr[i][j + 2]) + (arr[i + 1][j + 1]) +  
                       (arr[i + 2][j] + arr[i + 2][j + 1] +  
                       arr[i + 2][j + 2]); 
                if (sum > max_sum) {
                    max_sum = sum;
                }
            }
        }
        System.out.println(max_sum);
    }
}
                       
                    
