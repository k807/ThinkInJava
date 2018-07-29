package annotations;

import java.util.List;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-25 19:30
 * =============================================
 */
public class PasswordUtils {

    @UseCase(id = 47, description = "Passwords must contain at least one numeric")
    public boolean validatePassword(String password){
        return password.matches("\\w*\\d\\w*");
    }

    @UseCase(id = 48)
    public String encryptPassword(String password){
        return new StringBuilder(password).reverse().toString();
    }

    @UseCase(id = 49, description = "New passwords can't equal previously used one")
    public boolean checkForNewPassword(List<String> prevPasswords, String password){
        return !prevPasswords.contains(password);
    }
}
