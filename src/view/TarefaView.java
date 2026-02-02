package view;

public class TarefaView {
    public void mostrarMenu() {
        System.out.println("======= MENU =======");
        System.out.println("1 - Adicionar tarefa");
        System.out.println("2 - Listar tarefas");
        System.out.println("3 - Concluir tarefa");
        System.out.println("4 - Remover tarefa");
        System.out.println("5 - Sair");
        System.out.println("====================");
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void pedirOpcao() {
        System.out.println("Digite o que deseja fazer: ");
    }

    public void adicionarTarefa() {
        System.out.println("Digite a tarefa que deseja adicionar: ");
    }

    public void listarTarefas() {
        System.out.println("Aqui estão todas as tarefas: ");
    }

    public void concluirTarefa() {
        System.out.println("Marque a tarefa concluída: ");
    }

    public void removerTarefa() {
        System.out.println("Escolha a tarefa que deseja remover: ");
    }

    public void sair() {
        System.out.println("Encerrando programa");
        System.out.println(". . .");
    }

    public void erro() {
        System.out.println("Opção inválida!");
    }

    public void sucessoAdicionar() {
        System.out.println("Tarefa adicionada com sucesso!");
        System.out.println(" ");
    }

    public void sucessoRemover() {
        System.out.println("Tarefa removida com sucesso!");
        System.out.println(" ");
    }

    public void sucessoConcluir() {
        System.out.println("Tarefa concluída com sucesso!");
        System.out.println(" ");
    }
}
