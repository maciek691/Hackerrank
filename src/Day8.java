import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {

    // stworzenie książki telefonicznej korzystajac z map
/*    3
    sam 99912222
    tom 11122222
    harry 12299933
    sam
            edward
    harry*/
    public static void main(String[] args) {

        Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for (int i=0;i<n;i++) {
            phoneBook.put(scn.next(), scn.nextInt());
        }
        String serch;
        for (int i=0;i<n;i++) {
            serch = scn.next();
            if (phoneBook.containsKey(serch)) {
                System.out.println(serch + "=" + phoneBook.get(serch));
            } else {
                System.out.println("Not found");
            }
            /*while(scn.hasNext()){
                String s = scn.next();
                if (phoneBook.containsKey(s)) {
                    System.out.println(s+"="+phoneBook.get(s));
                } else{
                    System.out.println("Not found");
                }*/
            }
        }
    }

