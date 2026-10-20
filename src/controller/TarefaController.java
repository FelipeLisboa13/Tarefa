package controller;

import model.service.TarefaService;

public class TarefaController {

    private final TarefaService tarefaService;


    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    public void criarTarefa(){
        tarefaService.criar();
        IO.println("!Criação Realizada!");
    }

    public void mostrarTarefa(){
        tarefaService.mostrarTarefa();
    }
}
