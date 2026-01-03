class Solution {
    static String isVowel(char c) {
        // convert character to lowercase
        c = Character.toLowerCase(c);

        // check for vowel
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "YES";
        }
        return "NO";
    }
}
