import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Employe employe1 = new Employe("alex",200.00,700.50,true, LocalDate.of(1989,6,13),1L);
        Employe employe2 = new Employe("sven",400.00,850.50,true, LocalDate.of(1995,8,18),2L);
        Employe employe3 = new Employe("julia",740.00,790.50,true, LocalDate.of(1998,2,24),3L);

        ArrayList<Employe> employes = new ArrayList<>();
        employes.add(employe1);
        employes.add(employe2);
        employes.add(employe3);

        Item lasagne = new Food("Lasagne",true,7.50,false,true);
        Item whiteWine = new Drink("Chardonnay",true,23.90,true,false);
        Item coffee = new Drink("Capuccino",true,3.40,false,true);
        Item pizza = new Food("Pizza",true,8.70,false,true);
        ArrayList<Item> items = new ArrayList<>();
        items.add(lasagne);
        items.add(whiteWine);
        items.add(coffee);
        items.add(pizza);

        Restaurant alfredos = new Restaurant("Alfredos",45000.00,employes,items);

        alfredos.cheapestPrice();
        alfredos.payAllEmployeesFull();
        alfredos.payEmployeById(3L);
        System.out.println("Average price is " + alfredos.averagePrice() + "€");

    }
}
