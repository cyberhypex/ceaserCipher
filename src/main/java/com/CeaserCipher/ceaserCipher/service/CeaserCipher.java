package com.CeaserCipher.ceaserCipher.service;

import org.springframework.stereotype.Service;

@Service
public class CeaserCipher {
    public  String encrypt(String text, Integer shift) {
        StringBuilder result = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                char shifted = (char) ((character - base + shift) % 26 + base);
                result.append(shifted);
            } else {
                result.append(character); // keep non-letters unchanged
            }
        }
        return result.toString();
    }
    public  String decrypt(String text, Integer shift) {
        StringBuilder result = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                char shifted = (char) ((character - base - shift + 26) % 26 + base);
                result.append(shifted);
            } else {
                result.append(character); // keep non-letters unchanged
            }
        }
        return result.toString();
    }
}
