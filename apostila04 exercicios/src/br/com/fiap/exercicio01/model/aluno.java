package br.com.fiap.exercicio01.model;

public class aluno {


    public String nome;
    public double cp1, cp2 , gs, sprint1, sprint2;


    public double calcularMedia(){
        double media = ((cp1 + cp2)/2)*0.2 + gs + (sprint1 + sprint2)/2*0.2;
        return media;
    }
}