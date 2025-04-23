package leetcode;

public class ConvertToTitle {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--;
            sb.insert(0,(char) (n % 26 + 'A'));
            n /= 26;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int x = 701;
        ConvertToTitle t = new ConvertToTitle();
        System.out.println(t.convertToTitle(x));
    }
}
