package house;

/**
 * Клас {@code House} описує квартиру з її характеристиками:
 * ідентифікатор, номер, площа, поверх, кількість кімнат та вулиця.
 * <p>
 * Передбачено методи доступу (гетери/сетери) до всіх полів
 * та метод {@link #toString()} для відображення інформації про квартиру.
 */
public class House {
    public static final String RESET = "\u001B[0m";
    public static final String WHITE = "\u001B[37m";

    /** Унікальний ідентифікатор квартири */
    private int id;
    /** Номер квартири */
    private int apartmentNumber;
    /** Площа квартири */
    private double area;
    /** Поверх, на якому знаходиться квартира */
    private int floor;
    /** Кількість кімнат у квартирі */
    private int numberOfRooms;
    /** Вулиця, на якій знаходиться квартира */
    private String street;

    /**
     * Конструктор за замовчуванням.
     * Створює квартиру з нульовими параметрами та пустою вулицею.
     */
    public House() {
        id = 0;
        apartmentNumber = 0;
        area = 0;
        floor = 0;
        numberOfRooms = 0;
        street = "";
    }

    /**
     * Встановлює ідентифікатор квартири.
     * @param id унікальний ідентифікатор
     */
    public void SetId(int id){this.id = id;}

    /**
     * Встановлює номер квартири.
     * @param apartmentNumber номер квартири
     */
    public void SetApartmentNumber(int apartmentNumber){this.apartmentNumber = apartmentNumber;}

    /**
     * Встановлює площу квартири.
     * @param area площа (кв. м)
     */
    public void SetArea(double area){this.area = area;}

    /**
     * Встановлює поверх, на якому знаходиться квартира.
     * @param floor номер поверху
     */
    public void SetFloor(int floor){this.floor = floor;}

    /**
     * Встановлює кількість кімнат у квартирі.
     * @param numberOfRooms кількість кімнат
     */
    public void SetNumberOfRooms(int numberOfRooms){this.numberOfRooms = numberOfRooms;}

    /**
     * Встановлює вулицю, на якій знаходиться квартира.
     * @param street назва вулиці
     */
    public void SetStreet(String street){this.street = street;}

    /**
     * Повертає ідентифікатор квартири.
     * @return унікальний ідентифікатор
     */
    public int GetId() {return id;}

    /**
     * Повертає номер квартири.
     * @return номер квартири
     */
    public int GetApartmentNumber() {return apartmentNumber;}

    /**
     * Повертає площу квартири.
     * @return площа (кв. м)
     */
    public double GetArea() {return area;}

    /**
     * Повертає поверх, на якому знаходиться квартира.
     * @return номер поверху
     */
    public int GetFloor() {return floor;}

    /**
     * Повертає кількість кімнат у квартирі.
     * @return кількість кімнат
     */
    public int GetNumberOfRooms() {return numberOfRooms;}

    /**
     * Повертає назву вулиці.
     * @return вулиця
     */
    public String GetStreet() {return street;}

    /**
     * Повертає рядкове представлення квартири з усіма характеристиками.
     * @return текст з даними про квартиру
     */
    public String ToString() {
        return WHITE + "\nДані квартири по " + "Id: " + RESET + id +
                WHITE + "\n\tКвартира: " + RESET + "№"+ apartmentNumber +
                WHITE + "\n\tПлоща: " + RESET + area + "кв." +
                WHITE + "\n\tПоверх: " + RESET + floor +
                WHITE + "\n\tКількість кімнат: " + RESET + numberOfRooms +
                WHITE + "\n\tВулиця: " + RESET + street;
    }
}
