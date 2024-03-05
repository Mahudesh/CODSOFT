import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        int[] marks = new int[numSubjects];
        
        for (int i = 0; i < numSubjects; i++) {
            System.out.printf("Enter marks obtained in subject %d (out of 100): ", i + 1);
            marks[i] = scanner.nextInt();
        }
        calculateAndDisplayResults(marks);
        scanner.close();
    }

    public static void calculateAndDisplayResults(int[] marks) {
        int numSubjects = marks.length;
        int totalMarks = 0;
        
        for (int mark : marks) {
            totalMarks += mark;
        }
        
        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;

        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}
