package com.kodilla.bytecode.reflection;

import java.util.Random;

public class Student {
    private String indexNumber;
    private final Random generator = new Random();

    public Student() {
        this.indexNumber = generateIndex();
    }

    private String generateIndex() {
        String result = "";
        StringBuilder buldier = new StringBuilder();
        int generatedNumer;

        for(int i=0; i<10; i++) {
            char c = (char) (generator.nextInt(25) + 65);
            buldier.append(c);
        }

        result = buldier.toString();

        return result;
    }

    public String getIndexNumber() {
        return indexNumber;
    }
}
