package models;

public class Carro extends Veiculo {
    private int Qtdportas;

    public Carro (){}

    public Carro(int qtdportas) {
        Qtdportas = qtdportas;
    }

    public Carro(String marca, String modelo, int ano, int qtdportas) {
        super(marca, modelo, ano);
        Qtdportas = qtdportas;
    }

    public int getQtdportas() {
        return Qtdportas;
    }

    public void setQtdportas(int qtdportas) {
        Qtdportas = qtdportas;
    }

    @Override
    public void Acelerar(){
        System.out.println("O carro"+ super.getModelo() +"Está acelerando...");
    }

    @Override
    public void Frear(){
        System.out.println("O carro"+ super.getModelo() +"Está freando...");
    }

    public void Abrirportas(){
        System.out.println("Abrindo as" + Qtdportas + "portas do" + super.getModelo());
    }


}
