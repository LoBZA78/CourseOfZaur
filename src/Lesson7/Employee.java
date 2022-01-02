package Lesson7;

public class Employee {
    int id;
    public String surname;
    int age;
    private int salary;
    String department;
    public void surname() {
        System.out.println(surname);
    }
    public void salary() {
        System.out.println(salary);
    }
    public void id() {
        System.out.println(id);
    }
    Employee (int id1, String name1, int vozrast1, String podrazdelenie1, int zarplata1) {
        id = id1;
        surname = name1;
        age = vozrast1;
        salary = zarplata1;
        department = podrazdelenie1;
    }
    public Employee(String name2, int id2, int vozrast2, int zarplata2, String podrazdelenie2) {
        id = id2;
        surname = name2;
        age = vozrast2;
        salary = zarplata2;
        department = podrazdelenie2;
    }
    private Employee(int id3, String name3, int vozrast3, int zarplata3, String podrazdelenie3) {
        id = id3;
        surname = name3;
        age = vozrast3;
        salary = zarplata3;
        department = podrazdelenie3;
    }
    double uvelichenieVdvoe () {
        salary *= 2;
        System.out.println(salary);
        return salary;
    }
}
