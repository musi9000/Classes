package examples;

/**
 *
 * @author mustafa
 */
public class StudentTest {

    static String name;
    static int course;
    static String speciality;
    static String university;
    static String email = null;
    static String mobileNum = null;
    static int studentCount = 0;

    static void createStudent(String studentName, int studentCourse, String studentEmail, String studentMobileNum) {
        name = studentName;
        course = studentCourse;
        speciality = "Computer_informatics";
        university = "SHU_UNI";
        email = studentEmail;
        mobileNum = studentMobileNum;
        studentCount++;
    }

    static void getStudentInfo() {
        System.out.printf("Student name: %s\n"
                + "Course: %d\n"
                + "Speciality: %s\n"
                + "University: %s\n"
                + "Email: %s\n"
                + "Mobile number %s\n"
                + "Student number: %d\n",
                name, course, speciality, university,
                email, mobileNum, studentCount);
    }

    public static void main(String[] args) {
        Student firstStudent = new Student("Mustafa", 4, "musi9000@abv.bg", "0895038878");
        firstStudent.getStudentInfo();
        Student secondStudent = new Student("Krum", 4, "skalata92@gmail.com", "0894343434");
        secondStudent.getStudentInfo();

        
        StudentTest.createStudent("Kistina", 4, "kriska_1111@abv.bg", "0895546456");
        StudentTest.getStudentInfo();
        
    }
}
