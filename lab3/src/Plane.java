import java.util.Arrays;
import java.util.Comparator;

public class Plane {
    private PlaneSeat[] seats;
    private int numEmptySeat;
    public Plane() {
        this.seats = new PlaneSeat[12];
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
        int num = 0;
        for (PlaneSeat seat: this.seats)  {
            if (!seat.isOccupied()) ++num;
        }
        System.out.println("There are "+num+" empty seats\r\n");

    }
    public void showEmptySeats() {
        System.out.println("The following seats are empty:");
        boolean isFull = true;
        for (PlaneSeat seat: this.seats)  {
            if (seat.isOccupied()) continue;
            isFull = false;
            System.out.print("SeatID ");
            System.out.println(seat.getSeatID());
        }
        if (isFull) {
            System.out.println("all Occupied!");
        }
    }
    public void showAssignedSeats(boolean bySeatId) {
        PlaneSeat[] seats2;
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
        if (isEmptySeat) {
            System.out.println("no Occupied seat!");
        }
        System.out.println();
    }
    public void assignSeat(int seatId, int cust_id) throws SeatNotFoundException {
        for (PlaneSeat seat: this.seats) {
            if(seat.getSeatID() == seatId) {
                seat.assign(cust_id);
                return;
            }
        }
        throw new SeatNotFoundException();
    }
    public void unAssignSeat(int seatId) throws SeatNotFoundException {
        for (PlaneSeat seat: this.seats) {
            if(seat.getSeatID() == seatId) {
                seat.unAssign();
                return;
            }
        }
        throw new SeatNotFoundException();
    }

    public static class SeatNotFoundException extends Exception {

    }
}
