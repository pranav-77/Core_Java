import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        int n = 2456;
//        int result = calculateDigitSum(n);
//        System.out.println(result);
//        array();
//        string();
        stringTwo();
    }

    private static int calculateDigitSum(int n) {
        while (n >= 10) {
            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }

    public static void array() {
        int[] arr = {2, 1, 45, 32, 0, 9, 0, 4};
        List<Integer> l1 = new LinkedList<>();
        List<Integer> l2 = new LinkedList<>();
        for (int n : arr) {
            if (n == 0)
                l1.add(n);
            else
                l2.add(n);
        }
        l1.addAll(l2);
        Iterator<Integer> i = l1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    public static void string() {
        String str = "Hello World";
        String[] w = str.split(" ");
        String s = "";
        char[] ch = w[0].toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            s = s + ch[i];
        }
        s = s + " " + w[1];
        System.out.println(s);
    }

    public static void stringTwo() {
        String word = "hello World";
        String[] w = word.split(" ");
        String s = "";
        for (String words : w) {
            String s1 = "";
            for (int i = words.length() - 1; i >= 0; i--) {
                s1 = s1 + words.charAt(i);
            }
            s = s + s1 + " ";
        }
        System.out.println(s);
    }
}
