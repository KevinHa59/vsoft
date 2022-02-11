package assignment.Assignment10_MovieTickets.pojo;

public class Movie {
    private int Id;
    private String name;
    private String time;
    private int room;

    public Movie(int Id, String name, String time, int room) {
        this.Id = Id;
        this.name = name;
        this.time = time;
        this.room = room;
    }

    public Movie() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int ID) {
        this.Id = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartTime() {
        return time;
    }

    public void setStartTime(String time) {
        this.time = time;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int broom) {
        this.room = broom;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "ID=" + Id +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", room=" + room +
                '}';
    }
}
