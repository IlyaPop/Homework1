public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Иван", "Петров", 1, 4.5, 4.0, 4.2);
        Student student2 = new Student(2, "Мария", "Сидорова", 2, 3.8, 4.5, 4.3);
        Student student3 = new Student(3, "Алексей", "Иванов", 3, 4.2, 3.9, 4.1);

        System.out.println(student1 + ", Средняя оценка: " + student1.getAverageGrade());
        System.out.println(student2 + ", Средняя оценка: " + student2.getAverageGrade());
        System.out.println(student3 + ", Средняя оценка: " + student3.getAverageGrade());
    }
}
