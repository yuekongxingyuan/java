package MyAlgorithm;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String result = null;
		result = input.replace(" ", "%20");
		System.out.println(result);
		in.close();
	}

}
