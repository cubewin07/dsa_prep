package hashmaps.syntax;

import java.util.HashSet;

public class hashSet_syntax {
    public static void main(String[] args) {
        // Init
        HashSet<Integer> set = new HashSet<>();

        // Add
        set.add(2);
        set.add(4);

        // Contain
        set.contains(3);

        // Remove
        set.remove(2);

        // Time complexity - O(1)

    }
}
