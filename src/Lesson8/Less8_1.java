package Lesson8;

public class Less8_1 {
    static int proizvedenie (int a, int b, int c) {
        return a * b * c;
    }
    static void delenie (int d, int f) {
        System.out.println(d / f);
        System.out.println(d % f);
    }

    public static void main(String[] args) {
        proizvedenie(3,3, 5);
        delenie(4, 6);
    }
}
