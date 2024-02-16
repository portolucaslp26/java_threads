package com.example.threads.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<String> lista = Collections.synchronizedList(new ArrayList<String>()); // ou Vector java.tils

        for(int i = 0; i < 10; i++) {
            new Thread(new TarefaAdicionarElemento(lista, i)).start();
        }

        Thread.sleep(2000);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

}
