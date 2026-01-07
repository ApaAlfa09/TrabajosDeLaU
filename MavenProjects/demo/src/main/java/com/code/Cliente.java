package com.code;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        try (
            Socket socket = new Socket("localhost", ConfiPuerto.getInstance().getPort());
            BufferedReader lector = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter escritor = new PrintWriter(socket.getOutputStream(), true);
            Scanner teclado = new Scanner(System.in);
        ) {
            String message;
            String palabra;
            System.out.println(lector.readLine());// bienvenida
            while ((message = lector.readLine()) != null) {//el "ingrese una palabra"
                System.out.println(message);
                palabra = teclado.nextLine();
                escritor.println(palabra); 
                if (palabra.equalsIgnoreCase("salir")) {
                    System.out.println("Saliendo...");
                    break;
                }
                message = lector.readLine();
                System.out.println(message);
                
                if (message.equalsIgnoreCase("Esa palabra no se encuentra registrada en ingles, porfavor ingrese cual seria su traduccion")) {
                    palabra = teclado.nextLine();
                    escritor.println(palabra);
                    message= lector.readLine();
                    System.out.println(message);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
