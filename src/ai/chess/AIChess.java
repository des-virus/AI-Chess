/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.chess;

/**
 *
 * @author PhongPP
 */
public class AIChess {

    int WIDTH = 5;
    int HEIGHT = 7;

    int a[][] = {{1, 1, 1, 1, 1},
    {1, 1, 0, 1, 1},
    {1, 0, 0, 0, 1},
    {1, 1, 0, 1, 1},
    {1, 1, 0, 1, 1},
    {-1, 2, 0, 2, -1},
    {-1, -1, 2, -1, -1},};

    public boolean CheckLen(int i, int j) {
        if (i == 0 || a[i - 1][j] != 0) {
            return false;
        }
        return true;
    }

    public boolean CheckXuong(int i, int j) {
        if (i == 6 || a[i + 1][j] != 0) {
            return false;
        }
        return true;
    }

    public boolean CheckTrai(int i, int j) {
        if (j == 0 || a[i][j - 1] != 0) {
            return false;
        }
        return true;
    }

    public boolean CheckPhai(int i, int j) {
        if (j == 4 || a[i][j + 1] != 0) 
            return false;
        return true;
    }

    public boolean CheckCheoChinhLen(int i, int j){
        if(i == 0 || j == 0 || a[i - 1][j - 1] != 0)
            return false;
        return true;
    }
    
    public static void main(String[] args) {

    }

}
