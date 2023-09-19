public class Student {
    int studentID;
    String firstName;
    String lastName;
    int year;
    double mathGrade;
    double economicsGrade;
    double languageGrade;

    public Student(int studentID, String firstName, String lastName, int year, double mathGrade, double economicsGrade, double languageGrade) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.mathGrade = mathGrade;
        this.economicsGrade = economicsGrade;
        this.languageGrade = languageGrade;
    }

    public double getAverageGrade() {
        return (mathGrade + economicsGrade + languageGrade) / 3;
    }

    public String toString() {
        return "Студент " + firstName + " " + lastName + " (ID: " + studentID + ")" + ", Год обучения: " + year;
    }
}
