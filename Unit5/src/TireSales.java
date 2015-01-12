/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dyla1920
 */
public class TireSales {

    public static void main(String[] args) {
       ArrayStack pole = new ArrayStack();
       //add 4 tires to pole
       pole.push(new Tire("GoodYear"));
       pole.push(new Tire("GoodYear"));
       pole.push(new Tire("GoodYear"));
       pole.push(new Tire("GoodYear"));
       //sell 2 tires
        System.out.println("Selling 2 tires");
        System.out.println(pole.pop());
        System.out.println(pole.pop());
    }
    
}
