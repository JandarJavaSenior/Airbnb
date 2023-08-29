package Service;

import Interface.User;
import Model.Announcements;

public class UserService implements User {
    private Model.User [] user;
    private Model.Announcements[] announcemen;

    public UserService(Model.User[] user, Announcements[] announcemen) {
        this.user = user;
        this.announcemen = announcemen;
    }

    public Model.User[] getUser() {
        return user;
    }

    public void setUser(Model.User[] user) {
        this.user = user;
    }

    public Announcements[] getAnnouncemen() {
        return announcemen;
    }

    public void setAnnouncemen(Announcements[] announcemen) {
        this.announcemen = announcemen;
    }

    @Override
    public void getAllUser() {
        for (Model.User u :user) {
            System.out.println(u);
        }
    }

    @Override
    public void getAnnouncementsByUserId(int id) {

        for (int i = 0; i < announcemen.length; i++) {
            if(announcemen[i].getOwner()!=null){
                for (int j = 0; j < user.length; j++) {
                    if (user[j].getId()==id){
                        if(announcemen[i].getOwner()==user[j]){
                            System.out.println(announcemen[i]);
                        }
                    }
                }
            }
        }

    }

    @Override
    public void getAnnouncementsByAddress(String address) {
        for (int i = 0; i < announcemen.length; i++) {
            if (announcemen[i].getAddress().getAddress().contains(address)) {
                System.out.println(announcemen[i]);
            }
        }
    }

}
