//           abeceda(Ztest)abc(ztest2)
import java.util.ArrayList;
import java.util.Scanner;

public class ZasifrovanieZatvoriek {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("napis vetu");
        String line = s.nextLine();
        ArrayList<Integer> openingBracketPositions = new ArrayList<>();
        ArrayList<Integer> closingBracketPositions = new ArrayList<>();
        ArrayList<StringBuilder> bracketContents = new ArrayList<>();
        ArrayList<StringBuilder> encryptedBracketContents = new ArrayList<>();

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '('){
                openingBracketPositions.add(i+1);
            } else if (line.charAt(i) == ')') {
                closingBracketPositions.add(i);
            }
        }

        for (int i = 0; i < openingBracketPositions.size(); i++) {
            bracketContents.add(new StringBuilder(line.substring(openingBracketPositions.get(i), closingBracketPositions.get(i))));
        }

        for (int i = 0; i < bracketContents.size(); i++) {
            encryptedBracketContents.add(new StringBuilder());
        }

        for (int i = 0; i < encryptedBracketContents.size(); i++) {
            for (char c : bracketContents.get(i).toString().toCharArray()){
                if (c == 'z'){
                    encryptedBracketContents.get(i).append('a');
                } else if (c == 'Z') {
                    encryptedBracketContents.get(i).append('A');
                }else {
                    encryptedBracketContents.get(i).append((char) (c + 1));
                }
            }
        }
        System.out.println(bracketContents + "\nzasifrovane: \n"+ encryptedBracketContents);
    }
}