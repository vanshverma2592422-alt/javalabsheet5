import java.util.Scanner;

// Main class: run any question from 1 to 20
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("===== MCA203P-AS05: JAVA PROGRAMS =====");
        System.out.println("Enter question number (1-20):");

        int choice = sc.nextInt();

        switch (choice) {
            case 1: q1(); break;
            case 2: q2(); break;
            case 3: q3(); break;
            case 4: q4(); break;
            case 5: q5(); break;
            case 6: q6(); break;
            case 7: q7(); break;
            case 8: q8(); break;
            case 9: q9(); break;
            case 10: q10(); break;
            case 11: q11(); break;
            case 12: q12(); break;
            case 13: q13(); break;
            case 14: q14(); break;
            case 15: q15(); break;
            case 16: q16(); break;
            case 17: q17(); break;
            case 18: q18(); break;
            case 19: q19(); break;
            case 20: q20(); break;
            default: System.out.println("Invalid question number.");
        }

        sc.close();
    }

    // QUESTION 1: Student Record using Class and Object
    static void q1() {
        StudentQ1 s = new StudentQ1();
        s.displayDetails();
    }

    // QUESTION 2: Parameterized Constructor and this Keyword
    static void q2() {
        MedicineQ2 m1 = new MedicineQ2("Paracetamol", 101, 25.50);
        MedicineQ2 m2 = new MedicineQ2("Cetirizine", 102, 40.00);
        m1.display();
        m2.display();
    }

    // QUESTION 3: Instance and Static Variables
    static void q3() {
        new PharmacyQ3("City Pharmacy", "Jaipur");
        new PharmacyQ3("Health Pharmacy", "Delhi");
        new PharmacyQ3("Care Pharmacy", "Mumbai");
        System.out.println("Total pharmacies: " + PharmacyQ3.pharmacyCount);
    }

    // QUESTION 4: Array of Objects and Loop
    static void q4() {
        PatientQ4[] patients = {
            new PatientQ4("Aman", 21),
            new PatientQ4("Rohan", 22),
            new PatientQ4("Priya", 23),
            new PatientQ4("Neha", 24),
            new PatientQ4("Rahul", 25)
        };
        new PatientManagerQ4().displayPatients(patients);
    }

    // QUESTION 5: Method, Local Variable and if-else
    static void q5() {
        MedicineQ5 m = new MedicineQ5();
        System.out.println(m.checkEligibility(20));
        System.out.println(m.checkEligibility(15));
    }

    // QUESTION 6: Encapsulation using Getters and Setters
    static void q6() {
        MedicineProductQ6 m = new MedicineProductQ6();
        m.setMedicineName("Paracetamol");
        m.setBatchNo(101);
        m.setPrice(30.0);
        m.displayProduct();
    }

    // QUESTION 7: Encapsulation and Validation
    static void q7() {
        PatientQ7 p = new PatientQ7();
        p.setPatientName("Aman");
        p.setAge(22);
        p.setWeight(65.5);
        p.display();

        p.setAge(-5);
        p.setWeight(-10);
        p.display();
    }

    // QUESTION 8: Bank Account and Boolean Return
    static void q8() {
        BankAccountQ8 b = new BankAccountQ8(1001, "Aman", 5000);
        b.displayAccount();
        b.deposit(1000);
        b.withdraw(2000);
        b.withdraw(10000);
        System.out.println("Balance: " + b.getBalance());
    }

    // QUESTION 9: Public Access Specifier
    static void q9() {
        HospitalQ9 h = new HospitalQ9();
        h.hospitalName = "City Hospital";
        h.hospitalCode = 101;
        h.displayHospital();
    }

    // QUESTION 10: Private Access Specifier
    static void q10() {
        EmployeeQ10 e = new EmployeeQ10(101, "Aman", 30000);
        e.display();
        // e.salary = 50000; // Not allowed: salary is private
    }

    // QUESTION 11: Default Access Specifier
    static void q11() {
        PharmacyQ11 p = new PharmacyQ11("Paracetamol", 25.50);
        p.display();
    }

    // QUESTION 12: Protected Access Specifier
    static void q12() {
        PharmacistQ12 p = new PharmacistQ12(101, "Aman", "PH123");
        p.display();
    }

    // QUESTION 13: Single Inheritance
    static void q13() {
        PharmacistQ13 p = new PharmacistQ13(101, "Rohan", 35000, "PH456");
        p.display();
    }

    // QUESTION 14: Hierarchical Inheritance
    static void q14() {
        DoctorQ14 d = new DoctorQ14("Aman", 35, "Cardiology");
        NurseQ14 n = new NurseQ14("Priya", 28, "Ward A");
        d.display();
        n.display();
    }

    // QUESTION 15: Multilevel Inheritance
    static void q15() {
        ManagerQ15 m = new ManagerQ15("Rahul", 40, 501, 10);
        m.display();
    }

    // QUESTION 16: Protected Parent and Private Child Data
    static void q16() {
        DoctorQ16 d = new DoctorQ16(101, "Aman", "Medicine");
        PharmacistQ16 p = new PharmacistQ16(102, "Rohan", "PH789");
        d.display();
        p.display();
    }

    // QUESTION 17: Multiple and Hybrid Inheritance Concept
    static void q17() {
        InheritanceConceptQ17.show();
    }

    // QUESTION 18: Parent Reference Array and Polymorphism
    static void q18() {
        ShapeQ18[] shapes = {
            new CircleQ18(5),
            new RectangleQ18(4, 6)
        };
        new ShapeManagerQ18().displayAreas(shapes);
    }

    // QUESTION 19: Hospital Staff Management using OOP
    static void q19() {
        EmployeeQ19[] staff = {
            new DoctorQ19("Aman", 101, 50000, "Cardiology"),
            new PharmacistQ19("Rohan", 102, 35000, "PH123")
        };
        new StaffManagerQ19().displayStaff(staff);
        System.out.println("Total employees: " + EmployeeQ19.employeeCount);
    }

    // QUESTION 20: Pharmacy Employee Management System
    static void q20() {
        EmployeeQ20[] staff = {
            new PharmacistQ20("Aman", 101, 35000, "PH123"),
            new StoreManagerQ20("Rohan", 102, 45000, 5)
        };
        PharmacyManagerQ20 manager = new PharmacyManagerQ20();
        manager.displayStaff(staff);
        System.out.println("Total employees: " + EmployeeQ20.employeeCount);
    }
}

