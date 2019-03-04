
package com.mycompany.practicasjava;

import java.util.Scanner;
import static java.lang.reflect.Array.get;
import java.util.Arrays;

public class Practicas {
    
    public static void main (String [] args)
    {
        System.out.println("\n\n");
        System.out.println("\t\t\tProyectos Java");
        System.out.println("\t\t\t══════════════");
        System.out.println("\n");
        System.out.println("\t¡¡Cargando proyectos... Espere porfavor!!");
        System.out.println("\n");
         
        for(int i = 0; i < 80; i++)
        {
            try
            {
                System.out.print("█");
                Thread.sleep(200);
            }
            catch(InterruptedException e){}            
        }
       
      System.out.println("\n\n"); 
      
      int seleccion = 0;
      
      do{
        System.out.println("+----------------------Menu de seleccion-------------------------+");
        System.out.print("¦ 1 HOLA MUNDO                          ¦");	System.out.println(" 9 REPETITIVA PARA (FOR)¦");
	System.out.print("¦----------------------------------------------------------------¦\n");            				
	System.out.print("¦ 2 SECUENCIAL                          ¦");	System.out.println(" 10 DosArreglos         ¦");   
	System.out.print("¦----------------------------------------------------------------¦\n");							
	System.out.print("¦ 3 ALTERNATIVA SIMPLE                  ¦");	System.out.println(" 11 Pila                ¦");   
	System.out.print("¦----------------------------------------------------------------¦\n");
	System.out.print("¦ 4 ALTERNATIVA DOBLE                   ¦");	System.out.println(" 12 Matrices            ¦");
	System.out.print("¦----------------------------------------------------------------¦\n");
	System.out.print("¦ 5 ALTERNATIVA DOBLE                   ¦");  System.out.println(" 13 Busqueda            ¦");
        System.out.print("¦----------------------------------------------------------------¦\n");
	System.out.print("¦ 6 ALTERNATIVA MÚLTIPLE                ¦");	System.out.println(" 14 Cargar dias         ¦");
        System.out.print("¦----------------------------------------------------------------¦\n");
	System.out.print("¦ 7 REPETITIVA MIENTRAS (WHILE)         ¦");	System.out.println(" 15 Busqueda Secuencial ¦");
        System.out.print("¦----------------------------------------------------------------¦\n");
	System.out.print("¦ 8 REPETITIVA HACER MIENTRAS (DO WHILE)¦"); System.out.println(" 0: Salir               ¦");
        System.out.print("+----------------------------------------------------------------+");
        System.out.println("\n\n");
          System.out.print("Elije una opcion: ");
          seleccion = new Scanner(System.in).nextInt();
          System.out.println("\n\n");
          
      switch (seleccion)
      {
          case 1:
              Practicas.ejerciocio1();
              break;
           
          case 2:
              Practicas.Suma();
              break;
               
          case 3:
              Practicas.Login();
              break;
              
          case 4:
              Practicas.AlternativaDoble();
              break;
              
          case 5:
              Practicas.AlternativaMultiple();
              break;
          case 6:
              Practicas.RepetitivaMientras();
              break;
          
          case 7:
              Practicas.HacerMientras();
              break;
              
          case 8:
              Practicas.RepetitivaPara();
              break;
              
          case 9:
              Practicas.EstructuradeDatos();
              break;
              
          case 10:
              Practicas.DosArreglos();
              break;
              
          case 11:
              Practicas.Pila();
              break;
              
          case 12:
                System.out.print("Matrices\n");
                int [][] matrix = new int [][]{{1,2,3},{4,5,6},{7,8,9}};
                Print(matrix);
                System.out.print("\n");
                matrix[0][0] = 10;
                matrix[1][1] = 10;
                matrix[2][2] = 10;

                Print(matrix);        
                System.out.print("\n");
                for(int i = 0; i < matrix.length; i++)
                {
                   for(int j = 0; j < matrix.length; j++)
                   {
                       System.out.printf("Matrix [%s][%s] Actual: %s Nuevo valor: ", i, j, matrix [i][j]);
                       matrix [i][j] = new Scanner(System.in).nextInt();
                   }
                }
                Print(matrix);
                System.out.println("\n");
              break;
              
          case 13:
                  int [] valores = new int []{4,7,9,10,15};
                    int valor = 10;
                    int pos = Busqueda(valores, valor);

                    if(pos != -1)
                    {
                        System.out.println("Se encuentra en la posicion: \n"+pos);
                    }
                    else
                        System.out.println("¡¡No se encontro!!\n");
              break;
              
          case 14:
              int [] diasdelMes;
              diasdelMes = cargarDias();
              
        int Mes;

        System.out.print("Ingrese el n° de mes que desee averiguar: ");
        Mes = new Scanner(System.in).nextInt();
         
         System.out.print("El mes "+Mes+" tiene "+diasdelMes[Mes-1]+" dias");
         
        //Mostrar(diasdelMes);
              break;
              
          case 15:
              Practicas.BusquedaSecuencial();
              break;
              
              
          default: System.out.print("Seleccion ¡¡INCORRECTA!!\n");
              
      }
     }
       while(seleccion != 0); 
    }
    
