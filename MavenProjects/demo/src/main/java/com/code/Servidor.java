package com.code;

import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) {
        try (
            ServerSocket serverSocket = new ServerSocket(ConfiPuerto.getInstance().getPort());
        ){
            System.out.println("Esperando cliente...");
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Cliente aceptado");
                //List<Palabras> listaPalabras = new ArrayList<>();
                Thread cliente = new Thread(new ClienteHandler(socket));
                cliente.start();
                System.out.println("Cliente conectado");
            }
        
        }catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
}
