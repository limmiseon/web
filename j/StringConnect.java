package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringConnect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<String> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s.add(scanner.next());
        }

        System.out.println(resolve(s));
        scanner.close();
    }

    public static String resolve(List<String> strings) {
        StringBuilder sb = new StringBuilder("Hello ");
        for (String s : strings) {
            sb.append(s).append(", ");
        }
        return sb.substring(0, sb.length() - 2) + ".";
    }
}
