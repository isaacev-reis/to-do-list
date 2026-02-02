import controller.TarefaController;

public class Main {
    public static void main(String[] args) {
        TarefaController tarefaController = new TarefaController();
        tarefaController.adicionarTarefa();
        tarefaController.adicionarTarefa();
        tarefaController.adicionarTarefa();
        tarefaController.listarTarefas();
    }
}
