/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caneta;

/**
 *
 * @author Ewerton
 */
public final class Caneta {

    private String modelo;
    protected String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta, int carga) {
        this.setModelo(modelo);
        this.setCor(cor);
        this.setPonta(ponta);
        this.setCarga(carga);
        this.tampar();
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar!");
        } else {
            System.out.println("Estou rabiscando...");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void status() {
        System.out.println("Eu tenho uma caneta "
                + this.getModelo() + ", "
                + this.getCor() + ", ponta "
                + this.getPonta() + ", com "
                + this.getCarga() + "% de carga!");
    }
}
