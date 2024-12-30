public class mainclass {
}
public class Main {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Alice", "Brown", 20, false);
        student1.addGrade(90);
        student1.addGrade(85);

        Student student2 = new Student("Bob", "Smith", 22, true);
        student2.addGrade(88);
        student2.addGrade(92);

        // Create teachers
        Teacher teacher1 = new Teacher("John", "Doe", 45, true, "Math", 15, 50000);
        Teacher teacher2 = new Teacher("Jane", "Davis", 30, false, "English", 8, 40000);

        // Give raise to teacher1
        teacher1.giveRaise(10);

        // Create school and add members
        School school = new School();
        school.addMember(student1);
        school.addMember(student2);
        school.addMember(teacher1);
        school.addMember(teacher2);

        // Print all members of the school
        System.out.println(school);
    }
}