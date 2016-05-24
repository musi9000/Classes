package examples;

/**
 *
 * @author mustafa
 */
public class Student {

    private String name;
    private int course;
    private String speciality;
    private String university;
    static int studentCount = 0;

    private enum Speciality {
        COMPUTER_INFORMATICS, COMPUTER_INFORMATIC_TECHNOLOGY, MATEMATICS
    };

    private enum university {
        SHUMEN_UNI, VARNA_UNI, SOFIA_UNI
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public static void setStudentCount(int studentCount) {
        Student.studentCount = studentCount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }
    private String email = null;
    private String mobileNum = null;

    public Student(String studentName, int studentCourse, String studentEmail, String studentMobileNum) {
        this.name = studentName;
        this.course = studentCourse;
        this.speciality = "Computer_informatics";
        this.university = "SHU_UNI";
        this.email = studentEmail;
        this.mobileNum = studentMobileNum;
        studentCount++;
    }

    public void getStudentInfo() {
        System.out.printf("Student name: %s\n"
                + "Course: %d\n"
                + "Speciality: %s\n"
                + "University: %s\n"
                + "Email: %s\n"
                + "Mobile number %s\n"
                + "Student number: %d\n",
                this.name, this.course, this.speciality, this.university,
                this.email, this.mobileNum, studentCount);
    }

}
