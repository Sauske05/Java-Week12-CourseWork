
/**
 * Write a description of class Regular here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Regular extends Student
{
    // instance variables - replace the example below with your own
    private int numOfModules;
    private int numOfCreditHours;
    private double daysPresent;
    private boolean isGrantedScholarship;
    /**
     * Constructor for objects of class Regular
     */
    public Regular(String dateOfBirth, String studentName, int courseDuration, int tutionFee,int numOfModules, int numOfCreditHours, double daysPresent, String dateOfEnrollment, String courseName, int enrollmentID)
    {
        // initialise instance variables
        super(dateOfBirth, studentName, courseDuration, tutionFee);
        super.set_courseName(courseName);
        super.set_enrollmentID(enrollmentID);
        super.set_dateofEnrollment(dateOfEnrollment);
        this.numOfModules = numOfModules;
        this.numOfCreditHours = numOfCreditHours;
        this.daysPresent = daysPresent;
        this.isGrantedScholarship = false;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
     public int getNumOfModules() {
        return numOfModules;
    }

    public int getNumOfCreditHours() {
        return numOfCreditHours;
    }

    public double getDaysPresent() {
        return daysPresent;
    }

    public boolean isGrantedScholarship() {
        return isGrantedScholarship;
    }

    public void setIsGrantedScholarship(boolean isGrantedScholarship) {
        this.isGrantedScholarship = isGrantedScholarship;
    }

    public void presentPercentage(double daysPresent) {
    double present_percentage = (daysPresent / (super.get_courseDuration() * 30)) * 100;
    String message = "";
    this.daysPresent = daysPresent;
    if (daysPresent > (get_courseDuration() * 30)) {
    System.out.println("You are from future homie!");
    } else {
    if (present_percentage >= 80 & present_percentage <= 100) {
        setIsGrantedScholarship(true);
    message = "A";
    }
    
    else if (present_percentage < 80 & present_percentage >=60) {
    message = "B";
    }
    
    else if (present_percentage < 60 & present_percentage >=40) {
    message = "C";
    } 
    
    else if (present_percentage < 40 & present_percentage >=20) {
    message = "D";
    } 
    
    else { message = "E";}
    System.out.println("The student's attendence is" +" "+ present_percentage + "%. So, the student's grade is"+ " "+message);
}
    
    }
    
    public void grantCertificate(String courseName, int enrollmentId, String dateOfEnrollment) {
     System.out.print(super.get_studentName() + " has graduated from " + get_courseName() + " with enrollment ID " + get_enrollmentID() + " and enrollment date " + get_dateofEnrollment() + ".");
    if (isGrantedScholarship) {
        System.out.print(" The scholarship has been granted.");
    }
    System.out.println();
    } 
    
    public void display() {
    super.display();
    System.out.println("Number of modules: " + this.numOfModules);
    System.out.println("Number of credit hours: " + this.numOfCreditHours);
    System.out.println("Days present: " + this.daysPresent);
}

//public static void main(String[] args) {
//Regular reg = new Regular("22-09-2003", "Sasuke", 6, 100000, 3, 4, 140, "21-07-2022", "Programming", 1234);
//System.out.println(reg.presentPercentage(reg.daysPresent));
//System.out.println();
//reg.grantCertificate(reg.courseName, reg.enrollmentID, reg.dateOfEnrollment);
//System.out.println();
//reg.display();

//}
}
