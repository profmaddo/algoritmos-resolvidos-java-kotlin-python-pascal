import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

class Tarefa {
    int codigo;
    String nome;
    String situacao;

    public Tarefa(int codigo, String nome, String situacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + "\nNome: " + nome + "\nSituação: " + situacao + "\n";
    }
}

public class Tarefas {
    static ArrayList<Tarefa> listaTarefas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean executando = true;

        while (executando) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Incluir Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Atualizar Tarefa");
            System.out.println("4. Deletar Tarefa");
            System.out.println("5. Sair e Salvar");
            System.out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 -> incluirTarefa();
                case 2 -> listarTarefas();
                case 3 -> atualizarTarefa();
                case 4 -> deletarTarefa();
                case 5 -> {
                    salvarEmArquivo();
                    executando = false;
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }

    static void incluirTarefa() {
        System.out.print("Código: ");
        int codigo = Integer.parseInt(scanner.nextLine());
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Situação (nova/concluida/cancelada): ");
        String situacao = scanner.nextLine();
        listaTarefas.add(new Tarefa(codigo, nome, situacao));
        System.out.println("Tarefa adicionada com sucesso!");
    }

    static void listarTarefas() {
        if (listaTarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            for (Tarefa t : listaTarefas) {
                System.out.println(t);
            }
        }
    }

    static void atualizarTarefa() {
        System.out.print("Informe o código da tarefa para atualizar: ");
        int codigo = Integer.parseInt(scanner.nextLine());
        for (Tarefa t : listaTarefas) {
            if (t.codigo == codigo) {
                System.out.print("Novo nome: ");
                t.nome = scanner.nextLine();
                System.out.print("Nova situação: ");
                t.situacao = scanner.nextLine();
                System.out.println("Tarefa atualizada!");
                return;
            }
        }
        System.out.println("Tarefa não encontrada.");
    }

    static void deletarTarefa() {
        System.out.print("Informe o código da tarefa para deletar: ");
        int codigo = Integer.parseInt(scanner.nextLine());
        listaTarefas.removeIf(t -> t.codigo == codigo);
        System.out.println("Tarefa removida (se existente).");
    }

    static void salvarEmArquivo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String fileName = "tarefas-" + LocalDateTime.now().format(formatter) + ".txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Tarefa t : listaTarefas) {
                writer.write(t.toString());
                writer.newLine();
            }
            System.out.println("Tarefas salvas no arquivo " + fileName);
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }
}