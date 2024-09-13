public class GradeCalculator
{
  public static void main(String[] args)
  {
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
    int finalGrade2 = (int) (finalGrade + 0.5);
    System.out.println(
    System.out.println(
    System.out.println(
    System.out.println(
    System.out.println(
    System.out.println(
    System.out.println(finalGrade2);
  }
}
