import java.util.Comparator;
import java.util.Objects;

public class Employee  {
    String name;
    String lastName;
    int salary;
    int yearOfEmployment;

    public Employee(String name, String lastName, int salary, int yearOfEmployment) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.yearOfEmployment = yearOfEmployment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    public void setYearOfEmployment(int yearOfEmployment) {
        this.yearOfEmployment = yearOfEmployment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", yearOfEmployment=" + yearOfEmployment +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && yearOfEmployment == employee.yearOfEmployment && Objects.equals(name, employee.name) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, salary, yearOfEmployment);
    }


}
