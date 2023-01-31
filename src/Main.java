import java.util.Date;

import static ui.UIMenu.*;
public class Main {
    public static void main(String[] args) {
              //showMenu();

        Doctor myDoctor = new Doctor("Angelica Madera", "Neurology");
        myDoctor.addAvailableAppointment(new Date(), "4am");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "11am");

        for (Doctor.AvailableAppointments aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate()+" "+ aA.getTime());
        }


        /*Patient patient = new Patient("Carolina","caro@gmail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());*/

    }
}