    //Ejercicio N°1
    public static void ejerciocio1()
   {
       System.out.print("Hola mundo\n\n");

   }
    
    //Ejercicio N°2
    public static void Suma()
   {
       int primerN;
       int segundoN;
       int Resultado;
       
       System.out.print("Ingrese el primer número: ");
       primerN = new Scanner(System.in).nextInt();
       
       System.out.print("Ingrese el segundo número: ");
       segundoN = new Scanner (System.in).nextInt();
       
       Resultado = primerN + segundoN;
       
       System.out.print("\n");
       System.out.print("El resultado de la suma es: " + Resultado);
       System.out.print("\n\n");
       
   }
    
    //Ejercicio N°3
     public static void Login ()
   {
       Scanner input = new Scanner(System.in);
        
        String Usuario;
        String Pass;
        
        System.out.print("\n\nIngrese el usuario: ");
        Usuario = input.nextLine();
        System.out.print("\n");
        System.out.print ("Ingrese la contraseña: ");
        Pass = input.nextLine();
        
        if (Usuario.equals("Juan") && Pass.equals("Pokemon"))
        {
           System.out.print("Usuario Logeado Correctamente."); 
        }
        
        if (Usuario.equals("Julieta") && Pass.equals("Pikachu"))
        {
            System.out.print("Usuario Logeado Correctamente.");
        }
        
        if (Usuario.equals("Andrea") && Pass.equals("NoSoyFanDePokemo"))
        {
            System.out.print("Usuario No Valido.");
        } 
        System.out.print("\n\n");
   }
     
    //Ejercicio N°4
     public static void AlternativaDoble()
   {
       int cantBancosAula;
       int cantAlumnosInscriptos;
       int bancosFaltantes;
       
//       String datos = "";
       
       System.out.print("Ingrese la cantidad de bancos disponibles en el aula: ");
       cantBancosAula = new Scanner(System.in).nextInt();
       System.out.print("Ingrese la cantidad de alumnos inscriptos: ");
       cantAlumnosInscriptos = new Scanner(System.in).nextInt();
    
       bancosFaltantes = cantBancosAula -cantAlumnosInscriptos;
       
       if (cantBancosAula >= cantAlumnosInscriptos)
       {
           System.out.print("La cantidad de bancos faltantes es: " + bancosFaltantes);
       }
       else 
           System.out.print("Los bancos del aula son suficiente: " + bancosFaltantes);
       
//        if (Comunes.isNumeric(datos))
//        {
//            System.out.print("¡ERROR! Esperando un valor tipo entero" + bancosFaltantes);
//        }
        System.out.print("\n\n");
        
   }
     
     //Ejercicio N°5
    public static void AlternativaMultiple()
   {
       int numeroMes;
       
       System.out.print("Ingrese el número del mes: ");
       numeroMes = new Scanner(System.in).nextInt();
       
       switch (numeroMes)
       {
           case 1:  System.out.print("El mes es Enero\n\n");
           break;
           case 2: System.out.print("El mes es Febrero\n\n");
           break;
           case 3: System.out.print("El mes es Marzo\n\n");
           break;
           case 4: System.out.print("El mes es Abril\n\n");
           break;
           case 5: System.out.print("El mes es Mayo\n\n");
           break;
           case 6: System.out.print("El mes es Junio\n\n");
           break;
           case 7: System.out.print("El mes es Julio\n\n");
           break;
           case 8: System.out.print("El mes es Agosto\n\n");
           break;
           case 9: System.out.print("El mes es Septiembre\n\n");
           break;
           case 10: System.out.print("El mes es Octubre\n\n");
           break;
           case 11: System.out.print("El mes es Noviembre\n\n");
           break;
           case 12: System.out.print("El mes es Diciembre\n\n");
           break;
           default: System.out.print("El número ingresado, no corresponde a un mes.\n\n");
       }
       System.out.print("\n\n");
   } 
    
    //Ejercicio N°6
     public static void RepetitivaMientras()
   {
       int tablaNum;
       int tablaHasta;
       int contador = 1;
       int multiplicacion;
       
       System.out.print("Ingrese el numero del cual desea conocer la tabla de multiplicar: ");
       tablaNum = new Scanner(System.in).nextInt();
       
       System.out.print("Ingrese el numero hasta donde desea conocer la tabla: ");
       tablaHasta = new Scanner(System.in).nextInt();
       System.out.print("\n");
       while(contador <= tablaHasta)
       {
           multiplicacion = tablaNum * contador;
           System.out.println(tablaNum + "*" + contador + "= " + multiplicacion);
           contador ++;
       }
       System.out.print("\n\n");
   }
     
