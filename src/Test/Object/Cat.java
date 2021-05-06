package Test.Object;

import java.util.Objects;

public class Cat {
    private String name;
    private String owner;

    public Cat(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

   /* @Override
    public String toString() {
        return "Cat name is " + name + " and owner is " + owner;
    }

    @Override
    public boolean equals(Object obj) {
        Cat cat = (Cat)obj;
        if(this.name.equals(cat.name) && this.owner.equals(cat.owner)) {
            return true;
        } else {
            return false;
        }
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name) && Objects.equals(owner, cat.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, owner);
    }
}
