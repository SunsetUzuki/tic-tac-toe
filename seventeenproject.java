package by.itstep;

/**
 * Created by st on 20.12.2017.
 */
public class seventeenproject {
    public static void main(String[] args) {
        int[] y = createRandomArray(30, 100);
        printArray(y);
        System.out.println(searchInArray(y, 10));
        int[] j = new int[20];
        for (int x = 0; x < j.length; x++) {
            j[x] = x + 1;
        }
        printArray(j);
        System.out.println(binarySearch(17,j,0,j.length));

    }

    public static int binarySearch(int item,int[]x,int start,int end) {//ФУНКЦИЯ БИНАРНОГО ПОИСКА В МАССИВЕ
        if(start==end&&x[start]!=item)
            return-1;
        int half=start+(end-start)/2;
        System.out.println("start:"+start+" end:"+end+" half:"+half);
        if(x[half]==item)
            return half;
        if (item<x[half])
            return binarySearch(item,x,start,half-1);
        else
            return binarySearch(item,x,half+1,end);



    }





    public static void main4(String[] args) {//МЕТОД СОРТИРОВКИ МАССИВА "ВСТАВКАМИ"
        int[] x = createRandomArray(10, 100);
        printArray(x);
        for (int i = 1; i < x.length; i++) {
            int index = i;
            while (index >= 1 && x[index - 1] > x[index]) {
                int temp = x[index - 1];
                x[index - 1] = x[index];
                x[index] = temp;
                index--;
            }
        }
        printArray(x);
    }

    public static void main3(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        for (int k = 0; k < a.length; k++) {
            a[k] = (int) (Math.random() * 10);
            b[k] = (int) (Math.random() * 10);
        }
        printArray(b);
        printArray(a);
        System.out.println();
        Select(a);
        Selecter(b);
    }

    public static void Select(int a[]) {//МЕТОД СОРТИРОВКИ МАССИВА "ВЫБОРОМ"

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int n = a[j];
                    a[j] = a[i];
                    a[i] = n;

                }


            }
        }
        printArray(a);

    }

    public static void Selecter(int[] a) {
        int[] x = createRandomArray(10, 100);
        printArray(x);
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;

                }

            }
            System.out.println("minIndex=" + minIndex);
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
            printArray(a);
        }
    }


    public static void main2(String[] args) {
        int[] a = new int[10];
        for (int k = 0; k < a.length; k++) {
            a[k] = (int) (Math.random() * 10);
        }
        printArray(a);
        Puz(a);
    }

    public static void Puz(int a[]) {
        int n;
        for (int i = 0; i < a.length - 1; i++) {
            int counter = 0;
            for (int j = 0; j < a.length - 2 - i; j++) {
                if (a[j] > a[j + 1]) {
                    n = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = n;
                    counter++;
                } else if (j == a.length - 2 - i) {
                    i++;
                }
            }
            if (counter == 0)
                break;
        }
        printArray(a);


    }


    //ДОП ФУНКЦИИ
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
                System.out.print(q[i][j] + " ");

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
