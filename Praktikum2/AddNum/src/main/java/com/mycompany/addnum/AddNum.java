/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.addnum;

/**
 * <h1> Add Two Number </h1>
 * AddNum merupakan program yang mengimplementasi aplikasi dimana ada proses menghitung dua integer
 * dan menampilkan hasil dari operasi perjumlahannya
 * <p>
 * <b>Note</b> Memberikan komentar pada program akan membuat program menjadi lebih 
 * user friendly dan meningkatkan kualitas program
 *  
 *  
 *  @author Ryanda Afriza
 *  @version 1.0
 *  @since 2023-09-01
 */
	
public class AddNum {
	/**
	 * This method uses two integers. This is to simplify the use of class methods
	 * @param numA is the first parameter used in the addNum method
	 * @param numB is the second parameter used in the addNum method
	 * @return int is the return value of the sum of numA and numB
	 * 
	 */
	
	public int addNum(int numA, int numB) {
		return numA + numB;
	}
	
	/**
	 * This is the main method which uses the addNum method
	 * @param args used
	 * @exception IOexcaption on input error
	 * @see IOexcaption
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddNum obj = new AddNum();
		int sum = obj.addNum(2, 8);
		
		System.out.println("Hasil perjumlahan  dari 2 dan 8 adalah : " + sum);
	}

}
