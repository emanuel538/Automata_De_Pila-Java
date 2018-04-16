/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Control.ExpresionArchivoC;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author elburi
 */
public class ArchivoC {

    private ExpresionArchivoC expresion;

    public ArchivoC(String ruta) {
        expresion = new ExpresionArchivoC();
        String nombre;
        nombre = "";
        try {
            BufferedReader f = new BufferedReader(new FileReader(ruta));
            String linea;
            while ((linea = f.readLine()) != null) {
                linea = linea.replaceAll("\\s", "");
                String a[] = linea.split("\\[");
                if (a[0].equalsIgnoreCase("\"Simbolosdeentrada\":")) {
                    expresion.agregarSimboloEntrada(a[1]);

                } else {
                    if (a[0].equalsIgnoreCase("\"Simbolosenlapila\":")) {
                        expresion.agregarSimboloPila(a[1]);

                    } else {
                        if (a[0].equalsIgnoreCase("\"Estados\":")) {
                            while ((linea = f.readLine()) != null) {
                                linea = linea.replaceAll("\\s", "");
                                if (linea.equalsIgnoreCase("],")) {
                                    break;
                                }
                                a = linea.split(":");
                                if (a[0].equalsIgnoreCase("\"nombre\"")) {
                                    nombre = a[1].replace("\"", "");

                                }
                                if (a[0].equalsIgnoreCase("\"transiciones\"")) {
                                    expresion.agregarEstado(nombre, a[1]);

                                }

                            }

                        } else {
                            a = linea.split(":");
                            if (a[0].equalsIgnoreCase("\"Configuracioninicial\"")) {
                                expresion.agregarInicial(a[1]);

                            } else {
                                if (a[0].equals("\"Transiciones\"")) {
                                    while ((linea = f.readLine()) != null) {
                                        linea = linea.replaceAll("\\s", "");
                                        if (linea.equals("}")) {
                                            break;
                                        }
                                        a = linea.split(":");
                                        expresion.agregarTransicion(a);
                                    }

                                }
                            }

                        }
                    }
                }

            }

        } catch (FileNotFoundException ex) {
            System.out.println("Ruta equivocada");
        } catch (IOException ex) {
            System.out.println("Error");
        }

    }

    public ArchivoC(String ruta[]) {
        expresion = new ExpresionArchivoC();
        String nombre;
        nombre = "";
        String linea;
        for (int i = 0;i < ruta.length;i++) {
            linea = ruta[i].replaceAll("\\s", "");
            String a[] = linea.split("\\[");
            if (a[0].equalsIgnoreCase("\"Simbolosdeentrada\":")) {
                expresion.agregarSimboloEntrada(a[1]);

            } else {
                if (a[0].equalsIgnoreCase("\"Simbolosenlapila\":")) {
                    expresion.agregarSimboloPila(a[1]);

                } else {
                    if (a[0].equalsIgnoreCase("\"Estados\":")) {
                        i++;
                        for (;i<ruta.length;i++) {
                            linea = ruta[i].replaceAll("\\s", "");
                            if (linea.equalsIgnoreCase("],")) {
                                break;
                            }
                            a = linea.split(":");
                            if (a[0].equalsIgnoreCase("\"nombre\"")) {
                                nombre = a[1].replace("\"", "");

                            }
                            if (a[0].equalsIgnoreCase("\"transiciones\"")) {
                                expresion.agregarEstado(nombre, a[1]);

                            }

                        }

                    } else {
                        a = linea.split(":");
                        if (a[0].equalsIgnoreCase("\"Configuracioninicial\"")) {
                            expresion.agregarInicial(a[1]);

                        } else {
                            if (a[0].equals("\"Transiciones\"")) {
                                i++;
                                for (;i<ruta.length;i++) {
                                    linea = ruta[i].replaceAll("\\s", "");
                                    if (linea.equals("}")) {
                                        break;
                                    }
                                    a = linea.split(":");
                                    expresion.agregarTransicion(a);
                                }

                            }
                        }

                    }
                }
            }

        }

    }

    public ExpresionArchivoC getExpresion() {
        return expresion;
    }

    public void setExpresion(ExpresionArchivoC expresion) {
        this.expresion = expresion;
    }

}
