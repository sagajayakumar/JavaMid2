/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jaya Kumar Saga
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Answer for question 1: Jaya Kumar Saga");
        System.out.print("Enter ten integers: ");
        String s = sc.nextLine();
        String arr[] = s.split(" ", 10);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<arr.length;i++){
            int b = Integer.parseInt(arr[i]);
            list.add(b);
        }
        removeDuplicate(list);
    }
    public static void removeDuplicate(ArrayList<Integer> list){
        ArrayList<Integer> distinct = new ArrayList<>();
        for(int i =0; i<list.size();i++){
           if(!distinct.contains(list.get(i))){
                distinct.add(list.get(i));
           }
       }
        System.out.println("The distinct integers are " +distinct.toString().replace("[", "").replace("]", "").replaceAll(",", ""));
    }

}
