import org.junit.jupiter.api.Test;
import ucu.edu.ua.task1.Student;
import java.util.Arrays;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class DecoratorTest {

    @Test
    void testBuilderCreatesStudent() {
        Student student = Student.builder()
                .firstName("Tania")
                .lastName("Shvets")
                .gender("female")
                .email("tania.shvets@example.com")
                .age(20)
                .course("Math")
                .course("Physics")
                .build();

        assertEquals("Tania", student.getFirstName(), "First name should match");
        assertEquals("Shvets", student.getLastName(), "Last name should match");
        assertEquals("female", student.getGender(), "Gender should match");
        assertEquals("tania.shvets@example.com", student.getEmail(), "Email should match");
        assertEquals(20, student.getAge(), "Age should match");
        assertEquals(Arrays.asList("Math", "Physics"), student.getCourses(), "Courses should match");
    }

    @Test
    void testSingularAnnotation() {
        Student student = Student.builder()
                .firstName("Sasha")
                .lastName("Saltsova")
                .course("Chemistry")
                .build();

        assertEquals(Collections.singletonList("Chemistry"), student.getCourses(), "Courses should contain a single entry");
    }

    @Test
    void testToString() {
        Student student = Student.builder()
                .firstName("Maryan")
                .lastName("Dob")
                .gender("male")
                .email("maryan@example.com")
                .age(22)
                .build();

        String studentString = student.toString();
        assertTrue(studentString.contains("Maryan"), "String representation should contain the first name");
        assertTrue(studentString.contains("Dob"), "String representation should contain the last name");
        assertTrue(studentString.contains("22"), "String representation should contain the age");
    }

    @Test
    void testEmptyCourses() {
        Student student = Student.builder()
                .firstName("oles")
                .lastName("dob")
                .build();

        assertTrue(student.getCourses().isEmpty(), "Courses list should be empty when no courses are added");
    }
}
