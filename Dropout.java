
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
        super.set_courseName(""); // can also pass parameter value using super.get_courseName(). 
        super.set_enrollmentID(0); //same for these
        super.set_dateofEnrollment("");//same
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
    
    public void billsPayble () {
    String message = "";
    this.remainingAmount = (courseDuration - numOfMonthsAttended) * tutionFee;
    // the way question is worded is dumb imo. Need to confirm this. I assumed this a bit!
    if (this.remainingAmount == 0) {
    hasPaid = true;
    message = "All bills cleared by the student";
} else {
    message = "The total amount of bills needed to be paid is" + "" + this.remainingAmount;}
    
    System.out.println(message);
    }
    // removeStudent() also can be written with a return type of void.
    public String removeStudent() {
    String message = "All Bills Cleared Sucessfully!";
    // date of birth, coursename, student name, date of enrollment, course duration, tuition fee and date of drop out
    // enrollment id, number of remaining modules, number of months attended and remaining amount to 0
    if (hasPaid = true) {
    // need to initialise student instance variables of Student as protected else we cant modify it here! We can get around by using setter but the question doesn't says introduce setters for all vals. 
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
    super.display();
    System.out.println("The number of remaining modules is" + " "+get_numOfRemainingModules());
    System.out.println("The number of months attended is" +" "+ get_numOfMonthsAttended());
    System.out.println("The date of dropout was" +" "+ get_dateOfDropout());
    }
    
    //public static void main(String [] args) {
        // String dateOfBirth, String studentName, int courseDuration, int tutionFee, int numOfRemainingModules, int numOfMonthsAttended, String dateOfDropout
    //Dropout drp = new Dropout("22-07-2004", "Barun", 8, 70000, 4, 7, "21-01-2023");
    //drp.display();
    //}
}
