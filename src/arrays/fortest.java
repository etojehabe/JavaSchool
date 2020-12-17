package arrays;

public class fortest {
    public static void main(String[] args) {
        int n = 7, m = 7, s = 0;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                s+= i*j;

        System.out.println(s);
    }
}
