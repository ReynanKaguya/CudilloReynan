import java.util.Scanner;

class Student {
    private int studentId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private int age;
    private int yearLevel;
    private String phoneNumber;
    private String email;
    private Course course;

    public Student(int studentId, String firstName, String middleName, String lastName, String suffix, int age, int yearLevel, String phoneNumber, String email) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
        this.age = age;
        this.yearLevel = yearLevel;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.course = new Course();
    }
    public void setStudentId(int studentId) {
    this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
    this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
    this.middleName = middleName;
    }

    public void setLastName(String lastName) {
    this.lastName = lastName;
    }

    public void setSuffix(String suffix) {
    this.suffix = suffix;
    }

    public void setAge(int age) {
    this.age = age;
    }

    public void setYearLevel(int yearLevel) {
    this.yearLevel = yearLevel;
    }

    public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
    this.email = email;
    }
    

    public void setCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    public void setCourseCode(String courseCode) {
        course.setCourseCode(courseCode);
    }

    public void setDepartment(String department) {
        course.setDepartment(department);
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public int getAge() {
        return age;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getCourseName() {
        return course.getCourseName();
    }

    public String getCourseCode() {
        return course.getCourseCode();
    }

    public String getDepartment() {
        return course.getDepartment();
    }

    public void displayStudentDetails() {
        System.out.println("Student Record");
        System.out.println("0. Exit");

        System.out.println("Student Profile Details:");
        System.out.println("Student ID No.: " + studentId);
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Suffix: " + suffix);
        System.out.println("Age: " + age);
        System.out.println("Year Level: " + yearLevel);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);

        System.out.println("Student Course Details:");
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseCode());
        System.out.println("Department: " + course.getDepartment());

        System.out.print("Enter 0 to return: ");
    }
}

class Course {
    private String courseName;
    private String courseCode;
    private String department;

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getDepartment() {
        return department;
    }
}

public class StudentRecordManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = null;

        while (true) {
            System.out.println("Student Record Management System");
            System.out.println("1. Create Student Record");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    student = createStudent(scanner);
                    break;

                case 0:
                    System.out.println("Exiting Student Record Management System.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }

            if (student != null) {
                studentManagementMenu(scanner, student);
            }
        }
    }

    public static Student createStudent(Scanner scanner) {
        System.out.println("Enter Student Details:");
        System.out.print("Student ID No.: ");
        int studentId = scanner.nextInt();
        System.out.print("First Name: ");
        String firstName = scanner.next();
        System.out.print("Middle Name: ");
        String middleName = scanner.next();
        System.out.print("Last Name: ");
        String lastName = scanner.next();
        System.out.print("Suffix: ");
        String suffix = scanner.next();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Year Level: ");
        int yearLevel = scanner.nextInt();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.next();
        System.out.print("Email: ");
        String email = scanner.next();

        return new Student(studentId, firstName, middleName, lastName, suffix, age, yearLevel, phoneNumber, email);
    }

    public static void studentManagementMenu(Scanner scanner, Student student) {
        while (true) {
            System.out.println("Student Record Management Menu");
            System.out.println("1. Update Student Profile Details");
            System.out.println("2. Update Student Course Details");
            System.out.println("3. Display Student Record");
            System.out.println("0. Return");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    updateStudentProfileDetails(scanner, student);
                    break;

                case 2:
                    updateStudentCourseDetails(scanner, student);
                    break;

                case 3:
                    student.displayStudentDetails();
                    scanner.nextInt();  // Wait for user to press Enter
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }

    public static void updateStudentProfileDetails(Scanner scanner, Student student) {
        while (true) {
            System.out.println("Student Profile Details Update Menu");
            System.out.println("1. Update Student ID No.");
            System.out.println("2. Update First Name");
            System.out.println("3. Update Middle Name");
            System.out.println("4. Update Last Name");
            System.out.println("5. Update Suffix");
            System.out.println("6. Update Age");
            System.out.println("7. Update Year Level");
            System.out.println("8. Update Phone Number");
            System.out.println("9. Update Email");
            System.out.println("0. Return");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter new Student ID No.: ");
                    int newStudentId = scanner.nextInt();
                    student.setStudentId(newStudentId);
                    break;

                case 2:
                    System.out.print("Enter new First Name: ");
                    String newFirstName = scanner.next();
                    student.setFirstName(newFirstName);
                    break;

                case 3:
                    System.out.print("Enter new Middle Name: ");
                    String newMiddleName = scanner.next();
                    student.setMiddleName(newMiddleName);
                    break;

                case 4:
                    System.out.print("Enter new Last Name: ");
                    String newLastName = scanner.next();
                    student.setLastName(newLastName);
                    break;

                case 5:
                    System.out.print("Enter new Suffix: ");
                    String newSuffix = scanner.next();
                    student.setSuffix(newSuffix);
                    break;

                case 6:
                    System.out.print("Enter new Age: ");
                    int newAge = scanner.nextInt();
                    student.setAge(newAge);
                    break;

                case 7:
                    System.out.print("Enter new Year Level: ");
                    int newYearLevel = scanner.nextInt();
                    student.setYearLevel(newYearLevel);
                    break;

                case 8:
                    System.out.print("Enter new Phone Number: ");
                    String newPhoneNumber = scanner.next();
                    student.setPhoneNumber(newPhoneNumber);
                    break;

                case 9:
                    System.out.print("Enter new Email: ");
                    String newEmail = scanner.next();
                    student.setEmail(newEmail);
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }

    public static void updateStudentCourseDetails(Scanner scanner, Student student) {
        System.out.println("Select Student Course Details (Update)");
        System.out.println("1. Bachelor of Science in Information Technology (BSIT)");
        System.out.println("2. Bachelor of Science in Computer Science (BSCS)");
        System.out.println("3. Associate of Computer Technology (ACT)");
        System.out.println("4. Bachelor of Science in Mechanical Engineering (BSME)");
        System.out.println("5. Bachelor of Science in Civil Engineering (BSCE)");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                student.setCourseName("Bachelor of Science in Information Technology (BSIT)");
                student.setCourseCode("BSIT");
                student.setDepartment("College of Computer Studies Department");
                break;

            case 2:
                student.setCourseName("Bachelor of Science in Computer Science (BSCS)");
                student.setCourseCode("BSCS");
                student.setDepartment("College of Computer Studies Department");
                break;

            case 3:
                student.setCourseName("Associate of Computer Technology (ACT)");
                student.setCourseCode("ACT");
                student.setDepartment("College of Computer Studies Department");
                break;

            case 4:
                student.setCourseName("Bachelor of Science in Mechanical Engineering (BSME)");
                student.setCourseCode("BSME");
                student.setDepartment("College of Engineering Department");
                break;

            case 5:
                student.setCourseName("Bachelor of Science in Civil Engineering (BSCE)");
                student.setCourseCode("BSCE");
                student.setDepartment("College of Engineering Department");
                break;

            default:
                System.out.println("Invalid choice. Please select a valid course option.");
                break;
        }
        System.out.println("Course information updated successfully.");
    }
}