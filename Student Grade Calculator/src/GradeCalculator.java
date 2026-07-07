public class GradeCalculator {

    public int calculateTotal(int[] marks) {

        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    public double calculatePercentage(int total, int subjectCount) {
        return (double) total / subjectCount;
    }

    public String calculateGrade(double percentage) {

        if (percentage >= 90)
            return "A+";
        else if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else
            return "F";
    }

    public String getResult(double percentage) {
        return percentage >= 40 ? "PASS" : "FAIL";
    }

    public int getHighestMark(int[] marks) {

        int highest = marks[0];

        for (int mark : marks) {
            if (mark > highest)
                highest = mark;
        }

        return highest;
    }

    public int getLowestMark(int[] marks) {

        int lowest = marks[0];

        for (int mark : marks) {
            if (mark < lowest)
                lowest = mark;
        }

        return lowest;
    }
}
