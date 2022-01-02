package Lesson8;

public class Less8_2 {
    static final double pi = 3.14;
    void ploshad (double radius) {
        double ploshad = pi * radius * radius;
        System.out.println(ploshad);
    }
    static void dlina(double radios) {
        double dlina = 2 * pi * radios;
        System.out.println(dlina);
    }
    void inf (double rad) {
        System.out.println(rad);
        System.out.println(pi * rad * rad);
        System.out.println(2 * pi * rad);
    }
}
class Less8_2Test {
    public static void main(String[] args) {
        Less8_2 on = new Less8_2();
        on.ploshad(3.3);
        Less8_2.dlina(2.3);
        on.inf(3.3);
    }
}