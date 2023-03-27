import java.util.Arrays;
import java.util.Scanner;

public class PriponaSuboru {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("napis nazov suboru");
        String fileName = s.nextLine();

        String[] textFormats = {".doc", ".docx", ".pdf", ".otf", ".txt"};
        String[] imageFormats = {".png", ".gif", ".jpeg", ".jpg", ".tiff"};
        String[] spreadsheetFormats = {".xlsx", ".xls", ".csv"};

        int dotIndex = fileName.indexOf('.');
        String extension = fileName.substring(dotIndex, fileName.length());


        if (Arrays.asList(textFormats).contains(extension)) System.out.println("text");
        else if (Arrays.asList(imageFormats).contains(extension)) System.out.println("obrazok");
        else if (Arrays.asList(spreadsheetFormats).contains(extension)) System.out.println("tabulka");
        else System.out.println("ine");
    }
}
