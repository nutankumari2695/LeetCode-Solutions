class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) { // Start from 1 up to n
            
            if (i % 3 == 0 && i % 5 == 0) {
                arr.add("FizzBuzz");
            } else if (i % 3 == 0) {
                arr.add("Fizz");
            } else if (i % 5 == 0) {
                arr.add("Buzz");
            } else {
                arr.add(Integer.toString(i)); // Add number as a string
            }
        }
        return arr;
    }
}