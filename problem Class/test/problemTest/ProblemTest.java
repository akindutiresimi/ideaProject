package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProblemTest {

    @Test
    public void testNpnsense() {
        Problem problem = new Problem();
        assertNotNull(problem);
    }

    @Test
    public void AnotherNonSense(){
        Problem problem = new Problem();
        //System.out.println(Problem.getName());
        assertEquals("", problem.getName());

    }
}
