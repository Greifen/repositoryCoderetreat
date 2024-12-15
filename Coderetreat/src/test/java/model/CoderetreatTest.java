package model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import model.Coderetreat;

class CoderetreatTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testunderpopulation() {
		Cell cell = new Cell(true, 1);
		cell.iterate();
		assertEquals(false, cell.getState());
	}

	@Test
	void testovercrowding() {
		Cell cell = new Cell(true, 8);
		cell.iterate();
		assertEquals(false, cell.getState());
	}

	@Test
	void testsurvival() {
		Cell cell = new Cell(true, 3);
		cell.iterate();
		assertEquals(true, cell.getState());
	}

	@Test
	void testreproduction() {
		Cell cell = new Cell(false, 3);
		cell.iterate();
		assertEquals(true, cell.getState());
	}

	@Test
    void testneighbours() {
        // Define a custom matrix for the test
        boolean[][] testMatrix = {
            {false, false, false},
            {false, true, false},
            {false, true, true}
        };

        Coderetreat coderetreat = new Coderetreat(testMatrix);
        assertEquals(2, coderetreat.neighbours()); // Expect 2 neighboring `true` cells
    }
	
	 @Test
    void testneighbours2() {
        // Define a custom matrix for the test
        boolean[][] testMatrix = {
            {false, false, false},
            {true, true, false},
            {false, true, true}
        };

        Coderetreat coderetreat = new Coderetreat(testMatrix);
        assertEquals(3, coderetreat.neighbours()); // Expect 3 neighboring `true` cells
    }
    
    


}
