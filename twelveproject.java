package by.itstep;

/**
 * Created by st on 04.12.2017.
 */
public class twelveproject {
    public static void main2(String[] args) {
        System.out.println(Min(2876341));

    }

    public static int Min(int x) {
        if (x < 10)
            return x;
        int min3 = Min(x / 10);
        int min2 = x % 10;
        if (min3 < min2)
            return min3;
        else
            return min2;

    }

    public static void main1(String[] args) {//задача число наоборот рекурсией
        r(234);
        r(5 * 5 * 11 * 17 * 101, 2);
    }

    public static void r(int x) {
        for (int i = 2; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
                r(x / i);
                break;
            }
        }


    }

    public static void main4(String[] args) {
        del(108, 1);
    }

    public static void r(int x, int d) {

        if (x <= 1)
            return;
        if (x % d == 0) {
            System.out.println(d);
            r(x / d, 2);
        } else if (d + 1 < Math.sqrt(x))
            r(x, d + 1);
        else
            System.out.println(x);

    }

    public static void del(int x, int d) {
        if (d > x / 2) {
            System.out.println(x);
            return;
        }
        if (x % d == 0)
            System.out.println(d);
        del(x, d + 1);


    }

    public static void main45(String[] args) {
        int[] a = new int[10];
        a[4] = 34;
        a[5] = 2;
        System.out.println(a[4] + a[5]);
    }

    public static void main7(String[] args) {
        int[] a = new int[10];
        System.out.println("size: " + a.length);
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 1000) - 10000;
            System.out.print(" a[" + i + "]=" + a[i]);
        }

        System.out.println();
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];

        }
        System.out.println("max=" + max);
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = 0;
            System.out.print(" a[" + i + "]=" + a[i]);
        }
        System.out.println();

        int[] b = new int[10];
        for (int l = 0; l < b.length; l++) {
            if (l % 2 == 0)
                b[l] = 0;
            else
                b[l] = 1;
            System.out.print(" b[" + l + "]=" + b[l]);
        }
        System.out.println();

        int[] c = new int[10];
        for (int t = 0; t < c.length; t++) {
            c[t] = t + 1;
            System.out.print(" c[" + t + "]=" + c[t]);
        }

        System.out.println();

        int[] d = new int[10];
        int size = d.length;
        for (int q = 0; q < d.length; q++) {
            d[q] = size;
            size--;
            System.out.print(" d[" + q + "]=" + d[q]);
        }
        System.out.println();

        int[] f = new int[10];
        for (int y = 0; y < d.length; y++) {
            f[y] = (int) Math.pow(2, y);

            System.out.print(" f[" + y + "]=" + f[y]);
        }
        System.out.println();

        System.out.println(giveMeNextPrime(3));
    }


    public static int giveMeNextPrime(int x) {//Флаг простоты
        x++;
        boolean isPrime;
        do {
            isPrime = true;// даю числу шанс
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    isPrime = false;//ты мне не подходишь
                    x++;//будем проверять следующее
                    break;
                }
            }

        } while (!isPrime);
        return x;
    }

}




