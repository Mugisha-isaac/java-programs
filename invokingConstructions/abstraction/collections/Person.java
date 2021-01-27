package invokingConstructions.abstraction.collections;

public class Person {
    private long id;
    private long age;
    private String names;

    public Person(long id, long age, String names) {
        this.id = id;
        this.age = age;
        this.names = names;
    }

    public String getName() {
        return this.names;
    }

    public long getId() {
        return this.id;
    }

    public long getAge() {
        return this.age;
    }

    @Override
    public int hashCode() {
        return (int) this.id;
    }

    @Override
    public boolean equals(Object any) {
        if (this == any) {
            return true;
        }
        if (any == null || this.getClass() != any.getClass()) {
            return false;
        }
        Person p = (Person) any;
        return this.getId() == p.getId() && this.getName().equals(p.getName());

    }
}
