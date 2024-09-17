
// SRP (Single Responbility Principle) => setiap kelas harus dan hanya punya satu tanggung jawab
// Contoh yang salah

// public class Employee {
//     public String name;
//     public int id;
//     public double salary;

//     // 1 setter
//     public Employee(String name, int id, double salary) {
//         this.name = name;
//         this.id = id;
//         this.salary = salary;
//     }

//     // 2 hitung bonus gaji
//     public double calculateSalary() {
//         return salary * 1.1; 
//     }
// }

// Contoh yang benar
public class SinglePrinciple {
    public static void main(String[] args) {
        Employee employee = new Employee("Singgih", 1, 500000);
        employee.getEmployeeInfo();

        Salary salary = new Salary();
        double finalSalary = salary.salaryCalculator(employee, employee.salary);

        System.out.println("Total Bonus : " + (finalSalary - employee.salary));
        System.out.println("Total Gaji : " + finalSalary);
    }
}

// Class Employee => bertugas sebagai setter dan getter data employee
class Employee {
    public String name;
    public int id;
    public double salary;

    // Setter
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getter
    void getEmployeeInfo() {
        System.out.println("Nama : " + name);
        System.out.println("ID : " + id);
        System.out.println("Salary : " + salary);
    }
}

// Class Salary => bertugas sebagai penghitung bonus gaji karyawan
class Salary {
    public double salaryCalculator(Employee employee, double salary) {
        return salary * 1.1; // 10%
    }
}
