package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int R = scanner.nextInt();

        Gongsa gongsa = new Gongsa(a, b, R);

        int N = scanner.nextInt();

        List<Tree> trees = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Tree tree = new Tree(x, y);
            trees.add(tree);
        }

        Park park = new Park(gongsa, trees);
        for (boolean result : park.isSilents()) {
            System.out.println(result ? "silent" : "noisy");
        }
    }
}

class Gongsa {
    int x;
    int y;
    int radius;

    public Gongsa(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public boolean isSilent(Tree tree) {
        return (tree.x - x) * (tree.x - x) + (tree.y - y) * (tree.y - y) >= radius * radius;
    }
}

class Tree {
    int x;
    int y;

    public Tree(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isSilent(Gongsa gongsa) {
        return (gongsa.x - x) * (gongsa.x - x) + (gongsa.y - y) * (gongsa.y - y) >= gongsa.radius * gongsa.radius;
    }
}

class Park {
    Gongsa gongsa;
    List<Tree> trees;

    public Park(Gongsa gongsa, List<Tree> trees) {
        this.gongsa = gongsa;
        this.trees = trees;
    }

    public List<Boolean> isSilents() {
        List<Boolean> results = new ArrayList<>();

        for (Tree tree : trees) {
            results.add(tree.isSilent(gongsa));
        }

        return results;
    }

}