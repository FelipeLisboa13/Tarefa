package view;

import controller.PessoaController;
import model.service.PessoaService;

public class ViewPessoa {
    static void main(){
        PessoaService pessoaService = new PessoaService();
        PessoaController pessoaController = new PessoaController(pessoaService);
        pessoaController.criarPessoa();
        pessoaController.mostar();
    }
}