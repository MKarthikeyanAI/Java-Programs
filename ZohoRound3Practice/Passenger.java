package ZohoRound3Practice;

public class Passenger {
    private static int idProvider = 0;
    private int id;
    private String name;
    private int age;
    private int seatnumber;
    private char preference;
    private String ticketType;

    Passenger(String name,int age,char preference){
        this.id = ++idProvider;
        this.name = name;
        this.age = age;
        this.preference = preference;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        Passenger.idProvider = id;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public int getSeatnumber(){
        return seatnumber;
    }
    public void setSeatnumber(int seatnumber){
        this.seatnumber=seatnumber;
    }
    public char getPreference(){
        return preference;
    }
    public void setPreference(char preference){
        this.preference = preference;
    }

    public String getTicketType(){
        return ticketType;
    }

    public void setTicketType(String ticketType){
        this.ticketType=ticketType;
    }
    @Override
    public String toString(){
        return "id: "+id+"\nname: "+name+"\npreference: "+preference+"\nTicketType: "+ticketType;
    }
}
