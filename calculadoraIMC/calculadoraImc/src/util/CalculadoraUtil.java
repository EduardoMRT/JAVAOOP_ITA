//package util;
//
//import domain.CalculadoraIMC;
//import domain.Pessoa;
//
//public class CalculadoraUtil{
//  public String verifica(){
//        CalculadoraIMC calculadoraIMC = new CalculadoraIMC();
//        double imc = calculadoraIMC.getPessoa().getImc();
//
//      System.out.println("IMC:"+imc);
//        if (imc < 16){
//            return "Baixo peso muito grave"+imc;
//        } else if (imc >= 16 && imc <= 16.99) {
//            return "Baixo peso grave";
//        } else if (imc >= 17 && imc <= 18.49) {
//            return "Baixo peso";
//        } else if (imc >= 18.50 && imc <= 24.99) {
//            return "Peso normal";
//        }else if (imc >= 25 && imc <= 29.99) {
//            return "Sobrepeso";
//        }else if (imc >= 30 && imc <= 34.99) {
//            return "Obesidade grau I";
//        }else if (imc >= 35 && imc <= 35.99) {
//            return "Obesidade grau II";
//        }else {
//            return "Obesidade grau III";
//        }
//    }
//
//
//}
