package com.pranav.TestPractice.oops;

public class Student {
    private String name;
    private int rollNo;
    private int physics;
    private int chemistry;
    private int maths;

    public Student(String name, int rollNo, int physics, int chemistry, int maths) {
        this.name = name;
        this.rollNo = rollNo;
        this.physics = physics;
        this.chemistry = chemistry;
        this.maths = maths;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", physics=" + physics +
                ", chemistry=" + chemistry +
                ", maths=" + maths +
                '}';
    }
}
