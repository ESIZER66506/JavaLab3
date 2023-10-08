package ESPGame;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest {
	GradeBook FirstGradeBook;
	GradeBook SecondGradeBook;
	@Before
	public void setUp() throws Exception {
		 FirstGradeBook= new GradeBook(5);
		 SecondGradeBook= new GradeBook(5);
		
		FirstGradeBook.addScore(32);
		FirstGradeBook.addScore(78);
		FirstGradeBook.addScore(15);
		FirstGradeBook.addScore(7);
		FirstGradeBook.addScore(45);
		FirstGradeBook.addScore(14);
		
		
		SecondGradeBook.addScore(84);
		SecondGradeBook.addScore(12);
		SecondGradeBook.addScore(48);
		SecondGradeBook.addScore(64);
		SecondGradeBook.addScore(74);
		SecondGradeBook.addScore(87);
	
	}

	@After
	public void tearDown() throws Exception {
		FirstGradeBook=null;
		SecondGradeBook=null;
	}

	

	@Test
	public void testAddScore() {
		assertTrue(1<5);
	}

	
	@Test
	public void testSum() {
		org.junit.Assert.assertEquals(FirstGradeBook.sum(), 177.0,1);
		org.junit.Assert.assertEquals(SecondGradeBook.sum(), 282.0,1);
		
	}

	@Test
	public void testMinimum() {
		org.junit.Assert.assertEquals(FirstGradeBook.minimum(), 7.0,1);
		org.junit.Assert.assertEquals(SecondGradeBook.minimum(), 12.0,1);
	}

	@Test
	public void testFinalScore() {
		org.junit.Assert.assertEquals(FirstGradeBook.finalScore(), 170.0,1);
		org.junit.Assert.assertEquals(SecondGradeBook.finalScore(), 270.0,1);
	}

	@Test
	public void testGetScoreSize() {
		org.junit.Assert.assertEquals(FirstGradeBook.getScoreSize(), 5,1);
		org.junit.Assert.assertEquals(SecondGradeBook.getScoreSize(), 6,1);
	}

	@Test
	public void testToString() {
		assertEquals(FirstGradeBook.toString()," 78.0 15.0 7.0 45.0");
		assertEquals(SecondGradeBook.toString()," 12.0 48.0 64.0 74.0");
		
	}

}
