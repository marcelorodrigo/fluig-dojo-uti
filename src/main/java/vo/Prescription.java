package vo;

public class Prescription {

    private Medicine medicine;
    private double dose;
    private boolean alarm;

    public Medicine getMedicine() {
        return medicine;
    }

    public Prescription setMedicine(Medicine medicine) {
        this.medicine = medicine;
        return this;
    }

    public double getDose() {
        return dose;
    }

    public Prescription setDose(double dose) {
        this.dose = dose;
        return this;
    }

    public boolean isAlarm() {
        return alarm;
    }

    public Prescription setAlarm(boolean alarm) {
        this.alarm = alarm;
        return this;
    }
}
