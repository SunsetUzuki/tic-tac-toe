package by.itstep;

import java.util.Scanner;

/**
 * Created by st on 11.12.2017.
 */
public class fourteenproject {
    public static void main3(String[] args) {
        int[] a = new int[10];
        for (int x = 0; x < a.length; x++) {
            a[x] = x + 1;
        }
        printArray(a);
        // int []pari=Pari(a);
        // printArray(pari);
        printArray(Sme(a, 1));

    }

    public static void fillByRandom(int a[], int max) {
        for (int i = 0; i < a.length; i++)
            a[i] = (int) (Math.random() * max);

    }

    public static void fillByValue(int a[], int value) {
        for (int i = 0; i < a.length; i++)
            a[i] = value;

    }

    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++)
            System.out.printf("[%d]=%d ", i, a[i]);
        System.out.println();

    }

    public static int[] copyAndMultiply(int[] sourceArray, int m) {
        int[] newArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++)
            newArray[i] = sourceArray[i] * m;
        return newArray;

    }

    public static int[] Pari(int p[]) {
        for (int i = 0; i < p.length - 1; i = i + 2) {
            int x = p[i + 1];
            p[i + 1] = p[i];
            p[i] = x;


        }

        return p;

    }

    public static int[] Sme(int b[], int n) {
        int x;
        for (int i = 0; i < n; i++) {
            x = b[b.length - 1];
            for (int nn = b.length - 1; nn > 1; nn--) {
                b[nn] = b[nn - 1];
            }
            b[0] = x;

        }
        return b;
    }

    public static void main2(String[] args) {
        int[] a = new int[10];
        fillByRandom(a, 100);
        printArray(a);
        int n = 3 % a.length;
        int[] buffer = new int[n];
        for (int i = 0; i < n; i++)
            buffer[i] = a[a.length - n + i];
        printArray(buffer);
        for (int i = a.length - 1; i >= n; i--)
            a[i] = a[i - n];

        for (int i = 0; i < n; i++)
            a[i] = buffer[i];
        printArray(a);

    }

    public static void main6(String[] args) {
        int[] x = new int[10];
        fillByRandom(x, 100);
        printArray(x);

        int max = 0;
        int currentCount = 0;
        int indexOfFirst = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0)
                currentCount++;

            else {
                if (currentCount > max) {
                    max = currentCount;
                    indexOfFirst = i - max;
                }
                currentCount = 0;
            }
        }
        System.out.println(max);
        while (x[indexOfFirst] % 2 == 0) {//for (int i=indexOfFirst; i<indexOfFirst+max;i++) system/out/print(x[i]+" "); s
            System.out.print(x[indexOfFirst] + " ");
            indexOfFirst++;
        }
    }

    public static void main7(String[] args) {
        int x;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число от 0 до 10");
            System.out.println("Введите 100 для выхода");
            x = sc.nextInt();

            switch (x) {
                case 1:
                    System.out.println("Один");
                    break;
                case 2:
                    System.out.println("Два");
                    break;
                case 3:
                    System.out.println("Три");
                    break;
                case 4:
                    System.out.println("Четыре");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("Число больше 4х, меньше 10ти");
                    break;
                default:
                    System.out.println("Что за число?");
            }


        } while (x != 100);

    }

    public static void main4(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
            for (int j = 0; j < i; j++) {

                while (a[i] == a[j]) {
                    a[i] = (int) (Math.random() * 10);
                    j = 0;
                }
            }


        }
        printArray(a);


    }

    public static void main(String[] args) {
        final int SIZE = 12;
        final int RANDOM_LIMIT = 12;

        int[] x = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            x[i] = (int) (Math.random() * RANDOM_LIMIT);
            for (int j = 0; j < i; j++) {

                if (x[i] == x[j]) {
                    i--;
                    break;
                }
            }
        }printArray(x);


    }
}
