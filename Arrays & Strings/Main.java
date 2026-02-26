public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
         int[] arr = {1, 2, 3, 4, 5};
        Basics arrayBasics = new Basics();
        arrayBasics.sumOfAllElements(arr);
        arrayBasics.indexBasedTraversal(arr);
        arrayBasics.enhancedForLoop(arr);
        arrayBasics.reverseTraversal(arr);
        arrayBasics.reverse(arr);
        arrayBasics.isSorted(arr);
    }
}