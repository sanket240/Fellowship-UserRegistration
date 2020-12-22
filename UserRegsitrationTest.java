
import org.junit.Assert;
import org.junit.Test;
import org.hamcrest.CoreMatchers;

import static org.junit.Assert.*;

public class UserRegistrationTest {

    @Test
    public void nameValidation() {
        UserRegsitration user=new UserRegistration();
        String mood=user.NameValidation("Sanket");
        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
    }
    @Test
    public void lastNameValidation() {
        UserRegsitration user=new UserRegistration();
        String mood=user.LastNameValidation("Dulange");
        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
    }
    @Test
    public void emailValidation() {
        UserRegsitration user=new UserRegistration();
        String mood=user.EmailValidation("sanketdulange24@gmail.com");
        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
    }

    @Test
    public void phoneValidation() {
        UserRegsitration user=new UserRegistration();
        String mood=user.PhoneValidation("91 9422484996");
        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
    }

    @Test
    public void passwordValidation() {
        UserRegsitration user=new UserRegistration();
        String mood=user.PasswordValidation("Sanket@24");
        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
    }
}
