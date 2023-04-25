
/**
 * Write a description of class Dropout here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dropout extends Student
{
    // instance variables - replace the example below with your own
    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private int remainingAmount;
    private boolean hasPaid;
    /**
     * Constructor for objects of class Dropout
     */
    public Dropout(String dateOfBirth, String studentName, int courseDuration, int tutionFee, int numOfRemainingModules, int numOfMonthsAttended, String dateOfDropout)
    {
        // initialise instance variables
        super(dateOfBirth, studentName, courseDuration, tutionFee);
        this.numOfRemainingModules = numOfRemainingModules;
        this.numOfMonthsAttended = numOfMonthsAttended;
        this.dateOfDropout = dateOfDropout;
        super.set_courseName("");
        super.set_enrollmentID(0);
        super.set_dateofEnrollment("");
        this.remainingAmount = 0;
        this.hasPaid = false;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int get_numOfRemainingModules() {
    return numOfRemainingModules;
    }
    public int get_numOfMonthsAttended() {
    return this.numOfMonthsAttended;
    }
    public String get_dateOfDropout() {
    return dateOfDropout;
    }
    public int get_remainingAmount() {
    return remainingAmount;
    }
    public boolean get_hasPaid() {
    return hasPaid;
    }
    
    public double billsPayble () {
    remainingAmount = (courseDuration*30 - numOfMonthsAttended) * tutionFee;
    hasPaid = true;
    return remainingAmount;
    }
    
    public String removeStudent() {
    String message = "Clear Bill Mofo!";
    // date of birth, coursename, student name, date of enrollment, course duration, tuition fee and date of drop out
    // enrollment id, number of remaining modules, number of months attended and remaining amount to 0
    if (hasPaid = true) {
    dateOfBirth = "";
    courseName = "";
    studentName = "";
    dateOfEnrollment = "";
    courseDuration = 0;
    tutionFee = 0;
    dateOfDropout = "";
    enrollmentID = 0;
    numOfRemainingModules = 0;
    numOfMonthsAttended = 0;
    remainingAmount = 0;
    } else {
    message = "All Bills not cleared.";
    }
    
    return message;
    }
    
    public void display() {
    System.out.println("The enrollmentId of the Student is" + enrollmentID);
    System.out.println("The date of birth of the Student is" + dateOfBirth);
    System.out.println("The courseName is" + courseName);
    System.out.println("The studentName is" + studentName);
    System.out.println("The course duration is" + courseDuration);
    System.out.println("The tutionFee is" + tutionFee);
    System.out.println("The number of remaining modules is" + numOfRemainingModules);
    System.out.println("The number of months attended is" + numOfMonthsAttended);
    System.out.println("The date of dropout was" + dateOfDropout);
    }
    
    public static void main(String [] args) {
        // String dateOfBirth, String studentName, int courseDuration, int tutionFee, int numOfRemainingModules, int numOfMonthsAttended, String dateOfDropout
    Dropout drp = new Dropout("22-07-2004", "Barun", 8, 70000, 4, 7, "21-01-2023");
    drp.display();
    }
}
