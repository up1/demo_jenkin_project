package demo.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class GradeTest {

	Grade grade = new Grade();
	
	@Test
	public void scrore0ShouldGetGradeF() {
		assertEquals("F", grade.convert(0));
	}
	
	@Test
	public void scrore50ShouldGetGradeD() {
		assertEquals("D", grade.convert(50));
	}
	
	@Test
	public void scrore60ShouldGetGradeC() {
		assertEquals("C", grade.convert(60));
	}

}
