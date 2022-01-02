package Lesson7_1;


public class EmplTest {
    public static void main(String[] args) {
        Lesson7.Employee tr = new Lesson7.Employee("Armom", 231, 32, 34000, "dsc");
        tr.id();
        tr.salary();
        tr.surname();
        System.out.println(tr.surname);
    }
}
