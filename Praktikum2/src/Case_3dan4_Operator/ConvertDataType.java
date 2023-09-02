/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Case_3dan4_Operator;

/**
 *
 * @author brwnnn
 */

public class ConvertDataType {
	static short methodOne (long l) {
		int i = (int) l;
		return (short)i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 10.45;
		float f = (float)d;
		byte b = (byte) methodOne((long) f);
		System.out.println(b);
	}

}
