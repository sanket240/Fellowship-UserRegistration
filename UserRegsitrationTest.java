
import org.junit.Assert;
import org.junit.Test;
import org.hamcrest.CoreMatchers;
import static org.junit.Assert.*;

public class UserRegistrationTest {

      @Test
    public void givenFirstName_WhenProper_ShouldReturnHappy() {
        main main0=new main();
        String mood=main0.NameValidation("Sanket");
        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
    }
    @Test
    public void givenFirstName_WhenProper_ShouldReturnSad() {
        main main0=new main();
        String mood=main0.NameValidation("Sa");
        Assert.assertThat(mood,CoreMatchers.is("SAD"));
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnHappy() {
        main main0=new main();
        String mood=main0.LastNameValidation("Dulange");
        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnSad() {
        main main0=new main();
        String mood=main0.LastNameValidation("Du");
        Assert.assertThat(mood,CoreMatchers.is("SAD"));
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnHappy() {
        main main0=new main();
        String mood=main0.EmailValidation("sanketdulange24@gmail.com");
        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnSad() {
        main main0=new main();
        String mood=main0.EmailValidation("sanketdulangegmail.com");
        Assert.assertThat(mood,CoreMatchers.is("SAD"));
    }

    @Test
    public void givenPhone_WhenProper_ShouldReturnHappy(){
        main main0=new main();
        String mood=main0.PhoneValidation("91 9422484996");
        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
    }
    @Test
    public void givenPhone_WhenProper_ShouldReturnSad(){
        main main0=new main();
        String mood=main0.PhoneValidation("919422484996");
        Assert.assertThat(mood,CoreMatchers.is("SAD"));
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnHappy() {
        main main0=new main();
        String mood=main0.PasswordValidation("Sanket@24");
        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnSad() {
        main main0=new main();
        String mood=main0.PasswordValidation("Sanket4");
        Assert.assertThat(mood,CoreMatchers.is("SAD"));
    }
}
