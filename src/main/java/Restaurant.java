import java.util.ArrayList;
import java.util.HashMap;

public class Restaurant {

    private String name;
    private Double money;
    private ArrayList<Employe> employeList;
    private ArrayList<Item> menu;

    public Restaurant(String name, Double money, ArrayList<Employe> employeList, ArrayList<Item> menu) {
        this.name = name;
        this.money = money;
        this.employeList = employeList;
        this.menu = menu;
    }

    public Restaurant() {
    }

    public double payAllEmployeesFull(){
        double payment = 0;
        for(int i = 0; i< this.employeList.size();i++){
            payment += this.employeList.get(i).getMonthlySalaray();
        }
        System.out.println("All salarys payed in full: " + payment + "€");
        this.money -= payment;
        return payment;
    }

    public double cheapestPrice(){
        double lowestPrice = Double.MAX_VALUE;
        String name = "";
        for(Item item : this.menu){
            if(item.getPrice() < lowestPrice){
                lowestPrice = item.getPrice();
                name = item.getName();
            }
        }
        if(lowestPrice < 0){
            throw new NumberFormatException("check your menu, price should not be under 0€");
        }
        System.out.println(name+ " is the cheapest item with a price of " + lowestPrice +"€");
        return lowestPrice;
    }

    public double averagePrice(){
        double average = 0;
        for(Item item : this.menu){
            average += item.getPrice();
        }
        return average / this.menu.size();
    }

    public double payEmployeById(Long id){
        String name = "";
        double salary = -1;
        for(int i = 0; i< this.employeList.size();i++){
            if(this.employeList.get(i).getId() == id){
                salary = this.employeList.get(i).getMonthlySalaray();
                name = this.employeList.get(i).getName();
            }
        }
        if(salary == -1){
            throw new IllegalArgumentException("no employee with this id found");
        }
        if(name.isEmpty()){
            throw new NullPointerException("no corresponding name found,please enter a name for the employee");
        }
        System.out.println(name + " is being paid his monthly salary of " + salary + "€");
        this.money -= salary;
        return  salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public ArrayList<Employe> getEmployeList() {
        return employeList;
    }

    public void setEmployeList(ArrayList<Employe> employeList) {
        this.employeList = employeList;
    }

    public ArrayList<Item> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Item> menu) {
        this.menu = menu;
    }
}
