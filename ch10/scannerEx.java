import java.util.*;

class scannerEx  { throws IOException{
	public static void main(String args[]) {
	Scanner x = new Scanner(System.in);
	int i;

	System.out.println("Enter INT number enter other to stop: ");
	if(x.hasNextInt()) i = x.nextInt();
	else if (x.hasNextInt() == false) System.out.print("not valid");

	System.out.println(i);
}

}
}
