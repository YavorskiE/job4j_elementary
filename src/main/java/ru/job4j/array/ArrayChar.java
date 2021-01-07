package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = pref.length <= word.length;
        if (result) {
            for (int i = 0; i < pref.length; i++) {
                if (pref[i] != word[i]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
