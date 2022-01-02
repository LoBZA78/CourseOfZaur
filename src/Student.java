public class Student {
    int studentId;
    String name;
    String surname;
    int course;
    double mathAver;
    double economyAver;
    double languageAver;
    Student(int studentId1, String name1, String surname1, int course1, double mathAver1, double economyAver1, double languageAver1) {
        studentId = studentId1;
        name = name1;
        surname = surname1;
        course = course1;
        mathAver = mathAver1;
        economyAver = economyAver1;
        languageAver = languageAver1;
    }
    Student(int studentId2, String name2, String surname2, int course2) {
        this(studentId2, name2, surname2, course2, 0.0, 0,0);
    }
    Student(){

    }
}
class StudentTest {
    double averageGrade (Student st) {
        double averGrade = (st.economyAver + st.languageAver + st.mathAver) / 3;
        System.out.println("Средняя оценка студента " + st.name + " " + st.surname + " = " + averGrade);
        return averGrade;
    }
    public static void main(String[] args) {
        Student st1 = new Student(2234, "Vasya", "Sidorov", 1, 5, 6, 8);
        Student st2 = new Student(2233, "Petr", "Gromov", 2);
        st2.languageAver = 5;
        st2.mathAver = 6;
        st2.economyAver = 9;
        Student st3 = new Student();
        st3.studentId = 4354;
        st3.name = "Yana";
        st3.surname = "Malinina";
        st3.course = 4;
        st3.mathAver = 6;
        st3.economyAver = 4;
        st3.languageAver = 8;

        StudentTest st = new StudentTest();
        st.averageGrade(st1);
        st.averageGrade(st2);
        st.averageGrade(st3);
    }
}
