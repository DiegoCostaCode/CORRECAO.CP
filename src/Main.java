import models.Carro;
import models.Moto;

import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        var continuar = true;
        while(continuar){
            System.out.println("Menu:");
            System.out.println("1.models.Carro:");
            System.out.println("2.models.Moto:");
            System.out.println("3.Sair:");
            var opcao = scanner.nextInt();
            scanner.nextLine();
            if(opcao ==1) {
                System.out.println("Cadastro de carro iniciado");
                var carro = CadastrarCarro();
                carro.Acelerar();
                carro.Abrirportas();
            }
            if(opcao==2) {
                System.out.println("Cadastro de moto iniciado");
                var moto = CadastrarMoto();
                moto.Acelerar();
                moto.Empinar();
            }
            if(opcao == 0){
                break;
            }
        }
    }

    public static void Testarapp(){

    }
    public static Carro CadastrarCarro(){
        var novoCarro = new Carro();
        System.out.println("Marca: ");
        novoCarro.setMarca(scanner.nextLine());

        System.out.println("Modelo: ");
        novoCarro.setMarca(scanner.nextLine());

        System.out.println("Ano: ");
        novoCarro.setAno(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Quantidade de portas: ");
        novoCarro.setQtdportas(scanner.nextInt());
        scanner.nextLine();

        System.out.println("models.Carro cadastrado: " + novoCarro.toString());

        return novoCarro;
    }
    public static Moto CadastrarMoto(){
        var novaMoto = new Moto();

        System.out.println("Marca: ");
        novaMoto.setMarca(scanner.nextLine());

        System.out.println("Modelo: ");
        novaMoto.setMarca(scanner.nextLine());

        System.out.println("Ano: ");
        novaMoto.setAno(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Quantidade de portas: ");
        novaMoto.setTipo(scanner.nextLine());

        System.out.println("models.Carro cadastrado: " + novaMoto.toString());
        return novaMoto;
    }

}