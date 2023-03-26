import java.util.*;

public class Znamky {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder r = new StringBuilder();
        StringBuilder name = new StringBuilder();
        StringBuilder best = new StringBuilder();
        double bestAvg;
        StringBuilder worst = new StringBuilder();
        double worstAvg;
        double avg = 0;
        double gradeSum = 0;
        double gradeCount = 0;

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> averages = new ArrayList<>();

        System.out.println("napis meno studenta a znamky vo formate MENO 1,2,3,4,...");
        String in = s.nextLine();

        while (!in.equals("")){
            r.setLength(0);
            r.append(in);

            for (int i = 0; i < r.length(); i++) {
                if (r.charAt(i) != ' ' && Character.isLetter(r.charAt(i))){
                    name.append(r.charAt(i));

                } else if (Character.isDigit(r.charAt(i))) {
                    gradeSum += (double) r.charAt(i) - 48d;
                    gradeCount++;

                } else if (r.charAt(i) == ' ') {
                    System.out.println(name);
                }
            }

            avg = gradeSum / gradeCount;
            System.out.println(name + " priemer: " + avg);


            names.add(name.toString());
            averages.add(avg);

            bestAvg = Collections.min(averages);
            worstAvg = Collections.max(averages);
            worst.append(names.indexOf(Collections.max(averages)));
            System.out.println("napis meno studenta a znamky");
            in = s.nextLine();

        }
    }
}
