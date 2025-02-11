package com.java;

public class KarpRabin {
    private final int PRIME = 101;

    // Calculate the hash of a given string
    private long calculateHash(String str) {
        long hash = 0;
        for (int i = 0; i < str.length(); i++) {
            hash += str.charAt(i) * Math.pow(PRIME, i);
        }
        return hash;
    }

    // Update hash after sliding the window in the text
    private long updateHash(long prevHash, char oldChar, char newChar, int patternLength) {
        // Remove the oldChar's contribution and add the newChar's contribution
        long newHash = (prevHash - oldChar) / PRIME;
        newHash += newChar * Math.pow(PRIME, patternLength - 1);
        return newHash;
    }

    // Search for the pattern in the text using the Karp-Rabin algorithm
    public void search(String text, String pattern) {
        int patternLength = pattern.length();
        if (patternLength > text.length()) {
            System.out.println("Pattern is longer than the text.");
            return;
        }

        long patternHash = calculateHash(pattern);
        long textHash = calculateHash(text.substring(0, patternLength));

        for (int i = 0; i <= text.length() - patternLength; i++) {
            // If the hashes match, check for exact match of the substring
            if (textHash == patternHash) {
                if (text.substring(i, i + patternLength).equals(pattern)) {
                    System.out.println("Pattern found at index " + i);
                }
            }

            // Slide the window if there is more text to check
            if (i < text.length() - patternLength) {
                textHash = updateHash(textHash, text.charAt(i), text.charAt(i + patternLength), patternLength);
            }
        }
    }

    public static void main(String[] args) {
        KarpRabin algo = new KarpRabin();
        algo.search("AmanKunalRahul", "Kunal");
    }
}
