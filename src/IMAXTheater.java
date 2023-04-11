public class IMAXTheater extends Theater {
    private boolean isIMAX;

    public IMAXTheater() {
        super("The IMAX", 15, 25);
        this.isIMAX = true;
    }

    public boolean isIMAX() {
        return isIMAX;
    }

    public void setIMAX(boolean IMAX) {
        isIMAX = IMAX;
    }
}
