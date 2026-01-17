import java.time.Year;

class Employee{
    private String fullName;
    private int branch;
    private double salary;
    private long id;

    private static int IdCounter = 0;

    public Employee(String fullName, int branch, double salary) {
        this.fullName = fullName;
        this.branch = branch;
        this.salary = salary;
        this.id = IdCounter;
        IdCounter++;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }
}

class BookEmployees{
    static Employee[] employees = new Employee[10];

    public static void  getAllEmployees(){
        for(Employee emp : employees){
            System.out.println("Сотрудник: " + emp.getFullName());
            System.out.println("ID сотрудника: " + emp.getId());
            System.out.println("Отдел: " + emp.getBranch());
            System.out.println("Зарплата: " + emp.getSalary());

        }
    }
}

public class Project {

}
