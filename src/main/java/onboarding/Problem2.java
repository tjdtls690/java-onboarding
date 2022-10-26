package onboarding;

public class Problem2 {
    public static String solution(String cryptogram) {
        for (int i = 0; i < cryptogram.length() - 1; i++) {
            if (isEqualsTwoString(cryptogram.charAt(i), cryptogram.charAt(i + 1))) {
                cryptogram = cryptogram.substring(0, i) + cryptogram.substring(i + 2);
                
                if (i == 0) {
                    i--;
                } else {
                    i -= 2;
                }
            }
        }
        
        return cryptogram;
    }
    
    private static boolean isEqualsTwoString(final char firstChar, final char secondChar) {
        return firstChar == secondChar;
    }
}
