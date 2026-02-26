//Problem Statements
/*This class is all about understanding the basics and intrinsic working model of how Array functions and its features. 
Further more from the scratch we will discuss its behavious, limitations, advantages using appropriate examples then and there and solutions shall alsp be arrived as and when required */

public class Basics {
    
    // 1. Find the sum of all elements in an array int[] arr = {1, 2, 3, 4, 5} Expected output: 15
    public void sumOfAllElements(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of all elements: " + sum);
    }

    //2. Traverse the indexs of the Array using normal for looping technique
    public  void indexBasedTraversal(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        /*
        Advantages of this traversal are as follows
        1. Need neighbours
        2. We need to modify elements
        3. When we try to use two pointers
         */
    }

    //3. Traverse the indexes of the Array using enhanced for loop technique
    public void enhancedForLoop(int[] arr) {

        for (int value : arr) {
            System.out.println(value);
        }
        
        /*
        Advantages of enhanced traversal as  follows
        1. No index based traversal
        2. We cannot easily modify elements
        */
    }

    //4. Reverse Traversal of the Array using similar for loop approach
    public void reverseTraversal(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        /*
        Advantages of Reversal traverse technique
        1. Reversal problems where we need to start from the end
        2. Right to left comparison where we are in compulsion to check the neighbour
        */
    }

    //5 Reverse traversal real time application on a two pointer logic
    public void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        /*
        Two Pointer approach is where you basically start in two different places start and end not necessarily on any fixed point on the array it can be at any one of the indexes in the array
        For the above reversal example we are starting the left most pointer in the starting index and the right pointer in the last index and moving both the pointers towards one another for them to meet in the mid
        Also while we are at it we are storing the values in temp and swapping values using the variables instead of actual reverse traversal. Its like reversing the array without reverse traversal and this has Time O(n) and SpaceO(1)
        */         
    }

    //6. Find if the array is sorted in ascending order
    public boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}

