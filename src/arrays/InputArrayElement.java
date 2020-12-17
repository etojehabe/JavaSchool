package arrays;

public class InputArrayElement {
    public static void main(String[] args) {
        short a[] = new short[]{1, 2, 3, 5, 6, 7, 8, 9, 9};

        for (int i = 8; i > 3; i--) {
            a[i] = a[i - 1];
        }
        a[3] = 4;
        for (short val : a) {
            System.out.print(val + " ");
        }
    }
}
