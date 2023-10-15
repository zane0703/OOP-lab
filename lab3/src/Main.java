import java.util.Scanner;

public class Main {
    private static Scanner input;
    private static Plane plane;
    public static void main(String[] args) {
        input =  new Scanner(System.in);
        plane = new Plane();
        int choice;
        do {
            System.out.println("(1) Show number of empty seats");
            System.out.println("(2) Show the list of empty seats");
            System.out.println("(3) Show the list of seat assignments by seat ID");
            System.out.println("(4) Show the list of seat assignments by customer ID");
            System.out.println("(5) Assign a customer to a seat");
            System.out.println("(6) Remove a seat assignment");
            System.out.print(" Enter the number of your choice");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    showNumEmptySeat();
                    break;
                case 2:
                    listEmptySeat();
                    break;
                case 3:
                    listAssignBySeatId();
                    break;
                case 4:
                    listAssignByCustomerID();
                    break;
                case 5:
                    assignSeat();
                    break;
                case 6:
                    removeSeat();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Invalid input!");

            }

        }while (choice != 7);

    }
    public static void showNumEmptySeat() {
        plane.showNumEmptySeats();
    }
    public static void listEmptySeat() {
        plane.showEmptySeats();
    }

    public static void listAssignBySeatId() {
        plane.showAssignedSeats(true);
    }
    public static void listAssignByCustomerID() {
        plane.showAssignedSeats(false);
    }
    public static void assignSeat() {
        System.out.println("Assigning Seat");

        do {
            System.out.print("Please enter SeatID:");
            int seatID = input.nextInt();
            if (seatID > 12 || seatID < 1 ) {
                System.out.println("Invalid input 1-12 only.");
                continue;
            }
            System.out.print("please enter Customer ID:");
            int custID = input.nextInt();
            try {
                plane.assignSeat(seatID, custID);
                System.out.println("Seat Assigned!");
            } catch (Plane.SeatNotFoundException ex) {
                System.out.println("Seat not found please reenter seat");
                continue;
            }
            break;
        }while(true);

    }
    public static void removeSeat() {
        System.out.print("Enter SeatID to unassign customer from:");
        int seatID = input.nextInt();
        try {
            plane.unAssignSeat(seatID);
        } catch (Plane.SeatNotFoundException ex) {
            System.out.println("Seat not found");
        }
    }

}