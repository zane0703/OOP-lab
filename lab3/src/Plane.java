import java.util.Arrays;
import java.util.Comparator;

public class Plane {
    private PlaneSeat[] seats;
    private int numEmptySeat;
    public Plane() {
        this.seats = new PlaneSeat[12];
        this.numEmptySeat = 12;
        for (int i = 0; i < 12; ) {
            this.seats[i] = new PlaneSeat(++i);
        }
    }

    public PlaneSeat[] sortSeats() {
        PlaneSeat[] seats2 = Arrays.copyOf(this.seats, 12);
        Arrays.sort(seats2, Comparator.comparingInt(PlaneSeat::getCustomerID));
        return seats2;
    }
    public void showNumEmptySeats() {
//        int num = 0;
//        for (PlaneSeat seat: this.seats)  {
//            if (!seat.isOccupied()) ++num;
//        }
        System.out.println("There are "+numEmptySeat+" empty seats\r\n");

    }
    public void showEmptySeats() {
        System.out.println("The following seats are empty:");
        //boolean isFull = true;
        if (numEmptySeat <1) {
            System.out.println("all Occupied!");
            return;
        }
        for (PlaneSeat seat: this.seats)  {
            if (seat.isOccupied()) continue;
            //isFull = false;
            System.out.print("SeatID ");
            System.out.println(seat.getSeatID());
        }
//        if (isFull) {
//
//        }
    }
    public void showAssignedSeats(boolean bySeatId) {
        PlaneSeat[] seats2;
        if (numEmptySeat >11) {
            System.out.println("no Occupied seat!");
        }
        if (bySeatId) {
            seats2 = this.seats;
        } else {
            seats2 = sortSeats();
        }
        System.out.println("The seat assignments are as follow:");
        boolean isEmptySeat = true;
        for (PlaneSeat seat: seats2) {
            if (!seat.isOccupied()) continue;
            isEmptySeat = false;
            System.out.println("SeatID "+seat.getSeatID()+" assigned to CustomerID "+seat.getCustomerID()+".");
        }
//        if (isEmptySeat) {
//            System.out.println("no Occupied seat!");
//        }
        System.out.println();
    }
    public void assignSeat(int seatId, int cust_id) throws SeatNotFoundException {
        for (PlaneSeat seat: this.seats) {
            if(seat.getSeatID() == seatId) {
                if (seat.isOccupied()) {
                    System.out.println("Seat already assigned to a customer.");
                    return;
                }

                seat.assign(cust_id);
                --numEmptySeat;
                return;
            }
        }
        throw new SeatNotFoundException();
    }
    public void unAssignSeat(int seatId) throws SeatNotFoundException {
        for (PlaneSeat seat: this.seats) {
            if(seat.getSeatID() == seatId) {

                seat.unAssign();
                ++numEmptySeat;
                return;
            }
        }
        throw new SeatNotFoundException();
    }

    public static class SeatNotFoundException extends Exception {

    }
}
