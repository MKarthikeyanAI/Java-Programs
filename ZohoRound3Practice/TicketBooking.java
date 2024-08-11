package ZohoRound3Practice;
import java.util.*;
public class TicketBooking {
    private static int berthlimit = 3/3;

    private static int upperseatnumber = 1;
    private static int middleseatnumber=2;
    private static int lowerseatnumber=3;

    private static int raclimit = 1;
    private static int waitlistlimit=1;

    static ArrayList<Passenger> upperlist = new ArrayList<>();
    static ArrayList<Passenger> middlelist = new ArrayList<>();
    static ArrayList<Passenger> lowerlist = new ArrayList<>();

    static ArrayList<Passenger> confirmedlist = new ArrayList<Passenger>();

    static Queue<Passenger> racqueue = new LinkedList<>();
    static Queue<Passenger> waitlistqueue = new LinkedList<>();

    public static void bookTicket(Passenger p){

        if(upperlist.size() == berthlimit && middlelist.size() == berthlimit && lowerlist.size() == berthlimit){
            if(updateRACqueue(p)){
                System.out.println("No Ticket is Available.So Your Ticket is Added to RAC: "+p.getId());
            }
            else if (updateWaitingqueue(p)) {
                System.out.println("No Ticket is Available.So Your Ticket is Added to Waiting List: "+p.getId());
            }
            else{
                p.setId(p.getId()-1);
                System.out.println("No Tickets Available!!!");
            }
        }
        else if(checkAvailability(p)){
            System.out.println("Ticket is Booked Successfully!!!\nAnd your Ticket id is "+p.getId());
            p.setTicketType("berth");
            confirmedlist.add(p);
        }
        else {
            System.out.println("Your Preferred Ticket is not Available: ");
            p.setId(p.getId()-1);
            availablelist();
        }
    }
    public static void availablelist(){
        System.out.println("UpperLimit Seats: "+(berthlimit - upperlist.size()));
        System.out.println("Middlelimit Seats: "+(berthlimit - middlelist.size()));
        System.out.println("Lowerlimit Seats: "+(berthlimit - lowerlist.size()));
    }
    private static boolean checkAvailability(Passenger p){
        Map<Integer,Character> map = TicketCanceling.getSeatNumberwithBerth();

        if(p.getPreference() == 'U'){
            if(upperlist.size() < berthlimit){
                if(!map.isEmpty()){
                    for(Map.Entry<Integer,Character> m : map.entrySet()){
                        if(m.getValue() == p.getPreference()){
                            int seatno = m.getKey();
                            p.setSeatnumber(seatno);
                            map.remove(seatno);
                            break;
                        }
                    }
//                    getseatdetails(map,p);
                }
                else{
                    p.setSeatnumber(upperseatnumber);
                    upperseatnumber+=3;
                }
                upperlist.add(p);
                return true;
            }
        }

        else if (p.getPreference()=='M') {
            if(middlelist.size()< berthlimit  ){
                if(!map.isEmpty()){
                    getseatdetails(map,p);
                }
                else{
                    p.setSeatnumber(middleseatnumber);
                    middleseatnumber+=3;
                }
                middlelist.add(p);
                return true;
            }

        }
        else{
            if(lowerlist.size()<berthlimit ){
                if(!map.isEmpty()){
                    getseatdetails(map,p);
                }
                else{
                    p.setSeatnumber(lowerseatnumber);
                    lowerseatnumber+=3;
                }
                lowerlist.add(p);
                return true;
            }
        }
        return false;
    }
    public static void getseatdetails(Map<Integer,Character> map,Passenger p){
        int seatnumber = checkprefAvail(map,p.getPreference());
        p.setSeatnumber(seatnumber);
        map.remove(seatnumber);

    }
    public static int checkprefAvail(Map<Integer,Character> map,char pref){
        int seat = 0;
        for(Map.Entry<Integer,Character> m:map.entrySet()){
            if(pref == (char) m.getValue()){
                seat = (int) m.getKey();
                break;
            }
        }
        return seat;
    }
    private static boolean updateRACqueue(Passenger p){
        if(racqueue.size() < raclimit){
            p.setTicketType("rac");
            racqueue.add(p);
            return true;
        }
        return false;
    }

    private static boolean updateWaitingqueue(Passenger p){
        if(waitlistqueue.size() < waitlistlimit){
            p.setTicketType("waitinglist");
            waitlistqueue.add(p);
            return true;
        }
        return false;
    }

    public static void displayallconfirmedseats(){
        if(!confirmedlist.isEmpty()){
            for(Passenger s:confirmedlist){
                System.out.println(s.toString());
            }
        }
        else{
            System.out.println("All the Seats are Empty...");
        }
    }
    public static void displayracseats(){
        if(!racqueue.isEmpty()){
            for(Passenger s:racqueue){
                System.out.println(s.toString());
            }
        }
        else{
            System.out.println("All the Seats are Empty...");
        }
    }
    public static void displaywaitinglistseats(){
        if(!waitlistqueue.isEmpty()){
            for(Passenger s:waitlistqueue){
                System.out.println(s.toString());
            }
        }
        else{
            System.out.println("All the Seats are Empty...");
        }
    }


}
