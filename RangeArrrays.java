import java.util.Arrays;
public class RangeArrrays {
	public static void main (String[] args) {

	int[] ranges = new int[5];

	ranges[0] = 5; 	
	ranges[1] = 6;
	ranges[2] = 10;
	ranges[3] = 15;
	ranges[4] = 21;


	int largset[] = ranges[0];
	int smallest[] = ranges[0];

	if(ranges[1] > largest) {
		largestc = ranges[1];
	}
	if(ranges[2] > largest) {
		largest = ranges[2];
	}
	if(ranges[3] > largest) {
		largest = ranges[3];
	}
	if(ranges[4] > largest) {
		largest = ranges[4];
	}


	if(ranges[1] < smallest) {
		smallest = ranges[1];
	}

	if(ranges[2] < smallest) {
		smallest = ranges[2];
	}

	if(ranges[3] < smallest) {
		smallest = ranges[3];
	}

	if(ranges[4] < smallest) {
		smallest = ranges[4];
	}
	
	 ranges = largest - smallest;
System.out.println(Arrays.toString(ranges) + " is the range");
}


}	