package by.itstep;

import java.util.Scanner;

public class crosszeroeshome {

    public static void main(String[] args) {
        int select;
        int movenumber = 0;
        System.out.println("Выберите режим игры:\n1 - два игрока\n2 - против компа ЛЕГКО\n3 - против компа ТЯЖЕЛО\n4 - два компа против друг друга ");
        Scanner scanner = new Scanner(System.in);
        select = scanner.nextInt();

        char[][] gameField = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        showGameField(gameField);
        int result;
        char symbol = 'X';
        do {
            movenumber++;
            makeMove(gameField, symbol, select, movenumber);
            symbol = symbol == 'X' ? '0' : 'X';//игровой процесс основа
            showGameField(gameField);
            result = checkField(gameField);
        } while (result == 0);
        switch (result) {
            case 1:
                System.out.println("Победа X");
                break;
            case 2:
                System.out.println("Победа 0");
                break;
            case 3:
                System.out.println("Ничья");
        }


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

            if (select == 2 && symbol == '0') {//АИ легкий
                number = (int) (Math.random() * 10);
            } else if (select == 2 && symbol == 'X') {
                number = scanner.nextInt();
            }

            if (select == 3 && symbol == 'X') {//АИ Тяжелый
                number = scanner.nextInt();
            } else if (select == 3 && symbol == '0') {
                if (gameField[1][1] == ' ') {
                    number = 5;
                } else if (gameField[0][0] == ' ') {
                    number = 7;
                } else if (gameField[0][2] == ' ') {
                    number = 9;
                } else if (gameField[2][0] == ' ') {
                    number = 1;
                } else if (gameField[2][2] == ' ') {
                    number = 3;
                }
                if (movenumber > 2) {
                    if (gameField[0][0] == '0' && gameField[0][1] == '0' && gameField[0][2] == ' ') {//алгоритм победы
                        number = 9;
                    } else if (gameField[0][0] == '0' && gameField[0][2] == '0' && gameField[0][1] == ' ') {
                        number = 8;
                    } else if (gameField[0][1] == '0' && gameField[0][2] == '0' && gameField[0][0] == ' ') {
                        number = 7;
                    } else if (gameField[0][0] == '0' && gameField[1][0] == '0' && gameField[2][0] == ' ') {
                        number = 1;
                    } else if (gameField[0][0] == '0' && gameField[2][0] == '0' && gameField[1][0] == ' ') {
                        number = 4;
                    } else if (gameField[2][0] == '0' && gameField[1][0] == '0' && gameField[0][0] == ' ') {
                        number = 7;
                    } else if (gameField[2][0] == '0' && gameField[2][1] == '0' && gameField[2][2] == ' ') {
                        number = 3;
                    } else if (gameField[2][0] == '0' && gameField[2][2] == '0' && gameField[2][1] == ' ') {
                        number = 2;
                    } else if (gameField[2][1] == '0' && gameField[2][2] == '0' && gameField[2][0] == ' ') {
                        number = 1;
                    } else if (gameField[0][2] == '0' && gameField[1][2] == '0' && gameField[2][2] == ' ') {
                        number = 3;
                    } else if (gameField[0][2] == '0' && gameField[2][2] == '0' && gameField[1][2] == ' ') {
                        number = 6;
                    } else if (gameField[1][2] == '0' && gameField[2][2] == '0' && gameField[0][2] == ' ') {
                        number = 9;
                    } else if (gameField[0][1] == '0' && gameField[1][1] == '0' && gameField[2][1] == ' ') {
                        number = 2;
                    } else if (gameField[1][1] == '0' && gameField[2][1] == '0' && gameField[0][1] == ' ') {
                        number = 8;
                    } else if (gameField[1][0] == '0' && gameField[1][1] == '0' && gameField[1][2] == ' ') {
                        number = 6;
                    } else if (gameField[1][1] == '0' && gameField[1][2] == '0' && gameField[1][0] == ' ') {
                        number = 4;
                    } else if (gameField[0][0] == '0' && gameField[1][1] == '0' && gameField[2][2] == ' ') {
                        number = 3;
                    } else if (gameField[1][1] == '0' && gameField[2][2] == '0' && gameField[0][0] == ' ') {
                        number = 7;
                    } else if (gameField[2][0] == '0' && gameField[1][1] == '0' && gameField[0][2] == ' ') {
                        number = 9;
                    } else if (gameField[1][1] == '0' && gameField[0][2] == '0' && gameField[2][0] == ' ') {
                        number = 1;

                    } else if (gameField[0][0] == 'X' && gameField[0][1] == 'X' && gameField[0][2] == ' ') {//алгоритм защиты от победы
                        number = 9;
                    } else if (gameField[0][0] == 'X' && gameField[0][2] == 'X' && gameField[0][1] == ' ') {
                        number = 8;
                    } else if (gameField[0][1] == 'X' && gameField[0][2] == 'X' && gameField[0][0] == ' ') {
                        number = 7;
                    } else if (gameField[0][0] == 'X' && gameField[1][0] == 'X' && gameField[2][0] == ' ') {
                        number = 1;
                    } else if (gameField[0][0] == 'X' && gameField[2][0] == 'X' && gameField[1][0] == ' ') {
                        number = 4;
                    } else if (gameField[2][0] == 'X' && gameField[1][0] == 'X' && gameField[0][0] == ' ') {
                        number = 7;
                    } else if (gameField[2][0] == 'X' && gameField[2][1] == 'X' && gameField[2][2] == ' ') {
                        number = 3;
                    } else if (gameField[2][0] == 'X' && gameField[2][2] == 'X' && gameField[2][1] == ' ') {
                        number = 2;
                    } else if (gameField[2][1] == 'X' && gameField[2][2] == 'X' && gameField[2][0] == ' ') {
                        number = 1;
                    } else if (gameField[0][2] == 'X' && gameField[1][2] == 'X' && gameField[2][2] == ' ') {
                        number = 3;
                    } else if (gameField[0][2] == 'X' && gameField[2][2] == 'X' && gameField[1][2] == ' ') {
                        number = 6;
                    } else if (gameField[1][2] == 'X' && gameField[2][2] == 'X' && gameField[0][2] == ' ') {
                        number = 9;
                    } else if (gameField[0][1] == 'X' && gameField[1][1] == 'X' && gameField[2][1] == ' ') {
                        number = 2;
                    } else if (gameField[1][1] == 'X' && gameField[2][1] == 'X' && gameField[0][1] == ' ') {
                        number = 8;
                    } else if (gameField[1][0] == 'X' && gameField[1][1] == 'X' && gameField[1][2] == ' ') {
                        number = 6;
                    } else if (gameField[1][1] == 'X' && gameField[1][2] == 'X' && gameField[1][0] == ' ') {
                        number = 4;
                    } else if (gameField[0][0] == 'X' && gameField[1][1] == 'X' && gameField[2][2] == ' ') {
                        number = 3;
                    } else if (gameField[1][1] == 'X' && gameField[2][2] == 'X' && gameField[0][0] == ' ') {
                        number = 7;
                    } else if (gameField[2][0] == 'X' && gameField[1][1] == 'X' && gameField[0][2] == ' ') {
                        number = 9;
                    } else if (gameField[1][1] == 'X' && gameField[0][2] == 'X' && gameField[2][0] == ' ') {
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
        while (number < 1 || number > 9 || gameField[n][m] != ' ') ;
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
                if (gameField[i][0] == 'X')
                    return 1;
                if (gameField[i][0] == '0')
                    return 2;
            }
            if (gameField[0][i] == gameField[1][i]
                    && gameField[0][i] == gameField[2][i]) {
                if (gameField[0][i] == 'X')
                    return 1;
                if (gameField[0][i] == '0')
                    return 2;
            }
        }
        if (gameField[0][0] == gameField[1][1] && gameField[0][0] == gameField[2][2]) {
            if (gameField[0][0] == 'X')
                return 1;
            if (gameField[0][0] == '0')
                return 2;
        }
        if (gameField[2][0] == gameField[1][1] && gameField[2][0] == gameField[0][2]) {
            if (gameField[2][0] == 'X')
                return 1;
            if (gameField[2][0] == '0')
                return 2;
        }
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (gameField[i][j] == ' ')
                    return 0; //Продолжаем

        return 3; //Ничья
    }
}


