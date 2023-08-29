package Interface;

import Enam.Type;

public interface Announcements {


    void createAnnouncement(Model.Announcements newAnnouncement);

    void deleteAnnouncementById(int id);
    void updateAnnouncementById(int idOld,Model.Announcements announcements);
    Model.Announcements getAnnouncementById(int id);
    void getAllAnnouncements();
    void sortAnnouncementsByRating();
    void sortByPrice();
    void filterByType(Type type);
}
