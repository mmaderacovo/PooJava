package model;

public class Patient extends User {
    private String birthday;
    private String typeOfBlood;
    private double weight;
    private double height;

    public Patient(String name, String email){
        super(name, email);
    }
    public void setWeight (double weight){
        this.weight= weight;
    }

    public String getWeight() {
        return this.weight + "Kg.";
    }
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getTypeOfBlood() {
        return typeOfBlood;
    }

    public void setTypeOfBlood(String typeOfBlood) {
        this.typeOfBlood = typeOfBlood;
    }

    public String getHeight() {
        return this.height+"Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() +"\nAge: "+birthday+"\nWight: "+getWeight()+
                "\nHeight: "+ getHeight()+"\nBlood: "+typeOfBlood;
    }
}
