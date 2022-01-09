package aula01;

import jdk.swing.interop.SwingInterOpUtils;

public class Caneta {

    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    public Caneta() {
        this.modelo = "Bic";
        this.cor = "Azul";
        this.ponta = 0.7f;
        this.tampar();
    }

    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("MODELO: "+ this.getModelo());
        System.out.println("COR: "+ this.cor);
        System.out.println("PONTA: "+ this.getPonta());
        System.out.println("TAMPADA? "+ this.tampada);
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta() {
        return ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
