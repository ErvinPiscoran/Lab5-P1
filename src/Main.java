import java.util.ArrayList;
import java.util.Scanner;
class Employee{
    private String name;
    private String email;
    private double hourRate;
    private double capacity;
    private int freeDays;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public double getHourRate(){
        return hourRate;
    }
    public void setHourRate(double hourRate){
        this.hourRate=hourRate;
    }
    public double getCapacity(){
        return capacity;
    }
    public void setCapacity(double capacity){
        this.capacity=capacity;
    }
    public int getFreeDays(){
        return freeDays;
    }
    public void setFreeDays(int freeDays){
        this.freeDays=freeDays;
    }
}
public class Main {
    static double calculateDailyIncome(int i,ArrayList<Employee> employees){
        return employees.get(i).getHourRate()*employees.get(i).getCapacity();
    }
    static double calculateMonthlyIncome(int i,ArrayList<Employee> employees){
        return calculateDailyIncome(i,employees)*(21-employees.get(i).getFreeDays());
    }
    public static void main(String[] args){
        int N;
        System.out.println("Cati angajati doriti sa introduceti?:");
        Scanner s = new Scanner(System.in);
        N=s.nextInt();
        ArrayList<Employee> employees = new ArrayList<Employee>();
        s.nextLine();
        for(int i=0;i<N;i++){
            Employee emp = new Employee();
            System.out.println("nume:");
            emp.setName(s.nextLine());
            System.out.println("email:");
            emp.setEmail(s.nextLine());
            System.out.println("hourRate:");
            emp.setHourRate(s.nextDouble());
            System.out.println("capacity:");
            emp.setCapacity(s.nextDouble());
            System.out.println("freeDays:");
            emp.setFreeDays(s.nextInt());
            s.nextLine();
            employees.add(emp);
        }
        for (int i=0;i< employees.size();i++) {
            System.out.println(employees.get(i).getName()+ " | daily income:"+calculateDailyIncome(i,employees)+" | monthly income:"+calculateMonthlyIncome(i,employees));
        }
    }
}
