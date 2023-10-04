import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        boolean reiniciar = true;
         String respuesta;
        while (reiniciar) {
        System.out.println("Se le presentara un menu con las siguientes opciones");

        System.out.println("1)Verificar si dos matrices son iguales \n 2)Sumar 2 matrices\n 3)generar una matriz de 0 n x m\n 4)Obtener el inverso aditivo de una matriz n x m ");
        System.out.println("5)Restar 2 matrices\n 6)Multiplicar un escalar por una matriz n x m \n 7)Multiplicdar 2 matrices compatibles");

        int elegir = leer.nextInt();

         int numFilasA, numColumnaA, numFilasB, numColumnaB;

        
            
        
        switch (elegir) {
            case 1:

              System.out.println("Para verificar si dos matrices son iguales ambas deben tener el mismo numero de\n filas y columnas");

              System.out.println("Cual es el numero de filas para la matriz a");
              numFilasA=leer.nextInt();

              System.out.println("Cual es el numero de columnas para la matriz a ");
              numColumnaA=leer.nextInt();

              System.out.println("Cual es numero de filas para la matriz b");
              numFilasB=leer.nextInt();

              System.out.println("Cual es el numero de columnas para la matriz b");
              numColumnaB=leer.nextInt();

              int matrizA[][] = new int [numFilasA][numColumnaA];
              int matrizB[][] = new int [numFilasB][numColumnaB];

              if(numFilasA != numFilasB && numColumnaA !=  numColumnaB){
                System.out.println("Las matrices a y b son diferentes ");
                break;

              }else{
                System.out.println("Las matrices a y b son iguales ");
              }

                for(int i = 0 ; i <numFilasA ; i ++){
                    for(int j =  0 ;j<numColumnaA ; j++){

                    System.out.println("Cual es el valor de la matriz a  : " + "[" + (i + 1) + "][" + (j + 1) +"]");
                    matrizA[i][j] = leer.nextInt(); 
                    }
                }

                for(int x = 0 ; x <numFilasA ; x ++){
                    for(int y =  0 ;y<numColumnaA ; y++){

                    System.out.println("Cual es el valor de la matriz b : " + "[" +(x + 1) + "][" + (y + 1) +"]");
                    matrizB[x][y] = leer.nextInt(); 
                        }
                    }

                 System.out.println("La matriz a es");

                for(int i = 0 ; i <numFilasA ; i ++){
                    for(int j =  0 ;j<numColumnaA ; j++){
                          
                            System.out.print(matrizA[i][j] + " ");

                          }
                        System.out.println(" ");
                        }

                        System.out.println("La matriz b es ");

                        for(int x = 0 ; x <numFilasA ; x ++){
                          for(int y =  0 ;y<numColumnaA ; y++){
                         
                            System.out.print(matrizB[x][y] + " ");
                            }
                        System.out.println(" ");
                        }

                        System.out.println("Desea reiniciar el programa?(Si o No)");
                        respuesta = leer.next();
                        if(respuesta.equalsIgnoreCase("No")){
                            reiniciar = false;
                        }

                break;

            case 2:

              System.out.println("Para sumar 2 matrices tanto las columnas como las filas necesitan ser iguales");
             
              System.out.println("Cual es el numero de filas para la matriz a");
              numFilasA=leer.nextInt();

              System.out.println("Cual es el numero de columnas para la matriz a ");
              numColumnaA=leer.nextInt();

              System.out.println("Cual es numero de filas para la matriz b");
              numFilasB=leer.nextInt();

              System.out.println("Cual es el numero de columnas para la matriz b");
              numColumnaB=leer.nextInt();

              int matrizA1[][] = new int [numFilasA][numColumnaA];
              int matrizB1[][] = new int [numFilasB][numColumnaB];

              if(numFilasA != numFilasB && numColumnaA != numColumnaB){
                System.out.println("Las filas o las columnas no son iguales no se puede sumar ");
                break;

              }else{
                System.out.println("Las filas de la matriz a y b son iguales\n las columnas de la matriz a y b son iguales ");
              }

                for(int i = 0 ; i <numFilasA ; i ++){
                    for(int j =  0 ;j<numColumnaA ; j++){

                    System.out.println("Cual es el valor de la matriz a  : " + "[" + (i + 1) + "][" + (j + 1) +"]");
                    matrizA1[i][j] = leer.nextInt(); 

                    
                    }
                }

                for(int i = 0 ; i <numFilasA ; i ++){
                    for(int j =  0 ;j<numColumnaA ; j++){

                    System.out.println("Cual es el valor de la matriz b : " + "[" +(i + 1) + "][" + (j + 1) +"]");
                    matrizB1[i][j] = leer.nextInt(); 
                        }
                    }
                     int resultado [][] = new int [numFilasA][numColumnaA];
                    

                    for(int i = 0 ; i <matrizA1.length ; i ++){
                        for(int j =  0 ;j<matrizB1.length; j++){

                            resultado[i][j] = matrizA1[i][j] + matrizB1[i][j];

                        }
                    }

                    

                 System.out.println("La matriz a es");

                for(int i = 0 ; i <numFilasA ; i ++){
                    for(int j =  0 ;j<numColumnaA ; j++){
                        
                          
                            System.out.print(matrizA1[i][j] + " ");

                          }
                        System.out.println(" ");
                        }

                        System.out.println("La matriz b es ");

                        for(int i = 0 ; i <numFilasA ; i ++){
                          for(int j =  0 ;j<numColumnaA ; j++){

                         
                            System.out.print(matrizB1[i][j] + " ");

                            }
                        System.out.println(" ");
                        }

                        System.out.println("La suma de las matrices es ");

                        for(int i =0 ; i<numFilasA ;  i++){
                            for(int j =0 ; j<numColumnaA; j ++){
                                System.out.print(resultado[i][j] + " ");
                            }
                            System.out.println("");
                        }

                        System.out.println("Desea reiniciar el programa?(Si o No)");
                        respuesta = leer.next();
                        if(respuesta.equalsIgnoreCase("No")){
                            reiniciar = false;
                        }
                
                break;

             case 3:

                System.out.println("Para generar una matriz 0 de n x m \n solo se nexesita pedir la cantidad de filas y columnas ");

                System.out.println("Cual es la cantidad de filas que va a tener la matriz");
                numFilasA = leer.nextInt();
                
                System.out.println("Cual es la cantidad de columnas que va a tener la matriz");
                numColumnaA = leer.nextInt();

                 int matrizA2 [][] = new int [numFilasA][numColumnaA]; 

                for(int i =0; i<numFilasA; i ++){
                    for(int j =0 ; j<numColumnaA; j++){

                        matrizA2[i][j] = 0;
                        
                    }

                }

                System.out.println();

                System.out.println("La matriz de ceros n x m es ");

                for(int i=0; i<numFilasA; i++){
                    for(int j =0; j<numColumnaA; j++){
                        
                        System.out.print(matrizA2[i][j] + " ");
                    }
                    System.out.println();
                }
                
                System.out.println("Desea reiniciar el programa?(Si o No)");
                        respuesta = leer.next();
                        if(respuesta.equalsIgnoreCase("No")){
                            reiniciar = false;
                        }
                
                break;

             case 4:

                System.out.println("Para sacar la mtriz inversa aditiva solo se necesitan las columnas y filas ");

                System.out.println("Cual es la cantidad de filas de la mnatriz");
                numFilasA = leer.nextInt();

                System.out.println("Cual es la cantida de columnas para la matriz");
                numColumnaA = leer.nextInt();

                int matrizA3 [][] = new int [numFilasA][numColumnaA]; 

                for(int i =0; i<numFilasA; i ++){
                    for(int j =0 ; j<numColumnaA; j++){
                        
                        System.out.println("Cual es el valor de : " + "[" +(i + 1) + "][" + (j + 1) +"]");
                        matrizA3[i][j] = leer.nextInt();
                        
                    }

                }
                int matrizA3A [][] = new int[numFilasA][numColumnaA];

                 for(int i =0; i<numFilasA; i ++){
                    for(int j =0 ; j<numColumnaA; j++){

                        matrizA3A[i][j] = - matrizA3 [i][j];
                        
                    }

                }


                for(int i =0; i<numFilasA; i ++){
                    for(int j =0 ; j<numColumnaA; j++){

                      System.out.print(matrizA3A[i][j] + " ");
                        
                    }
                    System.out.println();
                }

                System.out.println("Desea reiniciar el programa?(Si o No)");
                        respuesta = leer.next();
                        if(respuesta.equalsIgnoreCase("No")){
                            reiniciar = false;
                        }

                break;

            case 5: 

                System.out.println("Para restar 2 matrices de n x m se necesitan las filas y las coolumnas y que ambas sean iguales\nSi las columnas y filas son diferentes no se pueden restar");

             
                System.out.println("Cual es el numero de filas para la matriz a");
                numFilasA=leer.nextInt();

                System.out.println("Cual es el numero de columnas para la matriz a ");
                numColumnaA=leer.nextInt();

                System.out.println("Cual es numero de filas para la matriz b");
                numFilasB=leer.nextInt();

                System.out.println("Cual es el numero de columnas para la matriz b");
                numColumnaB=leer.nextInt();

                int matrizA5[][] = new int [numFilasA][numColumnaA];
                int matrizB5[][] = new int [numFilasB][numColumnaB];

                if(numFilasA != numFilasB && numColumnaA != numColumnaB){
                System.out.println("Las filas o las columnas no son iguales no se puede sumar ");
                break;

                }else{
                System.out.println("Las filas de la matriz a y b son iguales\n las columnas de la matriz a y b son iguales ");
                }

                for(int i = 0 ; i <numFilasA ; i ++){
                    for(int j =  0 ;j<numColumnaA ; j++){

                    System.out.println("Cual es el valor de la matriz a  : " + "[" + (i + 1) + "][" + (j + 1) +"]");
                    matrizA5[i][j] = leer.nextInt(); 

                    
                    }
                }

                for(int i = 0 ; i <numFilasA ; i ++){
                    for(int j =  0 ;j<numColumnaA ; j++){

                    System.out.println("Cual es el valor de la matriz b : " + "[" +(i + 1) + "][" + (j + 1) +"]");
                    matrizB5[i][j] = leer.nextInt(); 
                        }
                    }
                     int resultado5 [][] = new int [numFilasA][numColumnaA];
                    

                    for(int i = 0 ; i <matrizA5.length ; i ++){
                        for(int j =  0 ;j<matrizB5.length; j++){

                            resultado5[i][j] = matrizA5[i][j] - matrizB5[i][j];

                        }
                    }

                 System.out.println("La matriz a es");

                for(int i = 0 ; i <numFilasA ; i ++){
                    for(int j =  0 ;j<numColumnaA ; j++){
                                                  
                            System.out.print(matrizA5[i][j] + " ");

                          }
                        System.out.println(" ");
                        }

                        System.out.println("La matriz b es ");

                        for(int i = 0 ; i <numFilasA ; i ++){
                          for(int j =  0 ;j<numColumnaA ; j++){

                         
                            System.out.print(matrizB5[i][j] + " ");

                            }
                        System.out.println(" ");
                        }

                        System.out.println("La suma de las matrices es ");

                        for(int i =0 ; i<numFilasA ;  i++){
                            for(int j =0 ; j<numColumnaA; j ++){
                                System.out.print(resultado5[i][j] + " ");
                            }
                            System.out.println("");
                        }

                        System.out.println("Desea reiniciar el programa?(Si o No)");
                        respuesta = leer.next();
                        if(respuesta.equalsIgnoreCase("No")){
                            reiniciar = false;
                        }
                                
                break;

            case 6:

                System.out.println("Para multiplicar un escalar por una matriz n x \n se nevcesitan el escalar filas y columnas");

                System.out.println("Cual es el numero de filas para la matriz a");
                numFilasA=leer.nextInt();

                System.out.println("Cual es el numero de columnas para la matriz a ");
                numColumnaA=leer.nextInt();

                System.out.println("Cual es el valor del escalar");
                int escalar = leer.nextInt();

                int matrizA6 [][] = new int[numFilasA][numColumnaA];

                for(int i = 0 ; i <numFilasA ; i ++){
                    for(int j =  0 ;j<numColumnaA ; j++){

                    System.out.println("Cual es el valor de la matriz a  : " + "[" + (i + 1) + "][" + (j + 1) +"]");
                    matrizA6[i][j] = leer.nextInt(); 

                    
                    }
                }

                 int resultado6 [][] = new int [numFilasA][numColumnaA];
                    

                    for(int i = 0 ; i <numFilasA ; i ++){
                        for(int j =  0 ;j<numColumnaA; j++){

                            resultado6[i][j] = escalar * matrizA6[i][j];

                        }
                    }


                        System.out.println("La multiplicacion de un escalar por una matriz n x m es ");

                        for(int i =0 ; i<numFilasA ;  i++){
                            for(int j =0 ; j<numColumnaA; j ++){
                                System.out.print(resultado6[i][j] + " ");
                            }
                            System.out.println("");
                        }

                        System.out.println("Desea reiniciar el programa?(Si o No)");
                        respuesta = leer.next();
                        if(respuesta.equalsIgnoreCase("No")){
                            reiniciar = false;
                        }

                
                break;

           case 7:

            System.out.println("Para multiplicar 2 matrices compatibles\n Para ello se necesitan las filas y las columnas");

            System.out.println("Cual es el numero de filas para la matriz a");
            numFilasA=leer.nextInt();

            System.out.println("Cual es el numero de columnas para la matriz a ");
            numColumnaA=leer.nextInt();

            System.out.println("Cual es numero de filas para la matriz b");
            numFilasB=leer.nextInt();

            System.out.println("Cual es el numero de columnas para la matriz b");
            numColumnaB=leer.nextInt();

            int matrizA7[][] = new int [numFilasA][numColumnaA];
            int matrizB7[][] = new int [numFilasB][numColumnaB];

            if(numFilasA != numFilasB && numColumnaA != numColumnaB){
              System.out.println("Las filas o las columnas no son iguales no se puede multiplicar ");
              break;

            }else if(numFilasA == numFilasB && numColumnaA == numColumnaB){
              System.out.println("Las filas de la matriz a y b son iguales\n las columnas de la matriz a y b son iguales ");
            }

              for(int i = 0 ; i <numFilasA ; i ++){
                  for(int j =  0 ;j<numColumnaA ; j++){

                  System.out.println("Cual es el valor de la matriz a  : " + "[" + (i + 1) + "][" + (j + 1) +"]");
                  matrizA7[i][j] = leer.nextInt(); 

                  
                  }
              }

              for(int i = 0 ; i <numFilasA ; i ++){
                  for(int j =  0 ;j<numColumnaA ; j++){

                  System.out.println("Cual es el valor de la matriz b : " + "[" +(i + 1) + "][" + (j + 1) +"]");
                  matrizB7[i][j] = leer.nextInt(); 
                      }
                  }
                   int resultado7 [][] = new int [numFilasA][numColumnaA];
                  

                  for(int i = 0 ; i <matrizA7.length ; i ++){
                      for(int j =  0 ;j<matrizB7.length; j++){

                          resultado7[i][j] = matrizA7[i][j] * matrizB7[i][j];

                      }
                  }

                  

               System.out.println("La matriz a es");

              for(int i = 0 ; i <numFilasA ; i ++){
                  for(int j =  0 ;j<numColumnaA ; j++){
                      
                        
                          System.out.print(matrizA7[i][j] + " ");

                        }
                      System.out.println(" ");
                      }

                      System.out.println("La matriz b es ");

                      for(int i = 0 ; i <numFilasA ; i ++){
                        for(int j =  0 ;j<numColumnaA ; j++){

                       
                          System.out.print(matrizB7[i][j] + " ");

                          }
                      System.out.println(" ");
                      }

                      System.out.println("La multiplicacion de las matrices es ");

                      for(int i =0 ; i<numFilasA ;  i++){
                          for(int j =0 ; j<numColumnaA; j ++){
                              System.out.print(resultado7[i][j] + " ");
                          }
                          System.out.println("");
                      }

                      System.out.println("Desea reiniciar el programa?(Si o No)");
                        respuesta = leer.next();
                        if(respuesta.equalsIgnoreCase("No")){
                            reiniciar = false;
                        }
                
                break;

            case 8:
                
                break;

            case 9:
                
                break;

                 case 10:
                
                break;
        
            default:

            System.out.println("elegi una opcion que este en el rango de las opciones");
            System.out.println("Saliendo de la aplicacion");
                break;
        }
    }

    }
}
