package com.tool.calculator;

public class Division implements IDivision {
    private double num1;
    private double num2;
    private double resp;

    public double getNum1() {
        return this.num1;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double getNum2() {
        return this.num2;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    public double getResp() {
        return this.resp;
    }
    protected void setResp(double resp) {
        this.resp = resp;
    }
    public void calcResp() {
        this.resp = getNum1() / getNum2() != 0 ? getNum2() : 1;
    }
    public String toString() {
        return getNum1() + " / " + getNum2() + " = " + getResp();
    }

    public Division(double num1, double num2) {
        setNum1(num1);
        setNum2(num2);
        calcResp();
    }

}
