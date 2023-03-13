package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

 private String speciality;

    public Doctor(String name,String email){
        super(name, email);
    }

    ArrayList<AvailableAppointments> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(String  date, String time){


      availableAppointments.add(new AvailableAppointments(date,time));
    }
    public ArrayList<AvailableAppointments> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSpeciality: "+speciality+"\nAvaliable: "+ availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Crux Roja");
        System.out.println("Departamento: Cancerologia");
    }

    public static class AvailableAppointments{
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");

        public AvailableAppointments(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }
        public String getDate(String DATE){
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Avaliable Appoiments \n Date: "+date+"\nTime: "+time;
        }
    }

}
