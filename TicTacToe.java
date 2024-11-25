/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tictactoe;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */

public class TicTacToe {
    private static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido al Tic Tac Toe!");
        System.out.println("Jugadores alternarán turnos usando X y O.");
        System.out.println("Introduce tu movimiento en el formato: fila columna (ejemplo: 0 1).");
        printBoard();

        while (true) {
            boolean validMove = false;

            while (!validMove) {
                System.out.println("Jugador " + currentPlayer + ", introduce tu movimiento (fila y columna): ");
                int row = scanner.nextInt();
                int col = scanner.nextInt();

                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                    board[row][col] = currentPlayer;
                    validMove = true;
                } else {
                    System.out.println("Movimiento inválido. Intenta nuevamente.");
                }
            }

            printBoard();

            if (checkWin()) {
                System.out.println("¡El jugador " + currentPlayer + " gana!");
                break;
            }

            if (isBoardFull()) {
                System.out.println("¡Es un empate!");
                break;
            }

            switchPlayer();
        }

        scanner.close();
    }

    private static void printBoard() {
        System.out.println("  0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println(" ---|---|---");
        }
    }

    private static boolean checkWin() {
        // Revisar filas
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }

        // Revisar columnas
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }

        // Revisar diagonales
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }

        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }

        return false;
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
}

