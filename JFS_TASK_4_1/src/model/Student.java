package model;

import utils.AgeNotWithinException;
import utils.NameNotValidException;

public class Student {

    private int roll_No;
    private String name;
    private int age;
    private String course;

    public Student(int roll_No, String name, int age, String course) throws AgeNotWithinException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinException("Age must be between 15 and 21. Provided age: " + age);
        }
        if (!isValidName(name)) {
            throw new NameNotValidException("Name contains invalid characters: " + name);
        }
        this.roll_No = roll_No;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getRoll_No() {
        return roll_No;
    }

    public void setRoll_No(int roll_No) {
        this.roll_No = roll_No;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameNotValidException {
        if (!isValidName(name)) {
            throw new NameNotValidException("Name contains invalid characters: " + name);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeNotWithinException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinException("Age must be between 15 and 21. Provided age: " + age);
        }
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_No=" + roll_No +
                ", nae='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }

    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z\\s]+"); // Allows letters and spaces only
    }
}
