package Modul_3.dz_3;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Z570 on 12.02.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Course courseMain = new Course();
        String courseName = courseMain.getName();
        int courseDuration = courseMain.getHoursDuration();
        String courseTeacherName = courseMain.getTeacherName();
        Date dateCourseStart = courseMain.getStartDate();
        Course courseStart = new Course( dateCourseStart, courseName);
        Course course = new Course(courseName, courseDuration, courseTeacherName);


        Student student = new Student();
        Course[] coursesTaken = student.getCoursesTaken();
        String firstNameStudent = student.getFirstName();
        String lastNameStudent = student.getLastName();
        int groupStudent = student.getGroup();
        int ageStudent = student.getAge();
        Student mainStudent = new Student (firstNameStudent,lastNameStudent, groupStudent);
        Student studentCourses = new Student(lastNameStudent, coursesTaken);

        CollegeStudent collegeStudent = new CollegeStudent();
        String collegeName = collegeStudent.getCollegeName();
        int ratingStudent = collegeStudent.getRating();
        long idStudent = collegeStudent.getId();
        CollegeStudent collegeStudentGroup = new CollegeStudent(firstNameStudent,lastNameStudent, groupStudent);
        CollegeStudent collegeStudentCourses = new CollegeStudent(lastNameStudent, coursesTaken);
        CollegeStudent collegeStudentRating = new CollegeStudent(collegeName, ratingStudent, idStudent);

        SpecialStudent specialStudent = new SpecialStudent();
        long secretKey = specialStudent.getSecretKey();
        SpecialStudent specialStudentInGroup = new SpecialStudent(firstNameStudent,lastNameStudent, groupStudent);
        SpecialStudent specialStudentWithCourses = new SpecialStudent(lastNameStudent, coursesTaken);
        SpecialStudent specialStudentWithSecretKey = new SpecialStudent(secretKey);

    }

}
