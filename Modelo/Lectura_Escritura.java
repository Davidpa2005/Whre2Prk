package Modelo;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Lectura_Escritura {

    public String[] leerPlazasLibres() {

        ArrayList<String> listaPlazasLibres = new ArrayList<String>();

        try{
            File file = new File("/Users/david/Downloads/Whre2Prk-main/plazas.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String[] linea = sc.nextLine().split(";");
                if (linea[1] == "L") {
                    listaPlazasLibres.add(linea[0]);
                }
            }
            sc.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        String[] plazaslibres = new String[listaPlazasLibres.size()];
        for (int i = 0; i < listaPlazasLibres.size(); i++) {
            plazaslibres[i] = listaPlazasLibres.get(i);
        }
        return plazaslibres;
    }

    public ArrayList<String[]> leerPlazasOcupadas() {
        
        ArrayList<String[]>listaPlazasOcupadas = new ArrayList<String[]>();

        try {
            File file = new File("./data/plazas.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String[] linea = sc.nextLine().split(";");
                if (linea[1] == "O") {
                    String[] plaza = {linea[0], linea[2]};
                    listaPlazasOcupadas.add(plaza);
                }
            }
            sc.close();
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
                if (lineaACambiar[0].equals(plaza.id)) {
                    lineaACambiar[1] = "O";
                    lineaACambiar[2] = coche.matricula;
                    printW.write(lineaACambiar[0] + ";" + lineaACambiar[1] + ";" + lineaACambiar[2]);
                }
            }
            sc.close();
            printW.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
    public void desasignarPlaza(Plaza plaza, Coche coche) {
        try {
            File file = new File("./data/plazas.txt");
            Scanner sc = new Scanner(file);
            PrintWriter printW = new PrintWriter(file);

            while (sc.hasNextLine()) {
                String[] lineaACambiar = sc.nextLine().split(";");
                if (lineaACambiar[0].equals(plaza.id)&& lineaACambiar[2].equals(coche.matricula)) {
                    lineaACambiar[1] = "L";
                    lineaACambiar[2] = "";
                    printW.write(lineaACambiar[0] + ";" + lineaACambiar[1] + ";" + lineaACambiar[2]);
                }
            }
            sc.close();
            printW.close();
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
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return listaPagosRealizados;
    }

    public void registrarPagosrealizados(Usuario usuario){
        try {
            File file = new File("./data/pagosrealizdos.txt");
            Scanner sc = new Scanner(file);
            PrintWriter printW = new PrintWriter(file);
            
            while(sc.hasNextLine()) {
                printW.write(usuario.coche.matricula + ";" + usuario.pago(usuario.coche, usuario.tarjeta)+ ";"+usuario.tarjeta); 
            }
            sc.close();
            printW.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}