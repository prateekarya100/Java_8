package Java_8_sampleData;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int gpa;
    private Double gradeLevel;
    private List<String> activities;

    public Student(String name) {
        System.out.println(name);
    }

    public Student(Student student) {
        System.out.println(student);
    }

    private void printActivities(){
        System.out.println(activities);
    }

    public void printNameOfStudent(){
        System.out.println(name);
    }

    public Student(String name, int gpa, Double gradeLevel, List<String> activities) {
        super();
        this.name = name;
        this.gpa = gpa;
        this.gradeLevel = gradeLevel;
        this.activities = activities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public Double getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(Double gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public void setActivities(ArrayList<String> activities) {
        this.activities = activities;
    }


    public List<String> getActivities() {
        return activities;
    }

    public void printListOfActivities(){
        System.out.println(activities);
    }
    public void printName__And__GradeLevel(){
        System.out.println(name+" :: "+gradeLevel);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                ", gradeLevel=" + gradeLevel +
                ", activities=" + activities +
                '}';
    }
}
