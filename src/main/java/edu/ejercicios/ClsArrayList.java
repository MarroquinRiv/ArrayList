package edu.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class ClsArrayList {
    public void ejemplo1() {
        //String lectura = "ir a votar";
        //taskList.add(lectura);
        //taskList.add("hacer la cama");
        //taskList.add("avar el carro");
        //taskList.add("pasear al perro");
        //taskList.add("hacer compras");

        List<String> taskList = new ArrayList<String>();
        taskList.add("hacer compras");
        taskList.add("pasear al perro");
        taskList.add("hacer la cama");
        taskList.add("avar el carro");

        System.out.println("Tareas pendientes: " + taskList);
        String primerTarea = taskList.get(0);
        System.out.println("Primer tarea "+primerTarea);

        //remover item
        taskList.remove(0);
        primerTarea = taskList.get(0);
        System.out.println("Primer tarea "+primerTarea);

        //A esto se le conoce como iterate o iteracion
        int elementos = 0;
        for (String task : taskList) {
            System.out.println(elementos+ "Tarea: "+task);
            elementos++;
        }
    }

    public void ejemplo2(){
        List<Integer> numberList = new ArrayList<Integer>();
        numberList.add(500);
        numberList.add(1000);
        numberList.add(1500);
        numberList.add(2000);
        numberList.add(2500);

        int total = 0;
        for (int n : numberList) {
            total += n;
            System.out.println("Sumatoria: "+total);
        }
    }

    public void ListaTareas(){
        List<TaskList> task = new ArrayList<>();
        TaskList tareaIndividual = new TaskList();
        tareaIndividual.setTaskName("Hacer compras");
        tareaIndividual.setTaskDescription("Ir a la torre");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual = new TaskList();

        tareaIndividual.setTaskName("Sacar al perro");
        tareaIndividual.setTaskDescription("LLevarlo al parque");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual = new TaskList();

        tareaIndividual.setTaskName("Hacer la cama");
        tareaIndividual.setTaskDescription("Cambiar las sabanas");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual = new TaskList();

        tareaIndividual.setTaskName("Ir a votar");
        tareaIndividual.setTaskDescription("Cumplir con mi pais");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual = new TaskList();

        task.get(1).setDone(true);
        task.get(3).setDone(true);

//        int tareaNumero = 0;
//        for(TaskList tl : task){
//            System.out.println(tareaNumero +" Tarea: "+tl.getTaskName());
//            System.out.println("Descripcion: "+tl.getTaskDescription());
//            System.out.println("Estado: "+tl.getIsDone());
//            tareaNumero++;
//        }

        int tarea_numero = 0;
        for (TaskList tl : task) {
            if (!tl.getIsDone()) {
                System.out.println("Tarea: "+tl.getTaskName());
                System.out.println("Descripcion: "+tl.getTaskDescription());
                System.out.println("Estado: "+tl.getIsDone());
            }
            tarea_numero++;
        }
    }
}