package mainApp;
import java.util.Scanner;
import house.House;

/**
 * Головний клас програми для роботи з квартирами.
 * Дозволяє створювати масив об'єктів {@link House},
 * а також здійснювати пошук за різними критеріями (площа, кількість кімнат, поверх).
 */
public class Main {
    public static final String WHITE = "\u001B[37m";
    public static final String RESET = "\u001B[0m";

    /**
     * Точка входу в програму.
     * @param args аргументи командного рядка (не використовуються)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Кількість квартир: ");
        int count = sc.nextInt();
        House[] houses = createHouses(count);

        System.out.println("\nУсі квартири:");
        for(byte i = 0; i < count; ++i) {
            System.out.println(houses[i].ToString());
        }

        System.out.print("\nВведіть площу для пошуку: ");
        double area = sc.nextDouble();
        printByAreaRange(houses, area);

        System.out.print("\nВведіть кількість кімнат для пошуку: ");
        int numberOfRooms = sc.nextInt();
        printByNumberOfRoomsRange(houses, numberOfRooms);

        System.out.print("\nВведіть поверх для пошуку: ");
        int floor = sc.nextInt();
        printByFloorRange(houses, floor);

    }

    /**
     * Створює масив квартир, заповнений даними користувача.
     *
     * @param count кількість квартир
     * @return масив об'єктів {@link House}
     */
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

    /**
     * Виводить усі квартири з площею більшою або рівною вказаній.
     *
     * @param houses масив об'єктів {@link House}
     * @param area мінімальна площа для пошуку
     */
    public static void printByAreaRange(House[] houses, double area) {
        boolean found = false;
        System.out.println("Квартири з площею >= " + area + ":");
        for(House h : houses) {
            if(h.GetArea() >= area) {
                System.out.println(h.ToString());
                found = true;
            }
        }
        if(!found) System.out.println(WHITE + "Такі квартири відсутні" + RESET);
    }
    /**
     * Виводить усі квартири з кількістю кімнат більшою або рівною вказаній.
     *
     * @param houses масив об'єктів {@link House}
     * @param numberOfRooms мінімальна кількість кімнат для пошуку
     */
    public static void printByNumberOfRoomsRange(House[] houses, int numberOfRooms) {
        boolean found = false;
        System.out.println("Квартири з кількістю кімнат >= " + numberOfRooms + ":");
        for(House h : houses) {
            if (h.GetNumberOfRooms() >= numberOfRooms) {
                System.out.println(h.ToString());
                found = true;
            }
        }
        if(!found) System.out.println(WHITE + "Такі квартири відсутні" + RESET);
    }
    /**
     * Виводить усі квартири, які знаходяться на вказаному поверсі.
     *
     * @param houses масив об'єктів {@link House}
     * @param floor поверх, на якому потрібно знайти квартири
     */
    public static void printByFloorRange(House[] houses, int floor) {
        boolean found = false;
        System.out.println("Квартири на поверсі " + floor + ":");
        for(House h : houses){
            if(h.GetFloor() == floor) {
                System.out.println(h.ToString());
            found = true;
            }
        }
        if(!found) System.out.println(WHITE + "Такі квартири відсутні" + RESET);
    }
}
