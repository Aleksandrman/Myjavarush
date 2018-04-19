package lvl5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[15];
        int odd = 0;
        int even = 0;
       
       
       for(int i = 0; i < array.length; i++) {
    	   array[i] = Integer.parseInt(reader.readLine());
    	   
    	   if(i%2==0 || i==0)
     		  even +=array[i];
     	  else
     		  odd +=array[i];
       
       }
     
      
       if(even>odd)
    	   System.out.println("В домах с четными номерами проживает больше жителей.");
       else
    	   System.out.println("В домах с нечетными номерами проживает больше жителей.");
       
       
     
    }

}

