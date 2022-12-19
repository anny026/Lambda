import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        Integer[] array = {4, 80, 15, 10, 60};
        Stream<Integer> integerStream = Arrays.stream(array);
        integerStream.filter(x -> x % 2 == 0).forEach(System.out::println);

        System.out.println("Задача 2");
        Employee employee1 = new Employee("Billllllllll", "Fox", 460, 2017);
        Employee employee2 = new Employee("Rob", "Rici", 800, 2020);
        Employee employee3 = new Employee("Tinaaaaaaaaaaa", "Dok", 700, 2018);
        Employee employee4 = new Employee("Peppa", "Tut", 50, 2021);
        Employee employee5 = new Employee("Tro", "Jok", 900, 2019);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        Stream<Employee> employeeStream = employees.stream();
        System.out.println("фамилии на букву «J»");
        employeeStream.filter((p) -> (p.getLastName().startsWith("J"))).forEach(System.out::println);
        System.out.println("имя которых длинее 7 символов");
        employees.stream().filter((p)->(p.getName().length()>7)).forEach(System.out::println);
        System.out.println("3 самых новых сотрудника");
        employees.stream().sorted(((Employee o1,Employee o2)->o2.getYearOfEmployment()-o1.getYearOfEmployment())).limit(3).forEach(System.out::println);
        System.out.println("3 самых старых сотрудника, зп которых менее 100");
        employees.stream().sorted(Comparator.comparing(Employee::getYearOfEmployment)).filter(x->(x.getSalary()<100)).limit(3).forEach(System.out::println);
        System.out.println("с почти самой большой зп");
        employees.stream().sorted((( o1, o2)->o2.getSalary()-o1.getSalary())).skip(1).limit(1).forEach(System.out::println);

        //employeeStream.sorted((o1,o2)->(o2.getYearOfEmployment()).compareTo((o1.getYearOfEmployment()))).limit(2).forEach(System.out::println);
       // employeeStream.sorted(((o1, o2) -> -o1.getYearOfEmployment().compareTo(o2.getYearOfEmployment()).limit(3).forEach(System.out::println);

        System.out.println("Задача 4");
        int j = Stream.iterate(1, x -> {
            if (x < 0) x = -x;
            if ((x + 1) % 2 != 0) return x + 1;
            else return -(x + 1);
        }).limit(15).mapToInt(i -> i).sum();
        System.out.println(j);

        System.out.println("Задача 5");
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("abci");
        list.add("abcde");
        Stream <String> characterStream=list.stream();
        int r= (int) characterStream.collect(Collectors.joining()).chars().mapToObj(item -> (char) item)
                .distinct().count();
        System.out.println(r);




    }

}