package house;

public class House {
    public static final String RESET = "\u001B[0m";
    public static final String WHITE = "\u001B[37m";

    private int id; ///id
    private int apartmentNumber; /// Номер квартири
    private int area; /// Площа квартири
    private int floor; /// поверх
    private int numberOfRooms; /// Кількість кімнат
    private String street; /// вулиця

    public House(){}

    public House(int id, int apartmentNumber, int area, int floor, int numberOfRooms, String street) {
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.area = area;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.street = street;
    }


    public void SetId(int id){this.id = id;}
    public void SetApartmentNumber(int apartmentNumber){this.apartmentNumber = apartmentNumber;}
    public void SetArea(int area){this.area = area;}
    public void SetFloor(int floor){this.floor = floor;}
    public void SetNumberOfRooms(int numberOfRooms){this.numberOfRooms = numberOfRooms;}
    public void SetStreet(String street){this.street = street;}

    public int GetId() {return id;}
    public int GetApartmentNumber() {return apartmentNumber;}
    public int GetArea() {return area;}
    public int GetFloor() {return floor;}
    public int GetNumberOfRooms() {return numberOfRooms;}
    public String street() {return street;}

    public String ToString() {
        return WHITE + "Дані квартири по " + "Id: " + RESET + id +
                WHITE + "\n\tКвартира: " + RESET + "№"+ apartmentNumber +
                WHITE + "\n\tПлоща: " + RESET + area + "кв." +
                WHITE + "\n\tПоверх: " + RESET + floor +
                WHITE + "\n\tКількість кімнат: " + RESET + numberOfRooms +
                WHITE + "\n\tВулиця: " + RESET + street;
    }
}
