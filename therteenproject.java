package by.itstep;

/**
 * Created by st on 06.12.2017.
 */
public class therteenproject {
    public static void main2(String[] args) {
int[]a =new int[10];
for(int x=0;x<a.length; x++){
    a[x]=Fib(x);
    System.out.print(" a["+x+"]="+a[x]);
        }

    }

    public static int Fib(int x) {
        if (x==0)
            return x;
        if(x==1)
            return x;
        x=Fib(x-2)+Fib(x-1);
        return x;

        }

    public static void main4(String[] args) {
        int[]x=new int [10];
        x[4]=100;
        int []y=x;
        x=new int [50];
        x[4]=555;
        b(y);
        System.out.println(y[4]);
    }

    public static void main3(String[] args) {
        int[]x=new int[10];
        x[4]=100;
        a(x);
        System.out.println(x[4]);
    }

    public static void a(int[]q) {
        q[4]=45;
    }

    public static void b(int[]q) {
        System.out.println(q[4]);
        q=new int[5];
        q[4]=9;
        System.out.println(q[4]);

    }

    public static void main7 (String[] args) {
        int []x=new int[15];
        fillByValue(x, 3);
        int[]r=copyAndMultiply(x, 2);
        printArray(x);
        printArray(r);

    }

    public static void fillByRandom(int a[],int max) {
        for(int i=0; i<a.length;i++)
            a[i]=(int)(Math.random()*max);

    }
    public static void fillByValue(int a[],int value) {
        for(int i=0; i<a.length;i++)
            a[i]=value;

    }
    public static void printArray(int a[]) {
        for(int i=0; i<a.length;i++)
            System.out.printf("[%d]=%d ", i, a[i]);
        System.out.println();

    }

    public static int[] copyAndMultiply(int[]sourceArray, int m) {
    int[] newArray=new int[sourceArray.length];
    for(int i=0;i<sourceArray.length;i++)
        newArray[i]=sourceArray[i]*m;
    return newArray;

    }

    public static void main(String[] args) {
        int []x=new int[10];
        fillByRandom(x, 10);
        printArray(x);
       int []r=P(x);
       printArray(r);
       int []n=Para(x);
       printArray(n);


    }
    public static int[] P(int[]source) {
        int[] newMas = new int[source.length];
        for (int i = source.length; i>= 0; i--) {
            for(int j=0; j<source.length-i;j++){
                newMas[i]=source[j];
            }

        }
        return newMas;

    }

    public static int[] Para(int[]M) {
        int[] newMas = new int[M.length];
        for (int i = M.length; i>= 0; i--) {
            for(int j=0; j<M.length-i;j++){
                if (i%2!=0&&j%2!=0){
                    newMas[i]=M[j];
                }


            }

        }
        return newMas;

    }



}

