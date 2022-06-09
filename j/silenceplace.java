package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SilencePlace {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int R = scanner.nextInt();
		int N = scanner.nextInt();
		
		List<Integer> trees = new ArrayList<>();
		
		for (int i = 0; i < (N * 2); i++) {
			trees.add(scanner.nextInt());
		}

		for(int i = 0; i < (N * 2); i+=2) {
			double noisy = Math.pow(R, 2);
			double distance = Math.pow((trees.get(i) - a), 2) + Math.pow((trees.get(i+1) - b), 2);
			
			if (distance >= noisy) {
				System.out.println("silent");
			} else {
				System.out.println("noisy");
			}
		}
	}
}
