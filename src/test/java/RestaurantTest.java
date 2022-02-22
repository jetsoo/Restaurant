import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {

    @Test
    void shouldReturn50Point50(){
        var restaurant = new Restaurant();
        var employe = new Employe("jim",200.00,20.50,true, LocalDate.of(2001,11,25),1L);
        var employe2 = new Employe("alex",200.00,30.00,true, LocalDate.of(2003,11,25),2L);
        ArrayList<Employe> employes = new ArrayList<>();
        employes.add(employe);
        employes.add(employe2);
        restaurant.setEmployeList(employes);
        restaurant.setMoney(50000.50);
        assertEquals(50.50,restaurant.payAllEmployeesFull());
    }

    @Test
    void shouldReturn100Point50(){
        var restaurant = new Restaurant();
        var employe = new Employe("jim",200.00,20.50,true, LocalDate.of(2001,11,25),1L);
        var employe2 = new Employe("alex",200.00,30.00,true, LocalDate.of(2003,11,25),2L);
        var employe3 = new Employe("sven",200.00,50.00,true, LocalDate.of(2003,11,25),2L);

        ArrayList<Employe> employes = new ArrayList<>();
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
        var item = new Item("asf",true,1.50);
        var item2 = new Item("asdf",true,6.50);
        var item3 = new Item("ashdfgf",true,5.50);
        var item4 = new Item("ajssf",true,9.50);
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
        var item = new Item("asf",true,1.50);
        var item2 = new Item("asdf",true,-6.50);
        var item3 = new Item("ashdfgf",true,5.50);
        var item4 = new Item("ajssf",true,9.50);
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
        var item = new Item("asf", true, 1.00);
        var item2 = new Item("asdf", true, 6.00);
        var item3 = new Item("ashdfgf", true, 3.50);
        var item4 = new Item("ajssf", true, 9.50);
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
        var employe = new Employe("jim",200.00,20.50,true, LocalDate.of(2001,11,25),1L);
        var employe2 = new Employe("alex",200.00,300.50,true, LocalDate.of(2003,11,25),2L);
        var employe3 = new Employe("sven",200.00,50.00,true, LocalDate.of(2003,11,25),3L);

        ArrayList<Employe> employes = new ArrayList<>();
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
        var employe = new Employe("jim",200.00,20.50,true, LocalDate.of(2001,11,25),1L);
        var employe2 = new Employe("alex",200.00,300.50,true, LocalDate.of(2003,11,25),2L);
        var employe3 = new Employe("sven",200.00,50.00,true, LocalDate.of(2003,11,25),3L);

        ArrayList<Employe> employes = new ArrayList<>();
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
        var employe = new Employe("jim",200.00,20.50,true, LocalDate.of(2001,11,25),1L);
        var employe2 = new Employe("alex",200.00,300.50,true, LocalDate.of(2003,11,25),2L);
        var employe3 = new Employe(3L,200.00,50.00,true, LocalDate.of(2003,11,25));

        ArrayList<Employe> employes = new ArrayList<>();
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
}