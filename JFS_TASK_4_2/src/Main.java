import model.InValidAgeException;
import model.Voter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Voter vote = new Voter(2347923, "Alex J", 17);
            System.out.println(vote);
        } catch (InValidAgeException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}