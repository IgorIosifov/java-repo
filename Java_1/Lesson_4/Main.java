package ru.geekbrains.lesson_java_4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static int SIZE = 5;

    static char[][] field = new char[SIZE][SIZE];
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    static char PLAYER_DOT = 'X';
    static char AI_DOT = '0';
    static char EMPTY_DOT = '.';

    static void initField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }

    static void printField() {
        for (int i = 0; i < SIZE; i++) {
            if (i == 0) {
                System.out.print("   " + (i + 1) + "  ");
            } else {
                System.out.print((i + 1) + "  ");
            }
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(field[i][j] + " | ");
            }
            System.out.println();
        }
    }

    static void setSym(int y, int x, char sym) {
        field[y][x] = sym;
    }

    static void playerStep() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты X и Y (1-3)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y, x));
        setSym(y, x, PLAYER_DOT);
    }

    /**
     * Ход компьютера
     */
    static void aiStep() {

        //проверка + счетчик
        System.out.println("Ходит комп");
        int x;
        int y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(y, x));
        setSym(y, x, AI_DOT);
    }

    /**
     * Возможность установки X или 0 в поле
     *
     * @param y - координата по y
     * @param x - координата по x
     * @return можно или нет
     */
    static boolean isCellValid(int y, int x) {
        if (x < 0 || x > SIZE || y < 0 || y > SIZE) {
            return false;
        }
        return field[y][x] == EMPTY_DOT;
    }

    static boolean checkWin(char sym) {
        int counter=0;
        int win_counter;
        if (SIZE==3) {
            win_counter=SIZE;
        }
        else {
            win_counter=SIZE-1;
        }
        //region Проверка

 //checking the strokes

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == sym) {
                    counter++;
                }
                if (counter == win_counter) {
                    return true;
                }
            }counter=0;
        }

//checking the column

        for (int j = 0; j < SIZE; j++) {
            for (int i = 0; i < SIZE; i++) {
                if (field[i][j] == sym) {
                    counter++;
                }

                if (counter == win_counter) {
                    return true;
                }
            }counter=0;
        }

       // checking the diagonals
        for (int j = 0, i =0; j < SIZE; j++, i++) {
                if (field[i][j] == sym) {
                    counter++;
                }
            if (counter == win_counter) {
                return true;
            }
        }counter=0;

        for (int j = 0, i =SIZE-1; j < SIZE; j++, i--) {
            if (field[i][j] == sym) {
                counter++;
            }
            if (counter == win_counter) {
                return true;
            }
        }counter=0;

        for (int j = 1, i =0; j < SIZE; j++, i++) {
            if (field[i][j] == sym) {
                counter++;
            }
            if (counter == win_counter) {
                return true;
            }
        }counter=0;

        for (int j = 0, i =1; i < SIZE; j++, i++) {
            if (field[i][j] == sym) {
                counter++;
            }
            if (counter == win_counter) {
                return true;
            }
        }counter=0;

        for (int j = 0, i =SIZE-2; i >= 0; j++, i--) {
            if (field[i][j] == sym) {
                counter++;
            }
            if (counter == win_counter) {
                return true;
            }
        }counter=0;

        for (int j = 1, i =SIZE-1; j < SIZE; j++, i--) {
            if (field[i][j] == sym) {
                counter++;
            }
            if (counter == win_counter) {
                return true;
            }
        }

        return false;
        }

    //endregion



    static boolean isFieldFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == EMPTY_DOT) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        initField();
        printField();

        while (true) {
            playerStep();
            printField();

            if (checkWin(PLAYER_DOT)) {
                System.out.println("Игрок выиграл!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiStep();
            printField();
            if (checkWin(AI_DOT)) {
                System.out.println("Комп выиграл!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }
}

