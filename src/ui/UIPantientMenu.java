package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPantientMenu {
    public static void showPatientMenu (){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: "+ UIMenu.patientLogged);
            System.out.println("1. Book an Appointment ");
            System.out.println("2. My appointments");
            System.out.println("0. Logout");

            Scanner sc =new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        }while (response !=0);
    }

    private static void showBookAppointmentMenu(){
       int response = 0;
       do {
           System.out.println("::Book an appointment");
           System.out.println("::Select date ");
           Map<Integer, Map<Integer, Doctor>>doctors = new TreeMap<>();
           int k = 0;
           for (int i = 0; i < UIDoctorMenu.doctorsAvaliableappoiments.size(); i++) {
               ArrayList<Doctor.AvailableAppointments>availableAppointments
                       = UIDoctorMenu.doctorsAvaliableappoiments.get(i).getAvailableAppointments();

               Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

               for (int j = 0; j < availableAppointments.size(); j++) {
                  k++;
                   System.out.println(k+". "+ availableAppointments.get(j).getDate());
                   doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvaliableappoiments.get(i));

                   doctors.put(Integer.valueOf(k), doctorAppointments);
               }
           }
           Scanner sc =new Scanner(System.in);
           int responseDateSelected = Integer.valueOf(sc.nextLine());


       }while (response!= 0);
    }
}
