/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.assignment2.info5100_labassignment2;

/**
 *
 * @author Purvam Sheth
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class INFO5100_LabAssignment2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
        
        //for (int i = 0; i < 6; i++) {
        //    for (int j = 0; j < 6; j++) {
        //        int element = arr.get(i).get(j);
        //        System.out.print(element + " ");
        //    }
        //    System.out.println(); // Move to the next line after each row
        //}
        
        int sum = -63;
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                int x = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) + arr.get(i+1).get(j+1) + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                
                if(x>sum){
                    sum=x;
                }
            }
        }
        System.out.println(sum);
    }
 } 

