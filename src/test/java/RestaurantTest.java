import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {

    @Test
    void shouldReturnItemsCheaperThanFiveAndTypDrink(){
        var restaurant = new Restaurant();
        var item = new Item("asf",true,1.50,Typ.DESERT);
        var item2 = new Item("asdf",true,6.50,Typ.DRINK);
        var item3 = new Item("coffee",true,2.50,Typ.DRINK);
        var item5 = new Item("klkloe",true,4.50,Typ.DRINK);
        var item4 = new Item("ajssf",true,9.50,Typ.DRINK);
        ArrayList<Item> items = new ArrayList<>();
        items.add(item);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        restaurant.setMenu(items);
        List<Item> cheapAndTyp = new ArrayList<>();
        cheapAndTyp.add(item3);
        cheapAndTyp.add(item5);
        assertEquals(cheapAndTyp,restaurant.findAllByTypAndCheaperThan(Typ.DRINK,5.00));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionG(){
        var restaurant = new Restaurant();
        var item = new Item("asf",true,1.50,Typ.DESERT);
        var item2 = new Item("asdf",true,6.50,Typ.DRINK);
        var item3 = new Item("coffee",true,2.50,Typ.DRINK);
        var item5 = new Item("klkloe",true,4.50,Typ.DRINK);
        var item4 = new Item("ajssf",true,9.50,Typ.DRINK);
        ArrayList<Item> items = new ArrayList<>();
        items.add(item);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        restaurant.setMenu(items);
        assertThrows(IllegalArgumentException.class,
                () ->{
                    restaurant.findAllByTypAndCheaperThan(Typ.DRINK,1.00);
                });
    }

    @Test
    void shouldReturnItemsCheaperThan5(){
        var restaurant = new Restaurant();
        var item = new Item("asf",true,1.50,Typ.DESERT);
        var item2 = new Item("asdf",true,6.50,Typ.DRINK);
        var item3 = new Item("coffee",true,2.50,Typ.DRINK);
        var item4 = new Item("ajssf",true,9.50,Typ.DRINK);
        ArrayList<Item> items = new ArrayList<>();
        items.add(item);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        restaurant.setMenu(items);
        List<Item> cheapItems = new ArrayList<>();
        cheapItems.add(item);
        cheapItems.add(item3);
        assertEquals(cheapItems,restaurant.findAllCheaperThan(5.00));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionF(){
        var restaurant = new Restaurant();
        var item = new Item("asf",true,3.50,Typ.DESERT);
        var item2 = new Item("asdf",true,6.50,Typ.DRINK);
        var item3 = new Item("coffee",true,4.50,Typ.DRINK);
        var item4 = new Item("ajssf",true,9.50,Typ.DRINK);
        ArrayList<Item> items = new ArrayList<>();
        items.add(item);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        restaurant.setMenu(items);
        List<Item> cheapItems = new ArrayList<>();
        cheapItems.add(item);
        cheapItems.add(item3);
        assertThrows(IllegalArgumentException.class,
                () ->{
                    restaurant.findAllCheaperThan(3.00);
                });
    }

    @Test
    void shouldReturn2Point50(){
        var restaurant = new Restaurant();
        var item = new Item("asf",true,1.50,Typ.DESERT);
        var item2 = new Item("asdf",true,6.50,Typ.DRINK);
        var item3 = new Item("coffee",true,2.50,Typ.DRINK);
        var item4 = new Item("ajssf",true,9.50,Typ.DRINK);
        ArrayList<Item> items = new ArrayList<>();
        items.add(item);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        restaurant.setMenu(items);
        assertEquals(2.50,restaurant.findItemPriceByName("coffee"));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionC(){
        var restaurant = new Restaurant();
        var item = new Item("asf",true,1.50,Typ.DESERT);
        var item2 = new Item("asdf",true,6.50,Typ.DRINK);
        var item3 = new Item("coffee",true,2.50,Typ.DRINK);
        var item4 = new Item("ajssf",true,9.50,Typ.DRINK);
        ArrayList<Item> items = new ArrayList<>();
        items.add(item);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        restaurant.setMenu(items);
        assertThrows(IllegalArgumentException.class,
                () ->{
                    restaurant.findItemPriceByName("lasagne");
                });
    }

    @Test
    void shouldReturnAllDrinks(){
        var restaurant = new Restaurant();
        var item = new Item("asf",true,1.50,Typ.DESERT);
        var item2 = new Item("asdf",true,6.50,Typ.DRINK);
        var item3 = new Item("coffee",true,2.50,Typ.DRINK);
        var item4 = new Item("ajssf",true,9.50,Typ.DRINK);
        ArrayList<Item> items = new ArrayList<>();
        items.add(item);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        restaurant.setMenu(items);
        List<Item> drinks = new ArrayList<>();
        drinks.add(item2);
        drinks.add(item3);
        drinks.add(item4);
        assertEquals(drinks,restaurant.findAllByTyp(Typ.DRINK));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionD(){
        var restaurant = new Restaurant();
        var item = new Item("asf",true,1.50,Typ.DESERT);
        var item2 = new Item("asdf",true,6.50,Typ.DRINK);
        var item3 = new Item("coffee",true,2.50,Typ.DRINK);
        var item4 = new Item("ajssf",true,9.50,Typ.DRINK);
        ArrayList<Item> items = new ArrayList<>();
        items.add(item);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        restaurant.setMenu(items);
        List<Item> drinks = new ArrayList<>();
        drinks.add(item2);
        drinks.add(item3);
        drinks.add(item4);
        assertThrows(IllegalArgumentException.class,
                () ->{
                    restaurant.findAllByTyp(Typ.MAIN_COURSE);
                });
    }

    @Test
    void shouldReturn50Point50(){
        var restaurant = new Restaurant();
        var employe = new Employee("jim",200.00,20.50,true, LocalDate.of(2001,11,25),1L);
        var employe2 = new Employee("alex",200.00,30.00,true, LocalDate.of(2003,11,25),2L);
        ArrayList<Employee> employes = new ArrayList<>();
        employes.add(employe);
        employes.add(employe2);
        restaurant.setEmployeList(employes);
        restaurant.setMoney(50000.50);
        assertEquals(50.50,restaurant.payAllEmployeesFull());
    }

    @Test
    void shouldReturn100Point50(){
        var restaurant = new Restaurant();
        var employe = new Employee("jim",200.00,20.50,true, LocalDate.of(2001,11,25),1L);
        var employe2 = new Employee("alex",200.00,30.00,true, LocalDate.of(2003,11,25),2L);
        var employe3 = new Employee("sven",200.00,50.00,true, LocalDate.of(2003,11,25),2L);

        ArrayList<Employee> employes = new ArrayList<>();
        employes.add(employe);
        employes.add(employe2);
        employes.add(employe3);
        restaurant.setEmployeList(employes);
        restaurant.setMoney(40000.60);
        assertEquals(100.50,restaurant.payAllEmployeesFull());
    }

    @Test
    void shouldReturn1Point50(){
        var restaurant = new Restaurant();
        var item = new Item("asf",true,1.50,Typ.DESERT);
        var item2 = new Item("asdf",true,6.50,Typ.DRINK);
        var item3 = new Item("ashdfgf",true,5.50,Typ.MAIN_COURSE);
        var item4 = new Item("ajssf",true,9.50,Typ.DRINK);
        ArrayList<Item> items = new ArrayList<>();
        items.add(item);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        restaurant.setMenu(items);
        assertEquals(1.50,restaurant.cheapestPrice());
    }

    @Test
    void shouldThrowNumberFormatException(){
        var restaurant = new Restaurant();
        var item = new Item("asf",true,1.50,Typ.DESERT);
        var item2 = new Item("asdf",true,-6.50,Typ.DESERT);
        var item3 = new Item("ashdfgf",true,5.50,Typ.DESERT);
        var item4 = new Item("ajssf",true,9.50,Typ.DESERT);
        ArrayList<Item> items = new ArrayList<>();
        items.add(item);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        restaurant.setMenu(items);
        assertThrows(NumberFormatException.class,
                () ->{
                    restaurant.cheapestPrice();
                });
    }

    @Test
    void shouldReturnFive() {
        var restaurant = new Restaurant();
        var item = new Item("asf", true, 1.00,Typ.DESERT);
        var item2 = new Item("asdf", true, 6.00,Typ.DESERT);
        var item3 = new Item("ashdfgf", true, 3.50,Typ.DESERT);
        var item4 = new Item("ajssf", true, 9.50,Typ.DESERT);
        ArrayList<Item> items = new ArrayList<>();
        items.add(item);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        restaurant.setMenu(items);
        assertEquals(5.00, restaurant.averagePrice());

    }

    @Test
    void shouldReturn300Point50(){
        var restaurant = new Restaurant();
        var employe = new Employee("jim",200.00,20.50,true, LocalDate.of(2001,11,25),1L);
        var employe2 = new Employee("alex",200.00,300.50,true, LocalDate.of(2003,11,25),2L);
        var employe3 = new Employee("sven",200.00,50.00,true, LocalDate.of(2003,11,25),3L);

        ArrayList<Employee> employes = new ArrayList<>();
        employes.add(employe);
        employes.add(employe2);
        employes.add(employe3);
        restaurant.setEmployeList(employes);
        restaurant.setMoney(40000.30);
        assertEquals(300.50,restaurant.payEmployeById(2L));
    }

    @Test
    void shouldThrowIllegalArgumentException(){
        var restaurant = new Restaurant();
        var employe = new Employee("jim",200.00,20.50,true, LocalDate.of(2001,11,25),1L);
        var employe2 = new Employee("alex",200.00,300.50,true, LocalDate.of(2003,11,25),2L);
        var employe3 = new Employee("sven",200.00,50.00,true, LocalDate.of(2003,11,25),3L);

        ArrayList<Employee> employes = new ArrayList<>();
        employes.add(employe);
        employes.add(employe2);
        employes.add(employe3);
        restaurant.setEmployeList(employes);
        restaurant.setMoney(40000.30);
        assertThrows(IllegalArgumentException.class,
                () ->{
                    restaurant.payEmployeById(5L);
                });
    }

    @Test
    void shouldThrowNullPointerException(){
        var restaurant = new Restaurant();
        var employe = new Employee("jim",200.00,20.50,true, LocalDate.of(2001,11,25),1L);
        var employe2 = new Employee("alex",200.00,300.50,true, LocalDate.of(2003,11,25),2L);
        var employe3 = new Employee(3L,200.00,50.00,true, LocalDate.of(2003,11,25));

        ArrayList<Employee> employes = new ArrayList<>();
        employes.add(employe);
        employes.add(employe2);
        employes.add(employe3);
        restaurant.setEmployeList(employes);
        restaurant.setMoney(40000.30);
        assertThrows(NullPointerException.class,
                () ->{
                    restaurant.payEmployeById(3L);
                });
    }

    @Test
    void shouldThrowIllegalArgumentExceptionB() {
        var restaurant = new Restaurant();
        var item = new Item("asf", true, 1.00,Typ.DESERT);
        var item2 = new Item("asdf", true, 6.00,Typ.DESERT);
        var item3 = new Item("ashdfgf", true, 3.50,Typ.DESERT);
        var item4 = new Item("ajssf", true, 9.50,Typ.DESERT);
        ArrayList<Item> items = new ArrayList<>();
        items.add(item);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        restaurant.setMenu(items);
        assertThrows(IllegalArgumentException.class,
                () ->{
                    restaurant.createNewBaseItem("asf",true,2.50,Typ.DESERT);
                });

    }
}