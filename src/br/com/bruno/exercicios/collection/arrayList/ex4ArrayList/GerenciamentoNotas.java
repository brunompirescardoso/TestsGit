package br.com.bruno.exercicios.collection.arrayList.ex4ArrayList;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciamentoNotas {
    static Scanner input = new Scanner(System.in);
    private static List<Aluno> alunos= new ArrayList<>();
    private static boolean ordemDesligamento = false;

    private static Aluno alunoSelecionado;

    public static void main(String[] args) {

        do{
            sistema();
            alunoSelecionado = procuraAluno();
        }while(!ordemDesligamento);
    }

    public static void sistema(){
        int opcao = opcaoUsuario();
        switch (opcao){
            case 1:
                criaAluno();
                break;
            case 2:
                adicionaNota();
                break;
            case 3:
                removeNota();
                break;
            case 4:
                System.out.println("Digite o nome do aluno: ");
                String nomeAlunoTamanho = input.next();
                System.out.println(tamanhoLista(nomeAlunoTamanho));
                break;
            case 5:
                System.out.println("Digite o nome do aluno: ");
                String nomeAlunoObtem = input.next();
                System.out.println("Insira o indice da nota a ser obtida: ");
                int indice = input.nextInt();
                System.out.println(obtemNota(nomeAlunoObtem, indice));
                break;
            case 6:
                System.out.println("Digite o nome do aluno: ");
                String nomeAlunoLista = input.next();
                System.out.println(obtemLista(nomeAlunoLista));
                break;
            case 7:
                System.out.println("Digite o nome do aluno: ");
                String nomeAlunoOrdena = input.next();
                ordenaLista(nomeAlunoOrdena);
                break;
            case 8:
                ordemDesligamento = true;
            default:
                System.out.println("Opção inválida, tente novament!!!!");
        }
    }






    }




    public static int tamanhoLista(String nome){
        Aluno aluno = procuraAluno(nome);
        return aluno.tamanhoNotas();
    }

    public static Nota obtemNota(String nome, int index){
        Aluno aluno = procuraAluno(nome);
        return aluno.getNotas(index);
    }

    public static String obtemLista(String nome){
        Aluno aluno = procuraAluno(nome);
        return aluno.toString();
    }

    public static void ordenaLista(String nome){
        Aluno aluno = procuraAluno(nome);
        aluno.ordenaNotas();
    }


    public static int opcaoUsuario(){
        System.out.println("Escolha uma opção: ");
        System.out.println("1- Cria aluno;\n 2- Adiciona nota;\n 3- Remove nota;\n 4- Obtem o tamanho da lista;\n " +
                "5- Obtem nota especifica;\n 6- Obtem lista de notas;\n 7- Ordena lista de notas;\n 8- Termina o programa;\n");
        int opcao = input.nextInt();
        return opcao;
    }

    public static Aluno procuraAluno() {
        System.out.println("Insira o nome do aluno: ");
        String nome = input.next();

        Aluno aluno = null;
        for (Aluno a : alunos) {
            if (a.getNome().equals(nome)) {
                aluno = a;
                return aluno;
            }
        }
        return aluno;
    }
    public static void criaAluno(){
        System.out.println("Insira o nome do aluno: ");
        String nome = input.next();

        alunos.add(new Aluno(nome));
    }

    public static void adicionaNota(){
        System.out.println("Digite a nota que deseja inserir: ");
        int valor = input.nextInt();

        alunoSelecionado.setNotas(valor);
        System.out.println("Nota " + valor + "adicionada!!");
    }

    public static void removeNota() {
        System.out.println("Digite a nota que deseja remover: ");
        int nota = input.nextInt();

        for (int x = 0; x <= alunoSelecionado.tamanhoNotas(); x++) {
            if (alunoSelecionado.getNotas(x).equals(nota)) {
                alunoSelecionado.removeNotas(x);
            }
        }
    }



}
