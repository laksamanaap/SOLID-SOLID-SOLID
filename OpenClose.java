// OCP (Open Close Principle) => setiap kelas terbuka untuk pelebaran tapi tidak untuk modifikasi 

// Contoh yang salah
// public class Employee {
//     private String type;
//     private double salary;

//     public Employee(String type, double salary) {
//         this.type = type;
//         this.salary = salary;
//     }

//     public double calculateBonus() {
//         if (type.equals("FullTime")) {
//             return salary * 1.1;
//         } else if (type.equals("Contract")) {
//             return salary * 0.7;
//         } else if (type.equals("Freelance")) {
//             return 0;
//         } else {return 0}
//     }
// }

// Contoh yang benar
public class OpenClose {
    public static void main(String[] args) {
        FullTimeEmployee fullTime = new FullTimeEmployee(35000);
        ContractEmployee contractTime = new ContractEmployee(25000);
        FreelanceEmployee freelanceTime = new FreelanceEmployee(25000);

        double bonusFullTime = fullTime.calculateBonus();
        double bonusContractTime = contractTime.calculateBonus();
        double bonusFreelanceTime = freelanceTime.calculateBonus();

        System.out.println("Bonus karyawan fullTime : " + bonusFullTime);
        System.out.println("Bonus karyawan contractTime : " + bonusContractTime);
        System.out.println("Bonus karyawan freelanceTime : " + bonusFreelanceTime);
    }
}

class Employee {
    public double salary; // bisa diakses oleh anak anaknya

    public Employee(double salary) {
        this.salary = salary;
    }

    public double calculateBonus() {
        return 0;
    };
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(double salary) {
        super(salary); // => punya hak khusus akses ke class parent
    }

    @Override // => ditimpa dengan fungsi calculate bonus yang baru
    public double calculateBonus() {
        return salary * 1.1;
    }
}

class ContractEmployee extends Employee {
    public ContractEmployee(double salary) {
        super(salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.7;
    }
}

class FreelanceEmployee extends Employee {
    public FreelanceEmployee(double salary) {
        super(salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.3;
    }
}
