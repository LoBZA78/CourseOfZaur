package Lesson7;

public class EmplTest1 {
    public static void main(String[] args) {
        Employee er = new Employee(123, "Artem", 31, "Ravochii", 320000);
        Employee et = new Employee("Vasya", 321, 30, 2300, "dsc");
        System.out.println(er.id);
        System.out.println(er.surname);
        er.salary();
        er.id();
        er.surname();
    }
}
