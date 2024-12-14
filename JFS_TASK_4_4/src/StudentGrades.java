import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StudentGrades {

    private HashMap<String, String> studentGrades;

    public StudentGrades() {
        studentGrades = new HashMap<>();
    }

    public static void main(String[] args) {
        StudentGrades sg = new StudentGrades();

        // Adding students
        sg.addStudent("Alex", "A");
        sg.addStudent("Xavier", "B");
        sg.addStudent("Jeni", "A");
        sg.addStudent("Rajan", "C");
        sg.addStudent("Xavier", "B");

        // Removing a student
        sg.removeStudent("Jenitha");

        // Displaying students by grade
        sg.displayStudentsByGrade("A");
        sg.displayStudentsByGrade("B");
        sg.displayStudentsByGrade("D");
    }

    // Method to add a student
    public void addStudent(String name, String grade) {
        studentGrades.put(name, grade);
        System.out.println("Student Added Successfully");
    }

    // Method to remove a student
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student Removed Successfully");
        } else {
            System.out.println("Student not found");
        }
    }

    // Method to display students based on a grade
    public void displayStudentsByGrade(String grade) {
        System.out.println("Students with grade " + grade + ":");
        for (Map.Entry<String, String> entry : studentGrades.entrySet()) {
            if (entry.getValue().equals(grade)) {
                System.out.println(entry.getKey());
            }
        }
    }
}