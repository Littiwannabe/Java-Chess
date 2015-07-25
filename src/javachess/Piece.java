package javachess;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorma Kikkelsson
 */
public class Piece {
    public static final char EMPTY = 'E';
    public static final char B_SOLDIER = 'S';
    public static final char B_KNIGHT = 'N';
    public static final char B_BISHOP = 'B';
    public static final char B_ROOK = 'R';
    public static final char B_QUEEN = 'Q';
    public static final char B_KING = 'K';
    public static final char W_SOLDIER = 's';
    public static final char W_KNIGHT = 'n';
    public static final char W_BISHOP = 'b';
    public static final char W_ROOK = 'r';
    public static final char W_QUEEN = 'q';
    public static final char W_KING = 'k';

    //moves returned as list of, x1,y1,x2,y2...
    public int[] allowedMoves(char[][] board, int x, int y){
        int[] moves = null;
        char type = board[y][x];
        if(type == EMPTY){
            return null;
        }else if(type == B_SOLDIER){
            
            
        }else if(type == B_ROOK){
            
        }else if(type == B_KNIGHT){
            
        }else if(type == B_BISHOP){
            
        }else if(type == B_QUEEN){
            
        }else if(type == B_BISHOP){
            
        }else if(type == B_KING){
            
        }else if(type == W_SOLDIER){
            
        }else if(type == W_ROOK){
            
        }else if(type == W_KNIGHT){
            
        }else if(type == W_BISHOP){
            
        }else if(type == W_QUEEN){
            
        }else if(type == W_BISHOP){
            
        }else{  //W_KING
            
        }
        return moves;
    }

    public int[] soldier_moves(boolean isWhite, char[] board, int x, int y){
        if(isWhite){    //how to find out if other pieces are black or white efficiently
            
        }
        return null;
    }
    
}
