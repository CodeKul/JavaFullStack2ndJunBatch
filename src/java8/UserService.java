package java8;

import java.util.Date;

@FunctionalInterface
public interface UserService {
    void addUser();
    default void sendWelcomeMessage(String username){
        System.out.println("Welcome "+username);
    }
    static Date getCurrentDate(){
        return new Date(System.currentTimeMillis());
    }
}
class User implements UserService{
    @Override
    public void addUser() {

    }
    @Override
    public void sendWelcomeMessage(String username) {
        System.out.println("Welcome "+username);
    }
}
class UserImpl{
    public static void main(String[] args) {
        UserService userService = new User();
        userService.addUser();
        userService.sendWelcomeMessage("Codekul");
        System.out.println(UserService.getCurrentDate());
    }
}