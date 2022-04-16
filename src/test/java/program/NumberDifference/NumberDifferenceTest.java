package program.NumberDifference;

import program.NumberDifference.CalcNUmberDifference;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
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

//Test Case Nabil Path 1-5 dan 9-11
        
        //Test Case 1 
        //Inputkan 2 angka membentuk group 3 dalam range
        //PIC : Nabil Putra Hadiyani
        /*Test Data
            N = 2
            Number = 5 60
        */
        @Test
	public void testGroup3InRange() {
		// (1) setup (arrange, build)
                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(5, 60));
		
                // Expected Result
                String expectedMessage = "Difference : 55\nGroup 3, Large Difference";
                Integer expectedDifference = 55;
                
                // Exercise
                Integer actualDifference = sut.numberDiffirenceProcess(testData);
                String actualMessage = sut.groupingDifference(actualDifference);
                		
		// Verify Test
                assertEquals(expectedDifference, actualDifference);
                assertEquals(expectedMessage, actualMessage);
	}
        
        //Test Case 2 Path 1 
        //Inputkan 2 angka membentuk group 3 dibatas bawah group 3 (51)
        //PIC : Nabil Putra Hadiyani
        /*Test Data
            N = 2
            Number = 1 52
        */
        @Test
	public void testGroup3MinRange() {
		// (1) setup (arrange, build)
                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 52));
		
                // Expected Result
                String expectedMessage = "Difference : 51\nGroup 3, Large Difference";
                Integer expectedDifference = 51;
                
                // Exercise
                Integer actualDifference = sut.numberDiffirenceProcess(testData);
                String actualMessage = sut.groupingDifference(actualDifference);
                		
		// Verify Test
                assertEquals(expectedDifference, actualDifference);
                assertEquals(expectedMessage, actualMessage);
	}
        
        //Test Case 3 Path 2 
        //Inputkan 2 angka membentuk group 2 dalam range
        //PIC : Nabil Putra Hadiyani
        /*Test Data
            N = 2
            Number = 5 20
        */
        @Test
	public void testGroup2InRange() {
		// (1) setup (arrange, build)
                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(5, 20));
		
                // Expected Result
                String expectedMessage = "Difference : 15\nGroup 2, Medium Difference";
                Integer expectedDifference = 15;
                
                // Exercise
                Integer actualDifference = sut.numberDiffirenceProcess(testData);
                String actualMessage = sut.groupingDifference(actualDifference);
                		
		// Verify Test
                assertEquals(expectedDifference, actualDifference);
                assertEquals(expectedMessage, actualMessage);
	}
        //Test Case 4 Path 2 
        //Inputkan 2 angka membentuk group 2 dibatas atas group 2 (50)
        //PIC : Nabil Putra Hadiyani
        /*Test Data
            N = 2
            Number = 5 55
        */
        @Test
	public void testGroup2MaxRange() {
		// (1) setup (arrange, build)
                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(5, 55));
		
                // Expected Result
                String expectedMessage = "Difference : 50\nGroup 2, Medium Difference";
                Integer expectedDifference = 50;
                
                // Exercise
                Integer actualDifference = sut.numberDiffirenceProcess(testData);
                String actualMessage = sut.groupingDifference(actualDifference);
                		
		// Verify Test
                assertEquals(expectedDifference, actualDifference);
                assertEquals(expectedMessage, actualMessage);
	}
 
        
        //Test Case 5 Path 2 
        //Inputkan 2 angka membentuk group 2 dibatas bawah range group 2 (11)
        //PIC : Nabil Putra Hadiyani
        /*Test Data
            N = 2
            Number = 1 12
        */
        @Test
	public void testGroup2MinRange() {
		// (1) setup (arrange, build)
                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 12));
		
                // Expected Result
                String expectedMessage = "Difference : 11\nGroup 2, Medium Difference";
                Integer expectedDifference = 11;
                
                // Exercise
                Integer actualDifference = sut.numberDiffirenceProcess(testData);
                String actualMessage = sut.groupingDifference(actualDifference);
                		
		// Verify Test
                assertEquals(expectedDifference, actualDifference);
                assertEquals(expectedMessage, actualMessage);
	}
 
        //Test Case 6 Path 3 
        //Inputkan 2 angka membentuk group 1 dalam range
        //PIC : Nabil Putra Hadiyani
        /*Test Data
            N = 2
            Number = 2 8
        */
        @Test
	public void testGroup1InRange() {
		// (1) setup (arrange, build)
                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(2, 8));
		
                // Expected Result
                String expectedMessage = "Difference : 6\nGroup 1, Small Difference";
                Integer expectedDifference = 6;
                
                // Exercise
                Integer actualDifference = sut.numberDiffirenceProcess(testData);
                String actualMessage = sut.groupingDifference(actualDifference);
                		
		// Verify Test
                assertEquals(expectedDifference, actualDifference);
                assertEquals(expectedMessage, actualMessage);
	} 
        
        //Test Case 7 Path 3 
        //Inputkan 2 angka membentuk group 1 dibatas atas range group 1 (10)
        //PIC : Nabil Putra Hadiyani
        /*Test Data
            N = 2
            Number = 2 12
        */
        @Test
	public void testGroup1MaxRange() {
		// (1) setup (arrange, build)
                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(2, 12));
		
                // Expected Result
                String expectedMessage = "Difference : 10\nGroup 1, Small Difference";
                Integer expectedDifference = 10;
                
                // Exercise
                Integer actualDifference = sut.numberDiffirenceProcess(testData);
                String actualMessage = sut.groupingDifference(actualDifference);
                		
		// Verify Test
                assertEquals(expectedDifference, actualDifference);
                assertEquals(expectedMessage, actualMessage);
	}        
        
        //Test Case 8 Path 3 
        //Inputkan 2 angka membentuk group 1 dibatas bawah range group 1 (1)
        //PIC : Nabil Putra Hadiyani
        /*Test Data
            N = 2
            Number = 1 2
        */
        @Test
	public void testGroup1MinRange() {
		// (1) setup (arrange, build)
                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 2));
		
                // Expected Result
                String expectedMessage = "Difference : 1\nGroup 1, Small Difference";
                Integer expectedDifference = 1;
                
                // Exercise
                Integer actualDifference = sut.numberDiffirenceProcess(testData);
                String actualMessage = sut.groupingDifference(actualDifference);
                		
		// Verify Test
                assertEquals(expectedDifference, actualDifference);
                assertEquals(expectedMessage, actualMessage);
	}        
        //Test Case 9 Path 4 
        //Inputkan 2 angka membentuk group 0
        //PIC : Nabil Putra Hadiyani
        /*Test Data
            N = 2
            Number = 5 5
        */
        @Test
	public void testGroup0() {
		// (1) setup (arrange, build)
                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(5, 5));
		
                // Expected Result
                String expectedMessage = "Difference : 0\nNon Group, There’s no difference";
                Integer expectedDifference = 0;
                
                // Exercise
                Integer actualDifference = sut.numberDiffirenceProcess(testData);
                String actualMessage = sut.groupingDifference(actualDifference);
                		
		// Verify Test
                assertEquals(expectedDifference, actualDifference);
                assertEquals(expectedMessage, actualMessage);
	}
        //Test Case 10 Path 5 
        //Inputkan jumlah angka tidak valid lebih dari 10 (N)
        //PIC : Nabil Putra Hadiyani
        /*Test Data
            N = 11
        */
        @Test
	public void testMaksValidation() {
		int jumlahDeretBil;
		boolean actual, expected;
                // Test Data = 11
		jumlahDeretBil = 11;
		expected = false;
		
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}
        //Test Case 11 Path 5 
        //Inputkan jumlah angka tidak valid kurang dari 1 (N)
        //PIC : Nabil Putra Hadiyani
        /*Test Data
            N = 0
        */
        @Test
	public void testMinValidation() {
		int jumlahDeretBil;
		boolean actual, expected;
                // Test Data = 0
		jumlahDeretBil = 0;
		expected = false;
		
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}        
        
        //Test Case 12 Path 9
        //Inputkan jumlah N 1  dan masuk group 0
        //PIC : Nabil Putra Hadiyani
        /*Test Data
            N = 1
            Number = 5
        */
        @Test
	public void testNonGroupInput1() {
		// (1) setup (arrange, build)
                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(5));
		
                // Expected Result
                String expectedMessage = "Difference : 0\nNon Group, There’s no difference";
                Integer expectedDifference = 0;
                
                // Exercise
                Integer actualDifference = sut.numberDiffirenceProcess(testData);
                String actualMessage = sut.groupingDifference(actualDifference);
                		
		// Verify Test
                assertEquals(expectedDifference, actualDifference);
                assertEquals(expectedMessage, actualMessage);
	}
        //Test Case 13 Path 10
        //Input 3 angka yang memenuhi group 3
        //PIC : Nabil Putra Hadiyani
        /*Test Data
            N = 3
            Number = 1 10 61
        */
        @Test
	public void testGroup3Input3() {
		// (1) setup (arrange, build)
                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 10, 61));
		
                // Expected Result
                String expectedMessage = "Difference : 60\nGroup 3, Large Difference";
                Integer expectedDifference = 60;
                
                // Exercise
                Integer actualDifference = sut.numberDiffirenceProcess(testData);
                String actualMessage = sut.groupingDifference(actualDifference);
                		
		// Verify Test
                assertEquals(expectedDifference, actualDifference);
                assertEquals(expectedMessage, actualMessage);
	}
        //Test Case 14 Path 11
        //Input 3 angka yang memenuhi group 2
        //PIC : Nabil Putra Hadiyani
        /*Test Data
            N = 3
            Number = 1 5 41
        */
        @Test
	public void testGroup3Input2() {
		// (1) setup (arrange, build)
                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 5, 41));
		
                // Expected Result
                String expectedMessage = "Difference : 40\nGroup 2, Medium Difference";
                Integer expectedDifference = 40;
                
                // Exercise
                Integer actualDifference = sut.numberDiffirenceProcess(testData);
                String actualMessage = sut.groupingDifference(actualDifference);
                		
		// Verify Test
                assertEquals(expectedDifference, actualDifference);
                assertEquals(expectedMessage, actualMessage);
	}

        
        //Test Case 18 Path 12 : Input 3 angka yang memenuhi group 1
        //PIC : Titis Sampurno
        @Test
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
        @Test
        public void testGroup0NoDiff2Loop() {
            /*
                Data Uji
                N = 3
                Number = 1 1 1
            */
            ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 1, 1));
            
            // Expected Result
            String expectedMessage = "Difference : 0\nNon Group, There’s no difference";
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
        @Test
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
        @Test
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
        @Test
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
        @Test
        public void testGroup0NoDiff3Loop() {
            /*
                Data Uji
                N = 4
                Number = 1 1 1 1
            */
            ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 1, 1, 1));
            
            // Expected Result
            String expectedMessage = "Difference : 0\nNon Group, There’s no difference";
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
        @Test
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

        //Test Case 25 Path 19  
        //Input 10 angka yang memenuhi group 2
        //PIC : Muammad Syahid Abdurrahman
        @Test
        public void testGroup2NoDiff9Loop() {
            /*
                Data Uji
                N = 10
                Number = 1 5 2 29 13 4 2 4 30 41
            */
            ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 5, 2, 29, 13, 4, 2, 4, 30, 41));
            
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

        //Test Case 26 Path 20
        //Input 10 angka yang memenuhi group 1
        //PIC : Muhammad Syahid Abdurraman
        @Test
        public void testGroup1DiffNo9Loop() {
            /*
                Data Uji
                N = 10
                Number = 1 2 3 4 5 5 2 7 6 10
            */
            ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 5, 2, 7, 6, 10));
            
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
        
        //Test Case 27 Path 21
        //Input 10 angka yang memenuhi group 0   
        //PIC : Muammad Syahid Abdurraman
        @Test
        public void testNonGroupNoDiff9Loop() {
            /*
                Data Uji
                N = 10
                Number = 1 1 1 1 1 1 1 1 1
            */
            ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1));
            
            // Expected Result
            String expectedMessage = "Difference : 0\nNon Group, There’s no difference";
            Integer expectedDifference = 0;
            
            // Exercise Test
            Integer actualDifference = sut.numberDiffirenceProcess(testData);
            String actualMessage = sut.groupingDifference(actualDifference);
            
            // Verify Test
            assertEquals(expectedDifference, actualDifference);
            assertEquals(expectedMessage, actualMessage);
	}
        
}