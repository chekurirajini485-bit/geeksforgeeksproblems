class Solution {
    static double switchCase(int choice, List<Double> arr) {
        switch (choice) {
            case 1:
                double r = arr.get(0);
                return Math.PI * r * r;

            case 2:
                double l = arr.get(0);
                double b = arr.get(1);
                return l * b;

            default:
                return 0.0;
        }
    }
}
