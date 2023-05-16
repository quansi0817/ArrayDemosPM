/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aarrydemo1;

import java.util.Scanner;

/**
 *
 * @author vivia
 */
public class AarryDemo1 {

    public static void main(String[] args) {
      /* char[] myLetters = new char[5];
        myLetters[0] ='R';
        myLetters[1] ='o';
        myLetters[2] ='c';
        myLetters[3] ='a';
        myLetters[4] ='b';
        
        for(int i=0; i<myLetters.length-1;i++){
            System.out.println(myLetters[i]);
        } */
       
       System.out.println("enter a word");
       Scanner input = new Scanner(System.in);
       
       String myWord = input.nextLine();
       char[] myLetters = new char[myWord.length()];
       for (int i=0; i<myLetters.length; i++){
           myLetters[i] = myWord.charAt(i);
           System.out.print(myLetters[i]);
           
       }
        System.out.print("Printing in reverse");
      for(int i =myLetters.length-1; i>=0; i--){
        System.out.print(myLetters[i]);
}
}
}
