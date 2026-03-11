package arrays.syntax;
import java.util.ArrayList;

public class ArrayList_syntax {
    public static void main(String[] args) {
        // Init
        ArrayList<Integer> list = new ArrayList<>();

        // Add - O(1)
        list.add(1);

        // Get - O(1)
        list.get(0);

        // Set - O(1)
        list.set(0, 10);

        // Remove - O(n)
        list.remove(0);

        // Size
        list.size();
    }
}