     //Ejercicio N°7
     public static void HacerMientras()
   {
       int tablaNum;
       int tablaHasta;
       int contador = 1;
       int multiplicacion;
       
       System.out.print("Ingrese el numero del cual desea conocer la tabla de multiplicar: ");
       tablaNum = new Scanner(System.in).nextInt();
       
       System.out.print("Ingrese el numero hasta donde desea conocer la tabla: ");
       tablaHasta = new Scanner(System.in).nextInt();
       System.out.print("\n");
       
       do
       {
           multiplicacion = tablaNum * contador;
           System.out.println(tablaNum + "*" + contador + "= " + multiplicacion);
           contador ++;    
       }
       
       while(contador <= tablaHasta);
       System.out.print("\n\n");
   }
     
     //Ejercicio N°8
     public static void RepetitivaPara()
   {
       Scanner leer = new Scanner(System.in);
       
       double acumulador = 0;
       double promedio = 0;
       double numero = 0;
       
       
       for (int i = 1; i <= 4; i++)
       {
           System.out.print(i + "° Ingrese el numero: ");
           numero = leer.nextDouble();
           
           acumulador = acumulador + numero;
       } 
       promedio = acumulador / 4;
       System.out.print("El promedio de los numeros es: " + promedio);
       System.out.print("\n\n");
       
   }
     
     //Ejercicio N°9
     public static void EstructuradeDatos()
   {
       Scanner leer = new Scanner(System.in);
       boolean butacas [] = {false, true};
       int butacasVacias = 0;
       
       for(int i = 0; i < butacas.length; i++)
       {
           boolean butacasActual = (boolean) get(butacas,i);
           
           if (butacasActual == true)
           {
               butacasVacias ++;
           }
       }
       
       System.out.print("La cantidad de vutacas vacias en la sala es: " + butacasVacias);
       System.out.print("\n\n");
   }
     
     //Ejercicio N°10
     public static void DosArreglos()
   {
       String [] ColoresAula = new String []{"Azul","Verde","Amarillo"};
       int [] CapacAula = new int []{40, 35, 30};
       int cantAlumIns;
       
       System.out.print("Ingrese la cantidad de alumnos inscriptos al cursado: ");
       cantAlumIns = new Scanner(System.in).nextInt();
       System.out.print("\n\n");
       
       int capacidadAulaAux = (int) get(CapacAula, 0);
       
       for(int i = 0; i < CapacAula.length; i++)
       {
           int capacidadAulaActual = (int)get(CapacAula,i);
           
           if((capacidadAulaActual >= cantAlumIns) && (capacidadAulaActual < capacidadAulaAux))
           {
               capacidadAulaAux = capacidadAulaActual;
               int indiceAulaAux = i ;
               String colorAula = (String) get(ColoresAula, indiceAulaAux);
               
               System.out.println("El aula indicada para la cantidad ingresada de " +
               "alumnos es el aula: " + colorAula + " con una capacidad de: " + 
               capacidadAulaAux);
           }
       } 
       System.out.print("\n\n");
   }
     
     //Ejercicio N°11
      public static void Pila()
   {
    int pilaOriginal [] = new int [3];
    int pilaInvertida [] = new int [3];
    
    System.out.print("Ingrese los digitos de la pila original\n");
    for(int i = 0; i < pilaOriginal.length; i++)
    {
        System.out.print("Digita los numeros: ");
        pilaOriginal [i] = new Scanner(System.in).nextInt();
        pilaInvertida = pilaOriginal;
    }
    System.out.print("\n");
    for (int j = pilaInvertida.length - 1; j >= 0; j--)
    {
        System.out.println ("Numeros Invertidos: "+ pilaInvertida[j]);
    }
    System.out.print("\n\n");
   }
      
     /*
      Trabajos realizados en clase.
      */
      
      //MATRICES
      public static void Print(int [][] matrix)
   {
       for (int i = 0; i < matrix.length; i++)
       {
           System.out.println(Arrays.toString(matrix[i]));
       }
   }
      
      public static int Busqueda(int [] vector, int valor)
    {
       int max = vector.length - 1;
       int min = 0 , media = 0;
       
       while( min <= max)
       {
           media = (max + min)/2;
           if(vector [media] == valor)
           {
               return media;
           }
           else if(valor < vector[media])
           {
               max = media - 1;
           }
           else
           {
               min = media + 1;
           }
       }
       return -1;
    }
      
       public static int[] cargarDias()
   {
     
     String [] Meses = new String []{"Enero: ","Febrero: ","Marzo: ","Abril: ",
         "Mayo: ","junio: ","Julio: ",
     "Agosto: ","Septiembre: ","Octubre: ","Noviembre: ","Diciembre: "};
     int []DiasMes = new int[12];
     
     for (int i = 0; i < 12; i ++)
     {
        System.out.print("Ingrese la cantidad de dias del mes: "+ Meses[i]);
        
        DiasMes[i] = new Scanner(System.in).nextInt();
     }
     return DiasMes;
   }
   
   //Muestra los dias
   public static void Mostrar(int [] dias)
   {
       for(int dia = 0; dia <= 12; dia++)
           System.out.print(dias[dia]);
     
   }
 
}
