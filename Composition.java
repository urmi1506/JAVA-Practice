public class Composition {
    class Authentication {

    void login(String username, String password) {
        System.out.println("User authenticated");
    }
}

class Employee {

    String name;
    int employeeId;

    private Authentication authentication;

    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
        this.authentication = new Authentication();
    }

    void login(String username, String password) {
        authentication.login(username, password);
    }
}
public static void main(String[] args) {
    Composition composition = new Composition();
    Employee employee = composition.new Employee("Urmi", 111);
    employee.login("urmi", "password");
}
}
