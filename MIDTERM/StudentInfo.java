import java.util.Scanner;

public class StudentInfo{

private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private String fullname;

public static void main(String []args){
Scanner sc = new Scanner(System.in);
StudentInfo studentinfo = new StudentInfo();

System.out.print("Enter First Name: ");
        studentinfo.setFirstName(sc.nextLine());

        System.out.print("Enter Middle Name: ");
        studentinfo.setMiddleName(sc.nextLine());

        System.out.print("Enter Last Name: ");
        studentinfo.setLastName(sc.nextLine());

        System.out.print("Enter Suffix: ");
        studentinfo.setSuffix(sc.nextLine());
    

        System.out.print("\nFullName: ");
        
        
        System.out.println("\nStudent's Info:");
        System.out.println("First Name: " + studentinfo.getFirstName());
        System.out.println("Middle Name: " + studentinfo.getMiddleName());
        System.out.println("Last Name: " + studentinfo.getLastName());
        System.out.println("Suffix: " + studentinfo.getSuffix());
        System.out.println("Full Name: " +studentinfo.getFullName());
}

//getter and setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getFullName(){
    return firstName+" "+middleName+" "+lastName+" "+suffix;
}}