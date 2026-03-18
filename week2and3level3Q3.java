import java.util.Scanner;

class StudentGradeReport {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("------ Student Performance Report ------");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Physics Marks: ");
        double physics = sc.nextDouble();

        System.out.print("Enter Chemistry Marks: ");
        double chemistry = sc.nextDouble();

        System.out.print("Enter Maths Marks: ");
        double maths = sc.nextDouble();

        double total = physics + chemistry + maths;
        double percentage = total / 3;

        char grade;
        String remarks;

        if (percentage >= 80) {
            grade = 'A';
            remarks = "Level 4 - Above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = 'B';
            remarks = "Level 3 - At agency-normalized standards";
        } else if (percentage >= 60) {
            grade = 'C';
            remarks = "Level 2 - Approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = 'D';
            remarks = "Level 1 - Below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = 'E';
            remarks = "Level 1- - Too below agency-normalized standards";
        } else {
            grade = 'R';
            remarks = "Remedial standards";
        }

        System.out.println("\n----------- Result Summary -----------");
        System.out.println("Student Name   : " + name);
        System.out.println("Average Marks  : " + String.format("%.2f", percentage) + "%");
        System.out.println("Grade Awarded  : " + grade);
        System.out.println("Remarks        : " + remarks);
        System.out.println("--------------------------------------");

        sc.close();
    }
}