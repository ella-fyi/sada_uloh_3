import java.util.Scanner;
public class opakovanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("napis vetu: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        int wordCount = words.length;

        System.out.println("pocet slov vo vete: " + wordCount);

        System.out.println("dlzka kazdeho slova:");

        for (String word : words) {
            System.out.println(word + ": " + word.length());
        }

    }
}
