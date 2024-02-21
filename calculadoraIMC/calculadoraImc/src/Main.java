import domain.CalculadoraIMC;
import domain.Pessoa;

public class Main {
    public static void main(String[] args) {
        CalculadoraIMC calculadoraIMC = new CalculadoraIMC();
        Pessoa Eduardo = new Pessoa("Eduardo", 18, 55, 1.70);
        calculadoraIMC.calcularIMC(Eduardo);
        
}