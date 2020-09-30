package tasksWithSetAndMap.tasksList.taskList1;

/**
 * JavaAdvanced
 * 27.09.20 14 51
 */

public class Address {
    private String street;
    private int numberOfHouse;

    public Address(String street, int numberOfHouse) {
        this.street = street;
        this.numberOfHouse = numberOfHouse;
    }

    @Override
    public String toString() {
        return "street: " + street +
                ", House number: " + numberOfHouse;
    }

    @Override // для тестирования
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (numberOfHouse != address.numberOfHouse) return false;
        return street != null ? street.equals(address.street) : address.street == null;
    }

    @Override
    public int hashCode() {
        int result = street != null ? street.hashCode() : 0;
        result = 31 * result + numberOfHouse;
        return result;
    }
}
