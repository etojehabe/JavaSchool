package methods;

public class MyMethod {
    public static void main(String[] args) {
        System.out.println(perimetr(1, 2));

        show_ar(2, 2, 8, 3, 2, 2);

    }

    static float perimetr(float a, float b) {
        float res = 2 * (a + b);
        return res;
    }

    static void show_ar(int ...ar) {
        for (int val : ar)
            System.out.print(val + " ");
    }
}
