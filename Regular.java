
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

    public String presentPercentage(double daysPresent) {
    double present_percentage = (daysPresent / (super.courseDuration * 30)) * 100;
    String message = "";
    if (present_percentage >= 80 & present_percentage <= 100) {
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
    return message;
    }
    
    public void grantCertificate(String courseName, int enrollmentId, String dateOfEnrollment) {
     System.out.print(super.studentName + " has graduated from " + courseName + " with enrollment ID " + enrollmentId + " and enrollment date " + dateOfEnrollment + ".");
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

public static void main(String[] args) {
Regular reg = new Regular("22-09-2003", "Sasuke", 6, 100000, 3, 4, 140, "21-07-2022", "Programming", 1234);
System.out.println(reg.presentPercentage(reg.daysPresent));
System.out.println();
reg.grantCertificate(reg.courseName, reg.enrollmentID, reg.dateOfEnrollment);
System.out.println();
reg.display();

}
}
