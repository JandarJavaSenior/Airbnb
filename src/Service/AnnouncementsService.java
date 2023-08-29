package Service;

import Enam.Type;
import Interface.Announcements;

import java.util.Arrays;

public class AnnouncementsService implements Announcements {
    Model.Announcements [] announcements;

    public AnnouncementsService(Model.Announcements[] announcements) {
        this.announcements = announcements;
    }

    public Model.Announcements[] getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(Model.Announcements[] announcements) {
        this.announcements = announcements;
    }

    @Override
    public void createAnnouncement(Model.Announcements newAnnouncement) {
        boolean alreadyExists = false;

        for (Model.Announcements a : announcements) {
            if (a.equals(newAnnouncement)) {
                alreadyExists = true;
                System.out.println("Такое сооружение уже есть!😕");
                break;
            }
        }

        if (!alreadyExists) {
            Model.Announcements[] announcements1 = Arrays.copyOf(announcements, announcements.length + 1);
            announcements1[announcements1.length - 1] = (Model.Announcements) newAnnouncement;
            announcements = announcements1;
            System.out.println("Вы добавили новое сооружение!🤗");
        }
    }



    @Override
    public void deleteAnnouncementById(int id) {
        for (int i = 0; i < announcements.length; i++) {
            if (announcements[i].getId() == id) {
                Model.Announcements[] newAnnouncements = new Model.Announcements[announcements.length - 1];
                System.arraycopy(announcements, 0, newAnnouncements, 0, i);
                System.arraycopy(announcements, i + 1, newAnnouncements, i, announcements.length - i - 1);
                announcements = newAnnouncements;
                System.out.println("Объявление с id " + id + " удалено.✅");
                return;
            }
        }

        System.out.println("Объявление с id " + id + " не найдено.❌");
    }


    @Override
    public void updateAnnouncementById(int idOld, Model.Announcements newAnnouncement) {
        for (int i = 0; i < announcements.length; i++) {
            if (announcements[i].getId() == idOld) {
                announcements[i] =  newAnnouncement;
                System.out.println("Объявление с id " + idOld + " обновлено.🔄");
                return;
            }
        }

        System.out.println("Объявление с id " + idOld + " не найдено.❌");
    }


    @Override
    public Model.Announcements getAnnouncementById(int id) {
        for (Model.Announcements announcement : announcements) {
            if (announcement.getId() == id) {
                return  announcement;
            }
        }
        return null;
    }


    @Override
    public void getAllAnnouncements() {
        for (Model.Announcements a:announcements) {
            System.out.println(a);
        }

    }

    @Override
    public void sortAnnouncementsByRating() {
        int n = announcements.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (announcements[j].getRating() < announcements[j + 1].getRating()) {
                    Model.Announcements temp = announcements[j];
                    announcements[j] = announcements[j + 1];
                    announcements[j + 1] = temp;
                }
            }
        }

        for (Model.Announcements announcement : announcements) {
            System.out.println(announcement);
        }
    }


    @Override
    public void sortByPrice() {
        System.out.println();
        System.out.println();
        System.out.println("От большего к меньшему!⏬");
        System.out.println();
        System.out.println();
        int n = announcements.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (announcements[j].getPrisePerDay() < announcements[j + 1].getPrisePerDay()) {
                    Model.Announcements temp = announcements[j];
                    announcements[j] = announcements[j + 1];
                    announcements[j + 1] = temp;
                }
            }
        }

        for (Model.Announcements announcement : announcements) {
            System.out.println(announcement);
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("От меньшего к большому!⏫↕");
        System.out.println();
        System.out.println();

        int h = announcements.length;

        for (int i = 0; i < h - 1; i++) {
            for (int j = 0; j < h - i - 1; j++) {
                if (announcements[j].getPrisePerDay() > announcements[j + 1].getPrisePerDay()) {
                    Model.Announcements temp = announcements[j];
                    announcements[j] = announcements[j + 1];
                    announcements[j + 1] = temp;
                }
            }
        }
        for (Model.Announcements announcement : announcements) {
            System.out.println(announcement);
        }

    }

    @Override
    public void filterByType(Type type) {
        for (Model.Announcements announcement : announcements) {
            if (announcement.getType() == type) {
                System.out.println(announcement);
            }
        }
    }


    @Override
    public String toString() {
        return"Announcements: " + Arrays.toString(announcements);
    }
}
