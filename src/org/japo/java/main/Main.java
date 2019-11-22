/* 
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        //Variables
        char userValue;
        boolean exit = false;

        //Bucle principal
        while (exit == false) {
            try {
                //Pedimos el dato al usuario
                System.out.printf("Por favor, inserte un caracter, recuerde %n"
                        + "que será tomado el primer caracter ...: ");
                userValue = SCN.nextLine().charAt(0);

                //Salida
                System.out.printf("Usted insertó ...: %s.%n", userValue);

                //Salimos del bucle
                exit = true;
            } catch (Exception e) {
                System.out.println("ERROR: Valor no válido.");
            }
        }
    }
}
