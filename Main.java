import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        final File file = new File("text.txt");
        final Scanner sc = new Scanner(file);
        HashSet<Position> hashset = new HashSet<>();
        int x = 0;
        int y = 0;
        String input = sc.nextLine();
        String[] splitted = input.split("");

        for (String string : splitted) {
            switch (string) {
                case "<" -> x -= 1;
                case ">" -> x += 1;
                case "v" -> y -= 1;
                case "^" -> y += 1;
            }
            final Position position = new Position(x, y);
            hashset.add(position);
        }
        System.out.println(hashset.size()+1);
    }
}