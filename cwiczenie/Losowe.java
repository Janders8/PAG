package pl.edu.pw.elka.pag.cwiczenie;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class Losowe {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int max = scan.nextInt();
        int n = scan.nextInt();
        int s = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        int rand = -1;

        do {
            rand = ThreadLocalRandom.current().nextInt(0, max);
            list.add(rand);


        }while(rand != s);

        System.out.println("dlugosc tablicy wynosi = ");
        System.out.println(list.size());

        System.out.println("w kolejnosci losowania: ");
        for (int i =0; i < n; i++)
        {
            if(i == list.size()) break;
            System.out.println(list.get(i));

        }

        System.out.println("w odwrotnej kolejnosci losowania: ");
        int counter = 0;
        for (int i =list.size()-1; i >= 0; i--)
        {

            if(counter == n) break;
            if(i == list.size()) break;
            System.out.println(list.get(i));
            counter++;
        }

        System.out.println("posortowane bez powtorzen: ");

        Set<Integer> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        Collections.sort(list);

        System.out.println(list);




    }
}
