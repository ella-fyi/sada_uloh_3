import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Telesna {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("napis skoky oddelene medzerou s presnostou na dve des. miesta");
        String line = s.nextLine();
        StringBuilder lineSB = new StringBuilder(line);
        lineSB.append(' ');

        int numberOfPeople = lineSB.length() / 5;

        ArrayList<StringBuilder> jumps = new ArrayList<>();
        ArrayList<Double> jumpsDouble = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {
            jumps.add(new StringBuilder(lineSB.subSequence(i*5, i*5+4)));
            jumpsDouble.add(Double.parseDouble(jumps.get(i).toString()));
        }

        double bestScore = Collections.max(jumpsDouble);
        int whoWasBest = jumpsDouble.indexOf(bestScore) + 1;
        int qualifiedCount = 0;

        for (int i = 0; i < numberOfPeople; i++) {
            if (jumpsDouble.get(i) >= 4.20d){
               qualifiedCount++;
            }
        }


        System.out.println(
                "\npocet skokanov je " + numberOfPeople +
                "\nnajlepsi bol skokan " + whoWasBest + " a skocil " + bestScore + " metrov" +
                "\nz " + numberOfPeople + " sa na krajske kolo kvalifikovalo " + qualifiedCount);
    }
}
