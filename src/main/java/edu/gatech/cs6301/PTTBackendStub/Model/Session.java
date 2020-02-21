package edu.gatech.cs6301.PTTBackendStub.Model;

public class Session {
    private int id;
    private String startTime;
    private String endTime;
    int counter;

    public Session() {
    }

    public Session(int id, String startTime, String endTime, int counter) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
