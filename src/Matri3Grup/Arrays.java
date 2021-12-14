package Matri3Grup;

import java.util.Scanner;

public class Arrays {

    int Tam;
    int Matricula[];
    int Cont;
    int Dato;
    Scanner scanner = new Scanner(System.in);

    boolean Arreglo_Vacio() {
        if (Cont == -1) {
            System.out.println("El Grupo Está Vacío.");
            return true;
        } else {
            return false;
        }
    }

    boolean Arreglo_Lleno() {
        if (Cont == Tam - 1) {
            System.out.println("El Grupo Está Lleno.");
            return true;
        } else {
            return false;
        }
    }

    int Busqueda_Secuencial() {
        if (Arreglo_Vacio()) {
            return -1;
        } else {
            for (int i = 0; i <= Cont; i++) {
                if (Dato == Matricula[i]) {
                    return i;
                }
            }
        }
        System.out.println("La Matricula: " + Dato + " No se Encuentra en el Grupo.");
        return -2;
    }

    void Crear_Arreglo() {
        int i = 0;
        System.out.println("Escriba el Total de Alumnos del Grupo: ");
        Tam = scanner.nextInt();
        int Aux[] = new int[Tam];
        for (i = 0; i < Tam; i++) {
            Aux[i] = 0;
        }
        Matricula = Aux;
        Cont = -1;
    }

    void Insertar_Dato() {
        if (!Arreglo_Lleno()) {
            if (Repetido()){
                System.out.println("La Matricula que Desea Agregar ya Existe");
            }
            else {
                Cont++;
                Matricula[Cont] = Dato;
            }
        }
    }

    void Eliminar_Dato() {
        int Buscar = Busqueda_Secuencial();
        int i = 0;
        if (Buscar > -1) {
            for (i = Buscar; i < Cont; i++) {
                Matricula[i] = Matricula[i + 1];
            }
            Cont--;
        }
    }

    void Modificar_Dato() {
        int Buscar = Busqueda_Secuencial();

        if (Buscar > -1) {
                System.out.println("Escriba la Nueva Matricula:");
                Dato = scanner.nextInt();
                if (Repetido()){

                    System.out.println("La Matricula que Desea Modificar ya Existe");
                }
                else {
                    Matricula[Buscar] = Dato;
                }
        }
    }

    void ListarGrupo() {
        for (int i = 0; i <= Cont; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + Matricula[i]);
        }
    }

    boolean Repetido() {
        boolean DatoRepetido = false;
        int i = 0;
        for (i = 0; i <= Cont; i++) {
            if (Dato == Matricula[i]) {
                DatoRepetido = true;
            }
        }
            return DatoRepetido;
    }

    int NumMayor() {
        int Mayor = 0;
        int i = 0;
        for (i = 0; i <= Cont; i++) {
            if (Matricula[i] > Mayor) {
                Mayor = Matricula[i];
            }
        }
        return Mayor;
    }

    int NumMenor() {
        int Menor = Matricula[0];
        int i = 0;
        for (i = 0; i <= Cont; i++) {
            if (Matricula[i] < Menor) {
                Menor = Matricula[i];
            }
        }
        return Menor;
    }
    void Menu_Gestion() {
        int op = 0;
        do {
            System.out.println("");
            System.out.println("1) Crear Grupo");
            System.out.println("2) Ingresar Matricula");
            System.out.println("3) Eliminar Matricula");
            System.out.println("4) Modificar Matricula");
            System.out.println("5) Listar Matricula");
            System.out.println("6) Numero Mayor y Menor");
            System.out.println("0) Regresar al Menú Anterior");
            op = scanner.nextInt();

            switch (op) {
                case 1: {
                    Crear_Arreglo();
                    break;
                }
                case 2: {
                    if (Cont == Tam - 1) {
                        Arreglo_Lleno();
                    }
                    else {
                        System.out.println("Matricula que Desea Insertar: ");
                        Dato = scanner.nextInt();
                        Insertar_Dato();

                    }
                    break;
                }
                case 3: {
                    System.out.println("Matricula que Desea Eliminar: ");
                    Dato = scanner.nextInt();
                    Eliminar_Dato();
                    break;
                }
                case 4: {
                    System.out.println("Matricula que Desea Modificar: ");
                    Dato = scanner.nextInt();
                    Modificar_Dato();
                    break;
                }
                case 5: {
                    if (Cont == -1) {
                        Arreglo_Vacio();
                    }
                    ListarGrupo();
                    break;
                }
                case 6: {
                    if (Cont == -1) {
                        Arreglo_Vacio();
                    }
                    else {
                        System.out.println("Numero Mayor: " + NumMayor());
                        System.out.println("");
                        System.out.println("Numero Menor: " + NumMenor());
                    }
                }
            }
        } while (op > 0);
    }
}