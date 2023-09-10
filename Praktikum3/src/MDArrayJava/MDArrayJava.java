/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MDArrayJava;

/**
 *
 * @author brwnnn
 */
public class MDArrayJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//One Dimensional Arrays
		 int[] fisrtArray = {2, 5, 3}; 
		 int[] secondArray = {9, 5, 3}; 
		 int[] thirdArray = {2, 4, 9}; 
		 int[] fourthArray = {10, 11, 12}; 
		 int[] fifthArray = {13, 14, 15}; 
		 int[] sixthArray = {16, 17, 18}; 
		 int[] seventhArray = {19, 20, 21}; 
		 int[] eighthArray = {22, 23, 24}; 
		 int[] ninthArray = {25, 26, 27}; 
		 //Array dua dimensi
		 int[][] twoDimensionalArray1 = {fisrtArray, secondArray, thirdArray}; 
		 int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
		 int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};
		 //Array tiga dimensi
		 int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};
		 
		// Mencetak array dengan loop bersarang
		 for (int i = 0; i < threeDimensionalArray.length; i++) { // Loop untuk sumbu x
		     System.out.print("{");
		     for (int j = 0; j < threeDimensionalArray[i].length; j++) { // Loop untuk sumbu y
		         System.out.print("{");
		         for (int k = 0; k < threeDimensionalArray[i][j].length; k++) { // Loop untuk sumbu z
		             System.out.print(threeDimensionalArray[i][j][k]); // Mencetak elemen array
		             if (k < threeDimensionalArray[i][j].length - 1) {
		                 System.out.print(" "); // Menambahkan koma sebagai pemisah
		             }
		         }
		         System.out.print("}");
		         if (j < threeDimensionalArray[i].length - 1) {
		             System.out.print(" "); // Menambahkan koma sebagai pemisah
		         }
		     }
		     System.out.print("}");
		     if (i < threeDimensionalArray.length - 1) {
		         System.out.println(); // Membuat baris baru sebagai pemisah
		     }
		 }
	}

}

