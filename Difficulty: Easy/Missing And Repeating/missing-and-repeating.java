class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        
        ArrayList<Integer> result = new ArrayList<>();
        int duplicate = -1;
        int missing = -1;

        // Step 1: Find duplicate
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1;

            if (arr[index] < 0) {
                duplicate = Math.abs(arr[i]);
            } else {
                arr[index] = -arr[index];
            }
        }

        // Step 2: Find missing
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }

        result.add(duplicate);
        result.add(missing);

        return result;
    }
}
