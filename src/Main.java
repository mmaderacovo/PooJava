import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
              //showMenu();

        Doctor myDoctor = new Doctor("Alejandra Madera", "Neurology");
        myDoctor.addAvailableAppointment(new Date(), "4am");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "11am");

        System.out.println(myDoctor);

        User user = new Doctor("Juan Quiroga","juan@juan");
        user.showDataUser();

        User userPa = new Patient("Laury","Laury@laury");
        userPa.showDataUser();

        User user1 = new User("Mafe","mafe@mafe") {
            @Override
            public void showDataUser() {
                System.out.println("\nPsicologa");
                System.out.println("Institucion: UPB");
                System.out.println("Consejeria");
            }
        };

        user1.showDataUser();

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