import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "Anna");
        employees.put(102, "Peter");
        employees.put(103, "Mary");

        String name = employees.get(102);
        System.out.println("Nhân viên ID 102: " + name);

        if (!employees.containsKey(105)) {
            employees.put(105, "Unknown");
        }

        System.out.println(employees);
    }
}