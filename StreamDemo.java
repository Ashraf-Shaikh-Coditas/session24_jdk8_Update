package Week6.Session24_JDK_8_UPDATE;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Vehicle {
    String name;
    double price;

    public Vehicle(String name, double price) {
        this.name = name;
        this.price = price;
    }

}

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle("Audi", 1000000));
        list.add(new Vehicle("Baleno", 400000));
        list.add(new Vehicle("Swift", 35000));
        list.add(new Vehicle("Dzire", 400000));
        list.add(new Vehicle("Triber", 700000));
        list.add(new Vehicle("Zest", 500000));
        list.add(new Vehicle("BMW", 1100000));

        System.out.println("Vehicles with price greater than 500000 using filter()");
        list.stream()
                .filter(p -> p.price > 500000)           // Filter operation
                .forEach(p -> System.out.println(p.name + " : " + p.price));

        double totalPrice = list.stream()
                .map(p -> p.price)               // Mapping Operation
                .reduce(0.0, (num1, num2) -> num1 + num2);   // Reduction Operation
        System.out.println("Total Cost:" + totalPrice);

        Boolean ans = list.stream()
                .anyMatch(p -> p.name.equals("Zest"));   // Matching Operation
        System.out.println("Zest Present or not :: " + ans);

        List<Vehicle> filteredList = list.stream()
                .filter(p -> p.price > 800000)
                .collect(Collectors.toList());

        System.out.println("List of vehicles price greater than 800000");
        for (Vehicle v : filteredList) {
            System.out.println(v.name);
        }
    }
}

/*

Vehicles with price greater than 500000 using filter()
Audi : 1000000.0
Triber : 700000.0
BMW : 1100000.0

Total Cost:4135000.0

Zest Present or not :: true

List of vehicles price greater than 800000
Audi
BMW


* */