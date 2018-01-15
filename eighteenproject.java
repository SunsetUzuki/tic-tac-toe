package by.itstep;

/**
 * Created by st on 08.01.2018.
 */
public class eighteenproject {
    public static void main(String[] args) {
        int a[] = new int[10];
        fillByRandom(a, 10);
        printArray(a);
        int b[] = new int[20];
        fillByRandom(b, 10);
        printArray(b);
        System.out.println("Общие числа в массивах: ");
        Common(a, b);
        System.out.println();
        System.out.println("");
        MassiveA(a, b);
        System.out.println();
        int[][] n = new int[3][3];
        fillByRandomDouble(n, 10);
        PrintArray(n);
        System.out.println("Определитель матрицы равен: " + Matrix(n));


    }

    public static int Matrix(int a[][]) {
        int M = a[0][0] * a[1][1] * a[2][2] - a[0][0] * a[1][2] * a[2][1] - a[0][1] * a[1][0] * a[2][2] + a[0][1] * a[1][2] * a[2][0] + a[0][2] * a[1][0] * a[2][1] - a[0][2] * a[1][1] * a[2][0];
        return M;
    }

    public static void MassiveA(int x[], int y[]) {
        int l[] = new int[x.length];
        int n = 0;

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                if (x[i] == y[j]) {
                    l[i] = y[j];
                    n++;
                    break;

                }

            }
        }
        System.out.println("Числа которые есть только в массиве А: ");
        for (int i = 0; i < x.length; i++) {
            boolean m = true;
            for (int j = 0; j < l.length; j++) {
                if (x[i] == l[j]) {
                    m = false;
                }
            }
            if (m == true) {
                System.out.print(" " + x[i]);
            }
        }
        System.out.println();
        System.out.println("Числа которые есть только в массиве B: ");
        for (int i = 0; i < y.length; i++) {
            boolean p = true;
            for (int j = 0; j < l.length; j++) {
                if (y[i] == l[j]) {
                    p = false;

                }
            }
            if (p == true)
                System.out.print(" " + y[i]);
        }

    }


    public static void Common(int x[], int y[]) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                if (x[i] == y[j]) {
                    System.out.print(x[i] + " ");
                }

            }

        }

    }


    //ДОП ФУНКЦИИ
    public static void fillByRandomDouble(int a[][], int max) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * max);
            }
        }

    }

    public static void fillByRandom(int a[], int max) {
        for (int i = 0; i < a.length; i++)
            a[i] = (int) (Math.random() * max);
    }

    public static int[] createRandomArray(int size, int random) {
        int[] randomArray = new int[size];
        for (int i = 0; i < size; i++) {
            randomArray[i] = (int) (random * Math.random());
        }
        return randomArray;

    }

    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++)
            System.out.printf("[%d]=%d ", i, a[i]);
        System.out.println();
    }

    public static int[][] PrintArray(int q[][]) {
        for (int i = 0; i < q.length; i++) {
            for (int j = 0; j < q[i].length; j++) {
                System.out.print(q[i][j] + "\t");

            }
            System.out.println();
        }
        return q;
    }

    public static int searchInArray(int m[], int p) {//МЕТОД ПОИСКА ЧИСЛА В МАССИВЕ
        for (int i = 0; i < m.length; i++)
            if (m[i] == p)
                return i;
        return -1;


    }
}