// QUESTION 1: Student class
class StudentQ1 {
    String name = "Aman";
    int rollNo = 101;
    double marks = 85.5;

    StudentQ1() {}

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

// QUESTION 2: Medicine class
class MedicineQ2 {
    String medicineName;
    int batchNo;
    double price;

    MedicineQ2(String medicineName, int batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    void display() {
        System.out.println(medicineName + " " + batchNo + " " + price);
    }
}

// QUESTION 3: Static and instance variables
class PharmacyQ3 {
    String pharmacyName;
    String location;
    static int pharmacyCount = 0;

    PharmacyQ3(String pharmacyName, String location) {
        this.pharmacyName = pharmacyName;
        this.location = location;
        pharmacyCount++;
    }
}

// QUESTION 4: Patient and manager
class PatientQ4 {
    String name;
    int age;

    PatientQ4(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class PatientManagerQ4 {
    void displayPatients(PatientQ4[] patients) {
        for (PatientQ4 p : patients) {
            System.out.println(p.name + " " + p.age);
        }
    }
}

// QUESTION 5: Eligibility checking
class MedicineQ5 {
    String checkEligibility(int age) {
        String result;
        if (age >= 18)
            result = "Eligible";
        else
            result = "Not eligible";
        return result;
    }
}

// QUESTION 6: Encapsulation
class MedicineProductQ6 {
    private String medicineName;
    private int batchNo;
    private double price;

    public void setMedicineName(String name) {
        medicineName = name;
    }

    public void setBatchNo(int batch) {
        batchNo = batch;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public int getBatchNo() {
        return batchNo;
    }

    public double getPrice() {
        return price;
    }

    void displayProduct() {
        System.out.println(getMedicineName() + " " + getBatchNo()
                + " " + getPrice());
    }
}

// QUESTION 7: Patient validation
class PatientQ7 {
    private String patientName;
    private int age;
    private double weight;

    public void setPatientName(String name) {
        patientName = name;
    }

    public void setAge(int age) {
        if (age >= 0)
            this.age = age;
        else
            System.out.println("Invalid age");
    }

    public void setWeight(double weight) {
        if (weight > 0)
            this.weight = weight;
        else
            System.out.println("Invalid weight");
    }

    void display() {
        System.out.println(patientName + " " + age + " " + weight);
    }
}

// QUESTION 8: Bank Account
class BankAccountQ8 {
    private int accountNo;
    private String accountHolderName;
    private double balance;

    BankAccountQ8(int accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    boolean withdraw(double amount) {
        boolean success = amount > 0 && amount <= balance;
        if (success)
            balance -= amount;
        else
            System.out.println("Insufficient balance or invalid amount");
        return success;
    }

    double getBalance() {
        return balance;
    }

    void displayAccount() {
        System.out.println(accountNo + " " + accountHolderName
                + " " + balance);
    }
}

// QUESTION 9: Public access
class HospitalQ9 {
    public String hospitalName;
    public int hospitalCode;

    public HospitalQ9() {}

    public void displayHospital() {
        System.out.println(hospitalName + " " + hospitalCode);
    }
}

// QUESTION 10: Private access
class EmployeeQ10 {
    private int employeeId;
    private String employeeName;
    private double salary;

    EmployeeQ10(int id, String name, double salary) {
        employeeId = id;
        employeeName = name;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    void display() {
        System.out.println(employeeId + " " + employeeName + " " + salary);
    }
}

// QUESTION 11: Default access
class PharmacyQ11 {
    String medicineName;
    double price;

    PharmacyQ11(String medicineName, double price) {
        this.medicineName = medicineName;
        this.price = price;
    }

    void display() {
        System.out.println(medicineName + " " + price);
    }
}

// QUESTION 12: Protected access
class HospitalStaffQ12 {
    protected int staffId;
    protected String staffName;

    protected HospitalStaffQ12(int id, String name) {
        staffId = id;
        staffName = name;
    }

    protected void displayStaff() {
        System.out.println(staffId + " " + staffName);
    }
}

class PharmacistQ12 extends HospitalStaffQ12 {
    private String licenseNo;

    PharmacistQ12(int id, String name, String licenseNo) {
        super(id, name);
        this.licenseNo = licenseNo;
    }

    void display() {
        displayStaff();
        System.out.println("License: " + licenseNo);
    }
}

// QUESTION 13: Single inheritance
class EmployeeQ13 {
    protected int employeeId;
    protected String employeeName;
    protected double salary;

    EmployeeQ13(int id, String name, double salary) {
        employeeId = id;
        employeeName = name;
        this.salary = salary;
    }
}

class PharmacistQ13 extends EmployeeQ13 {
    private String licenseNo;

    PharmacistQ13(int id, String name, double salary, String licenseNo) {
        super(id, name, salary);
        this.licenseNo = licenseNo;
    }

    void display() {
        System.out.println(employeeId + " " + employeeName + " "
                + salary + " " + licenseNo);
    }
}

// QUESTION 14: Hierarchical inheritance
class PersonQ14 {
    protected String name;
    protected int age;

    PersonQ14(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class DoctorQ14 extends PersonQ14 {
    private String specialization;

    DoctorQ14(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    void display() {
        System.out.println(name + " " + age + " " + specialization);
    }
}

class NurseQ14 extends PersonQ14 {
    private String ward;

    NurseQ14(String name, int age, String ward) {
        super(name, age);
        this.ward = ward;
    }

    void display() {
        System.out.println(name + " " + age + " " + ward);
    }
}

// QUESTION 15: Multilevel inheritance
class PersonQ15 {
    protected String name;
    protected int age;

    PersonQ15(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class EmployeeQ15 extends PersonQ15 {
    private int employeeId;

    EmployeeQ15(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    int getEmployeeId() {
        return employeeId;
    }
}

class ManagerQ15 extends EmployeeQ15 {
    private int teamSize;

    ManagerQ15(String name, int age, int id, int teamSize) {
        super(name, age, id);
        this.teamSize = teamSize;
    }

    void display() {
        System.out.println(name + " " + age + " " + getEmployeeId()
                + " " + teamSize);
    }
}

// QUESTION 16: Protected parent and private child data
class MedicalStaffQ16 {
    protected int staffId;
    protected String staffName;

    MedicalStaffQ16(int id, String name) {
        staffId = id;
        staffName = name;
    }
}

class DoctorQ16 extends MedicalStaffQ16 {
    private String specialization;

    DoctorQ16(int id, String name, String specialization) {
        super(id, name);
        this.specialization = specialization;
    }

    void display() {
        System.out.println(staffId + " " + staffName + " " + specialization);
    }
}

class PharmacistQ16 extends MedicalStaffQ16 {
    private String licenseNo;

    PharmacistQ16(int id, String name, String licenseNo) {
        super(id, name);
        this.licenseNo = licenseNo;
    }

    void display() {
        System.out.println(staffId + " " + staffName + " " + licenseNo);
    }
}

// QUESTION 17: Multiple and hybrid inheritance concept
class InheritanceConceptQ17 {
    static void show() {
        System.out.println("Java does not support multiple inheritance through classes.");
        System.out.println("A class cannot extend two classes.");
        System.out.println("Java supports multiple inheritance of type through interfaces.");
        System.out.println("Hybrid inheritance can be implemented using interfaces.");
    }
}

// QUESTION 18: Shape hierarchy and parent reference array
class ShapeQ18 {
    String name;

    ShapeQ18(String name) {
        this.name = name;
    }

    double area() {
        return 0;
    }
}

class CircleQ18 extends ShapeQ18 {
    double radius;

    CircleQ18(double radius) {
        super("Circle");
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class RectangleQ18 extends ShapeQ18 {
    double length;
    double width;

    RectangleQ18(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

class ShapeManagerQ18 {
    void displayAreas(ShapeQ18[] shapes) {
        for (ShapeQ18 s : shapes) {
            System.out.println(s.name + " area: " + s.area());
        }
    }
}

// QUESTION 19: Hospital staff management using OOP
class PersonQ19 {
    protected String name;

    PersonQ19(String name) {
        this.name = name;
    }
}

class EmployeeQ19 extends PersonQ19 {
    protected int employeeId;
    protected double salary;
    static int employeeCount = 0;

    EmployeeQ19(String name, int id, double salary) {
        super(name);
        employeeId = id;
        this.salary = salary;
        employeeCount++;
    }

    void display() {
        System.out.println(name + " " + employeeId + " " + salary);
    }
}

class DoctorQ19 extends EmployeeQ19 {
    private String specialization;

    DoctorQ19(String name, int id, double salary, String specialization) {
        super(name, id, salary);
        this.specialization = specialization;
    }

    void display() {
        System.out.println("Doctor: " + name + " " + employeeId
                + " " + salary + " " + specialization);
    }
}

class PharmacistQ19 extends EmployeeQ19 {
    private String licenseNo;

    PharmacistQ19(String name, int id, double salary, String licenseNo) {
        super(name, id, salary);
        this.licenseNo = licenseNo;
    }

    void display() {
        System.out.println("Pharmacist: " + name + " " + employeeId
                + " " + salary + " " + licenseNo);
    }
}

class StaffManagerQ19 {
    void displayStaff(EmployeeQ19[] staff) {
        for (EmployeeQ19 e : staff) {
            if (e instanceof DoctorQ19)
                ((DoctorQ19) e).display();
            else if (e instanceof PharmacistQ19)
                ((PharmacistQ19) e).display();
        }
    }
}

// QUESTION 20: Pharmacy employee management system
class EmployeeQ20 {
    private String name;
    protected int employeeId;
    double salary;
    static int employeeCount = 0;

    EmployeeQ20(String name, int id, double salary) {
        this.name = name;
        employeeId = id;
        setSalary(salary);
        employeeCount++;
    }

    public void setSalary(double salary) {
        if (salary >= 0)
            this.salary = salary;
        else
            System.out.println("Invalid salary");
    }

    String getName() {
        return name;
    }

    void display() {
        System.out.println(name + " " + employeeId + " " + salary);
    }
}

class PharmacistQ20 extends EmployeeQ20 {
    private String licenseNo;

    PharmacistQ20(String name, int id, double salary, String licenseNo) {
        super(name, id, salary);
        this.licenseNo = licenseNo;
    }

    void display() {
        System.out.println("Pharmacist: " + getName() + " " + employeeId
                + " " + salary + " " + licenseNo);
    }
}

class StoreManagerQ20 extends EmployeeQ20 {
    private int teamSize;

    StoreManagerQ20(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    void display() {
        System.out.println("Store Manager: " + getName() + " " + employeeId
                + " " + salary + " " + teamSize);
    }
}

class PharmacyManagerQ20 {
    void displayStaff(EmployeeQ20[] staff) {
        for (EmployeeQ20 e : staff) {
            if (e instanceof PharmacistQ20)
                ((PharmacistQ20) e).display();
            else if (e instanceof StoreManagerQ20)
                ((StoreManagerQ20) e).display();
        }
    }
}