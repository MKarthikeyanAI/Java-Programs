package ZohoRound3Practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean loop = true;

        while(loop){
            System.out.println("\nEnter your choice:\n1.Book Tickets(Press 1)\n2.Cancel Tickets(Press 2)\n3.Display Confirmed Tickets(Press 3)\n4.Display RAC Tickets:\n5.Display Waiting List Tickets:");

            Scanner in = new Scanner(System.in);
            int n=in.nextInt();

            switch(n){
                case 1:
                {
                    System.out.println("Enter the name: ");
                    String name = in.next();
                    System.out.println("Enter your age: ");
                    int age = in.nextInt();
                    System.out.println("Enter your preference: (U || M || L): ");
                    char preference = in.next().charAt(0);
                    if(preference == 'U'||preference == 'M'|| preference == 'L'){
                        TicketBooking.bookTicket(new Passenger(name,age,preference));
                    }
                    else {
                        System.out.println("Invalid Berth");
                    }
                    break;
                }


                case 2:
                {
                    System.out.println("Enter your Ticket id: ");
                    int d = in.nextInt();

                    System.out.println(TicketCanceling.canceling(d));
                    break;
                }
                case 3:
                {
                    TicketBooking.displayallconfirmedseats();
                    break;

                }
                case 4:
                {
                    TicketBooking.displayracseats();
                    break;
                }
                case 5:
                {
                    TicketBooking.displaywaitinglistseats();
                    break;
                }
                case 6:{
                    in.close();
                    loop = false;
                    break;
                }
            }
        }
    }
}
