package Java8__StudentDatabase;

import java.util.List;

public class Student {
    private String name;
    private int gpa;
    private Double gradeLevel;
    private List<String> hobbies;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                ", gradeLevel=" + gradeLevel +
                ", hobbies=" + hobbies +
                '}';
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

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Student(String name, int gpa, Double gradeLevel, List<String> hobbies) {
        this.name = name;
        this.gpa = gpa;
        this.gradeLevel = gradeLevel;
        this.hobbies = hobbies;
    }
}
