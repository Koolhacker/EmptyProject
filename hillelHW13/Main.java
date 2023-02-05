package hillelHW13;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Book", 100, false, LocalDate.now());
        Product p2 = new Product(2, "Book", 120, true, LocalDate.of(2020, 04, 20));
        Product p3 = new Product(3, "Book", 150, true, LocalDate.of(2022, 12, 30));
        Product p4 = new Product(4, "Toy", 100, true, LocalDate.of(2022, 05, 15));
        Product p5 = new Product(5, "Toy", 120, true, LocalDate.of(2020, 01, 07));
        Product p6 = new Product(6, "Book", 70, true, LocalDate.of(2023, 05, 01));
        Product p7 = new Product(7, "Food", 100, false, LocalDate.of(2022, 12, 30));
        Product p8 = new Product(8, "Food", 120, true, LocalDate.of(2022, 12, 30));
        Product p9 = new Product(9, "Food", 150, true, LocalDate.of(2022, 12, 30));

        List<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);
        productList.add(p5);
        productList.add(p6);
        productList.add(p7);
        productList.add(p8);

//      hw13_task_1.2
//        System.out.println(findProductByTypeAndPrice(productList, "Toy", 100));

//      hw13_task_2.2
//        System.out.println(findProductByTypeWithDisciunt(productList, "Food", 30));

//      hw13_task_3
//        System.out.println(findProductByMinPrice(productList, "Toy"));
//        System.out.println(findProductByMinPrice(productList, "Toyy"));

//       hw13_task_4
//        findProductByLastThreeDate(productList, 3);

//      hw13_task_5.2
//        System.out.println(totalCostOfBenchmarks(productList, LocalDate.now(), "Book", 110));

//    hw13_task_6.2
        System.out.println(groupByType(productList));

    }

    //  hw13_task_1.2
    public static List<Product> findProductByTypeAndPrice(List<Product> lpr, String type, int price) {
        List<Product> answer = lpr.stream()
                .filter(p -> p.getType() == type)
                .filter(p -> p.getPrice() > price)
                .collect(Collectors.toList());
        return answer;
    }

    //  hw13_task_2.2
    public static List<Product> findProductByTypeWithDisciunt(List<Product> lpr, String type, int discount) {
        List<Product> answer = lpr.stream()
                .filter(p -> p.getType() == type)
                .filter(p -> p.isDiscount() == true)
                .peek(p -> p.setPrice(p.getPrice() * (100 - discount) / 100))
                .collect(Collectors.toList());
        return answer;
    }

    //  hw13_task_3
    public static Product findProductByMinPrice(List<Product> lpr, String type) throws IndexOutOfBoundsException {
        List<Product> answer = lpr;
        try {
            answer = lpr.stream()
                    .filter(p -> p.getType() == type)
                    .sorted((x, y) -> x.getPrice() - y.getPrice())
                    .collect(Collectors.toList());
            return answer.get(0);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("\n Sorry product '" + type + "' not found \n");
        }
        return answer.get(0);
    }

    //  hw13_task_4
    public static void findProductByLastThreeDate(List<Product> lpr, int lookFor) {
        List<Product> answer = lpr.stream()
                .sorted(Comparator.comparing(p -> p.getCreateDate()))
                .collect(Collectors.toList());
        for (int i = 1; i <= lookFor; i++) {
            System.out.println(answer.get(lpr.size() - i));
        }
    }

    //      hw13_task_5.2
    public static int totalCostOfBenchmarks(List<Product> lpr, LocalDate ld, String type, int price) {
        AtomicReference<Integer> answerr = new AtomicReference<>(0);
        List<Product> answer = lpr.stream()
                .filter(p -> p.getCreateDate().getYear() == ld.getYear())
                .filter(p -> p.getType() == type)
                .filter(p -> p.getPrice() <= price)

//              пытался слепить чтото типа
//              .peek(p-> answerr +=p.getPrice())
//              но идея начала предлагать подсказки - и тут понеслась душа в рай...

                .peek(p -> answerr.updateAndGet(v -> v + p.getPrice()))
                .collect(Collectors.toList());

        return answerr.get();
    }

    //    hw13_task_6.2
    public static Map<String, List<Product>> groupByType(List<Product> lpr) {
        Map<String, List<Product>> ans = new HashMap<>();
        ans = lpr.stream()
                .collect(Collectors.groupingBy(p -> p.getType()));
        return ans;
    }

}


