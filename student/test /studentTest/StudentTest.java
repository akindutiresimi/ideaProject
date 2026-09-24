package studentTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import student.Student;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    Student student;
    @BeforeEach
    public void setUp(){
        student = new Student( "John Dan", 9);
    }

    @Test
    public void TestTheStudentNameAndShowWhichGradeTheStudentHas() {

        assertEquals("my name is John Dan,my grade level is 9", student.introduction());
    }

    @Test
    public void TestThatTheStudentIsPromotedUpTheGradeLevel() {
        assertEquals(10, student.promotion());
    }

    @Test
    public void TestThatTheStudentPassByTakingTheStudentScore() {
        assertTrue(student.has_Passed(70));
    }

    @Test
    public void TestThatTheStudentChangeIsName() {
        assertEquals("King", student.update_Name("King"));
    }

    @Test
    public void TestWetherTheStudentIsINGraduatingYear() {
        assertFalse(student.is_Graduating(10));
    }

}
