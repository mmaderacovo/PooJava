public class Patient {
    int id;
    private String name;
    private String email, address, birthday, phoneNumber, typeOfBlood;
    private double weight,height;

    Patient(String name, String email){
        this.name=name;
        this.email=email;
    }
        public void setWeight (double weight){
        this.weight= weight;
    }

    public String getWeight() {
        return this.weight + "Kg.";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
}
