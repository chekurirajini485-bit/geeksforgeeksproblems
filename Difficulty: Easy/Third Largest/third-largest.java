class Solution {
    int thirdLargest(int arr[]) {
        
        // If array has less than 3 elements
        if (arr.length < 3) {
            return -1;
        }
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second) {
                third = second;
                second = arr[i];
            }
            else if (arr[i] > third) {
                third = arr[i];
            }
        }
        
        return third;
    }
}
