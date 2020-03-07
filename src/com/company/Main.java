package com.company;

public class Main {

    public static void main(String[] args) {
        String s = "man has dog";
        System.out.println(stringReverse(s));
    }

    private static String stringReverse(String s) {
        String[] tmp = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = tmp.length - 1; i >= 0; i--) {
            builder.append(tmp[i] + " ");
        }
        return builder.toString();
    }
}


