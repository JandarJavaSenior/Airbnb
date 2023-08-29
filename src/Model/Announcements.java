package Model;

import Enam.Type;

import java.time.LocalDate;

public class Announcements {
    private int id;
    private String description;
    private LocalDate data;
    private String title;
    private Type type;
    private User owner;
    private boolean isBooked;
    private int  rating;
    private int prisePerDay;
    private Address address;
    private static int idd = 1;

    public Announcements(String description, LocalDate data, String title, Type type, User owner, boolean isBooked, int rating, int prisePerDay,Address address) {
        this.id = idd++;
        this.description = description;
        this.data = data;
        this.title = title;
        this.type = type;
        this.owner = owner;
        this.isBooked = isBooked;
        this.rating = rating;
        this.prisePerDay = prisePerDay;
        this.address = address;
    }

    public Announcements() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getPrisePerDay() {
        return prisePerDay;
    }

    public void setPrisePerDay(int prisePerDay) {
        this.prisePerDay = prisePerDay;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "◼◼◼◼◼Announcements◼◼◼◼◼\n" +
                "🔴🔴Id: " + id + "\n" +
                "🟢🟢Description: " + description + "\n" +
                "🟤🟤Data: " + data + "\n" +
                "🟠🟠Title: " + title + "\n" +
                "🔵🔵Enam.Type: " + type + "\n" +
                "⚫⚫Owner: " + owner + "\n" +
                "🟡🟡IsBooked: " + isBooked + "\n" +
                "🟣🟣Rating: " + rating + "\n" +
                "⚪⚪PrisePerDay: " + prisePerDay + "\n"+ "\n"+ "\n"+ "\n";
    }

}
