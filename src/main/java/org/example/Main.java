package org.example;

import dao.AnotacaoDAO;
import dao.CategoriaDAO;
import dao.DBConnection;
import dao.LembreteDAO;
import model.Anotacao;
import model.Categoria;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main extends Anotacao{
    public static void main(String[] args) throws SQLException {

        CategoriaDAO dao = new CategoriaDAO();
        AnotacaoDAO ldoa =new AnotacaoDAO();

        int opcao;
        int ident;
        String title;
        String cont;
        String dat;
        int cat;
        String novaAnotacao;


        Scanner sc = new Scanner(System.in);


//        dao.insert("LAZER");
        do {
            System.out.println("[1] - Adicionar anotação");
            System.out.println("[2] - Remover anotação");
            System.out.println("[3] - Atualizar anotação");
            System.out.println("[4] - Visualizar anotação");
            System.out.println("[0] - Para sair");
            opcao = sc.nextInt();

            if(opcao == 1){
                AnotacaoDAO anotacaoDAO = new AnotacaoDAO();
                System.out.println("Escreva o titulo da nota: ");
//              String titulo = sc.nextLine();
                title = sc.next();
                System.out.println("Escreva o conteudo da nota: ");
                cont = sc.next();
                System.out.println("Escreva a data da nota: ");
                dat = sc.next();
                System.out.println("Escreva a categoria da nota: \n1- Casa \n2- Trabalho \n3- Estudo \n4 -Viagem \n5- Lazer");
                cat = sc.nextInt();
                System.out.println("Sua nota foi Salva");

                ldoa.Inserir("" + title,"" +cont,""+dat,""+cat);


            }
            else if (opcao == 2){
                AnotacaoDAO anotacaoDAO = new AnotacaoDAO();

                System.out.println("Qual id deseja deletar ?: ");
                ident = sc.nextInt();
                ldoa.delete(""+ident);
                System.out.println("o id " +ident +" foi deletado!");



            }
            if (opcao == 3){
                AnotacaoDAO anotacaoDAO = new AnotacaoDAO();

                System.out.println("Escreva o novo titulo da nota: ");
                title = sc.next();
                System.out.println("Escreva o novo conteudo da nota: ");
                cont = sc.next();
                System.out.println("Escreva a nova data da nota: ");
                dat = sc.next();
                System.out.println("Escreva a nova categoria da nota: \n1- Casa \n2- Trabalho \n3- Estudo \n4 -Viagem \n5- Lazer");
                cat = sc.nextInt();
                System.out.println("Digite o id da anotação que deseja atualizar: ");
                ident = sc.nextInt();


                ldoa.update("" +title,""+cont,""+dat,""+cat,""+ident);
            }


            if(opcao == 4){
//                AnotacaoDAO anotacaoDAO = new AnotacaoDAO();
//                List<Anotacao> anotacao = anotacaoDAO.listar();
//                for (Anotacao a:anotacao) {
//                    System.out.println(a);
//               }
                ldoa= new AnotacaoDAO();
                List<Anotacao> anotacao = ldoa.listar();
                for (Anotacao a:anotacao) {
                   System.out.println(a);
               }
            }


        }while(opcao != 0);

        System.out.println("Fechando anotações");

        }

}