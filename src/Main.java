import Enam.Province;
import Enam.Type;
import Model.Address;
import Model.Announcements;
import Model.Booking;
import Model.User;
import Service.AnnouncementsService;
import Service.BookingService;
import Service.UserService;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Жандар","Таалайбеков","xp3335@gmail.com",
                LocalDate.of(2023,8,17));
        User user2 = new User("Али","Наматов","ali1998@gmail.com",
                LocalDate.of(2023,8,17));
        User user3 = new User("Фируза","Абылова","firuzz11@gmail.com",
                LocalDate.of(2023,8,17));
        User user4 = new User("Бексултан","Саткынбеков","beka2002@gmail.com",
                LocalDate.of(2023,8,17));
        User [] users = {user1,user2,user3,user4};

        Address address1 = new Address("Квартира", Province.CHUY, "Бишкек", "Ленина, 123");
        Address address2 = new Address("Дача", Province.CHUY, "Токмок", "Садовая, 7");
        Address address3 = new Address("Дом", Province.OSH, "Ош", "Пушкина, 50");
        Address address4 = new Address("Коттедж", Province.JALAL_ABAD, "Джалал-Абад", "Сосновая, 15");
        Address address5 = new Address("Офисное помещение", Province.CHUY, "Бишкек", "Пр. Чуй, 200");

        
        Announcements announcements1 = new Announcements(
                "Просторная квартира в центре", LocalDate.of(2023, 8, 25), "Квартира",
                Type.APARTMENT, user1, false, 4, 500, address1);

        Announcements announcements2 = new Announcements(
                "Уютная дача на берегу", LocalDate.of(2023, 8, 26), "Дача",
                Type.HOUSE, user2, true, 5, 700, address2);

        Announcements announcements3 = new Announcements(
                "Комфортабельный дом в старом городе", LocalDate.of(2023, 8, 27), "Дом",
                Type.HOUSE, null, false, 6, 900, address3);

        Announcements announcements4 = new Announcements(
                "Просторный коттедж с садом", LocalDate.of(2023, 8, 28), "Коттедж",
                Type.HOUSE, null, true, 7, 1200, address4);

        Announcements announcements5 = new Announcements(
                "Офисное помещение в центре города", LocalDate.of(2023, 8, 29), "Офис",
                Type.APARTMENT, null, false, 8, 800, address5);

        Announcements[] announcements = {announcements1, announcements2, announcements3, announcements4};

        BookingService bookingService = new BookingService(users,announcements);
        AnnouncementsService announcementsService = new AnnouncementsService(announcements);
        UserService userService = new UserService(users,announcements);


//        announcementsService.createAnnouncement(announcements5);
//        announcementsService.deleteAnnouncementById(5); // Удалить объявление по ID
//        announcementsService.updateAnnouncementById(4, announcements5); // Обновить объявление по ID
//        System.out.println(announcementsService.getAnnouncementById(5)); // Получить объявление по ID
//        announcementsService.getAllAnnouncements(); // Получить все объявления
//        announcementsService.sortAnnouncementsByRating(); // Сортировать объявления по рейтингу
//        announcementsService.sortByPrice(); // Сортировать объявления по цене
//        announcementsService.filterByType(Type.APARTMENT); // Фильтровать объявления по типу (APARTMENT)
//        announcementsService.filterByType(Type.HOUSE); // Фильтровать объявления по типу (HOUSE)
//        bookingService.bookingAnnouncement(1, 3); // Забронировать объявление
//        bookingService.unBookingAnnouncement(1, 3); // Отменить бронирование
//        userService.getAllUser(); // Получить всех пользователей
//        userService.getAnnouncementsByUserId(2); // Получить объявления по ID пользователя
//        userService.getAnnouncementsByAddress("Петрович"); // Получить объявления по адресу "Петрович"

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("💁‍♂️Выберите действие:");
            System.out.println("1. Сохранить новый объект!✅");
            System.out.println("2. Удалить объект по ID⛔");
            System.out.println("3. Обновить объект по ID🔄");
            System.out.println("4. Получить объект по ID🟢");
            System.out.println("5. Получить все объекты!💁‍♂️");
            System.out.println("6. Сортировать объявления по рейтингу📉");
            System.out.println("7. Сортировать объявления по цене💰");
            System.out.println("8. Фильтровать объявления по типу (APARTMENT)🏢");
            System.out.println("9. Фильтровать объявления по типу (HOUSE)🏠");
            System.out.println("10. Забронировать объявление🔒");
            System.out.println("11. Отменить бронирование🔓");
            System.out.println("12. Получить всех пользователей📝");
            System.out.println("13. Получить объявления по ID пользователя📩");
            System.out.println("14. Получить объявления по адресу📬");
            System.out.println("15. Выйти✋");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    announcementsService.createAnnouncement(announcements5);
                    System.out.println("Добавлен новый объект!");
                    break;
                case 2:
                    System.out.println("Введите ID объявления:");
                    int deleteAnnouncementId = scanner.nextInt();
                    announcementsService.deleteAnnouncementById(deleteAnnouncementId);
                    break;
                case 3:
                    System.out.println("Введите ID объявления для обновления:");
                    int updateAnnouncementId = scanner.nextInt();
                    System.out.println("Обнавлено на новый объект!");
                    announcementsService.updateAnnouncementById(updateAnnouncementId, announcements5);
                    break;
                case 4:
                    System.out.println("Введите ID объявления для получения:");
                    int getAnnouncementId = scanner.nextInt();
                    System.out.println(announcementsService.getAnnouncementById(getAnnouncementId));
                    break;
                case 5:
                    System.out.println("Получить все объявления!");
                    announcementsService.getAllAnnouncements();
                    break;
                case 6:
                    System.out.println("Сортировать объявления по рейтингу!");
                    announcementsService.sortAnnouncementsByRating();
                    break;
                case 7:
                    System.out.println("Сортировать объявления по цене!");
                    announcementsService.sortByPrice();
                    break;
                case 8:
                    System.out.println("Фильтровать объявления по типу (APARTMENT)");
                    announcementsService.filterByType(Type.APARTMENT);
                    break;
                case 9:
                    System.out.println("Фильтровать объявления по типу (HOUSE)");
                    announcementsService.filterByType(Type.HOUSE);
                    break;
                case 10:
                    System.out.println("Забронировать объявление");
                    System.out.println("Введите ID пользователя:");
                    int bookingUserId = scanner.nextInt();
                    System.out.println("Введите ID объявления:");
                    int bookingAnnouncementId = scanner.nextInt();
                    bookingService.bookingAnnouncement(bookingUserId, bookingAnnouncementId);
                    break;
                case 11:
                    System.out.println("Отменить бронирование");
                    System.out.println("Введите ID пользователя:");
                    int cancelUserId = scanner.nextInt();
                    System.out.println("Введите ID объявления:");
                    int cancelAnnouncementId = scanner.nextInt();
                    bookingService.unBookingAnnouncement(cancelUserId, cancelAnnouncementId);
                    break;
                case 12:
                    System.out.println("Получить всех пользователей!");
                    userService.getAllUser();
                    break;
                case 13:
                    System.out.println("Получить объявления по ID пользователя");
                    int getAnnUser = scanner.nextInt();
                    userService.getAnnouncementsByUserId(getAnnUser);
                    break;
                case 14:
                    System.out.println("Получить объявления по адресу");
                    String getAnnAddress = scanner.nextLine();
                    userService.getAnnouncementsByAddress(getAnnAddress);

                    break;
                case 15:
                    System.out.println("До свидания!");
                    return;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите снова.");
            }
        }



    }
}