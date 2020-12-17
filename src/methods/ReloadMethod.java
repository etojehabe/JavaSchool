package methods;

public class ReloadMethod {
    public static void main(String[] args) {
        int a1 = modul(-3);
        int a2 = (int) modul(-3.5);
        double a3 = modul(3);
        double a4 = modul(-3.5);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);


    }

    static int modul(int x) {
        if (x < 0) {
            x = -x;
        }
        return x;
    }

    static double modul(double x) {
        if (x < 0) {
            x = -x;
        }
        return x;
    }

}
