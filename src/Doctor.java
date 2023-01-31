import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id=0;
    private String name;
    private String email;
    private String speciality;

    Doctor(){
        System.out.println("Construyendo el objeto Doctor");

    }

    Doctor(String name,String speciality){
        System.out.println("El nombre del doctor asignado es: "+ name);
        id++;
        this.name=name;
        this.speciality=speciality;
    }
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

    ArrayList<AvailableAppointments> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
      availableAppointments.add(new AvailableAppointments(date,time));
    }
    public ArrayList<AvailableAppointments> getAvailableAppointments(){
        return availableAppointments;
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
    }

}
