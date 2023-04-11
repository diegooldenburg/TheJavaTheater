public class Seat {
    private int row;
    private int seatNumber;
    private boolean isTaken;

    public Seat(int row, int seatNumber) {
        this.row = row;
        this.seatNumber = seatNumber;
        this.isTaken = false;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isTaken() {
        return isTaken;
    }

    public void setTaken(boolean taken) {
        isTaken = taken;
    }
}