import java.util.ArrayList;
import java.util.List;

public class Company {
    private double DEFAULT_RAISE_AMOUNT = 2.5;
    private List<Employes> employesList;
    
    public Company() {
        this.employesList = new ArrayList<>();
    }

    public void addEmployes(Employes employes){
        employesList.add(employes);
    }

    public void removeEmployes(Employes employes){
        employesList.remove(employes);
    }

    public void raiseSalary(double percentage){
        for (Employes employes : employesList) {
            employes.raiseSalary(percentage);
        }
    }

    public void raiseSalary(){
        for (Employes employes : employesList) {
            employes.raiseSalary(DEFAULT_RAISE_AMOUNT);
        }
    }

    public List<Employes> getEmployes(){
        return employesList;
    }
}