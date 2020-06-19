/*
Immutable class
 */
public final class Person {

    final String firstName;
    final String lastName;
    final String email;
    final String mobileNumber;

    public Person(String firstName, String lastName, String email, String mobileNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

}
