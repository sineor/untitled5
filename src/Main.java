import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      Newspaper newspaper = new Newspaper("Nurles",7);
        System.out.println(newspaper.getName());
        System.out.println(newspaper.getPages());
        newspaper.read();

        Magazine magazine = new Magazine("Globus",6);
        System.out.println(magazine.getName());
        System.out.println(magazine.getPages());
        magazine.read();

        Gadjet gadjet = new Gadjet("Nout",7);
        System.out.println(gadjet.getName());
        System.out.println(gadjet.getPages());
        gadjet.read();

        News[] news = {newspaper,magazine,gadjet};
        System.out.println(Arrays.toString(news));


    }
}