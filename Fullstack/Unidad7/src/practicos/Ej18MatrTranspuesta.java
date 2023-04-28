/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejs.practicos;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ej18MatrTranspuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
      Scanner leer= new Scanner(System.in);
      int[][] matriz= new int[4][4];
      int[][] matrizT= new int[4][4];
      for (int i=0;i<4;i++){
         for(int j=0;j<4;j++){
             matriz[i][j] = (int)(Math.random()*10);
         } 
      }
      for (int i=0;i<4;i++){
         for(int j=0;j<4;j++){
             System.out.print(matriz[i][j]+" ");   
         }
          System.out.println("");
      }
      System.out.println("---------");
       for (int i=0;i<4;i++){
         for(int j=0;j<4;j++){
             matrizT[j][i] = matriz[i][j];
         } 
      }
       for (int i=0;i<4;i++){
         for(int j=0;j<4;j++){
             System.out.print(matrizT[i][j]+" ");   
         }
          System.out.println("");
      }
  }
}