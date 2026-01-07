public class Employes implements Comparable<Employes>{
    private String name;
    private double salary;

    public Employes(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public Employes() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employes [name=" + name + ", salary=" + salary + "]";
    }

    public void raiseSalary(double percentage){
        this.salary += this.salary * (percentage / 100);
    }

    @Override
    public int compareTo(Employes other) {
        return other.name.compareTo(this.name);
    }

}