package learn.dsa.Recursion;

public class StringToInteger {
    int charAt = 0;
    int result = 0;
    int sign = 1;
    public static void main(String[] args) {
        String str = "   -042";
        int res = new StringToInteger().convertToInteger(str);
//        res = -res;
        System.out.println(res);
//        String s = "1";
//        char c = s.charAt(0);
//        System.out.println(c*1);
    }

    public int convertToInteger(String s){
        char c = s.charAt(charAt);
        if (!Character.isDigit(c) && (s.charAt(charAt) != ' ') && (s.charAt(charAt) != '-')) return result;
        if(result < 1 && c == '-') sign = -1;
        if (Character.isDigit(c)) {
            result = (result * 10) + (c - '0');
        }
        if(charAt < s.length()-1){
            charAt++;
            convertToInteger(s);
        }
        return result*sign;
    }
}
