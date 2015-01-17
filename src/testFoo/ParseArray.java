package testFoo;

public class ParseArray {

    static void addTo2DArray(int [][] theArray, int addMe) {
    	
	// Loop through the number of rows in the array.
	for (int row=0; row < theArray.length; row++) {

	    // Loop through the columns in the rowth row.
	    for (int col=0; col < theArray[row].length; col++){

		// Add the addMe value to the [row][col] entry
		// in the array.
		theArray[row][col] = theArray[row][col] + addMe;
	    }
	}
    }

}
