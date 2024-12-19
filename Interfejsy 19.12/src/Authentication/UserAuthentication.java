package Authentication;

public class UserAuthentication implements Authentication{
    @Override
    public boolean login(String username, String password) {
        if(username == "michalbroda" && password == "1234")return true;
        return false;
    }

    @Override
    public void logout() {
        System.out.println("Wylogowano użytkownika");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        return false;
    }
}
