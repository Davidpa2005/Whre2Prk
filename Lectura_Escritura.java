package Modelo;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Lectura_Escritura {

    public ArrayList<String> leerPlazasLibres() {

        ArrayList<String> listaPlazasLibres = new ArrayList<String>();

        try{
            File file = new File("./data/plazas.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String[] linea = sc.nextLine().split(";");
                if (linea[1] == "L") {
                    listaPlazasLibres.add(linea[0]);
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return listaPlazasLibres;
    }

    public ArrayList<String[]> leerPlazasOcupadas() {
        
        ArrayList<String[]>listaPlazasOcupadas = new ArrayList<String[]>();

        try {
            File file = new File("./data/plazas.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String[] linea = sc.nextLine().split(";");
                if (linea[1] == "O") {
                    String[] plaza = { linea[0], linea[2]};
                    listaPlazasOcupadas.add(plaza);
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return listaPlazasOcupadas;

    }

    public void asignarPlaza(Plaza plaza, Coche coche) {
        try {
            File file = new File("./data/plazas.txt");
            Scanner sc = new Scanner(file);
            PrintWriter printW = new PrintWriter(file);

            while (sc.hasNextLine()) {
                String[] lineaACambiar = sc.nextLine().split(";");
                if (lineaACambiar[0].equals(plaza.numPlaza)) {
                    lineaACambiar[1] = "O";
                    lineaACambiar[2] = coche.matricula;
                    printW.write(lineaACambiar[0] + ";" + lineaACambiar[1] + ";" + lineaACambiar[2]);
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
    public void desasignarPlaza(String plaza, Coche coche) {
        try {
            File file = new File("./data/plazas.txt");
            Scanner sc = new Scanner(file);
            PrintWriter printW = new PrintWriter(file);

            while (sc.hasNextLine()) {
                String[] lineaACambiar = sc.nextLine().split(";");
                if (lineaACambiar[0].equals(plaza.numPlaza)&& lineaACambiar[2].equals(coche.matricula)) {
                    lineaACambiar[1] = "L";
                    lineaACambiar[2] = "";
                    printW.write(lineaACambiar[0] + ";" + lineaACambiar[1] + ";" + lineaACambiar[2]);
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
    public ArrayList<String[]> leerPagosRealizados() {

        ArrayList<String[]> listaPagosRealizados = new ArrayList<String[]>();
        try {
            File file = new File("./data/pagosrealizados.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String[] linea = sc.nextLine().split(";");
                listaPagosRealizados.add(linea);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return listaPagosRealizados;
    }

    public void registrarPagosrealizados(Coche coche,Pago pago, Tarjeta tarjeta){
        try {
            File file = new File("./data/pagosrealizdos.txt");
            Scanner sc = new Scanner(file);
            PrintWriter printW = new PrintWriter(file);
            
            while(sc.hasNextLine()) {
                printW.write(coche.matricula + ";" + pago.cantidad + ";"+tarjeta.numTarjeta); 
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}