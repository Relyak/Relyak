package com.example.ejemplolivedata;

public class ModelAleatorio {
    private static final double MAX_TIME = 1000;
    private int n;

    public ModelAleatorio(){
        n=0;
    }

    public void generarAleatorio() {
        //tarda en pedir la información
        esperarAleatorio();
        n=(int)(Math.random()*MAX_TIME);
    }
    public int getAleatorio(){
        return n;
    }
    private void esperarAleatorio()  {
        try {
            Thread.sleep((long)(Math.random()*MAX_TIME));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
