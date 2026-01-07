import java.util.Scanner;

import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Company company = new Company();
        
        Employes employe1 = new Employes("Hernesto", 10000);
        Employes employe2 = new Employes("Freddy", 5000);
        Employes employe3 = new Employes("Colocha", 15000);
    
        company.addEmployes(employe1);
        company.addEmployes(employe2);
        company.addEmployes(employe3);
        System.out.println(company.getEmployes());

        company.removeEmployes(employe3);
        System.out.println(company.getEmployes());

        /*company.raiseSalary();
        System.out.println(company.getEmployes());*/

        double percentage = 0.0;
        percentage = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentage que desea subirle al sueldo de los empleados"));
        company.raiseSalary(percentage);
        System.out.println(company.getEmployes());
        
    }
    
}