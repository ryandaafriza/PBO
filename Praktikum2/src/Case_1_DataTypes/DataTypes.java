/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Case_1_DataTypes;

import java.util.Scanner;

/**
 *
 * @author brwnnn
 */
public class DataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String ulang = "y";
        while (ulang.equals("y")){
            
            try{
                System.out.print("Masukkan angka yang ingin di uji : ");
                Scanner input1 = new Scanner(System.in);
                long angka = input1.nextLong();
                System.out.println(angka + "can be fitted in : ");

                if (angka >= Byte.MIN_VALUE && angka <= Byte.MAX_VALUE){
                    System.out.println("* Byte");
                }
                if (angka >= Short.MIN_VALUE && angka <= Short.MAX_VALUE){
                    System.out.println("* Short");
                }
                if (angka >= Integer.MIN_VALUE && angka <= Integer.MAX_VALUE){
                    System.out.println("* Int");
                }
                if (angka >= Long.MIN_VALUE && angka <= Long.MAX_VALUE){
                    System.out.println("* Long");
                }
            } catch(Exception e) {
                    System.out.println("N can't be fitted anywhere");
            }
            
            System.out.print("pakah anda ingin mengulang? (y/t)");
            ulang = input.next();
        }
    }   
}
