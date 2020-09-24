public class Day2_ArrayList {
    public static void main(String[] args) {

        int i = 0;
        int a = 0;
        int b = 0;

        int tabA[] = {1,2,3};
        int tabB[] = {3,4,5};
        for (i=0;i<tabA.length; i++) {
            if (tabA[i]<tabB[i]) {
                b+=1;
            }
            else if (tabA[i]>tabB[i]) {
                a+=1;
            }

        }
        System.out.println(a+" "+b);



  /*      static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
            int aliceTotalScore = 0;
            int bobTotalScore = 0;

            for (int i =0;i<3;i++) {
                int aliceScore = a.get(i);
                int bobScore = b.get(i);
                if (aliceScore != bobScore) {
                    int temp = aliceScore > bobScore ? aliceTotalScore++ : bobTotalScore++;
                }
            }
            List<Integer> result = new ArrayList<>();
            result.add(aliceTotalScore);
            result.add(bobTotalScore);
            return result;

        add(E e) - dodaje element zgodny z zadeklarowanym typem generycznym do kolekcji.
                   Pozwala na dodawanie wartości null oraz powtarzających się elementów,
        addAll(Collection c) - dodaje wszystkie elementy z innej kolekcji do listy (kopie referencji),
        clear() - usuwa wszystkie elementy z listy,
        get(int index) - zwraca element pod podanym indeksem. Podobnie jak przy tablicach indeksowanie jest od 0.
                  Metoda może generować wyjątek ArrayIndexOutOfBoundsException,
        remove(int index) - usuwa element z indeksu podanego jako parametr,
        remove(Object o) - usuwa pierwsze wystąpienie obiektu, dla którego metoda equals() zwróci true,
        sort(Comparator c) - sortuje listę zgodnie z przekazanym komparatorem,
        size() - zwraca rozmiar listy. Działanie analogiczne do właściwości length tablicy,


        */


    }
}


