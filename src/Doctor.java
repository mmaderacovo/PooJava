import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
 private String speciality;

    Doctor(String name,String email){
        super(name, email);
        System.out.println("El nombre del doctor asignado es: "+ name);

        this.speciality=speciality;
    }

    ArrayList<AvailableAppointments> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
      availableAppointments.add(new AvailableAppointments(date,time));
    }
    public ArrayList<AvailableAppointments> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSpeciality: "+speciality+"\nAvaliable: "+ availableAppointments.toString();
    }

    public static class AvailableAppointments{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointments(Date date, String time) {
            this.date = date;
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
