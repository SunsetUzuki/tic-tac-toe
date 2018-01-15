package by.itstep;

import java.util.Scanner;

public class crosszeroeshome {


    public static final int CONTINUE = 0;//находится вне метода
    public static final int WIN_1 = 1;
    public static final int WIN_2 = 2;
    public static final int DRAW = 3;

    public static final char PLAYER_1='X';
    public static final char PLAYER_2='0';
    public static final char EMPTY=' ';

    public static void main(String[] args) {

        int select;
        int movenumber = 0;
        System.out.println("Выберите режим игры:\n1 - два игрока\n2 - против компа ЛЕГКО\n3 - против компа ТЯЖЕЛО\n4 - два компа против друг друга ");
        Scanner scanner = new Scanner(System.in);
        select = scanner.nextInt();

        char[][] gameField = {{EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY}};
        showGameField(gameField);
        int result;
        char symbol = PLAYER_1;
        do {
            movenumber++;
            makeMove(gameField, symbol, select, movenumber);
            symbol = symbol == PLAYER_1 ? PLAYER_2 : PLAYER_1;//игровой процесс основа
            showGameField(gameField);
            result = checkField(gameField);
        } while (result == CONTINUE);
        showResult(result);

    }


    //Мы знаем чем мы ходим(Х или 0), но нам надо узнать в какую клетку
    public static void makeMove(char[][] gameField, char symbol,/*Х или 0*/int select, int movenumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сейчас ходит " + symbol);
        int n;
        int m;
        int number = 0;
        do {
            if (select == 1) {//Два игрока
                number = scanner.nextInt();
            }

            if (select == 2 && symbol == PLAYER_2) {//АИ легкий
                number = (int) (Math.random() * 10);
            } else if (select == 2 && symbol == PLAYER_1) {
                number = scanner.nextInt();
            }

            if (select == 3 && symbol == PLAYER_1) {//АИ Тяжелый
                number = scanner.nextInt();
            } else if (select == 3 && symbol == PLAYER_2) {
                if (gameField[1][1] == EMPTY) {
                    number = 5;
                } else if (gameField[0][0] == EMPTY) {
                    number = 7;
                } else if (gameField[0][2] == EMPTY) {
                    number = 9;
                } else if (gameField[2][0] == EMPTY) {
                    number = 1;
                } else if (gameField[2][2] == EMPTY) {
                    number = 3;
                }
                if (movenumber > 2) {
                    if (gameField[0][0] == PLAYER_2 && gameField[0][1] == PLAYER_2 && gameField[0][2] == EMPTY) {//алгоритм победы
                        number = 9;
                    } else if (gameField[0][0] == PLAYER_2 && gameField[0][2] == PLAYER_2 && gameField[0][1] == EMPTY) {
                        number = 8;
                    } else if (gameField[0][1] == PLAYER_2 && gameField[0][2] == PLAYER_2 && gameField[0][0] == EMPTY) {
                        number = 7;
                    } else if (gameField[0][0] == PLAYER_2 && gameField[1][0] == PLAYER_2 && gameField[2][0] == EMPTY) {
                        number = 1;
                    } else if (gameField[0][0] == PLAYER_2 && gameField[2][0] == PLAYER_2 && gameField[1][0] == EMPTY) {
                        number = 4;
                    } else if (gameField[2][0] == PLAYER_2 && gameField[1][0] == PLAYER_2 && gameField[0][0] == EMPTY) {
                        number = 7;
                    } else if (gameField[2][0] == PLAYER_2 && gameField[2][1] == PLAYER_2 && gameField[2][2] == EMPTY) {
                        number = 3;
                    } else if (gameField[2][0] == PLAYER_2 && gameField[2][2] == PLAYER_2 && gameField[2][1] == EMPTY) {
                        number = 2;
                    } else if (gameField[2][1] == PLAYER_2 && gameField[2][2] == PLAYER_2 && gameField[2][0] == EMPTY) {
                        number = 1;
                    } else if (gameField[0][2] == PLAYER_2 && gameField[1][2] == PLAYER_2 && gameField[2][2] == EMPTY) {
                        number = 3;
                    } else if (gameField[0][2] == PLAYER_2 && gameField[2][2] == PLAYER_2 && gameField[1][2] == EMPTY) {
                        number = 6;
                    } else if (gameField[1][2] == PLAYER_2 && gameField[2][2] == PLAYER_2 && gameField[0][2] == EMPTY) {
                        number = 9;
                    } else if (gameField[0][1] == PLAYER_2 && gameField[1][1] == PLAYER_2 && gameField[2][1] == EMPTY) {
                        number = 2;
                    } else if (gameField[1][1] == PLAYER_2 && gameField[2][1] == PLAYER_2 && gameField[0][1] == EMPTY) {
                        number = 8;
                    } else if (gameField[1][0] == PLAYER_2 && gameField[1][1] == PLAYER_2 && gameField[1][2] == EMPTY) {
                        number = 6;
                    } else if (gameField[1][1] == PLAYER_2 && gameField[1][2] == PLAYER_2 && gameField[1][0] == EMPTY) {
                        number = 4;
                    } else if (gameField[0][0] == PLAYER_2 && gameField[1][1] == PLAYER_2 && gameField[2][2] == EMPTY) {
                        number = 3;
                    } else if (gameField[1][1] == PLAYER_2 && gameField[2][2] == PLAYER_2 && gameField[0][0] == EMPTY) {
                        number = 7;
                    } else if (gameField[2][0] == PLAYER_2 && gameField[1][1] == PLAYER_2 && gameField[0][2] == EMPTY) {
                        number = 9;
                    } else if (gameField[1][1] == PLAYER_2 && gameField[0][2] == PLAYER_2 && gameField[2][0] == EMPTY) {
                        number = 1;

                    } else if (gameField[0][0] == PLAYER_1 && gameField[0][1] == PLAYER_1 && gameField[0][2] == EMPTY) {//алгоритм защиты от победы
                        number = 9;
                    } else if (gameField[0][0] == PLAYER_1 && gameField[0][2] == PLAYER_1 && gameField[0][1] == EMPTY) {
                        number = 8;
                    } else if (gameField[0][1] == PLAYER_1 && gameField[0][2] == PLAYER_1 && gameField[0][0] == EMPTY) {
                        number = 7;
                    } else if (gameField[0][0] == PLAYER_1 && gameField[1][0] == PLAYER_1 && gameField[2][0] == EMPTY) {
                        number = 1;
                    } else if (gameField[0][0] == PLAYER_1 && gameField[2][0] == PLAYER_1 && gameField[1][0] == EMPTY) {
                        number = 4;
                    } else if (gameField[2][0] == PLAYER_1 && gameField[1][0] == PLAYER_1 && gameField[0][0] == EMPTY) {
                        number = 7;
                    } else if (gameField[2][0] == PLAYER_1 && gameField[2][1] == PLAYER_1 && gameField[2][2] == EMPTY) {
                        number = 3;
                    } else if (gameField[2][0] == PLAYER_1 && gameField[2][2] == PLAYER_1 && gameField[2][1] == EMPTY) {
                        number = 2;
                    } else if (gameField[2][1] == PLAYER_1 && gameField[2][2] == PLAYER_1 && gameField[2][0] == EMPTY) {
                        number = 1;
                    } else if (gameField[0][2] == PLAYER_1 && gameField[1][2] == PLAYER_1 && gameField[2][2] == EMPTY) {
                        number = 3;
                    } else if (gameField[0][2] == PLAYER_1 && gameField[2][2] == PLAYER_1 && gameField[1][2] == EMPTY) {
                        number = 6;
                    } else if (gameField[1][2] == PLAYER_1 && gameField[2][2] == PLAYER_1 && gameField[0][2] == EMPTY) {
                        number = 9;
                    } else if (gameField[0][1] == PLAYER_1 && gameField[1][1] == PLAYER_1 && gameField[2][1] == EMPTY) {
                        number = 2;
                    } else if (gameField[1][1] == PLAYER_1 && gameField[2][1] == PLAYER_1 && gameField[0][1] == EMPTY) {
                        number = 8;
                    } else if (gameField[1][0] == PLAYER_1 && gameField[1][1] == PLAYER_1 && gameField[1][2] == EMPTY) {
                        number = 6;
                    } else if (gameField[1][1] == PLAYER_1 && gameField[1][2] == PLAYER_1 && gameField[1][0] == EMPTY) {
                        number = 4;
                    } else if (gameField[0][0] == PLAYER_1 && gameField[1][1] == PLAYER_1 && gameField[2][2] == EMPTY) {
                        number = 3;
                    } else if (gameField[1][1] == PLAYER_1 && gameField[2][2] == PLAYER_1 && gameField[0][0] == EMPTY) {
                        number = 7;
                    } else if (gameField[2][0] == PLAYER_1 && gameField[1][1] == PLAYER_1 && gameField[0][2] == EMPTY) {
                        number = 9;
                    } else if (gameField[1][1] == PLAYER_1 && gameField[0][2] == PLAYER_1 && gameField[2][0] == EMPTY) {
                        number = 1;
                    }

                }
            }

            if (select == 4) {//Два АИ с таймером
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                number = (int) (Math.random() * 10);

            }
            n = 2 - (number - 1) / 3;
            m = (number - 1) % 3;
        }
        while (number < 1 || number > 9 || gameField[n][m] != EMPTY);
        gameField[n][m] = symbol;
    }

