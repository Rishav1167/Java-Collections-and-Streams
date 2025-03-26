package Streams.Serialization;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Alice", "HR"),
                new Employee(2, "Bob", "IT"),
                new Employee(3, "Carol", "Finance")
        );
        String employees="C:\\Users\\risha\\OneDrive\\Desktop\\BridgeLabz_WorkSpace\\Java_Collections_And_Streams\\src\\Streams\\Serialization\\serialized\\employees.ser";
        HandleSerialization.serialize(employees, employeeList);

        List<Employee> loadedEmployees = HandleSerialization.deserialize(employees);

        assert loadedEmployees != null;
        for (Employee employee : loadedEmployees) {
            System.out.println(employee);
        }
    }
}
