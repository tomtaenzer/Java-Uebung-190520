package de.neuefische.objects.model;

import java.util.Objects;

public class Student {

    private String flagColor;
    private boolean single;
    private int fails;

    public Student(String flagColor, boolean single, int fails){
        this.flagColor = flagColor;
        this.single = single;
        this.fails = fails;
    }

    public String getFlagColor(){
        return this.flagColor;
    }

    public void setFlagColor(String flagColor){
        this.flagColor = flagColor;
    }

    public boolean isSingle() {
        return single;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }

    public int getFails() {
        return fails;
    }

    public void setFails(int fails) {
        this.fails = fails;
    }


    @Override
    public String toString() {
        return "Student{" +
                "flagColor='" + flagColor + '\'' +
                ", single=" + single +
                ", fails=" + fails +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return single == student.single &&
                fails == student.fails &&
                Objects.equals(flagColor, student.flagColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flagColor, single, fails);
    }
}
