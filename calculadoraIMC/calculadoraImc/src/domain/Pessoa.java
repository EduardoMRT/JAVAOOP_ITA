package domain;

public class Pessoa {
    String name;
    int age;
    double peso;

    double altura;

    private double imc;

    public Pessoa(String name, int age, double peso, double altura) {
        this.name = name;
        this.age = age;
        this.peso = peso;
        this.altura = altura;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public double getImc() {
        return imc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

}
