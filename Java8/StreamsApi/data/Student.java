package Java8.StreamsApi.data;

import java.util.List;

public class Student {
    private String name;
    private String gender;
    private int gpa;
    private double gradeLevel;
    private List<String> activities;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", gpa=" + gpa +
                ", gradeLevel=" + gradeLevel +
                ", activities=" + activities +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public double getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(double gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public Student(String name, String gender, int gpa, double gradeLevel, List<String> activities) {
        this.name = name;
        this.gender = gender;
        this.gpa = gpa;
        this.gradeLevel = gradeLevel;
        this.activities = activities;
    }
}
