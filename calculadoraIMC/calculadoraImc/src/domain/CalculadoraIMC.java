package domain;

import java.math.BigDecimal;

public class CalculadoraIMC {

    private double peso;
    private double altura;

    private double imc;
    public double calcularIMC(double peso, double altura){
        this.peso = peso;
        this.altura = altura;

        imc = peso/(altura*altura);
        return  imc;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
}
