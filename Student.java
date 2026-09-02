public class Student {
    String name;
    int rollNumber;
    static String collegeName = "ABC College";

    public Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }
    

    public static void main(String[] args){
        Student student1 = new Student("John", 101);
        Student student2 = new Student("Alice", 102);

        System.out.println("Student 1: " + student1.name + ", Roll Number: " + student1.rollNumber + ", College: " + collegeName);
        
        System.out.println("Student 2: " + student2.name + ", Roll Number: " + student2.rollNumber + ", College: " + collegeName);
    }

}
