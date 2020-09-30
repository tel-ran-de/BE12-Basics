package tasksWithSetAndMap.tasksList.taskList1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static tasksWithSetAndMap.tasksList.taskList1.Addresses.getAddresses;

/**
 * JavaAdvanced
 * 27.09.20
 */

class AddressesTest {
    @Test
    public void getAddresses_ListPerson_ListAddresses() {
        List<Person> people = new ArrayList<>();
        Person p1 = new Person("Lora", new Address("Street1", 7));
        Person p2 = new Person("Anna", new Address("Street16", 78));
        Person p3 = new Person("Olef", new Address("Street18", 89));
        people.addAll(Arrays.asList(p1, p2, p3));

        List<Address> addresses = new ArrayList<>();
        Address address1 = new Address("Street1", 7);
        Address address2 = new Address("Street16", 78);
        Address address3 = new Address("Street18", 89);
        addresses.addAll(Arrays.asList(address1, address2, address3));
        assertEquals(addresses, getAddresses(people));
    }

    @Test
    public void getAddresses_ListPersonIsNull_ListAddressesIs() {
        List<Person> people = null;
        List<Address> addresses = new ArrayList<>();
        assertEquals(addresses, getAddresses(people));
    }

}