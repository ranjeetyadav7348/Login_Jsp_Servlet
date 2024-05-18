package user;

public interface dao {

    boolean isValidUser(String username, String pass);
    public boolean addUser(user user);
    
}
