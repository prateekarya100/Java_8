package Java8.StreamsApi.Reduce_Method.EmployeeUseCase.UseCase1;

public class Student {
    private String name;
    private int gpa;
    private double gradeLevel;
    private String gender;
    private int noOfBooks;

    public String getName() {
        return name;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                ", gradeLevel=" + gradeLevel +
                ", gender='" + gender + '\'' +
                ", noOfBooks=" + noOfBooks +
                '}';
    }

    public double getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(double gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Student(String name, int gpa, double gradeLevel, String gender, int noOfBooks) {
        this.name = name;
        this.gpa = gpa;
        this.gradeLevel = gradeLevel;
        this.gender = gender;
        this.noOfBooks = noOfBooks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfBooks() {
        return noOfBooks;
    }

    public void setNoOfBooks(int noOfBooks) {
        this.noOfBooks = noOfBooks;
    }

    public Student(String name, int noOfBooks) {
        this.name = name;
        this.noOfBooks = noOfBooks;
    }
}
