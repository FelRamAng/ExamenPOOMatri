package Matri3Grup;

import java.util.Scanner;

public class Main_Matri {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays Grupo_1 = new Arrays();
        Arrays Grupo_2 = new Arrays();
        Arrays Grupo_3 = new Arrays();
        int op = 0, op1 = 0;
        do
        {
            System.out.println("Seleccione el Grupo:");
            System.out.println("1) Grupo 1");
            System.out.println("2) Grupo 2");
            System.out.println("3) Grupo 3");

            op = scanner.nextInt();

            do
            {
                System.out.println("Seleccione la opción que desea realizar: ");
                System.out.println("0) Regresar");
                System.out.println("1) Gestionar Grupo");
                op1 = scanner.nextInt();

                switch(op)
                {
                    case 1:
                    {
                        if(op1 == 1)
                        {
                            Grupo_1.Menu_Gestion();
                        }
                        break;
                    }
                    case 2:
                    {
                        if(op1 == 1)
                        {
                            Grupo_2.Menu_Gestion();
                        }
                        break;
                    }
                    case 3:
                    {
                        if(op1 == 1)
                        {
                            Grupo_3.Menu_Gestion();
                        }
                        break;
                    }
                    case 4:
                    {
                        if (!Grupo_1.Arreglo_Vacio())
                        {
                            if (!Grupo_2.Arreglo_Vacio())
                            {
                                if (!Grupo_3.Arreglo_Vacio())
                                {
                                    if (Grupo_1.NumMayor() > Grupo_2.NumMayor() && Grupo_1.NumMayor() > Grupo_3.NumMayor()){
                                        System.out.println("Matricula Mayor: " + Grupo_1.NumMayor() + " (Grupo 1)");
                                    }
                                    else if (Grupo_2.NumMayor() > Grupo_3.NumMayor() && Grupo_2.NumMayor() > Grupo_1.NumMayor()){
                                        System.out.println("Matricula Mayor: " + Grupo_2.NumMayor() + " (Grupo 2)");
                                    }
                                    else {
                                        System.out.println("Matricula Mayor: " + Grupo_3.NumMayor() + " (Grupo 3)");
                                    }

                                    if (Grupo_1.NumMenor() > Grupo_2.NumMenor() && Grupo_1.NumMenor() > Grupo_3.NumMenor()){
                                        System.out.println("Matricula Menor: " + Grupo_1.NumMenor() + " (Grupo 1)");
                                    }
                                    else if (Grupo_2.NumMenor() > Grupo_3.NumMenor() && Grupo_2.NumMenor() > Grupo_1.NumMenor()){
                                        System.out.println("Matricula Mayor: " + Grupo_2.NumMenor() + " (Grupo 2)");
                                    }
                                    else {
                                        System.out.println("Matricula Mayor: " + Grupo_3.NumMenor() + " (Grupo 3)");
                                    }
                                }

                            }
                        }
                    }
                }
            }while(op1 > 0);

        }while(op > 0);
    }
}
