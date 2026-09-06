public class Inheritance {
    class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        void displayPerson(){
            System.out.println("Name: " + name);
        }
    }

    class Employee extends Person {
        private String employeeId;

        public Employee(String name, String employeeId) {
            super(name);
            this.employeeId = employeeId;
        }

        void displayEmployee(){
            displayPerson();
            System.out.println("Employee ID: " + employeeId);
        }
    }

    public static void main(String[] args) {
        Inheritance inheritance = new Inheritance();
        Employee employee = inheritance.new Employee("Urmi", "E111");
        employee.displayEmployee();
    }
}
