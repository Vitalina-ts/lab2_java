package ua.util;

class ValidationHelper {
    static boolean isAlphabetic(String s) {
        return s != null && s.matches("[A-Za-zА-Яа-яЇїІіЄєҐґ]+");
    }
}
