package cbersoftware.dev.calculo_mental.apoio;

import cbersoftware.dev.calculo_mental.model.Calcular_mental_model;

public class Util_calculo_mental extends Calcular_mental_model {

    public Util_calculo_mental(int dificuldade) {
        super(dificuldade);
    }

    @Override
    public String toString() {

        String op;
        if(this.getOperacao() == 0) {

            op = "Somar";

        } else if(this.getOperacao() == 1) {

            op = "Diminuir";

        } else if(this.getOperacao() == 2) {

            op = "Multiplicar";

        } else {

            op = "Operação desconhecida";

        }

        return "Valor 1: " + this.getValor1() +
                "\nValor 2: " + this.getValor2() +
                "\nDificuldade: " + this.getDificuldade() +
                "\nOperação: " + op;
    }

    public boolean somar(int resposta) {

        this.resultado = this.getValor1() + this.getValor2();
        boolean certo = false;

        if(resposta == this.getResultado()) {

            System.out.println("Resposta correta !");
            certo = true;

        } else {

            System.out.println("Resposta errada !");
        }

        System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.getResultado());
        return certo;
    }

    public boolean diminuir(int resposta) {

        this.resultado = this.getValor1() - this.getValor2();
        boolean certo = false;

        if(resposta == this.getResultado()) {

            System.out.println("Resposta correta !");
            certo = true;

        } else {

            System.out.println("Resposta errada !");
        }

        System.out.println(this.getValor1() + " - " + this.getValor2() + " = " + this.getResultado());
        return certo;
    }

    public boolean multiplicar(int resposta) {

        this.resultado = this.getValor1() * this.getValor2();
        boolean certo = false;

        if(resposta == this.getResultado()) {

            System.out.println("Resposta correta !");
            certo = true;

        } else {

            System.out.println("Resposta errada !");
        }

        System.out.println(this.getValor1() + " * " + this.getValor2() + " = " + this.getResultado());
        return certo;
    }
}
