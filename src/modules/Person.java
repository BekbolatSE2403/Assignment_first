package modules;




public class Person {
    String name;
    String surname;
    int age;
    boolean gender;

    public Person(String name, String surname, int age, boolean gender) {
        setName(name);
        setSurname(surname);
        setAge(age);
        setGender(gender);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public boolean isGender(){
        return gender;
    }

    public void setGender(boolean gender){
        this.gender = gender;
    }

    @Override
    public String toString(){
        String genderStr = gender ? "male" : "female";
        return "Hi, I am " + getName() + " " + getSurname() + " , a " + getAge() + " year old,  " + genderStr;
    }
}
