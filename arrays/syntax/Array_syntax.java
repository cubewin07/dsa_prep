package arrays.syntax;

public class Array_syntax {
    public static void main(String[] args) {
        // 4 ways to init an array
        int[] a = new int[5];
        int b[] = new int[5];
        int[] c = {1,2,3,4,5};
        int[] d = new int[]{1,2,3,4,5};

        // Time complexity 
            // Access - O(1)
            // Insert(middle) - O(n)
            // Update - O(n)
            // Delete - O(n)
            // Search(unsorted) - O(n)

        // Common loop
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
            a[i] = 2;
        }

        // Enhanced loop
        for(int num : b){
            System.out.println(num);
        }
    }
}
