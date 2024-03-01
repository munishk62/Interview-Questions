package interviewquestions;

import comparator.Address;

public class Student {
    private int rollNumber;
    private int passingYear;
    private String name;
    private int percentage;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getPassingYear() {
        return passingYear;
    }

    public void setPassingYear(int passingYear) {
        this.passingYear = passingYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public Student(int rollNumber, int passingYear, String name, int percentage) {
        super();
        this.rollNumber = rollNumber;
        this.passingYear = passingYear;
        this.name = name;
        this.percentage = percentage;
    }

}
