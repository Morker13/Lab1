public class Palindrome {
    public static void main (String[] args){
        String[] s = {"java", "Palindrome", "madam", "racecar", "apple", "kayak", "song", "noon"};
        for (int i = 0; i < s.length; i++){
            System.out.println(s[i] + "-" + isPalindrom(s[i]));
        }
    }

    public static String reverseString(String s){
            String reverseStr = "";
            for (int j = s.length() - 1; j >=0; j--){
                reverseStr += s.charAt(j);
            }
            return reverseStr;
        }

    public static boolean isPalindrom(String s){
        String reverse = reverseString(s);
        return reverse.equals(s);
    }
}

