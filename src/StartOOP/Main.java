package StartOOP;

public class Main {
    public static void main(String[] args) {
        Point3D pt1 = new Point3D(2, 3, 4, 11);
        Point3D pt2 = new Point3D(1, 1, 6, 5);
        Point3D pt3 = new Point3D(5, 3, 3, 9);
        Point3D pt4 = new Point3D(6, 2, 4, 5);

        Line ln1 = new Line(1, 8);
        Line ln2 = new Line(3, 6);

        System.out.println(pt1.a + " " + pt2.b + " " + pt3.x + " " + pt4.y);
        System.out.println(ln1.a + " " + ln2.b + " " + ln2.color);

        Rect rt1 = new Rect();
        Rect rt2 = new Rect(1, 2, 1.1, 2.2);
        Rect rt3 = new Rect(1,2,5,6);
        Rect rt4 = new Rect(49, 20, 100, 200);

        int s1 = rt3.square();
        int s2 = rt4.square();
        System.out.println(s1);
        System.out.println(s2);

    }
}
