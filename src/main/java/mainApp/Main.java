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

        System.out.print("Введіть площу: ");
        double area = sc.nextDouble();
        printByAreaRange(houses, area);

        System.out.print("Введіть кількість кімнат: ");
        int numberOfRooms = sc.nextInt();
        printByNumberOfRoomsRange(houses, numberOfRooms);

        System.out.print("Введіть поверх: ");
        int floor = sc.nextInt();
        printByFloorRange(houses, floor);

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
            double area = sc.nextDouble();
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

    public static void printByAreaRange(House[] houses, double area) {
        System.out.println("Квартири з площею >= " + area + ":");
        for(House h : houses) {
            if(h.GetArea() >= area) System.out.println(h.ToString());
        }
    }
    public static void printByNumberOfRoomsRange(House[] houses, int numberOfRooms) {
        System.out.println("Квартири з кількістю кімнат >= " + numberOfRooms + ":");
        for(House h : houses){
            if(h.GetNumberOfRooms() >= numberOfRooms) System.out.println(h.ToString());
        }
    }
    public static void printByFloorRange(House[] houses, int floor) {
        System.out.println("Квартири на поверсі " + floor + ":");
        for(House h : houses){
            if(h.GetFloor() >= floor) System.out.println(h.ToString());
        }
    }
}
