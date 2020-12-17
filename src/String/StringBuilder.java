package String;

public class StringBuilder {
    public static void main(String[] args) {
        String str = "Java";
        StringBuffer strBuffer = new StringBuffer(str);
        System.out.println("Размер: " + strBuffer.capacity());
        strBuffer.ensureCapacity(32);
        System.out.println("Размер: " + strBuffer.capacity());
        System.out.println("Длина: " + strBuffer.length());

        System.out.println(strBuffer.toString());
        System.out.println();

        //charAt
        char c = strBuffer.charAt(0);
        System.out.println(c);
        strBuffer.setCharAt(0, 'c');
        System.out.println(strBuffer.toString());
        System.out.println();

        //append
        StringBuffer strBuffer1 = new StringBuffer("hello");
        strBuffer1.append(" world");
        System.out.println(strBuffer1.toString());
        System.out.println();

        //insert
        StringBuffer strBuffer2 = new StringBuffer("word");

        strBuffer2.insert(0, "N ");
        System.out.println(strBuffer2.toString());

        strBuffer2.insert(5, "l");
        System.out.println(strBuffer2.toString());
        System.out.println();

        //delete
        StringBuffer strBuffer3 = new StringBuffer("assembler");
        strBuffer3.delete(3, 9);
        System.out.println(strBuffer3.toString());
        System.out.println();

        //subString
        StringBuffer strBuffer4 = new StringBuffer("hello gose");
        String str1 = strBuffer4.substring(6);
        System.out.println(str1);
        System.out.println();

        //replace
        StringBuffer strBuffer5 = new StringBuffer("hello nigga");
        strBuffer5.replace(6, 11, "*censored*");
        System.out.println(strBuffer5.toString());
        System.out.println();

        //reverse
        StringBuffer strBuffer6 = new StringBuffer("aggin");
        strBuffer6.reverse();
        System.out.println(strBuffer6.toString());

    }
}
