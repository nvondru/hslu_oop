package ch.hslu.sw_07;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private final long ID;
    private String lastName;
    private String preName;

    public Person(long ID, String lastName, String preName) {
        this.ID = ID;
        this.lastName = lastName;
        this.preName = preName;
    }

    public long getID() {
        return ID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPreName() {
        return preName;
    }

    public void setPreName(String preName) {
        this.preName = preName;
    }

    public String getFullName(){
        return this.preName + " " + this.getLastName();
    }

    @Override
    public String toString(){
        return "Person[ID=" + this.getID() + ";lastName=" + this.getLastName() + ";preName=" + this.getPreName() + "]";
    }

    @Override
    public final boolean equals(final Object object){
        if (object == this){
            return true;
        }
        if (!(object instanceof Person)){
            return false;
        }
        final Person other = (Person) object;
        return (other.ID == this.ID) && (Objects.equals(other.lastName, this.lastName)) && (Objects.equals(other.preName, this.preName));
    }

    @Override
    public final int hashCode(){
        return Objects.hash(this.ID, this.lastName, this.preName);
    }

    @Override
    public int compareTo(Person other) {
        return Long.compare(this.ID, other.ID);
    }
}
