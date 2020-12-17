package arrays;

public class DeleteArrElement {
    public static void main(String[] args) {
        final int N = 9;
        short a[] = new short[N];

        for (int i = 0; i < N; i++) {
            a[i] = (short) (i + 1);
        }

        for (int i = 5; i < N - 1; i++) {
            a[i] = a[i + 1];
        }

        for (short val : a) {
            System.out.print(val + " ");
        }

    }
}
