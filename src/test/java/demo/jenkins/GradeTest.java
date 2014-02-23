package demo.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class GradeTest {

	@Test
	public void scrore0ShouldGetGradeF() {
		Grade grade = new Grade();
		assertEquals("F", grade.convert(0));
	}

}
