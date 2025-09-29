import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Integer> studentGrades = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

       
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = sc.nextLine();
            studentNames.add(name);

            System.out.print("Enter grade for " + name + ": ");
            int grade = sc.nextInt();
            studentGrades.add(grade);
            sc.nextLine();
        }

       
        int highest = studentGrades.get(0);
        int lowest = studentGrades.get(0);
        int sum = 0;

        for (int grade : studentGrades) {
            sum += grade;
            if (grade > highest) highest = grade;
            if (grade < lowest) lowest = grade;
        }

        double average = (double) sum / studentGrades.size();

       
        System.out.println("\n===== Student Grades Report =====");
        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println(studentNames.get(i) + ": " + studentGrades.get(i));
        }

        System.out.println("\nAverage Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);

        sc.close();
    }
}