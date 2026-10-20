package model.service;

import model.entity.Status;
import model.entity.Tarefa;

import java.util.HashSet;
import java.util.Set;

public class TarefaService {

 private static int id;

 Set<Tarefa> listaTaredas = new HashSet<>();

 public void criar(){
     Tarefa t = new Tarefa();
     t.setId(id++);
     t.setTitulo(IO.readln("Nome da tarefa: "));
     t.setDescricao(IO.readln("Descrição da tarefa: "));
     t.setStatus((Status.PENDENTE));
     listaTaredas.add(t);
 }
public void mostrarTarefa(){
    IO.println(listaTaredas);
}





}
