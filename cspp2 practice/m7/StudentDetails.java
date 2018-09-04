/**
 * Write a java program to find the odd composite numbers
 * between 2 and n where n is given as an input.
 *
 * @author : Arepallyrakesh
 */

/**
 * Class for student details.
 */
final public class StudentDetails {
    /**
     * private string.
     */
    private String student1, rollno1;
    /**
     * private double.
     */
    private double mark1, mark2, mark3;
    /**
     * Constructs the object.
     *
     * @param      student  The student
     * @param      rollno   The rollno
     * @param      m1       The m 1
     * @param      m2       The m 2
     * @param      m3       The m 3
     */
    private StudentDetails(final String student,
    final String rollno, final double m1, final double m2, final double m3) {
    student1  = student;
    rollno1 = rollno;
    mark1 = m1;
    mark2 = m2;
    mark3 = m3;
    }
    /**
     * gpa.
     *
     * @return     { description_of_the_return_value }
     */
    public double gpa() {
        final double three = 3;
        return (mark1 + mark2 + mark3) / three;
    }
    /**
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        final double sevfive = 7.5, seven = 7.0, eight = 8.0,
        eightfive = 8.5, six = 6.0, nine = 9.0;
        StudentDetails s1 = new StudentDetails("Sangay",
                             "IT201985001", sevfive, seven, eight);
        System.out.println(s1.gpa());
        StudentDetails s2 = new StudentDetails("Bidhya",
                             "IT201985003", eightfive, six, sevfive);
        System.out.println(s2.gpa());
        StudentDetails s3 = new StudentDetails("Kelzang",
                             "IT201985065", sevfive, eight, nine);
        System.out.println(s3.gpa());
    }
}