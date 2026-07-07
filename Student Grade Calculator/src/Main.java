import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("==========================================");
            System.out.println("      STUDENT GRADE CALCULATOR");
            System.out.println("==========================================");

            // Student Details
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Roll Number: ");
            int rollNumber = scanner.nextInt();

            // Number of Subjects
            int numberOfSubjects;

            do {
                System.out.print("Enter Number of Subjects: ");
                numberOfSubjects = scanner.nextInt();

                if (numberOfSubjects <= 0) {
                    System.out.println("Please enter a valid number!");
                }

            } while (numberOfSubjects <= 0);

            scanner.nextLine(); // consume newline

            String[] subjects = new String[numberOfSubjects];
            int[] marks = new int[numberOfSubjects];

            // Subject Details
            for (int i = 0; i < numberOfSubjects; i++) {

                System.out.println("\nSubject " + (i + 1));

                System.out.print("Enter Subject Name: ");
                subjects[i] = scanner.nextLine();

                while (true) {

                    System.out.print("Enter Marks (0-100): ");
                    int mark = scanner.nextInt();

                    if (mark >= 0 && mark <= 100) {
                        marks[i] = mark;
                        break;
                    } else {
                        System.out.println("Invalid marks! Please enter between 0 and 100.");
                    }
                }

                scanner.nextLine(); // consume newline
            }

            // Create Student Object
            Student student = new Student(name, rollNumber, subjects, marks);

            // Calculate Results
            GradeCalculator calculator = new GradeCalculator();

            int total = calculator.calculateTotal(student.getMarks());
            double percentage = calculator.calculatePercentage(total, numberOfSubjects);
            String grade = calculator.calculateGrade(percentage);
            String result = calculator.getResult(percentage);

            int highest = calculator.getHighestMark(student.getMarks());
            int lowest = calculator.getLowestMark(student.getMarks());

            // Display Report
            System.out.println("\n==============================================");
            System.out.println("              STUDENT REPORT");
            System.out.println("==============================================");

            System.out.println("Name        : " + student.getName());
            System.out.println("Roll Number : " + student.getRollNumber());

            System.out.println("\n----------------------------------------------");
            System.out.printf("%-25s %-10s%n", "Subject", "Marks");
            System.out.println("----------------------------------------------");

            for (int i = 0; i < numberOfSubjects; i++) {
                System.out.printf("%-25s %-10d%n",
                        student.getSubjects()[i],
                        student.getMarks()[i]);
            }

            System.out.println("----------------------------------------------");

            System.out.println("Total Marks : " + total + " / " + (numberOfSubjects * 100));
            System.out.printf("Percentage  : %.2f%%%n", percentage);
            System.out.println("Highest     : " + highest);
            System.out.println("Lowest      : " + lowest);
            System.out.println("Grade       : " + grade);
            System.out.println("Result      : " + result);

            System.out.println("==============================================");
        }
    }
}
