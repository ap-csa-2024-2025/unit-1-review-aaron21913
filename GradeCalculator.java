public class GradeCalculator
{
  public static void main(String[] args)
  {
    String course = "AP CS A";

    int time = 120;

    int hw = 60;
    int hw2 = 45;
    int hw3 = 55;
    int hw4 = 96;
    double quiz1 = 89.4;
    double quiz2 = 96.1;
    double final1 = 85.4;

    double avgHw = ((hw + hw2 + hw3 + hw4) / 4);
    double avgQuiz = ((quiz1 + quiz2) / 2);
    double hwWeight = (0.35);
    double quizWeight = (0.15);
    double finalWeight = (0.50);

    double finalGrade = ((avgHw * hwWeight) + (avgQuiz * quizWeight) + (final1 * finalWeight));
    int weeklyTime = (time / 60);
    int finalGrade2 = (int) (finalGrade + 0.5);
    System.out.println("course name: " + course);
    System.out.println("average time spent: " + time);
    System.out.println("homework grades for this course:");
    System.out.println(hw);
    System.out.println(hw2);
    System.out.println(hw3);
    System.out.println(hw4);
    System.out.println("quiz grades for this course:");
    System.out.println(quiz1);
    System.out.println(quiz2);
    System.out.println("final exam grade:");
    System.out.println(final1);
    System.out.println("Weekly time spent: " + weeklyTime + " hours");
    System.out.println("average homework grade: " + avgHw);
    System.out.println("average quiz grade: " +avgQuiz);
    System.out.println("Final exam grade: " + final1);
    System.out.println("overall grade: " + finalGrade2);
  }
}
