package hillelHW007;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> spisok = new ArrayList<>();
        spisok.add("one");
        spisok.add("two");
        spisok.add("three");
        spisok.add("four");
        spisok.add("five");
        spisok.add("two");
        spisok.add("two");
//        System.out.println(spisok.toString());
//        System.out.println("\ntotal quantity = " + spisok.size() + "\n");
//        countOccurance(spisok, "two");
//        countOccurance(spisok, "one");
//        Integer[] array = {1, 2, 3, 4, 5};
//        System.out.println("Array - " + Arrays.toString(array));
//        List<Integer> lisst = toList(array);
//        System.out.println("List - " + lisst);
//        List<Integer> listInteger = new ArrayList<>();
//        listInteger.add(1);
//        listInteger.add(2);
//        listInteger.add(3);
//        listInteger.add(2);
//        listInteger.add(9);
//        listInteger.add(2);
//        listInteger.add(4);
//       System.out.println(findUnicue(listInteger));

      calcOccurance(spisok);
    }

    /* HW  task 1 */
    public static void countOccurance(List<String> ls, String s) {
        int quantity = 0;
        for (String st : ls) {
            if (st.contains(s)) {
                quantity++;
            }
        }
        System.out.println("String '" + s + "' repeat " + quantity + " times");
    }
    /* HW task 2 = ничего не придумал как слямзить из сети )) */
    public static <T> List<T> toList(T[] arr) {
        List<T> newList = new ArrayList<>();
        Collections.addAll(newList, arr);
        return newList;
    }
    /* HW task 3 */
    public static List<Integer> findUnicue(List<Integer> L) {
        List<Integer> unicList = new ArrayList<>();
        for (Integer i : L) {
            if (!unicList.contains(i))
                unicList.add(i);
        }
        return unicList;
    }
    
    /* HW task 4   долго думал ... но в итоге подсмотрел решение у Андрея */
    public static void  calcOccurance(List<String> L) {
        List<String> unicList = new ArrayList<>();

        for (String listElement : L) {          // идем по элементам материнского списка L
            if (!unicList.contains(listElement)) { // ищем уникальные (неповторяющиеся)
                unicList.add(listElement);        // если не содержит добавляем в  лист unicList
            }
        }
        for (String listResultElement : unicList) { // идем по элементам уникального списка unicList
            int count = 0;
            for (String listElement : L) {    // идем по элементам материнского списка L
                if (listResultElement.equals(listElement)) {  // если елемент уникального списка равен елементу материнского списка
                    count++;                                    // инкрементируем счетчик
                }
            }
            System.out.println("Word '" + listResultElement + "' - occurs " + count + " times");
        }
    }

}


