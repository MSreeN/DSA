package learn.dsa.Strings;

public class VowelsGameInAString {
    public static void main(String[] args) {

    }

    public static boolean doesAliceWin(String s){
        int vowelsCount = countVowels(s);
        return vowelsCount > 0;
    }

    public static int countVowels(String s){
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i'
                    || c == 'o' || c == 'u') count++;
        }
        return count;
    }
}
