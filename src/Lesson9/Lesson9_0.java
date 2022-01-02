package Lesson9;

public class Lesson9_0 {
    int a = 1;
    static int b = 2;
    void abc (int a) {
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Lesson9_0.b);
    }

    public static void main(String[] args) {
        Lesson9_0 t = new Lesson9_0();
        t.abc(4);
    }
}
