package model;

public class Nurse extends User{

    private String speciallity;

    public Nurse(String name, String email) {
        super(name, email);
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz Verde");
        System.out.println("Departamento: Pediatria");
    }

    public String getSpeciallity() {
        return speciallity;
    }

    public void setSpeciallity(String speciallity) {
        this.speciallity = speciallity;
    }
}
