package controller;

import model.Tarefa;
import view.TarefaView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TarefaController {
    TarefaView tarefaView = new TarefaView();
    Scanner scanner = new Scanner(System.in);
    List<Tarefa> listaDeTarefas = new ArrayList<>();
    int opcao;

    public void iniciar() {
        // ainda falta
    }

    public void receberOpcao() {
        tarefaView.pedirOpcao();
        opcao = scanner.nextInt();
    }

    public void adicionarTarefa() {
        String descricao = scanner.nextLine();
        Tarefa tarefa = new Tarefa(descricao);
        if (!listaDeTarefas.isEmpty()){
            tarefa.setId(listaDeTarefas.get(listaDeTarefas.size() - 1).getId() + 1);
        } else {
            tarefa.setId(1);
        }
        listaDeTarefas.add(tarefa);
    }

    public void listarTarefas() {
        for (int i = 0; i < listaDeTarefas.size(); i++) {
            tarefaView.viewMostrarMensagem(Integer.toString(listaDeTarefas.get(i).getId()) + " - " + listaDeTarefas.get(i).getDescricao());
            if (listaDeTarefas.get(i).isConcluida()) {
                tarefaView.viewConcluida();
            } else {
                tarefaView.viewNaoConcluida();
            }
        }
    }

    public void concluirTarefa() {
        int tarefaID = scanner.nextInt();
        if (tarefaID - 1 < listaDeTarefas.size()) {
            listaDeTarefas.get(tarefaID - 1).setConcluida(true);
        }
    }

    public void removerTarefa() {
        int tarefaID = scanner.nextInt();
        if (tarefaID - 1 < listaDeTarefas.size()) {
            listaDeTarefas.remove(tarefaID - 1);
        }
    }
}
