import java.util.Scanner;
import java.util.ArrayList;


class Bandas{
Scanner scan=new Scanner(System.in);
private int numeroDeEntradas;
ArrayList<String> listaDeBandas =new ArrayList <String>();

//Metodo setter de número de entradas
void setNumeroDeEntradas(){
    System.out.print("Digite o número de bandas que deseja adicionar a lista de bandas: ");
    this.numeroDeEntradas= scan.nextInt();
    scan.nextLine();
}

//Metodo que registrará e adicionará os nomes das bandas ao sistema
void adicionarBandas(){
    for(int i=0; i<this.numeroDeEntradas;i++){
        System.out.print("Digite o nome da "+(i+1)+"º banda que deseja adicionar: ");
        String bandaAdicionada=scan.nextLine();
        listaDeBandas.add(bandaAdicionada);
    }
}

//Metodo que da um print da lista de bandas
void mostrarListaDeBandas(){
    System.out.println("\n\n\n\n");
    for(int i=0; i<this.numeroDeEntradas;i++){
        System.out.println(listaDeBandas.get(i));
    }
    System.out.println("\n\n\n\n");
}

}

public class ListaExercicios{
    public static void main(String[] args){
        Bandas bandas = new Bandas();
        bandas.setNumeroDeEntradas();
        bandas.adicionarBandas();
        bandas.mostrarListaDeBandas();
    }
}
