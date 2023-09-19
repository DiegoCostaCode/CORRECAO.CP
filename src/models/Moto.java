package models;

public class Moto extends Veiculo{
    private String tipo;

    public Moto(){}

    public Moto(String tipo) {
        this.tipo = tipo;
    }

    public Moto(String marca, String modelo, int ano, String tipo) {
        super(marca, modelo, ano);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void Acelerar(){
        System.out.println("A moto" + super.getModelo() + "está acelerando...");

    }
    @Override
    public void Frear(){
        System.out.println("A moto" + super.getModelo() + "está freando...");

    }

    public void Empinar(){
        System.out.println("A moto do tipo"+ tipo + "está empinando...");

    }

}
