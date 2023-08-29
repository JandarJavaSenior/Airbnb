package Model;

import Model.Announcements;

public class Booking {
    private User bookedUser;
    private Announcements announcement;

    public Booking(User bookedUser, Announcements announcement) {
        this.bookedUser = bookedUser;
        this.announcement = announcement;
    }

    public User getBookedUser() {
        return bookedUser;
    }

    public void setBookedUser(User bookedUser) {
        this.bookedUser = bookedUser;
    }

    public Announcements getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(Announcements announcement) {
        this.announcement = announcement;
    }

    @Override
    public String toString() {
        return "Model.Booking: \n" +
                "BookedUser: " + bookedUser + "\n" +
                "Announcement: " + announcement + "\n";
    }

}
