package MODULO01.CLASE06.src.tresenlinea;

import java.util.Scanner;

public class Triqui {

    public static void startGame() {
        // .1 identificar el primer jugador
        // 2. inicializar y mostrar el tablero
        // 3. leer el moviemiento del jugador
        // 4. verificar si hizo tres en linea
        // si lo hizo, diga gano
        // sino
        // 5. cambie de jugador
        // volver a 3.
        var entrada = new Scanner(System.in);

        var player = 'X';
        playGame(entrada, player);
        entrada.close();
    }

    private static void playGame(Scanner entrada, char player) {
        var isFinish = false;
        var board = initializeBoard();
        var counter = 0;
        do {
            showBoard(board);
            System.out.printf("Jugador %c Ingresa tu movimiento: %n", player);
            System.out.print("Coordenadas de la Fila del (1-3): ");
            var row = entrada.nextInt() - 1;
            System.out.print("Coordenadas de la Columna del (1-3): ");
            var column = entrada.nextInt() - 1;
            if (makeMove(board, row, column, player)) {
                counter++;
                if (chekWinner(board, player)) {
                    showBoard(board);
                    System.out.println("El jugador" + player + " ha ganado");
                    isFinish = true;
                } else {
                    if (player == 'X') {
                        player = 'O';
                    } else
                        player = 'X';
                }
            } else {
                System.err.println("Movimiento invalido. Intenta de nuevo.");
            }
            if (counter == 9) {
                System.out.println("Han quedado empatados");
                isFinish = false;
            }
        } while (!isFinish);
    }

    private static boolean chekWinner(char[][] board, char player) {
        for (var row : board) {
            if (row[0] == player && row[1] == player && row[2] == player) {
                return true;
            }
        }
        for (int i = 0; i < board[0].length; i++) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        for (int i = 0; i < board[0].length; i++) {
            if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
                return true;
            }
        }
        for (int i = 0; i < board[0].length; i++) {
            if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
                return true;
            }
        }
        return false;
    }

    private static Boolean makeMove(char[][] board, int row, int column, char player) {
        if (board[row][column] != ' ') {
            return false;
        }
        board[row][column] = player;
        return true;
    }

    private static void showBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                if (j < board[i].length - 1) {
                    System.out.print('|');
                }
            }
            System.out.println();
            if (i < board.length - 1) {
                System.out.println("-----");
            }
        }
    }

    private static char[][] initializeBoard() {
        var board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
        return board;
    }
}
