/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabanco;

/**
 *
 * @author Ewerton
 */
public final class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(int numConta, String dono) {
        this.setNumConta(numConta);
        this.setDono(dono);
        this.setStatus(false);
        this.setSaldo(0);

    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.status = true;
        if ("CC".equals(this.tipo)) {
            this.setSaldo(50);
        } else if ("CP".equals(this.tipo)) {
            this.setSaldo(150);
        }
    }

    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.saldo < 0) {
            System.out.println("Conta em débito");
        } else {
            this.status = false;
        }
    }

    public void depositar(float x) {
        if (this.isStatus()) {
            this.setSaldo((int) (this.getSaldo() + x));
        } else {
            System.out.println("A conta está fechada");
        }
    }

    public void sacar(float x) {
        if (this.isStatus()) {
            if (this.getSaldo() >= x) {
                this.setSaldo((int) (this.getSaldo() - x));
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("A conta está fechada");
        }
    }

    public void pagarMensal() {
        float x = 0;
        if ("CC".equals(this.tipo)) {
            x = 12;
        } else if ("CP".equals(this.tipo)) {
            x = 20;
        }
        if (this.isStatus()) {
            if (this.getSaldo() >= x) {
                this.setSaldo((int) (this.getSaldo() - x));
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("A conta está fechada");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
