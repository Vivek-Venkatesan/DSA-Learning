public class SubArrays {
    //1. Find the maximum sum of subarray of size k Input: arr = [2,1,5,1,3,2] k = 3 Expected Output 9 (5+1+3)
    //Trying to solve this sum of subarray using Sliding window

    public int maxSum(int[] arr, int k) {
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i];
            windowSum -= arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

    return maxSum;
    }

    //2. Print all the Subarrays
    public void printSubarrays(int[] arr) {
        int n = arr.length;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
        /*
        The Outer loop fixes the start index
        The Middle loop fixes the end index
        The Inner loop prints the sub array
        The Time complexity is o(n^3)
        */
    }

    //3. Find sum of all the Subarrays
    public static int sumOfAllSubarrays(int[] arr) {
        int n = arr.length;
        int total = 0;

        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += arr[end];
                total += sum;
            }
        }
        return total;
    }

    /*
    Outer loop decides the startof the window
    Inner loop moves the window
    sum += arr[end]; takes the index of the window rather than iterating from the first index every time
    */

    //4. Find the maximum  subarray sum
    public int maxSubarray(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += arr[end];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    /*
    The Outer loop iterates full length of the array
    The Inner loop iterates the full length of the subarray for each index
    end value holds the sub array index value and sum needs to be extracted from the same
    */

    //5. Find if there exists a subarray whose sum equals target
    /*
    Input = [1,2,3,4,5] Target = 12
    Expected - true (2+3+7 = 12)
    */
    public boolean hasSubarraySum(int[] arr, int target) {
        int n = arr.length;

        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += arr[end];
                if (sum == target) return true;
            }
        }
        return false;
    }

    /*
    Much Like two sum of two different numbers similar approach applies here where
    loop handles iterating through sub arrays and the sum acts as ultimate value possessor to which we can compare the target
    */

    /*
    6. Array = [3, -1, 4]
    List all subarrays and their sums.
    */

    public void printAndSumSubArrays(int[] arr) {
        int n = arr.length;
        int total = 0;
        for(int start = 0; start < n; start++) {
            int sum = 0;
            for(int end = start; end < n; end++) {
                sum += arr[end];
                total += sum;
                //printing subarrays
                for(int k = start; k <= end; k++) {
                    System.out.println(arr[k] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("Total sum of all subarrays: " + total);
    }

}
