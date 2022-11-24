package com.kodilla.bytecode.reflection;

import java.lang.reflect.Field;

public class StudentReflection {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Student student = new Student();
        System.out.println(student.getIndexNumber());

        Field signatureField = Student.class.getDeclaredField("indexNumber");
        signatureField.setAccessible(true);

        String value = (String)signatureField.get(student);
        System.out.println(value);
    }
}
