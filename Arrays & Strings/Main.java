public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
         int[] arr = {1, 2, 3, 4, 5};
        Basics arrayBasics = new Basics();
        InsertionDeletion arrayInserts = new InsertionDeletion();
        arrayBasics.sumOfAllElements(arr);
        arrayBasics.indexBasedTraversal(arr);
        arrayBasics.enhancedForLoop(arr);
        arrayBasics.reverseTraversal(arr);
        arrayBasics.reverse(arr);
        arrayBasics.isSorted(arr);
        int size = 5;
        int index = 3;
        int value = 9;
        arrayInserts.insert(arr, size, index, value);
        arrayInserts.delete(arr, size, index);
        arrayInserts.hasPair(arr, value);
        arrayInserts.maxSum(arr, value);
        arrayInserts.printSubarrays(arr);
        arrayInserts.maxSubarray(arr);
    }
}