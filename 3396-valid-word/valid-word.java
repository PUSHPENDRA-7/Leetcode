class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }

        boolean hasvowel = false;
        boolean hasconsonant = false;

        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') {
                    hasvowel = true;
                } else {
                    hasconsonant = true;
                }
            }else if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return hasvowel && hasconsonant;
    }
}