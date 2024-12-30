public class studentandteacher {
}
class Student extends Person {
    static int idCounter = 1;
    int studentID;
    int[] grades; //
    int gradeCount;

    Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.studentID = idCounter++;
        this.grades = new int[10];
        this.gradeCount = 0;
    }


    void addGrade(int grade) {
        if (grade >= 0 && grade <= 100 && gradeCount < grades.length) {
            grades[gradeCount] = grade;
            gradeCount++;
        }
    }


    double calculateGPA() {
        if (gradeCount == 0) return 0.0;
        int sum = 0;
        for (int i = 0; i < gradeCount; i++) {
            sum += grades[i];
        }
        return (double) sum / gradeCount;
    }

    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + studentID + ".";
    }
}

class Teacher extends Person {
    String subject;
    int yearsOfExperience;
    int salary;


    Teacher(String name, String surname, int age, boolean gender, String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    void giveRaise(double percentage) {
        if (percentage > 0) {
            salary += salary * percentage / 100;
        }
    }


    public String toString() {
        return super.toString() + " I teach " + subject + ".";
    }
}