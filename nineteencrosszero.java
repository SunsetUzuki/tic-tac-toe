package by.itstep;

import java.util.Scanner;


/**
 * Created by st on 10.01.2018.
 */
public class nineteencrosszero {

    public static final int CONTINUE = 0;
    public static final int WIN_1 = 1;
    public static final int WIN_2 = 2;
    public static final int DRAW = 3;
    
    public static final char PLAYER_1='+';
    public static final char PLAYER_2='-';
    public static final char EMPTY='@';

    public static void main(String[] args) {


        char[][] gameField = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        showGameField(gameField);
        int result;
        char symbol = PLAYER_1;
        do {
            makeMove(gameField, symbol);
            symbol = symbol == PLAYER_1 ? PLAYER_2 : PLAYER_1;
            showGameField(gameField);
            result = checkField(gameField);
        } while (result == CONTINUE);
        showResult(result);


    }

    public static int checkField(char[][] gameField) {

        for (int i = 0; i < 3; i++) {
            if (gameField[i][0] == gameField[i][1]
                    && gameField[i][0] == gameField[i][2]) {
                if (gameField[i][0] == PLAYER_1) {
                    return WIN_1;

                }

                if (gameField[i][0] == PLAYER_2) {
                    return WIN_2;

                }


            }
            if (gameField[0][i] == gameField[1][i]
                    && gameField[0][i] == gameField[2][i]) {
                if (gameField[0][i] == PLAYER_1) {
                    return WIN_1;

                }

                if (gameField[0][i] == PLAYER_2) {
                    return WIN_2;

                }


            }
        }
        if (gameField[0][0] == gameField[1][1]
                && gameField[0][0] == gameField[2][2]) {
            if (gameField[0][0] == PLAYER_1) {
                return WIN_1;

            }

            if (gameField[0][0] == PLAYER_2) {
                return WIN_2;

            }
        }
        if (gameField[2][0] == gameField[1][1]
                && gameField[2][0] == gameField[0][2]) {
            if (gameField[2][0] == PLAYER_1) {
                return WIN_1;

            }
            if (gameField[2][0] == PLAYER_2) {
                return WIN_2;

            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gameField[i][j] == ' ')
                    return CONTINUE;
            }
        }

        return DRAW;
    }


    public static void makeMove(char[][] gameField, char symbol) {//мы знаем чем мы ходим(Х или 0), но нам надо узнать в какую клетку
        Scanner sc = new Scanner(System.in);

        int n;
        int m;
        int number;
        do {
            System.out.println("Сейчас ходит " + symbol);
            number = sc.nextInt();
            n = 2 - (number - 1) / 3;
            m = (number - 1) % 3;

        } while (number < 1 || number > 9 || gameField[n][m] != ' ');
        gameField[n][m] = symbol;


    }

    public static void showGameField(char[][] gameField) {
        System.out.println(gameField[0][0] + "|" + gameField[0][1] + "|" + gameField[0][2]);
        System.out.println("-----");
        System.out.println(gameField[1][0] + "|" + gameField[1][1] + "|" + gameField[1][2]);
        System.out.println("-----");
        System.out.println(gameField[2][0] + "|" + gameField[2][1] + "|" + gameField[2][2]);
    }

    public static void showResult(int result) {
        switch (result) {
            case WIN_1:
                System.out.println("Победа "+PLAYER_1);
                break;
            case WIN_2:
                System.out.println("Победа "+PLAYER_2);
                break;
            case DRAW:
                System.out.println("Ничья");

        }
    }
}
