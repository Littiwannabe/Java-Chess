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
public class Gameboard {
    public int[][] board;
    
    public Gameboard(){
        board = new int[8][8];
        board[0] = new int[] {Piece.ROOK, Piece.KNIGHT, Piece.BISHOP, Piece.KING, Piece.QUEEN, Piece.BISHOP, Piece.KNIGHT, Piece.ROOK};
        board[7] = new int[] {Piece.ROOK, Piece.KNIGHT, Piece.BISHOP, Piece.KING, Piece.QUEEN, Piece.BISHOP, Piece.KNIGHT, Piece.ROOK};
        for(int i = 1; i<7; i++){
            board[i] = new int[] {Piece.SOLDIER, Piece.SOLDIER, Piece.SOLDIER, Piece.SOLDIER, Piece.SOLDIER, Piece.SOLDIER, Piece.SOLDIER, Piece.SOLDIER};
        }
    }
}
