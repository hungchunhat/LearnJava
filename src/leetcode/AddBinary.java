package leetcode;

public class AddBinary {
    public String addBinary(String a, String b) {
        boolean remember = false;
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            carry = sum > 1 ? 1 : 0;
            sb.append((sum % 2));
        }
        if (carry == 1) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        AddBinary obj = new AddBinary();
        System.out.println(obj.addBinary(a, b));
    }
}
