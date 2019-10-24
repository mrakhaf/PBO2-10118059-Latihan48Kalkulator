/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan48kalkulator;

/**
 *
 * @author 
 * Nama : Muhammad Rakha Firdaus
 * NIM : 10118059
 * Kelas : IF-2
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator kal = new Kalkulator();
        
        kal.setValue1(7);
        kal.setValue2(5);
        
        System.out.println("VALUE1 = " + kal.getValue1());
        System.out.println("VALUE2 = " + kal.getValue2());
        kal.setNameProject();
        kal.setNoteProject("This project shown your how to manage method in java");
        System.out.println("Result Add is = " + kal.add(kal.getValue1(), kal.getValue2()));
        System.out.println("Result Minus is = " + kal.minus(kal.getValue1(), kal.getValue2()));
        System.out.println("Result Multiple is = " + kal.multiplication(kal.getValue1(), kal.getValue2()));
        System.out.println("Result Division is = " + kal.division(kal.getValue1(), kal.getValue2()));
    }
    
}
