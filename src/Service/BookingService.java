package Service;

import Interface.Booking;
import Model.Announcements;
import Model.User;

public class BookingService implements Booking {
    private User [] userrr;
    private Announcements [] announcementsss;

    public BookingService(User[] userrr, Announcements[] announcementsss) {
        this.userrr = userrr;
        this.announcementsss = announcementsss;
    }

    public User[] getUserrr() {
        return userrr;
    }

    public void setUserrr(User[] userrr) {
        this.userrr = userrr;
    }

    public Announcements[] getAnnouncementsss() {
        return announcementsss;
    }

    public void setAnnouncementsss(Announcements[] announcementsss) {
        this.announcementsss = announcementsss;
    }

    @Override
    public void bookingAnnouncement(int idUser, int idAnnoun) {
        boolean foundAndBooked = false;

        for (int i = 0; i < announcementsss.length; i++) {
            if (announcementsss[i].getId() == idAnnoun && announcementsss[i].getOwner() == null) {
                for (int j = 0; j < userrr.length; j++) {
                    if (userrr[j].getId() == idUser) {
                        announcementsss[i].setOwner(userrr[j]);
                        announcementsss[i].setBooked(false);
                        System.out.println("Вы забронировали номер!❕✅");
                        foundAndBooked = true;
                        break;
                    }
                }
            }
        }

        if (!foundAndBooked) {
            System.out.println("Извините, данное сооружение забронировано или не существует!⛔");
        }
    }  

    @Override
    public void unBookingAnnouncement(int idUser, int idAnnoun) {
        boolean foundAndCanceled = false;

        for (int i = 0; i < announcementsss.length; i++) {
            if (announcementsss[i].getId() == idAnnoun && announcementsss[i].getOwner() != null) {
                if (announcementsss[i].getOwner().getId() == idUser) {
                    announcementsss[i].setOwner(null);
                    announcementsss[i].setBooked(true);
                    System.out.println("Бронирование успешно отменено!✅");
                    foundAndCanceled = true;
                    break;
                }
            }
        }

        if (!foundAndCanceled) {
            System.out.println("Извините, вы не можете отменить бронирование данного объявления!⛔");
        }
    }

}
