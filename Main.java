import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Sveiki, mani sauc Bots Bobs, kā tevi sauc?");
        String user_name = scan.nextLine();
        System.out.println("Sveiki, " + user_name);

        System.out.println("Vai šonakt ārā būs mīnus grādi?");
        String ansver = scan.nextLine();

        if(ansver.contains("nē")) {
            System.out.println("Tad droši slēdz ārā sildītāju un patīkamu tev dienu.");

        } if(ansver.contains("jā")) {
            System.out.println("Var būt tad vēlies iegādāties sildītaju");

            String ansver_sec = scan.nextLine();
            if(ansver_sec.contains("jā")) {
                System.out.println("Tad vari apmeklēt mūsu lappu sildītāji.lv un veiksmīgu tev iepirkšanos.");
            } else {
                System.out.println("Veiksmīgu tev dienu");

            }

        }
    }
}