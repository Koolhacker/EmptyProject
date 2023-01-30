package lesson11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    static Map<Product, Company> products = new HashMap<>();

    public static void main(String[] args) throws Exception {
        Product product1 = new Product("Iphone 14", 2000);
        Product product2 = new Product("Samsung A2", 1500);
        Product product3 = new Product("Model S", 9000);
        Product product4 = new Product("Cheese", 70);
        Company company1 = new Company("Apple");
        Company company2 = new Company("Samsung");
        Company company3 = new Company("Tesla");
        Company company4 = new Company("Yamagasy");
        products.put(product1, company1);
        products.put(product2, company2);
        products.put(product3, company3);
        products.put(product4, company4);
//        System.out.println(products);
//        products.keySet().forEach(System.out::println);
//        products.values().forEach(System.out::println);
//        System.out.println(checkCompany(company1));
//        System.out.println(checkCompany(company2));
//        System.out.println(checkCompany(company3));
//        System.out.println(checkCompany(products.get(product1)));
        System.out.println(findProductsByPrice(70));
        System.out.println(findProductsByProductName("Model S"));
    }

    public static Optional<List<Product>> findProductsByPrice(int price) {
        return Optional.of(products.keySet().stream()
                .filter(product -> product.getPrice() == price)
                .collect(Collectors.toList()));
    }

    public static Optional<List<Product>> findProductsByProductName(String name) {
        return Optional.of(products.keySet().stream()
                .filter(product -> product.getName() == name).toList());

    }

    public static Optional<Product> addProduct(String name) throws Exception {
        Product product = new Product(name);
        if (isExist(product))
            throw new Exception("This object is already exist");
        return Optional.of(product);
    }

    public static boolean checkCompany(Company company) throws Exception {
        if (company != null) {
            return (products.containsValue(company));
        } else {
            throw new Exception("Company does not exist");
        }
    }

    public static boolean isExist(Product product) {
        return products.containsKey(product);
    }
}
