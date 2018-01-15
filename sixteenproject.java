package by.itstep;

/**
 * Created by st on 18.12.2017.
 */
public class sixteenproject {
    public static void main2(String[] args) {
        int[][] x = new int[10][10];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = (int) (Math.random() * 10);
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        Pari(x);
        System.out.println();
        PariSt(x);
    }

    public static void Pari(int x[][]) {
        int q;
        for (int i = 0; i < x.length; i = i + 2) {
            if (i >= x.length - 1)
                break;
            for (int j = 0; j < x[i].length; j++) {
                q = x[i][j];
                x[i][j] = x[i + 1][j];
                x[i + 1][j] = q;

            }

        }
        PrintArray(x);
    }

    public static void PariSt(int x[][]) {
        int q;
        for (int j = 0; j < x[0].length; j = j + 2) {
            if (j >= x[0].length - 1)
                break;
            for (int i = 0; i < x.length; i++) {
                q = x[i][j];
                x[i][j] = x[i][j + 1];
                x[i][j + 1] = q;

            }

        }
        PrintArray(x);

    }


    public static void main3(String[] args) {
        int[] x = new int[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * 100);


        }
        printArray(x);
        printArray(Sort(x));
    }

    public static int[] Sort(int a[]) {//способ сортировки "пузырек"
        int buf;
        for (int i = 0; i < a.length - 1; i++) {// i показывает сколько элементов уже на своих местах
            int swapCount = 0;
            final int RIGHT_FRIEND = a.length - 1 - i;
            final int LEFT_FRIEND = RIGHT_FRIEND - 1;
            for (int j = 0; j <= LEFT_FRIEND; j++) {
                buf = a[j];
                if (a[j] > a[j + 1]) {
                    a[j] = a[j + 1];
                    a[j + 1] = buf;
                    swapCount++;
                } else if (j == LEFT_FRIEND) {
                    i++;

                }
                if (swapCount == 0)
                    break;
            }
        }
        return a;
    }

    public static void main4(String[] args) {
        int[] x = createRandomArray(10, 999);
        printArray(x);

        for (int i = 0; i < Math.pow(x.length, 3); i++) {
            int a = (int) (Math.random() * x.length);
            int b = (int) (Math.random() * x.length);
            if (a >= b)
                continue;
            if (x[a] > x[b]) {
                int temp = x[a];
                x[a] = x[b];
                x[b] = temp;
            }
        }
        printArray(x);
    }

    public static void main(String[] args) {//генерация сразу отсортированного массива
        int[]x;
        boolean ok;
        long attemptsCount=0;
        long startTime=System.nanoTime();//таймер выполнения
        do{x=createRandomArray(11,100);
            ok=isArraySort(x);
            attemptsCount++;

        }while (!ok);
        long endTime=System.nanoTime();
        System.out.println((endTime-startTime)/(1000*1000));//милисекунды (Результат/1000 = секунды)
        printArray(x);
        System.out.println(attemptsCount);
    }

    public static boolean isArraySort(int[] array) {
        for (int i=0;i<array.length-1;i++){
            if (array[i]>array[i+1])
                return false;
        }
        return true;

    }


    // ФУНКЦИИ ДОП.

    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++)
            System.out.printf("[%d]=%d ", i, a[i]);
        System.out.println();

    }

    public static int[][] PrintArray(int q[][]) {
        for (int i = 0; i < q.length; i++) {
            for (int j = 0; j < q[i].length; j++) {
                System.out.print(q[i][j] + " ");

            }
            System.out.println();
        }
        return q;
    }

    public static void fillByRandom(int a[], int max) {
        for (int i = 0; i < a.length; i++)
            a[i] = (int) (Math.random() * max);
    }

    public static int[] createRandomArray(int size, int random) {
        int[] randomArray = new int[size];
        for (int i = 0; i < size; i++) {
            randomArray[i] = (int) (random * Math.random());
        } return randomArray;

    }
}
