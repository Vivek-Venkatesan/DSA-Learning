public class InsertionDeletion {

    //1. Insert particular element into a specific index into the Array
    public void insert(int[] arr, int size, int index, int value) {
        for(int i = size; i > index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = value;
        
        /*
        We start from the last since we dont want to overwrite the values stored in the indexes upfront since Arrays are fixed sized collection entity
        Adding or inserting from the last makes sense since the existing data would not be disturbed
        */
    }
    //2. Delete a particular element from the Array
   public void delete(int[] arr, int size, int index) {
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }

    //3. Find if there exists pair with sum = target in SORTED array. Input: [1,2,3,4,5] Target = 6
    public boolean hasPair(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) return true;
            else if (sum < target) left++;
            else right--;
        }

        return false;
        /*
        This works better with Time complexity O(n) and Space complexity O(1)
        If the sum is too small it increase left pointer
        If the sum is too large this decreases the right pointer
        */
    }

}
