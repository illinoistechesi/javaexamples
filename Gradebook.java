public class GradeBook{
  public static void main(String[] args){
  int grade = 99;
/* A is a 90-100
   B is a 80-89
   C is a 70-79
   D is a 60-69
   F is less than 60
*/
    //adjust conditionals and print statements to fit the grading scale
    if (grade >= 0 && grade < 60) {
      System.out.println("Your grade is an F");
    }
    else if (grade >= 60 && grade < 70) {
      System.out.println("Your grade is a D");
    }
    else if (grade >= 70 && grade < 79) {
      System.out.println("Your grade is a C");
    }
    else if (grade >= 80 && grade < 90) {
      System.out.println("Your grade is a B");
    }
    else if (grade >= 90 && grade <= 100) {
      System.out.println("Your grade is a A!");
    }

  }
}
