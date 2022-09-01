// Solution by Anjali Dabholkar on 01/09/2022

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    
    public int maxnum(int [] array){
        
        //Arrays.sort(array);   
        //System.out.println("Elements of array sorted in ascending order: "); 
        int num_max = array[0];
        for (int i = 1; i <= array.length; i++)   
            {       
                if (array[i] > num_max)
                    num_max = array[i];
                else
                    break;
            } 
        //System.out.println(num_max); 
        
        return num_max;
    } 
    public static void main(String[] args) {
        int [] array = new int [] {18, 110, 210, 452, 810, 500, 101, 13};
        Main m1 = new Main();
        int maximumNum = m1.maxnum(array);
        System.out.println("max number of array is : " + maximumNum);
    }
}
