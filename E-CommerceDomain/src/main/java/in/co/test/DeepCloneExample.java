package in.co.test;
class Address {
    String city;
    String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Address(this.city, this.country);
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.address = (Address) address.clone(); // deep cloning
        return cloned;
    }
}

public class DeepCloneExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("New York", "USA");
        Person person1 = new Person("John", address);
        Person person2 = (Person) person1.clone();

        System.out.println(person1.address.city); // Output: New York
        System.out.println(person2.address.city); // Output: New York

        person2.address.city = "Los Angeles";
        System.out.println(person1.address.city); // Output: New York
        System.out.println(person2.address.city); // Output: Los Angeles
    }
}