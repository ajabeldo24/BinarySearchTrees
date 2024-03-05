public class BinarySearchTreeDriver {
    public static void main(String[] args) {
        BinarySearchTree<Integer, String> b = new BinarySearchTree<>();

        b.put(0, "Zero"); //adding values to BST at every point from 0 to 5
        b.put(1, "One");
        b.put(2, "Two");
        b.put(3, "Three");
        b.put(4, "Four");
        b.put(5, "Five");

        System.out.println(b.size()); //returning size, should return 6

        b.remove(5);

        System.out.println(b.size()); //should return 5 now

        b.put(5, "Five");

        for (int i = 0; i <= 5; i++) {
            System.out.println(b.get(i)); //printing out the values at BST at every index up until 5
        }

        System.out.println(b.get(9)); //checking if it returns null for a value that doesn't exist in the BST

        for (int i = 0; i <= 5; i++) {
            if (b.contains(i) == true) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        for (int i = 0; i <= 5; i++) {
            b.remove(i); //remove the values in the BST
        }

        System.out.println(b.isEmpty()); //should return true
        System.out.println(b.size()); //should return 0


    }
}
