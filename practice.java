public class practice {

public static int alg4(int[] a) {
    int result = a[0];

    for (int i=1; i< a.length; i++)
        if (a[i] > result)
            result = a[i];
    return result;
    System.out.print();
    }
}

