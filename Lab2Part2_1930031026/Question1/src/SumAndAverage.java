public class SumAndAverage {
	public static void main(String[] args) {
		int sum = 0; // Store the accumulated sum init to 0
		double average; // average in double
		int lowerbound = 1; // The lowerbound to sum
		int upperbound = 100; // The upperbound to sum
		int oddNumber=0;
		// Use a for-loop to sum from lowerbound to upperbound
		for(int number = lowerbound; number <= upperbound; number++) {
			if(number%2!=0) {
			sum += number; // same as "sum = sum + number"
			oddNumber++;
			}
		}
		// Compute average in double. Beware that int/int produces int.
		average = (double) sum / oddNumber;
		// Print sum and average
		System.out.println("The sum of odd number is " + sum);
		System.out.println("The average of all odd numbers is " + average);
		// 6.1 while loop
		System.out.println("---- While-loop:");
		sum = 0;
		int number = lowerbound;
		int sevenNumber=0;
		while(number <= upperbound) {
			if(number%7==0) {
				sum += number;
				sevenNumber++;
			}
			number++;
			}
		// Compute average in double. Beware that int/int produces int.
		average = (double) sum / sevenNumber;
		// Print sum and average
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);
		// 6.2 do-while
		System.out.println("---- Do-while:");
		sum = 0; // Reset sum
		number = lowerbound;
		do {
			sum += number*number;
			number++;
		} while(number <= upperbound);
		// Compute average in double. Beware that int/int produces int.
		average = (double) sum / (upperbound - lowerbound + 1);
		// Print sum and average
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);
	}
}
