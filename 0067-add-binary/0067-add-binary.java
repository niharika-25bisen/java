public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Niharika Bisen
        while (i >= 0 || j >= 0 || carry == 1) {
            int bitA = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int bitB = (j >= 0) ? b.charAt(j--) - '0' : 0;

            int sum = bitA + bitB + carry;
            result.append(sum % 2); // Add current bit
            carry = sum / 2;        // Update carry
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String a = "1010";
        String b = "1011";
        String sum = sol.addBinary(a, b);
        System.out.println("Sum: " + sum); 
    }
}