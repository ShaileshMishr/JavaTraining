
// Take 4 email addresses from the user as input and store them in an array
// put all the gmail domains into one array and yahoo domains in another array.

package JavaBasics.src.Day4;

public class Email {
    private String email;
    private String name;

    public Email(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Email{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
