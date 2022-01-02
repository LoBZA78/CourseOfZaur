public class Lesson1 {
    int method (int one1, int two1, int three1, int four1, int five1){
        int sum = one1 + two1 + three1 + four1 + five1;
        System.out.println(sum);
        return sum;
    }
    int method (int one2, int two2, int three2, int four2){
        int sum = one2 + two2 + three2 + four2;
        System.out.println(sum);
        return sum;
    }
    int method (int one3, int two3, int three3){
        int sum = one3 + two3 + three3;
        System.out.println(sum);
        return sum;
    }
    int method (int one4, int two4){
        int sum = one4 + two4;
        System.out.println(sum);
        return sum;
    }
    int method (int one5){
        int sum = one5;
        System.out.println(sum);
        return sum;
    }
}
class Lesson1Test {
    public static void main(String[] args) {
        Lesson1 type1 = new Lesson1();
        type1.method(4, 3, 6, 6, 6);
        type1.method(2);
        type1.method(3, 5);
        type1.method(3, 6, 6);

    }
}