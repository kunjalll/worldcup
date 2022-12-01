package model;

public class Team {
    public Team(String name, String jersey_color, String fifa_position) {
        Name = name;
        Jersey_color = jersey_color;
        Fifa_position = fifa_position;
    }

    String Name;
    String Jersey_color;
    String Fifa_position;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getJersey_color() {
        return Jersey_color;
    }

    public void setJersey_color(String jersey_color) {
        Jersey_color = jersey_color;
    }

    public String getFifa_position() {
        return Fifa_position;
    }

    public void setFifa_position(String fifa_position) {
        Fifa_position = fifa_position;
    }
}
