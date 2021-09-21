import java.util.Scanner;

public class CoolSifra {
    public static void main(String[] args) {
        // AZhAoqjl,Z ybgakbqi
        Scanner sc = new Scanner(System.in);
        System.out.println("Napiš větu");
        String sifra = sc.nextLine();
        String finalsifra = "";

        for (int i = 0; i < sifra.length(); i++) {
            finalsifra += sifra.charAt(i);
            i++;

        }
        System.out.println(finalsifra);
    }
}
