import model.Student;
import utils.AgeNotWithinException;
import utils.NameNotValidException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student student1 = null;
        try {
            student1 = new Student(101, "Alice Johnson", 20, "Computer Science");
        } catch (AgeNotWithinException | NameNotValidException e) {
            throw new RuntimeException(e);
        }
        System.out.println(student1);

        // Invalid Name, triggers exception
        Student student2 = null;
        try {
            student2 = new Student(102, "Bob&Smith01", 15, "Mathematics");
        } catch (AgeNotWithinException | NameNotValidException e) {
            throw new RuntimeException(e);
        }
        System.out.println(student2);
    }
}