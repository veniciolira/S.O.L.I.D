package Main;

import Model.*;

public class Main {
    public static void main(String[] args) {

        Endereco cliente1end = new Endereco(983692308,"58900-000","PB","Cajazeiras","Bela Vista",
                "Antonio Pessoa de Abreu","Casa");

        Contato cliente1Cont = new Contato(983692308,"83991984088",
                "venicioliracontato@gmail.com");
        Sexo client1sex = new Sexo(983692308,"Gay");

        Cliente cliente1 = new Cliente(983692308, cliente1Cont, cliente1end,true,"18/05/2015");

        System.out.println(cliente1);


        Endereco cliente2end = new Endereco(579100565,"58900-000","PB","Cajazeiras","Centro",
                "Tenente Arsenio de Araruna","AP");
        Contato cliente2contato = new Contato(579100565, "83991732664",
                "matheuslira@gmail.com");
        Sexo cliente2sex = new Sexo(579100565,"Hetero");
        Cliente cliente2 = new Cliente(579100565,cliente2contato,cliente2end,true,"14/07/2005");

        System.out.println(cliente2);

        Endereco cliente3end = new Endereco(747820258,"58900-000","PB","Cajazeiras",
                "Centro","Souza Assis","Casa");

        Contato cliente3contato = new Contato(747820258,"83991854670",
                "matheuscz@hotmail.com");
        IndicadorInscricaoEstadual cliente3inscricao = new IndicadorInscricaoEstadual(747820258,
                "1008716883085223");
        Sexo cliente3sex = new Sexo(747820258,"Hetero");
        Cliente cliente3 = new Cliente(747020258,cliente3contato,cliente3end,true,
                "18/09/2009");

        System.out.println(cliente3);


    }
}