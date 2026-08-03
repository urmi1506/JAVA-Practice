
// Employee m/g System
// Topic : class ,object ,Encapsulation ,constuctor ,getter/setter ,
public class Employee {
    private int employeeid;
    private String name;
    private String department;
    private double salary;
    
    public Employee() {
    }

    public Employee(int employeeid, String name, String department, double salary) {
        this.employeeid = employeeid;
        // Reuse Validation
        setName(name);
        setDepartment(department);
        setSalary(salary);
    }

    public void setId(int employeeid) {
        this.employeeid = employeeid;
    }

    public void setName(String name) {
        if(name == null || name.isBlank()){
            System.out.println("Invalid Name");
            return;
        }
        this.name = name;
    }

    public void setDepartment(String department) {
        if (department == null || department.isBlank()) {
            System.out.println("Invalid Department");
            return;
        }
        this.department = department;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Invalid Salary");
            return;
        }
        this.salary = salary;
    }

    public int getId() {
        return employeeid;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    void incrementSalary(double percentage) {
        if (percentage < 0) {
            System.out.println("Invalid Percentage");
            return;
        }
        salary += salary * percentage / 100;
    }

    public void displayEmployee() {
        System.out.println(
                "ID : " + employeeid);

        System.out.println(
                "Name : " + name);

        System.out.println(
                "Department : " + department);

        System.out.println(
                "Salary : " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "urmi", "IT", 1800000);
        Employee e2 = new Employee(2, "Rutvik", "AI", 2500000);

        e2.incrementSalary(10);

        e1.setSalary(-5000);

        e1.displayEmployee();
        e2.displayEmployee();

    }
}