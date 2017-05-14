package model;

/**
 * Created by ealexhaywood on 5/13/17.
 */
public class User {

    private String name;
    private boolean isPrime;
    private String location;

    public User(String name, boolean isPrime, String location) {
        this.name = name;
        this.isPrime = isPrime;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public void setPrime(boolean prime) {
        isPrime = prime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return name;
    }
}
