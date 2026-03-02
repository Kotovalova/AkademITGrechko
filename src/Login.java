import java.util.Objects;

public class Login {

    public static void check(String   entLogin, String entPassword) {
        /** Массив верных логин паролей */
        String[][] users = {
                {"admin", "admin123"},
                {"user1", "pass1"},
                {"user2", "pass2"},
                {"guest", "guest123"}
        };
        boolean result = false;

        for (String[] user : users) {
            String login = user[0];
            String password = user[1];
            if(Objects.equals(login, entLogin)){
                if (Objects.equals(password, entPassword)){
                    System.out.println("🔐 Пароль для " + entLogin + " введен верно");
                }
                else {
                    System.out.println("🔐 Пароль для " + entLogin + " введен не верно");
                }
                result = true;
            }
        }

        if(!result){
            System.out.println("Пользователь " + entLogin + " не найден");
        }
    }

    public static void main(String[] args) {
        Login.check("user1", "pass1");
        Login.check("admin", "admin10");
        Login.check("admin2", "admin10");
        Login.check("guest", "admin10");
        Login.check("guest", "guest123");
        Login.check(null, null);
    }
}