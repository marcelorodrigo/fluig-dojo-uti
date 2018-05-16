package service;

import vo.Medicine;
import vo.Patient;
import vo.Prescription;

public class Hospital {

    public Prescription triad(Patient patient) {
        final Prescription prescription = new Prescription();
        if (patient.getHeartBeat() > 150) {
            prescription.setMedicine(Medicine.CALMANT);
            prescription.setDose(1.5 * patient.getWeight());
            prescription.setAlarm(true);
        } else if (patient.getHeartBeat() > 120) {
            prescription.setMedicine(Medicine.CALMANT);
            prescription.setDose(1 * patient.getWeight());
            prescription.setAlarm(false);
        } else if (patient.getHeartBeat() < 20) {
            prescription.setMedicine(Medicine.ADRENALINE);
            prescription.setDose(1 * patient.getWeight());
            prescription.setAlarm(true);
        } else if (patient.getHeartBeat() < 40) {
            prescription.setMedicine(Medicine.ADRENALINE)
                    .setDose(0.5 * patient.getWeight())
                    .setAlarm(false);
        }

        return prescription;
    }
}
