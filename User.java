public class User {
    Long id;
    String userName;

    public User(long a, String b) {
        this.id = a;
        this.userName = b;
    }

    Long getId() {
        return this.id;
    }
    String getUserName() {
        return this.userName;
    }
    void setId(Long id) {
        this.id = id;
    }

    void setUserName(String userName) {
        this.userName = userName;
    }
}
