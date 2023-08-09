/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuevoproyectoprueba;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

/**
 *
 * @author diakz
 */
public   class Tetris  extends Frame implements KeyListener {
    
    
    private static final int BOARD_WIDTH = 10;
    private static final int BOARD_HEIGHT = 20;
    private static final int SQUARE_SIZE = 20;
     public static void main(String[] args) {
    private  int[][] board = new int[BOARD_WIDTH][BOARD_HEIGHT];
    private int currentPiece;
    private int currentX;
    private int currentY;
    private Random random = new Random();
    private int[][][] pieceShape;
    public Tetris() {
        setTitle("Tetris");
        setSize(BOARD_WIDTH * SQUARE_SIZE, BOARD_HEIGHT * SQUARE_SIZE);
        setLocationRelativeTo(null);
        addKeyListener(this);
        setVisible(true);
        newGame();
    }
    private  void newGame() {
        for (int i = 0; i < BOARD_WIDTH; i++) {
            for (int j = 0; j < BOARD_HEIGHT; j++) {
                board[i][j] = 0;
            }
        }
        currentPiece = random.nextInt(7);
        currentX = BOARD_WIDTH / 2 - 1;
        currentY = 0;
        while (!canMove(currentPiece, currentX, currentY)) {
            currentY--;
        }
    }
    private boolean canMove(int piece, int x, int y) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (pieceShape[piece][i][j] == 1 && (x + i < 0 || x + i >= BOARD_WIDTH || y + j >= BOARD_HEIGHT || board[x + i][y + j] != 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}
}
