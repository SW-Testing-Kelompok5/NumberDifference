package program.NumberDifference;

import program.NumberDifference.CalcNUmberDifference;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumberDifferenceTest {
	private CalcNUmberDifference sut;
	
	/**
	 * Setup = inisiasi sebelum test dijalankan, preparation object
	 * --> pay attention to keep components and test cases small, 
	 * --> the trade-off seems acceptable. 
	 * --> implicit setup can be used to deine the fixture common for all tests. 
	 * --> Small in-line and delegate setup statements may supplement .. 
	 *     the speciic preconditions on per-test basis. 
	 * */
	@Before
	public void setUp() throws Exception {
		sut = new CalcNUmberDifference();
	}

		//Test Case 18 Path 12 : Input 3 angka yang memenuhi group 1
        //PIC : Titis Sampurno
        public void testGroup1NoDiff2Loop() {
            /*
                Data Uji
                N = 3
                Number = 1 5 10
            */
            ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 5, 10));
            
            // Expected Result
            String expectedMessage = "Difference : 9\nGroup 1, Small Difference";
            Integer expectedDifference = 9;
            
            // Exercise Test
            Integer actualDifference = sut.numberDiffirenceProcess(testData);
            String actualMessage = sut.groupingDifference(actualDifference);
            
            // Verify Test
            assertEquals(expectedDifference, actualDifference);
            assertEquals(expectedMessage, actualMessage);
	}

        //Test Case 19 Path 13 : Input 3 angka yang memenuhi group 0
        //PIC : Titis Sampurno
        public void testGroup0NoDiff2Loop() {
            /*
                Data Uji
                N = 3
                Number = 1 1 1
            */
            ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 1, 1));
            
            // Expected Result
            String expectedMessage = "Difference : 0\nNon Group, There's no difference";
            Integer expectedDifference = 0;
            
            // Exercise Test
            Integer actualDifference = sut.numberDiffirenceProcess(testData);
            String actualMessage = sut.groupingDifference(actualDifference);
            
            // Verify Test
            assertEquals(expectedDifference, actualDifference);
            assertEquals(expectedMessage, actualMessage);
	}
        
        //Test Case 20 Path 14 : Input 4 angka yang memenuhi group 3
        //PIC : Titis Sampurno
        public void testGroup3NoDiff3Loop() {
            /*
                Data Uji
                N = 4
                Number = 1 10 30 61
            */
            ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 10, 30, 61));
            
            // Expected Result
            String expectedMessage = "Difference : 60\nGroup 3, Large Difference";
            Integer expectedDifference = 60;
            
            // Exercise Test
            Integer actualDifference = sut.numberDiffirenceProcess(testData);
            String actualMessage = sut.groupingDifference(actualDifference);
            
            // Verify Test
            assertEquals(expectedDifference, actualDifference);
            assertEquals(expectedMessage, actualMessage);
	}
        
        //Test Case 21 Path 15 : Input 4 angka yang memenuhi group 2
        //PIC : Titis Sampurno
        public void testGroup2NoDiff3Loop() {
            /*
                Data Uji
                N = 4
                Number = 1 5 30 41
            */
            ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 5, 30, 41));
            
            // Expected Result
            String expectedMessage = "Difference : 40\nGroup 2, Medium Difference";
            Integer expectedDifference = 40;
            
            // Exercise Test
            Integer actualDifference = sut.numberDiffirenceProcess(testData);
            String actualMessage = sut.groupingDifference(actualDifference);
            
            // Verify Test
            assertEquals(expectedDifference, actualDifference);
            assertEquals(expectedMessage, actualMessage);
	}
        
        //Test Case 22 Path 16 : Input 4 angka yang memenuhi group 1
        //PIC : Titis Sampurno
        public void testGroup1NoDiff3Loop() {
            /*
                Data Uji
                N = 4
                Number = 1 5 6 10
            */
            ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 5, 6, 10));
            
            // Expected Result
            String expectedMessage = "Difference : 9\nGroup 1, Small Difference";
            Integer expectedDifference = 9;
            
            // Exercise Test
            Integer actualDifference = sut.numberDiffirenceProcess(testData);
            String actualMessage = sut.groupingDifference(actualDifference);
            
            // Verify Test
            assertEquals(expectedDifference, actualDifference);
            assertEquals(expectedMessage, actualMessage);
	}
        
        //Test Case 23 Path 17 : Input 4 angka yang memenuhi group 0
        //PIC : Titis Sampurno
        public void testGroup0NoDiff3Loop() {
            /*
                Data Uji
                N = 4
                Number = 1 1 1 1
            */
            ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 1, 1, 1));
            
            // Expected Result
            String expectedMessage = "Difference : 0\nNon Group, There's no difference";
            Integer expectedDifference = 0;
            
            // Exercise Test
            Integer actualDifference = sut.numberDiffirenceProcess(testData);
            String actualMessage = sut.groupingDifference(actualDifference);
            
            // Verify Test
            assertEquals(expectedDifference, actualDifference);
            assertEquals(expectedMessage, actualMessage);
	}
        
        //Test Case 24 Path 18 : Input 10 angka yang memenuhi group 3
        //PIC : Titis Sampurno
        public void testGroup3NoDiff9Loop() {
            /*
                Data Uji
                N = 10
                Number = 1 4 7 20 25 10 30 4 2 61
            */
            ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 4, 7, 20, 25, 10, 30, 4, 2, 61));
            
            // Expected Result
            String expectedMessage = "Difference : 60\nGroup 3, Large Difference";
            Integer expectedDifference = 60;
            
            // Exercise Test
            Integer actualDifference = sut.numberDiffirenceProcess(testData);
            String actualMessage = sut.groupingDifference(actualDifference);
            
            // Verify Test
            assertEquals(expectedDifference, actualDifference);
            assertEquals(expectedMessage, actualMessage);

}