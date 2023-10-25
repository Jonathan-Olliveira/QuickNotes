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
        String es;

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
                System.out.println("Escreva a role: ");
                String titulo = sc.nextLine();
                es = sc.next();
                System.out.println("Você digitou: " + es);

                ldoa.Inserir("loop","source","2023/10/23","2");


            }
            else if (opcao == 2){
                AnotacaoDAO anotacaoDAO = new AnotacaoDAO();
                int id;

                System.out.println("Quak id deseja deletar ?: ");
                sc.nextLine();
                id = sc.nextInt();



            }
            if (opcao == 3){
                AnotacaoDAO anotacaoDAO = new AnotacaoDAO();
                String novaAnotacao;
                int id;

                System.out.println("Digite o texto que deseja atualizar: ");
                novaAnotacao = sc.nextLine();
                System.out.println("Digite o ID: ");
                id = sc.nextInt();

                ldoa.update("Estudo","SQL","2023/10/24","2");
            }


            if(opcao == 4){
//                AnotacaoDAO anotacaoDAO = new AnotacaoDAO();
//                List<Anotacao> anotacao = anotacaoDAO.listar();
//                for (Anotacao a:anotacao) {
//                    System.out.println(a);
//                }
//                ldoa= new AnotacaoDAO();
//                List<Anotacao> anotacao = ldoa.listar();
//                for (Anotacao a:anotacao) {
//                    System.out.println(a);
//                }
            }


        }while(opcao != 0);

//       List<Categoria> categorias =  dao.findAll();
//        for (int i = 0; i < categorias.size(); i++) {
//            System.out.println(categorias.get(i));
//        }

        AnotacaoDAO anotacaoDAO = new AnotacaoDAO();
        List<Anotacao> anotacao = anotacaoDAO.listar();
        for (Anotacao a:anotacao) {
            System.out.println(a);
        }
    }
}