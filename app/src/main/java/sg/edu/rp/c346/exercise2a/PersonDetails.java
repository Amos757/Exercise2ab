package sg.edu.rp.c346.exercise2a;

public class PersonDetails {

    private String name;
    private String role;
    private double salary;

    public PersonDetails(String Name, String Role , double Salary) {
        name = Name;
        role = Role;
        salary = Salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //tostring()

    @Override
    public String toString() {
        return "PersonDetails{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }
}
