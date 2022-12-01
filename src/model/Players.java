package model;

public class Players {
    public Players(String name, int id, int age, int rating) {
        Name = name;
        Id = id;
        Age = age;
        Rating = rating;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int rating) {
        Rating = rating;
    }

    String Name;
    int Id;
    int Age;
    int Rating;

    public void format(){
        String format= "Name    "+"Id    "+"Age    "+"Rating";
        String value= this.Name+"   "+this.Id+"   "+this.Age+"   "+this.Rating+"   ";
        System.out.println(format);
        System.out.println(value);
    }
}
