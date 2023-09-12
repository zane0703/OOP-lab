public class PlaneSeat {
    final private int seatId;
    private boolean assigned;
    private int customerId;

    public PlaneSeat(int seat_id) {
        this.seatId = seat_id;
        this.assigned = false;
    }

    public int getSeatID() {
        return seatId;
    }
    public int getCustomerID() {
        return customerId;
    }
    public boolean isOccupied(){
        return  assigned;
    }
    public void assign(int cust_id) {
        assigned = true;
        customerId = cust_id;
    }
    public void unAssign() {
        assigned = false;
    }

}
