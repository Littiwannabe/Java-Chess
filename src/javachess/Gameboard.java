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
    public char[][] board;
    
    public Gameboard(){
        board = new char[8][8];
        board[0] = new char[] {Piece.W_ROOK, Piece.W_KNIGHT, Piece.W_BISHOP, Piece.W_KING, Piece.W_QUEEN, Piece.W_BISHOP, Piece.W_KNIGHT, Piece.W_ROOK};
        board[7] = new char[] {Piece.B_ROOK, Piece.B_KNIGHT, Piece.B_BISHOP, Piece.B_KING, Piece.B_QUEEN, Piece.B_BISHOP, Piece.B_KNIGHT, Piece.B_ROOK};
        board[1] = new char[] {Piece.W_SOLDIER, Piece.W_SOLDIER, Piece.W_SOLDIER, Piece.W_SOLDIER, Piece.W_SOLDIER, Piece.W_SOLDIER, Piece.W_SOLDIER, Piece.W_SOLDIER};
        board[6] = new char[] {Piece.B_SOLDIER, Piece.B_SOLDIER, Piece.B_SOLDIER, Piece.B_SOLDIER, Piece.B_SOLDIER, Piece.B_SOLDIER, Piece.B_SOLDIER, Piece.B_SOLDIER};
        for(int i = 2; i<6; i++){
            board[i] = new char[] {Piece.EMPTY, Piece.EMPTY, Piece.EMPTY, Piece.EMPTY, Piece.EMPTY, Piece.EMPTY, Piece.EMPTY, Piece.EMPTY};
        }
    }

    public Gameboard(char[][] gameboard){
        board = gameboard;
    }
    
    
    public char[][] copyBoard(){
        char[][] new_board = new char[8][8];
        for(int y = 0; y <8; y++){
            for(int x = 0; x <8; x++){
                new_board[y][x] = board[y][x];
            }
        }
        return new_board;
    }
    
    public String toString(){
        String board_string = "";
        for(int y = 0; y <8; y++){
            board_string += "[";
            for(int x = 0; x <8; x++){
                board_string += board[y][x];
            }
            board_string += "]";
            if(y<7){
                board_string += "\n";
            }
        }
        return board_string;
    }
}
