package com.code;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ClienteHandler implements Runnable{
    //private List<Palabras> listPalabras;
    private Socket cliente;

    public ClienteHandler( Socket cliente) {
        //this.listPalabras = listPalabras;
        this.cliente = cliente;
    }
    
    List<Palabras> listPalabras = new ArrayList<>();

    @Override
    public void run() {
        Palabras p1 = new Palabras("perro", "dog");
        listPalabras.add(p1);
        String message;
        String palabra;
        try (
            BufferedReader lector = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            PrintWriter escritor = new PrintWriter(cliente.getOutputStream(), true);
        ){
            escritor.println("Bienvenido al IA traductor de español a ingles");
            while (true) { 
                escritor.println("Ingrese una palabra en español");
                palabra = lector.readLine();
                if (palabra.equalsIgnoreCase("salir")) {
                    break;
                }
                boolean encontrado = false;
                for (int i = 0; i < listPalabras.size(); i++) {
                    if (palabra.equalsIgnoreCase(listPalabras.get(i).getPalabraEspa())) {
                        escritor.println("Palabra en ingles: "+listPalabras.get(i).getPalabraIngle());
                        encontrado = true;
                        break;
                    }
                }
                if(!encontrado){
                    escritor.println("Esa palabra no se encuentra registrada en ingles, porfavor ingrese cual seria su traduccion");
                    String traduccion = lector.readLine();
                    listPalabras.add(new Palabras(palabra, traduccion));
                    escritor.println("Palabra en ingles: " + traduccion);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
