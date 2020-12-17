package String;

public class String1 {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = new String();
        String str3 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        String str4 = new String(new char[]{'h', 'e', 'l', 'l', 'o', 'x', 'y'}, 3, 4);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