    public static void showGameField(char[][] gameField) {
        System.out.println(gameField[0][0] + "|" + gameField[0][1] + "|" + gameField[0][2]);
        System.out.println("-----");
        System.out.println(gameField[1][0] + "|" + gameField[1][1] + "|" + gameField[1][2]);
        System.out.println("-----");
        System.out.println(gameField[2][0] + "|" + gameField[2][1] + "|" + gameField[2][2]);
    }

    public static int checkField(char[][] gameField) {
        for (int i = 0; i < 3; i++) {
            if (gameField[i][0] == gameField[i][1]
                    && gameField[i][0] == gameField[i][2]) {
                if (gameField[i][0] == PLAYER_1)
                    return WIN_1;
                if (gameField[i][0] == PLAYER_2)
                    return WIN_2;
            }
            if (gameField[0][i] == gameField[1][i]
                    && gameField[0][i] == gameField[2][i]) {
                if (gameField[0][i] == PLAYER_1)
                    return WIN_1;
                if (gameField[0][i] == PLAYER_2)
                    return WIN_2;
            }
        }
        if (gameField[0][0] == gameField[1][1] && gameField[0][0] == gameField[2][2]) {
            if (gameField[0][0] == PLAYER_1)
                return WIN_1;
            if (gameField[0][0] == PLAYER_2)
                return WIN_2;
        }
        if (gameField[2][0] == gameField[1][1] && gameField[2][0] == gameField[0][2]) {
            if (gameField[2][0] == PLAYER_1)
                return WIN_1;
            if (gameField[2][0] == PLAYER_2)
                return WIN_2;
        }
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (gameField[i][j] == EMPTY)
                    return CONTINUE; //Продолжаем

        return DRAW; //Ничья
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


