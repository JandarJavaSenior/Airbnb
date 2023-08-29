package Model;

import Service.UserService;

import java.time.LocalDate;

public class User{
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate registeredDate;
    private static int idd = 1;

    public User( String firstName, String lastName, String email, LocalDate registeredDate) {
        this.id = idd++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.registeredDate = registeredDate;

    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(LocalDate registeredDate) {
        this.registeredDate = registeredDate;
    }

    @Override
    public String toString() {
        return "\n➖➖➖➖➖User➖➖➖➖➖\n" +
                "🔴Id: " + id +"\n"+
                "🟢FirstName: " + firstName + "\n"+
                "🟤LastName: " + lastName +"\n"+
                "🟠Email: " + email +"\n"+
                "🔵RegisteredDate: " + registeredDate +
                "\n➖➖➖➖➖➖➖➖➖➖➖";
    }
}
