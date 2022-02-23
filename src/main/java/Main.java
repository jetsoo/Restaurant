import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Employee employe1 = new Employee("alex",200.00,700.50,true, LocalDate.of(1989,6,13),1L);
        Employee employe2 = new Employee("sven",400.00,850.50,true, LocalDate.of(1995,8,18),2L);
        Employee employe3 = new Employee("julia",740.00,790.50,true, LocalDate.of(1998,2,24),3L);

        ArrayList<Employee> employes = new ArrayList<>();
        employes.add(employe1);
        employes.add(employe2);
        employes.add(employe3);

        Item lasagne = new Food("Lasagne",true,7.50,Typ.MAIN_COURSE,false,true);
        Item whiteWine = new Drink("Chardonnay",true,23.90,true,false);
        Item coffee = new Drink("Capuccino",true,3.40,false,true);
        Item pizza = new Food("Pizza",true,8.70,Typ.MAIN_COURSE,false,true);
        Item pommes = new Food("Pommes",true,2.45,Typ.FOOD,true,true);
        Item onionRings = new Food("Onion Rings",true,3.99,Typ.FOOD,false,true);
        ArrayList<Item> items = new ArrayList<>();
        items.add(lasagne);
        items.add(whiteWine);
        items.add(coffee);
        items.add(pizza);
        items.add(pommes);
        items.add(onionRings);

        Restaurant alfredos = new Restaurant("Alfredos",45000.00,employes,items);

        alfredos.cheapestPrice();
        alfredos.payAllEmployeesFull();
        alfredos.payEmployeById(3L);
        System.out.println("Average price is " + alfredos.averagePrice() + "€");

        alfredos.findAllByTyp(Typ.FOOD);
        alfredos.findAllByTyp(Typ.DRINK);

        System.out.println("All Items cheaper than 5.50 are:\n"+alfredos.findAllCheaperThan(5.50));
        alfredos.findAllCheaperThan(5.50);

        System.out.println("Food cheaper than 5.50 is:\n" + alfredos.findAllByTypAndCheaperThan(Typ.FOOD,5.50));

        alfredos.findItemByName("Lasagne");


    }
}
