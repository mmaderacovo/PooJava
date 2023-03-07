import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
              //showMenu();

        Doctor myDoctor = new Doctor("Angelica Madera", "Neurology");
        myDoctor.addAvailableAppointment(new Date(), "4am");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "11am");

        System.out.println(myDoctor);

        User user = new Doctor("Juan Quiroga","juan@juan");
        user.showDataUser();

        /*

        for (model.Doctor.AvailableAppointments aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate()+" "+ aA.getTime());
        }*/

        /*Patient patient = new Patient("Carolina","caro@gmail.com");
        patient.setWeight(54.6);
        patient.setPhoneNumber("12345678");
        System.out.println(patient);*/
    }
}