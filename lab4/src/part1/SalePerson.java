package part1;

import java.util.Objects;

public class SalePerson implements Comparable<SalePerson>{


    private final String firstName;
    private final String lastName;
    private final int totalSales;

    public SalePerson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    @Override
    public String toString() {
        return new StringBuilder(lastName).append(new char[]{' ', ','}).append(firstName).append(new char[]{' ',':', ' '}).append(totalSales).toString();
    }
    @Override
    public boolean equals(Object that) {
        if (this == that) return  true;
        if (that instanceof  SalePerson thatPerson) {
            return this.firstName.equals(thatPerson.firstName) && this.lastName.equals(thatPerson.lastName);
        }
        return false;
    }
    @Override
    public int compareTo(SalePerson that) {
        int compare = this.totalSales - that.totalSales;
        return compare == 0? this.lastName.compareTo(that.lastName) : compare;
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.firstName, this.lastName);
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getTotalSales() {
        return totalSales;
    }
}
