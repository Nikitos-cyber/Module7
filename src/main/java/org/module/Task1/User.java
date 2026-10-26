package org.module.Task1;

public class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User: { username: " + username + ";\nemail: " + email + " }\n";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;
        User user = (User) object;
        if (username != null ? !username.equals(user.username) : (user.username != null))
            return false;
        return email != null ? email.equals(user.email) : user.email == null;
    }

    @Override
    public int hashCode() {
        int num = 10;
        num = 31 * num + (username != null ? username.hashCode() : 0);
        num = 31 * num + (email != null ? email.hashCode() : 0);
        return num;
    }
}
