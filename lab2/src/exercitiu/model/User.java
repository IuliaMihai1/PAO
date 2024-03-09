package exercitiu.model;

public class User {

    private String username;
    private int sold;

    public User(String username, int sold) {
        this.username = username;
        this.sold = sold;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        return "[username: " + this.getUsername() + "; sold: " + this.sold + "]";
    }
}
