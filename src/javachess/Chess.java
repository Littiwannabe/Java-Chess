/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javachess;

/**
 *
 * @author Jorma Kikkelsson
 */
public class Chess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gameboard lauta = new Gameboard();
        char[][] copy = lauta.copyBoard();
        System.out.print(lauta);
    }
    
}
