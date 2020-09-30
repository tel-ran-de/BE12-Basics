package tasksWithSetAndMap.tasksList.taskList1;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaAdvanced
 * 27.09.20
 */


public class Addresses {
    public static void main(String[] args) {
    }

    // Задача 1(List). Есть два класса: Address с полями улица и номер дома и Person с полями имя иAddress.
    // Нужно написать функцию:List<Address> getAddresses(List<Person> persons)то есть
    // по списку persons возвращать список их адресов.
    public static List<Address> getAddresses(List<Person> persons) {
        List<Address> addressesForAllPersons = new ArrayList<>();
        if (persons != null) {
            for (Person person : persons) {
                addressesForAllPersons.add(person.getAddress());
            }
        }
        return addressesForAllPersons;
    }
}
