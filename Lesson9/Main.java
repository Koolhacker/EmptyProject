package Lesson9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Cafe cafe1 = new Cafe("Astoria", "Kiev", 10);
        Cafe cafe5 = new Cafe("Astoria", "Odessa", 10);
        Cafe cafe6 = new Cafe("Astoria", "Odessa", 11);

        Cafe cafe2 = new Cafe("Arkadia", "Odessa", 20);
        Cafe cafe3 = new Cafe("U Ashota", "Odessa", 5);
        Cafe cafe4 = new Cafe("Grand paradise", "Kiev", 100);


        List<Cafe> cafeList = new ArrayList<>();

        cafeList.add(cafe1);
        cafeList.add(cafe2);
        cafeList.add(cafe3);
        cafeList.add(cafe4);
        cafeList.add(cafe1);
        cafeList.add(cafe2);
        cafeList.add(cafe5);
        cafeList.add(cafe6);

//        System.out.println(findFirst(cafeList));
        System.out.println("Quantity cafe at list = " + quantityCafeAtList(cafeList));
        System.out.println("Quantity real cafe at list = " + quantityRealCafe(cafeList));

        System.out.println(sortCafeQuantitySeats(cafeList, 10));

    }

    public static Cafe findFirst(List list) throws Exception {
        try {
            checkIsEmpty(list);
            Cafe returnCafe = (Cafe) list.get(0);
            System.out.println("Collection is not empty");
            return returnCafe;
        } catch (Exception e) {
            throw new Exception("Collection is empty");
        }
    }

    public static boolean checkIsEmpty(List list) {
        Iterator<Cafe> itr = list.iterator();
        boolean check = itr.hasNext();
        if (!check) {
            System.out.println("\nAttention!!! \n soon wil be exception :-) \n || \n || \n || /  \n ||/ \n |/");
        }
        return check;
    }

    public static int quantityCafeAtList(List<Cafe> list) {
        int counter = 0;
        for (Cafe listCafe : list) {
            counter++;
        }
        return counter;
    }

    public static int quantityRealCafe(List<Cafe> list) { // считает количество реальных кафе в списке
        int counter = 0;                                  // чтобы не было задвоения
        List<Cafe> unicList = new ArrayList<>();
        for (Cafe le : list) {          // идем по списку
            if (!unicList.contains(le)) { // ищем уникальные (неповторяющиеся)
                unicList.add(le);        // если не содержит добавляем в  лист unicList
                counter++;
            }
        }
        return counter;
    }

    public static List<Cafe> sortCafeQuantitySeats(List<Cafe> list, int quantitySeats) { // возвращает сортированный список по количеству мест
        List<Cafe> unicList = new ArrayList<>();
        for (Cafe le : list) {
            if (le.getQuantitySeats() >= quantitySeats && (!unicList.contains(le))) {
                unicList.add(le);
            }
        }
        return unicList;
    }
}