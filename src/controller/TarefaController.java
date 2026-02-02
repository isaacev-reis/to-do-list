package controller;

import model.Tarefa;
import view.TarefaView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TarefaController {
    TarefaView tarefaView = new TarefaView();
    Scanner scannerDeInteiro = new Scanner(System.in);
    Scanner scannerDeTexto = new Scanner(System.in);
    List<Tarefa> listaDeTarefas = new ArrayList<>();
    int opcao;

    public void iniciar() {
        tarefaView.mostrarMenu();
        receberOpcao();

        while (opcao != 5) {
            if (opcao == 1) {
                adicionarTarefa();
            } else if (opcao == 2) {
                listarTarefas();
            } else if (opcao == 3) {
                concluirTarefa();
            } else if (opcao == 4) {
                removerTarefa();
            } else {
                tarefaView.erro();
            }
            tarefaView.mostrarMenu();
            receberOpcao();
        }
        tarefaView.sair();
    }

    public void receberOpcao() {
        opcao = 0;
        tarefaView.pedirOpcao();
        opcao = scannerDeInteiro.nextInt();
    }

    public void adicionarTarefa() {
        tarefaView.adicionarTarefa();
        String descricao = scannerDeTexto.nextLine();
        Tarefa tarefa = new Tarefa(descricao);
        if (!listaDeTarefas.isEmpty()){
            tarefa.setId(listaDeTarefas.get(listaDeTarefas.size() - 1).getId() + 1);
        } else {
            tarefa.setId(1);
        }
        listaDeTarefas.add(tarefa);
        tarefaView.sucessoAdicionar();
    }

    public void listarTarefas() {
        tarefaView.listarTarefas();
        for (int i = 0; i < listaDeTarefas.size(); i++) {
            tarefaView.mostrarMensagem(Integer.toString(listaDeTarefas.get(i).getId()) + " - " + listaDeTarefas.get(i).getDescricao());
            if (listaDeTarefas.get(i).isConcluida()) {
                tarefaView.concluida();
            } else {
                tarefaView.naoConcluida();
            }
        }
    }

    public void concluirTarefa() {
        tarefaView.concluirTarefa();
        int tarefaID = scannerDeInteiro.nextInt();
        if (tarefaID - 1 < listaDeTarefas.size()) {
            listaDeTarefas.get(tarefaID - 1).setConcluida(true);
        }
        tarefaView.sucessoConcluir();
    }

    public void removerTarefa() {
        tarefaView.removerTarefa();
        int tarefaID = scannerDeInteiro.nextInt();
        if (tarefaID - 1 < listaDeTarefas.size()) {
            listaDeTarefas.remove(tarefaID - 1);
        }
        tarefaView.sucessoRemover();
    }
}
