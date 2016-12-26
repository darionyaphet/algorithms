package org.darion.yaphet.match;

public class SimpleMatch implements Matching {
    public static void main(String[] args) {
        String input = "LOVE is love";
        String pattern = "is";

        SimpleMatch matcher = new SimpleMatch();

        if (matcher.match(input, pattern)) {
            System.out.println("I Got it ~ " + input + " / " + pattern);
        } else {
            System.out.println("Miss Match");
        }
    }

    @Override
    public boolean match(String input, String pattern) {
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < pattern.length(); j++) {
                if (input.charAt(i) != pattern.charAt(j)) {
                    break;
                }
                if (j == pattern.length()) {
                    return true;
                }
            }
        }
        return false;
    }
}
