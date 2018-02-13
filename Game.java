import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/movies.txt");
        Scanner scan = new Scanner(file);
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> movies = new ArrayList<String>();
        while (scan.hasNextLine()) {
            movies.add(scan.nextLine());
        }
        String movieName = movies.get((int) Math.floor(Math.random() * movies.size()));
        int length = movieName.length();
        System.out.println(movieName + length);


        ArrayList<Character> choice = new ArrayList<Character>();
        for (int i = 0; i < movieName.length(); i++) {
            choice.add(movieName.charAt(i));
        }


        System.out.println("Here's your movie:");
        for (int i = 0; i < choice.size(); i++) {
            System.out.print("_ ");
        }
        System.out.println(movieName);


        ArrayList<Character> temp = new ArrayList<Character>();
        for (int i = 0; i < movieName.length(); i++) {
            temp.add('_');
        }


       while(true) { System.out.print("\nEnter your choice: ");
        String input = scanner.nextLine();


        System.out.println(temp);
        for (int i = 0; i < movieName.length(); i++) {
            if (input.equals(String.valueOf(choice.get(i)))) {
                temp.set(i, input.charAt(0));
            }
        }
        System.out.println(temp);
        for (int i = 0; i < choice.size(); i++) {
            System.out.print(temp.get(i) + " ");
        }
    }


    }

}
