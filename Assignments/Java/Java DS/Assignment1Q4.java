import java.util.Scanner;

class ResultDeclaration {
    public String declareResults(double subject1Marks, double subject2Marks, double subject3Marks) {
        String result = "failed";
        double sumOfMarks = subject1Marks + subject2Marks + subject3Marks;
        if (subject1Marks > 60 || subject2Marks > 60 || subject3Marks > 60) {
            result = "failed";
        } else if (sumOfMarks < 60) {
            result = "failed";
        } else if (sumOfMarks > 60) {
            result = "passed";
        } else if (subject1Marks + subject2Marks > 60) {
            result = "passed";
        } else if (subject2Marks + subject3Marks > 60) {
            result = "passed";
        } else if (subject3Marks + subject1Marks > 60) {
            result = "passed";
        }
        return result;
    }
}

public class Assignment1Q4 {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        double subject1Marks = inputStream.nextInt();
        double subject2Marks = inputStream.nextInt();
        double subject3Marks = inputStream.nextInt();
        ResultDeclaration obj = new ResultDeclaration();
        String result = obj.declareResults(subject1Marks, subject2Marks, subject3Marks);
        System.out.println(result);

    }
}