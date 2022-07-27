
public class TimeTable {

	public static void main(String[] args) {
	System.out.println("* |  1  2  3  4  5  6  7  8  9");
	System.out.println("------------------------------");//first two lines
	for(int i=1;i<=9;i++) {//loop to count row
		System.out.print(i+" |");
		for(int j=1;j<=9;j++){//nested loop to count column
			if(j*i>=10) {//decide if there are two digits
				System.out.print(" "+j*i);//if yes, out put one space
			}else {
				System.out.print("  "+j*i);//else, output two space
			}
		}
		System.out.println();//change line
		}
	}

}
