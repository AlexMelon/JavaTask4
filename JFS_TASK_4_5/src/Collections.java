import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Collections {

    private ArrayList<Integer> collections;

    public Collections() {
        collections = new ArrayList<>();
    }

    public static void main(String[] args) {
        Collections collections1 = new Collections();
        Scanner scanner = new Scanner(System.in);

        int choose = scanner.nextInt();

        do {
            if (choose == 1) {
                int insert = scanner.nextInt();
                collections1.push(insert);
            } else if (choose == 2) {
                collections1.pop();
            }
        } while (choose == 3);
        scanner.close();

    }

    public void push(int number) {
        collections.add(number);
        System.out.println("Pushed: " + number);
    }

    public void pop() {
        if (collections.isEmpty()) {
            System.out.println("List is empty! Cannot pop.");
        } else {
            int removedNumber = collections.removeLast();
            System.out.println("Popped: " + removedNumber);
        }
    }
}