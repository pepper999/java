package test07_comparable;

public class Person implements Comparable<Person> {
    String name;
    String id;
    
    public Person() {}

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    @Override
    public int hashCode() {
        return id.hashCode();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            return id.equals(((Person)obj).id);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", id=" + id + "]";
    }
    
    @Override
    public int compareTo(Person p) {
        return Integer.parseInt(p.id) - Integer.parseInt(this.id);
    }
    
}
