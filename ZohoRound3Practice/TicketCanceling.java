package ZohoRound3Practice;

import java.util.HashMap;
import java.util.*;


public class TicketCanceling extends TicketBooking{
    static HashMap<Integer,Character> deletedseats = new HashMap<>();

    private static char pref_tracker = '\0';
    private static int seat_tracker = 0;

    public static String canceling(int id){
        for(Passenger p: confirmedlist){
            if(p.getId() == id){
                cancel(p);
                return "success";
            }
        }
        for(Passenger p: racqueue){
            if(p.getId() == id){
                cancel(p);
                return "success";
            }
        }
        for(Passenger p: waitlistqueue){
            if(p.getId() == id){
                cancel(p);
                return "success";
            }
        }
        return "Invalid Id";
    }

    private static void cancel(Passenger p){
        if(p.getTicketType() == "berth"){
            pref_tracker = p.getPreference();
            seat_tracker = p.getSeatnumber();
            deletedseats.put(seat_tracker,pref_tracker);
            deletefromalllist(p);
            addractoberth(racqueue.poll());
            addwaittorac(waitlistqueue.poll());
        } else if (p.getTicketType() == "rac") {
            racqueue.remove();
            addwaittorac(p);
        }
        else {
            waitlistqueue.remove(p);
        }
    }

    private static void addwaittorac(Passenger p){
        if(p!=null){
            p.setTicketType("rac");
            racqueue.add(p);
        }
    }
    private static void addractoberth(Passenger p){
        if(p!=null){
            p.setPreference(pref_tracker);
            p.setSeatnumber(seat_tracker);
            p.setTicketType("berth");
            if(pref_tracker == 'U'){
                upperlist.add(p);
            } else if (pref_tracker == 'M') {
                middlelist.add(p);
            }
            else {
                lowerlist.add(p);
            }
            deletedseats.remove(seat_tracker);
            pref_tracker = '\0';
            seat_tracker=0;
        }
    }
    private static void deletefromalllist(Passenger p){
        confirmedlist.remove(p);
        upperlist.remove(p);
        middlelist.remove(p);
        lowerlist.remove(p);
    }

    public static Map<Integer,Character> getSeatNumberwithBerth(){
        return deletedseats;
    }
}
