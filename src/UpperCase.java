import java.sql.SQLOutput;

public class UpperCase {
    public static void main(String[] args) {
        String zwrot = "dupa dupa dupa";

        String[] podzialNaWyrazy = zwrot.split(" ");

        for (int i=0; i < podzialNaWyrazy.length; i++) {
            String wyraz = podzialNaWyrazy[i];
            String pierwszaLitera = wyraz.substring(0,1).toUpperCase();
            String nowyWyraz = pierwszaLitera+wyraz.substring(1) + " ";
            System.out.print(nowyWyraz);
        }

    }
}
