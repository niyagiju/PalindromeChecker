class PalindromeChecker {

    // Public method exposed to outside
    public boolean checkPalindrome(String input) {

        if (input == null)
            return false;

        // Preprocessing (optional improvement)
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        char[] chars = normalized.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end])
                return false;

            start++;
            end--;
        }

        return true;
    }
}