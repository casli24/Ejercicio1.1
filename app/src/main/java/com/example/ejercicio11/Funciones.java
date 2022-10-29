package com.example.ejercicio11;

public class Funciones  {
    private Integer num1;
    private Integer num2;
    private Integer sum;
    private Integer rest;
    private Integer multi;
    private Integer div;

    public Funciones(int i, int parseInt){

    }

    public Funciones(Integer a, Integer b, Integer sum, Integer rest, Integer multi, Integer div){
        this.num1 = a;
        this.num2 = b;
    }

    public Integer getNum1(){
        return num1;
    }

    public void setNum1(Integer n1){
        this.num1 = n1;
    }

    public Integer getNum2(){
        return num2;
    }

    public void setNum2(Integer n2){
        this.num2 = n2;
    }

    public Integer suma (Integer a, Integer b){
        return sum = a + b;
    }

    public Integer resta (Integer a, Integer b){
        return rest = a - b;
    }

    public Integer multiplicacion (Integer a, Integer b){
        return multi = a * b;
    }

    public Integer division (Integer a, Integer b){
        return div = a / b;
    }
}