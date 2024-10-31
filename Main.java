/*Knuth-Morris-Pratt Algorithm*/
public class KMP {
    // Function to perform the KMP algorithm for pattern searching
    public static int[] computeLPSArray(String pattern) {
        int length = pattern.length();
        int[] lps = new int[length];
        int len = 0; // Length of the previous longest prefix suffix
        int i = 1;

        while (i < length) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1]; // Consider the previous longest prefix suffix
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static void KMPSearch(String text, String pattern) {
        int textLength = text.length();
        int patternLength = pattern.length();

        // Create lps array to hold the longest prefix suffix
        int[] lps = computeLPSArray(pattern);

        int i = 0; // Index for text
        int j = 0; // Index for pattern

        while (i < textLength) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }

            if (j == patternLength) {
                System.out.println("Pattern found at index " + (i - j));
                j = lps[j - 1];
            } else if (i < textLength && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        String text = "ABABDABACDABABCABAB";
        String pattern = "ABABCABAB";

        KMPSearch(text, pattern);
    }
}



/*Run Length Encoding (RLE)*/
public class RLE {
    // Function to perform Run Length Encoding
    public static String runLengthEncode(String input) {
        StringBuilder encoded = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                encoded.append(input.charAt(i - 1));
                encoded.append(count);
                count = 1;
            }
        }

        // Handle the last character
        encoded.append(input.charAt(input.length() - 1));
        encoded.append(count);

        return encoded.toString();
    }

    // Function to perform Run Length Decoding
    public static String runLengthDecode(String input) {
        StringBuilder decoded = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            i++;
            StringBuilder countStr = new StringBuilder();
            while (i < input.length() && Character.isDigit(input.charAt(i))) {
                countStr.append(input.charAt(i));
                i++;
            }
            int count = Integer.parseInt(countStr.toString());
            for (int j = 0; j < count; j++) {
                decoded.append(currentChar);
            }
            i--; // Adjust for the outer loop increment
        }

        return decoded.toString();
    }

    public static void main(String[] args) {
        String input = "AAAABBBCCDAA";
        String encoded = runLengthEncode(input);
        System.out.println("Encoded: " + encoded);

        String decoded = runLengthDecode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}


