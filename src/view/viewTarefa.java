package view;

import controller.TarefaController;
import model.service.TarefaService;

public class viewTarefa {
    static void main(){
         TarefaService tarefaService = new TarefaService();
         TarefaController tarefaController = new TarefaController(tarefaService);
        tarefaController.criarTarefa();
        tarefaController.mostrarTarefa();

    }
}