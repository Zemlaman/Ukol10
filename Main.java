import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        final File file = new File("text.txt");
        final Scanner sc = new Scanner(file);
        final HashSet<Coordinate> set = new HashSet<>();

        int x = 0, y = 0;

        final String input = sc.nextLine();
        final String[] splitter = input.split("");

        for (String s : splitter) {
            switch (s) {
                case "<" -> x -= 1;
                case ">" -> x += 1;
                case "v" -> y -= 1;
                case "^" -> y += 1;
            }
            final Coordinate coord = new Coordinate(x, y);
            set.add(coord);
        }
        System.out.println(set.size()+1);
    }
}
