package homework_6.hospital;

public class Main {
    public static void main(String[] args) {

        Patient patient = new Patient("-1");

        patient.appointDoctor(patient.getTreatmentPlan());
    }
}
