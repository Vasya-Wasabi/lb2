package mainApp;
import java.util.Scanner;
import house.House;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Кількість квартир: ");
        int count = sc.nextInt();
        House[] houses = createHouses(count);

        for(byte i = 0; i < count; ++i) {
            System.out.println(houses[i].ToString());
        }

        System.out.println("1) Вивести квартири за їхньою площею\n" +
                "2) Вивести квартири за кількістю квартир\n" +
                "3) Вивести квартири, які знаходяться на одному поверсі\n" +
                " Ваш вибір: ");

        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Помилка! Неправильний вибір");


        }

    }

    public static House[] createHouses(int count) {
        Scanner sc = new Scanner(System.in);
        House[] houses = new House[count];
        for(byte i = 0; i < count; ++i) {
            houses[i] = new House();
            System.out.println("\nВведіть дані про квартиру " + (i + 1) + ":");
            System.out.print("Id квартири: ");
            int id = sc.nextInt();
            houses[i].SetId(id);

            System.out.print("Номер квартири: ");
            int apartmentNumber = sc.nextInt();
            houses[i].SetApartmentNumber(apartmentNumber);

            System.out.print("Площа квартири: ");
            int area = sc.nextInt();
            houses[i].SetArea(area);

            System.out.print("Поверх: ");
            int floor = sc.nextInt();
            houses[i].SetFloor(floor);

            System.out.print("Кількість кімнат: ");
            int numberOfRooms = sc.nextInt();
            houses[i].SetNumberOfRooms(numberOfRooms);

            sc.nextLine(); // очищення буф
            System.out.print("Вулиця: ");
            String street = sc.nextLine();
            houses[i].SetStreet(street);
        }
        return houses;
    }

    public static void printByAreaRange() {

    }

    public static void printByFloorRange() {

    }

    public static void printByNumberOfRoomsRange() {

    }
}
