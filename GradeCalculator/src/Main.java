import java.util.Scanner;

 class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects (out of 100):");
        int [] marks = new int[5];



        // Take marks obtained in each subject and calculate total marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print(" subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        //Calculate total marks
        int totalMarks =0;
        for(int mark : marks)
            {
            totalMarks += mark;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / marks.length;

        // Assign grades based on average percentage
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

        // Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}