
// SRP (Single Responbility Principle) => setiap kelas harus punya dan hanya satu tanggung jawab

// Contoh yang salah
// public class Employee {
//     private String name;
//     private int id;
//     private double salary;

//     // 1
//     public Employee(String name, int id, double salary) {
//         this.name = name;
//         this.id = id;
//         this.salary = salary;
//     }

//     // 2
//     public double calculateSalary() {
//         return salary * 1.1; 
//     }
// }

// Contoh yang benar

// Class employee => menyimpan dan mengset data dari karyawan
public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getter informasi user
    void getDetailEmployee() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Laksamana", 1, 20000.0);
        employee.getDetailEmployee();

        Salary calculator = new Salary();
        double finalSalary = calculator.calculateSalary(employee, employee.salary);

        System.out.println("Salary w bonus : " + finalSalary);
    }
}

// Class Salary => menghitung bonus gaji karyawan
class Salary {
    public double calculateSalary(Employee employee, double baseSalary) {
        return baseSalary * 1.1;
    }
}