package homework_6.hospital;

public class Therapist implements Doctor {
    @Override
    public void treat() {
        System.out.println("Лечит терапевт");
    }

    public void appointDoctor(String cod) {
        if ("1".equalsIgnoreCase(cod)) {
            Surgeon surgeon = new Surgeon();
            System.out.println("Назначить хирурга");
            surgeon.treat();
        } else if ("2".equalsIgnoreCase(cod)) {
            Dentist dentist = new Dentist();
            System.out.println("Назначить дантиста");
            dentist.treat();
        } else {
            Therapist therapist = new Therapist();
            System.out.println("Назначить терапевта");
            therapist.treat();
        }
    }
}
