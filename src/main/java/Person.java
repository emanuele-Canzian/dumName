public class Person {

    //Variabeln
    private String name;
    private int age;
    private boolean pet;


    //Konsturktor
    public Person(){
        this.name = "Sla";
        this.pet = true;
    }

    //Getter Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPet() {
        return pet;
    }

    public void setPet(boolean pet) {
        this.pet = pet;
    }



}
