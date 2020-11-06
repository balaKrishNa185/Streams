package com.map;

public class Staff {

    private int id;
    private double sal;
    private double avg;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", sal=" + sal +
                ", avg=" + avg +
                '}';
    }
}
