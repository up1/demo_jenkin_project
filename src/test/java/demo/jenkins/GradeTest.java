package demo.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class GradeTest {

	Grade grade = new Grade();
	
	@Test
	public void scrore0ShouldGetGradeF() {
		assertEquals("FFFFFFF", grade.convert(0));
	}
	
	@Test
	public void scrore50ShouldGetGradeD() {
		assertEquals("D", grade.convert(50));
	}
	
	@Test
	public void scrore60ShouldGetGradeC() {
		assertEquals("C", grade.convert(60));
	}
	
	@Test
	public void scrore70ShouldGetGradeB() {
		assertEquals("B", grade.convert(70));
	}
	
	@Test
	public void scrore80ShouldGetGradeA() {
		assertEquals("A", grade.convert(80));
	}

}
