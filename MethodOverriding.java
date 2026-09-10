public class MethodOverriding {
    class Employee {
        void work() {
            System.out.println("Employee is working");
        }
    }

    class Devloper extends Employee {
        @Override
        void work() {
            System.out.println("Developer is coding");
        }
    }

    class Tester extends Employee {
        @Override
        void work() {
            System.out.println("Tester is testing");
        }
    }

    public static void main(String[] args) {
        Employee employee = new MethodOverriding().new Employee();
        employee.work();

        Employee e1 = new MethodOverriding().new Devloper();
        e1.work();

        Employee e2 = new MethodOverriding().new Tester();
        e2.work();
    }
}
