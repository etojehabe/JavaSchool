package arrays;

public class Bubble {

    public static void main(String[] args) {

/*        int[] array = new int[]{5, 0, -2, 7, 3};

        int sortIndex = array.length;
        int numberOfSwap = 1;
        while (numberOfSwap > 0) {
            numberOfSwap = 0;
            for (int i = 0; i < sortIndex - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    numberOfSwap += 1;
                }
            }
            sortIndex -= 1;
        }
        System.out.println(Arrays.toString(array));
    }*/

        byte a[] = {3, 5, 1, 6, 2, 4};

        for (int i = 0; i < a.length; i++) {
            byte min = a[i];
            int pos = i;

            for (int j = i + 1; j < a.length; j++)
                if (min > a[j]) {
                    pos = j;
                    min = a[j];
                }

            byte t = a[i];
            a[i] = a[pos];
            a[pos] = t;
        }

        for (short val : a) System.out.print(val + " ");

    }
}
