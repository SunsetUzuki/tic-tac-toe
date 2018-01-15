package by.itstep;

/**
 * Created by st on 13.12.2017.
 */
public class fifteenproject {

    public static void Mini(int n[][]) {
        for (int j=0;j<n[0].length;j++){
            int max=n[0][j];
            for(int i=0;i<n.length;i++){
                if(n[i][j]>max)
                    max=n[i][j];
            }
            System.out.println("Столбец "+j+" макс"+max);

        }

    }
    public static void Min(int n[][]) {
        int min = n[0][0];
        int sum = 0;
        int maxStr;
        int maxStol=0;
        for (int i = 0; i < n.length; i++) {
            maxStr = 0;

            for (int j = 0; j < n[i].length; j++) {
                sum = sum + n[i][j];
                if (min >= n[i][j]) {
                    min = n[i][j];
                }
                if (maxStr <= n[i][j]) {
                    maxStr = n[i][j];
                }



            }


            System.out.println("max в строке " + i + " = " + maxStr);


        } for (int j=0;j<n[0].length;j++){
            maxStol=0;
            for (int i=0;i<n.length;i++){
            if (maxStol<n[i][j])
                maxStol=n[i][j];}
            System.out.println("max в столбце " + j + " = " + maxStol);}
        System.out.println(sum);
        System.out.println(min);
    }

    public static void main(String[] args) {//для заполнения
        int[][] x = new int[3][5];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < x.length; i++) {//ля вывода на экран
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
        Min(x);
        Mini(x);


    }

    public static void main2(String[] args) {
        int[] a = new int[10];
        fillByRandom(a, 10);
        printArray(a);
        printArray(ZZ(a));
        printArray(ZZZ(a));


    }

    public static void main4(String[] args) {
        int[] x = createRandomArray(10, 100);
        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
            for (int j = 0; j < 10; j++) {
                if (x[j] == i)
                    System.out.print(x[j] + " ");
            }
        }
    }

    public static void main5(String[] args) {
        int[] MasMax = createRandomArray(10, 8);
        printArray(MasMax);
        int[] a = new int[10];
        int min = MasMax[0];
        int max = MasMax[0];
        for (int i = 0; i < MasMax.length; i++) {
            if (MasMax[i] < min)
                min = MasMax[i];
            if (MasMax[i] > max)
                max = MasMax[i];

        }
        System.out.print(min + " ");
        int newMin = max;
        for (int j = 1; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                if (MasMax[i] < newMin && MasMax[i] > min)
                    newMin = MasMax[i];
            }
            System.out.print(newMin + " ");
//////////////////////////////////

        }


    }


    public static void main3(String[] args) {
        int[] x = createRandomArray(10, 8);
        printArray(x);
        int[] a = new int[10];
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            boolean isOK = true;//int dublicate=0;
            for (int j = 0; j < count; j++) {
                if (x[i] == a[j]) {//ЧИСЛО НЕ ПОДХОДИТ
                    isOK = false;//dublicate++;
                    break;//-------
                }
            }
            if (isOK) {//if(dublicate==0)
                a[count] = x[i];
                count++;
            }

        }
        for (int i = 0; i < count; i++)
            System.out.print(a[i] + " ");

    }

    public static int[] createRandomArray(int size, int random) {
        int[] randomArray = new int[size];
        for (int i = 0; i < size; i++) {
            randomArray[i] = (int) (random * Math.random());
        }

        return randomArray;
    }

    public static int[] ZZ(int b[]) {//задача про парные в массиве
        int[] q = new int[b.length];
        int o = 0;
        for (int i = 0; i < b.length; i++) {
            int t = 0;
            for (int j = i; j < b.length; j++) {
                if (b[i] == b[j])
                    t++;

            }
            if (t == 1) {
                q[o] = b[i];
                o++;
            }

        }
        int[] m = new int[o];
        for (int i = 0; i < o; i++) {
            m[i] = q[i];
        }
        return m;

    }

    public static int[] ZZZ(int e[]) {
        int[] q = new int[e.length];
        int o = 0;
        for (int i = 0; i < e.length; i++) {
            int t = 0;
            for (int j = 0; j < e.length; j++) {
                if (e[i] == e[j])
                    t++;

            }
            if (t == 1) {
                q[o] = e[i];
                o++;
            }

        }
        int[] m = new int[o];
        for (int i = 0; i < o; i++) {
            m[i] = q[i];
        }
        return m;

    }


    public static void fillByRandom(int a[], int max) {
        for (int i = 0; i < a.length; i++)
            a[i] = (int) (Math.random() * max);
    }

    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++)
            System.out.printf("[%d]=%d ", i, a[i]);
        System.out.println();
    }
}

