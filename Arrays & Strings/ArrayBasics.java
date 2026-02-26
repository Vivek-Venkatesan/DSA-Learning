//Problem Statements
/*This class is all about understanding the basics and intrinsic working model of how Array functions and its features. 
Further more from the scratch we will discuss its behavious, limitations, advantages using appropriate examples then and there and solutions shall alsp be arrived as and when required */

public class ArrayBasics {
    
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
}
}

