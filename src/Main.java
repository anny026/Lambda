import java.awt.print.Printable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        interface Printable {
            void print(String x);
        }
        Printable printable = System.out::println;
        printable.print("Print");
        //Задача 2
        System.out.println("Задача 2/1");
        Predicate<String> predicate2 = Objects::nonNull;
        System.out.println(predicate2.test(null));
        System.out.println(predicate2.test("non null"));
        System.out.println("Задача 2/2");
        Predicate<String> predicate3 = x -> {
            if (x != null) {
                if (x.length() > 0) {
                    return true;
                } else return false;
            } else
                return false;
        };
        System.out.println(predicate3.test(""));
        System.out.println(predicate3.test(null));
        System.out.println(predicate3.test("non null"));
        System.out.println("Задача 2/3");
        System.out.println(predicate3.and(predicate2).test(null));
        System.out.println(predicate3.and(predicate2).test(""));
        System.out.println(predicate3.and(predicate2).test("non null"));
        //Задача 3
        System.out.println("Задача 3");
        Predicate<String> predicate4 = (x) -> {
            if ((x.startsWith("J") && x.endsWith("A")) || ((x.startsWith("N") && (x.endsWith("A")))))
                return true;
            else
                return false;
        };
        System.out.println(predicate4.test("JavA"));
        System.out.println(predicate4.test("NavA"));
        System.out.println(predicate4.test("00JavA"));
        //Задача 4
        System.out.println("Задача 4");
        Consumer<HeavyBox> consumer1 = x -> System.out.println("Отгрузили ящик  " + x);
        Consumer<HeavyBox> consumer2 = x -> System.out.println("Отправляем ящик  " + x);
        HeavyBox heavyBox = new HeavyBox(5);
        consumer1.andThen(consumer2).accept(heavyBox);

        //Задача 5
        System.out.println("Задача 5");
        Function<Integer, String> function = (x) -> {
            if (x > 0) return "положительное";
            if (x < 0) return "отрицательное";
            else return "равно 0";
        };
        System.out.println(function.apply(-5));
        System.out.println(function.apply(0));
        //Задача 6
        System.out.println("Задача 6");
        Supplier<Integer> supplier = () -> (int) (Math.random() * 10);
        System.out.println(supplier.get());
        
        //Задача 7
        System.out.println("Задача 7");
        PrintableImpl.ChangePrint();

        //Задача 8
        System.out.println("Задача 8");
        Predicate<Integer> predicate = (x) -> x % 13 == 0;
        System.out.println(predicate.test(13));
        System.out.println(predicate.test(14));
        //Задача 9
        System.out.println("Задача 9");
        interface ForString<T> {
            T apply(T t, T p);
        }
        ForString<String> stringForString = (x1, x2) -> {
            if (x1.length() > x2.length()) {
                return x1;
            } else return x2;
        };
        System.out.println(stringForString.apply("Longer", "Short"));
        //Задача 10
        System.out.println("Задача 10");
        interface Formula<T> {
            T apply(T t1, T t2, T t3);
        }
        Formula<Double> formulaDiskriminant = (a, b, c) -> {
            double v = b * b - 4 * a * c;
            return v;
        };
        System.out.println(formulaDiskriminant.apply(10.0, 15.0, 4.5));
        //Задача 11
        System.out.println("Задача 11");
        Formula<Double> formula2 = (a, b, c) -> a * Math.pow(b, c);
        System.out.println(formula2.apply(2.0, 2.0, 3.0));
        //Задача 12
        System.out.println("Задача 12");
        Formula<Double> formula3 = (a, b, c) -> (a + b + c);
        Formula<Double> formula4 = (a, b, c) -> Math.max(Math.max(a, b), c);
        System.out.println(formula3.apply(2.0, 6.5, 4.0));
        System.out.println(formula4.apply(2.0, 6.5, 4.0));
        //Задача 13
        Employee employee1 = new Employee("Bob", 500, 35);
        Employee employee2 = new Employee("Bil", 800, 25);
        Employee employee3 = new Employee("Peppa", 800, 45);
        Employee employee4 = new Employee("Luk", 450, 50);
        Employee employee5 = new Employee("Harry", 1000, 15);
        Employee[] array = new Employee[]{employee1, employee2, employee3, employee4, employee5};
//        Comparator <Employee> comparator=new Comparator<>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o2.getAge()- o1.getAge();
//            }
//        };
//        Arrays.sort(array,comparator);
//        for (int i = 0; i <5 ; i++) {
//            System.out.println(array[i]);
//        }
        Comparator<Employee> comparator1 = Comparator.comparingInt(Employee::getSalary);
        Arrays.sort(array, comparator1);
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
        System.out.println("");
        Comparator<Employee> comparator2 = Comparator.comparingInt(Employee::getAge);
        Arrays.sort(array, comparator2);
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
        System.out.println("");
        Comparator<Employee> comparator3 = (n1, n2) -> (n2.getSalary() - n1.getSalary());
        Arrays.sort(array, comparator3);
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
        System.out.println("");
        Comparator<Employee> comparator4 = (n1, n2) -> (n2.getAge() - n1.getAge());
        Arrays.sort(array, comparator4);
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }
}