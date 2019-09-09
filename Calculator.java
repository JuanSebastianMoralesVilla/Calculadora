import java.util.Scanner;
import java.lang.Math;

// inicio de clase Lab  Sebastian3217938337
public class Calculator {

    public Scanner reader = new Scanner(System.in);
// creation and assignment of variables
    public static double num1 = 0, num2 = 0, result;
    public static double PI = 3.14,selectedMemory=0;
    public static int op, mode, tipe, cifra, menu, indice = 0;
    public static double memory[] = new double[10];
    public static boolean useMemory = false;
    
    public static void main(String[] arg) {

        Scanner reader = new Scanner(System.in);

        tipe();

    }
// method in which the mode type of the calculator is selected

    public static void tipe() {
        Scanner reader = new Scanner(System.in);

        System.out.print("Con cual modo desea operar la calculadora:\n"
                + "1.modo de una sola operacion a la vez. \n"
                + "2.flujo de operaciones. \n " + "\n");

        mode = reader.nextInt();

        switch (mode) {
            // una operacion a la vez
            case 1:
                Menu();

                break;
            // flujo de operaciones
            case 2:

                Menu2();

                break;

            default:
                System.out.println("Numero invalido, inicie de nuevo");

                break;

        }
    }

    // menu He gives me the options in full, and asks me for each case the number of numbers needed for such an operation.
    public static void Menu() {
        // fin sea falso repite el ciclo 

        boolean end = false;
        while (!end) {
            Scanner reader = new Scanner(System.in);
            System.out.print("\n" + "\nQue operacion desea realizar? \n"
                    + "1.SUMA\n"
                    + "2.RESTA\n"
                    + "3.DIVISION\n"
                    + "4.MULTIPLICACION\n"
                    + "5.MODULO\n"
                    + "6.RAIZ CUADRADA\n"
                    + "7.POTENCIACION\n"
                    + "8.EL FACTORIAL DE UN NUMERO\n"
                    + "9.CONVERSION ENTRE BINARIOS DECIMALES Y HEXADECIMALES\n"
                    + "10.BASE 10 DE UN NUMERO X( NOTACION CIENTIFICA).\n"
                    + "11.SENO\n"
                    + "12.COSENO\n"
                    + "13.TANGENTE\n"
                    + "14.LOGARITMO BASE X \n"
                    + "15.RAIZ N-ESIMA\n"
                    + "16.VER RESULTADOS EN MEMORIA\n"
                    + "17.GRADOS y RADIANES\n"
                    + "18. Salir \n" + "\n"
                    + "___________________________________________________________________________________________ \n");
            int op = reader.nextInt();
            int menu = op;
            if (op >= 1 && op <= 5) {
                menu = 1;
            }

            switch (menu) {
                case 1:
                    System.out.print("Ingrese numero 1 :");
                    num1 = reader.nextDouble();
                    System.out.print("Ingrese numero 2 :");
                    num2 = reader.nextDouble();
                    break;
                case 6:
                    System.out.print("Ingrese el numero que desee sacarle raiz cuadrada  :");
                    num1 = reader.nextDouble();
                    break;

                case 7:
                    System.out.print("Ingrese base la potencia  :");
                    num1 = reader.nextDouble();
                    System.out.print("Ingrese exponente al cual va a ser elevado la potencia1 :");
                    num2 = reader.nextDouble();
                    break;

                case 8:
                    System.out.print("Ingrese el numero para sacarle factorial :");
                    num1 = reader.nextDouble();
                    break;

                case 9:
                    System.out.print("Ingrese una cifra (entera) para darle un valor hexadecimal y decimal : ");
                    cifra = reader.nextInt();
                    break;

                case 10:
                    System.out.print("Ingrese numero entero positivo para logaritmo base 10 :");
                    num1 = reader.nextDouble();

                    break;

                case 11:
                    System.out.println(" Ingrese los grados para sacar el seno : ");
                    num1 = reader.nextDouble();
                    break;

                case 12:
                    System.out.println(" Ingrese los grados para sacar el coseno : ");
                    num1 = reader.nextDouble();
                    break;

                case 13:
                    System.out.println(" Ingrese los grados para sacar el tangente : ");
                    num1 = reader.nextDouble();
                    break;

                case 14:

                    System.out.print("Ingrese numero entero positivo para logaritmo base n :");
                    num1 = reader.nextDouble();

                    break;

                case 15:
                    System.out.print("Ingrese el radicando  :");
                    num1 = reader.nextDouble();
                    System.out.print("Ingrese el indice :");
                    num2 = reader.nextDouble();

                    break;

                case 16:
                    System.out.println("Para utilizar un número de la memoria escriba su indice: ");
                    break;

                case 17:
                    System.out.println("Escriba los grados para su conversion: ");
                    num1 = reader.nextDouble();
                    break;
                case 18:
                    end = true;
                    break;

                default:
                    System.out.println("Numero invalido");
                    break;

            }
            Resultoperations(op);
        }
    }

    // resultoperations it gives me the result of the operations
    public static int Resultoperations(int op) {
    	Scanner reader = new Scanner(System.in);
        switch (op) {
            case 1:
                result = suma(num1, num2);

                System.out.println(num1 + " +  " + num2 + " = " + result);
                break;

            case 2:
                result = resta(num1, num2);
                System.out.println(num1 + " -  " + num2 + " = " + result);
                break;
            case 3:
                result = division(num1, num2);
                System.out.println(num1 + " /  " + num2 + " = " + result);
                break;
            case 4:
                result = multiplicacion(num1, num2);
                System.out.println(num1 + " *  " + num2 + " = " + result);
                break;
            case 5:
                result = modulo(num1, num2);
                System.out.println(num1 + " % " + num2 + " = " + result);
                break;
            case 6:

                result = squareRoot(num1);
                System.out.println(result);
                break;
            case 7:
                result = potencia(num1, num2);
                System.out.println(num1 + " ^  " + num2 + " = " + result
                );
                break;

            case 8:
                result = factorial(num1);
                System.out.println("El factorial de " + num1 + " es :  " + result);
                break;
            case 9:
                String resultBinary = decimaltoBinary(cifra);
                String resultHex = decimaltoHex(cifra);
                System.out.println("El numero decimal ingresado es: " + cifra);
                System.out.println("El número convertido a binario es: " + resultBinary);
                System.out.println("El numero convertido a hexadecimal es: " + resultHex);
                break;

            case 10:
                result = logaritmoBase10(num1);

                break;

            case 11:
                result = seno(num1);

                break;

            case 12:
                result = coseno(num1);

                break;
            case 13:
                result = tangente(num1);

                break;
            case 14:
                result = logaritmoBaseN(num1);
                break;

            case 15:
                result = raizNesima(num1, num2);
                System.out.println("indice = " + num2 + "  " + " radicando = " + num1 + "  " + result);
                break;

            case 16:
                System.out.println(showMemory());
                int i = reader.nextInt();
                selectedMemory = memory[i];
                useMemory = true;
                Menu2();
                break;

            case 17:
                result = degretoradians_radTodegrees(num1);

                break;
        }
        if(op!=16)
        addToMemory(result);
        return op;
    }

    public static void addToMemory(double n) {
        if (indice <= 9) {
            memory[indice] = n;
            indice++;
        } else {
            indice = 0;
        }

    }

    public static String showMemory() {

        // msg= message
        String msg = "";
        for (int i = 0; i < memory.length; i++) {
            msg += String.valueOf(i) + "| "+String.valueOf("[" + memory[i]) + "]\n";
        }
        return msg;
    }

    // menu para flujo 2
    public static void Menu2() {
        // fin sea falso repite el ciclo 
        boolean first = false;
        boolean end = false;
        while (!end) {
            Scanner reader = new Scanner(System.in);
            System.out.print("\n" + "\nQue operacion desea realizar? \n"
                    + "1.+\n"
                    + "2.-\n"
                    + "3./\n"
                    + "4.x\n"
                    + "5.%\n"
                    + "6.v\n"
                    + "7.^\n"
                    + "8.!\n"
                    + "9.SENO\n"
                    + "10.COSENO\n"
                    + "11.TANGENTE\n"
                    + "12.VER RESULTADOS EN MEMORIA\n"
                    + "13. Salir \n" + "\n");
            int op = reader.nextInt();
            int menu = op;
            if (op >= 1 && op <= 5) {
                menu = 1;
            }
            
            switch (menu) {
                case 1:
                    if (!first && !useMemory) {
                        System.out.print("Ingrese numero 1 :");
                        num1 = reader.nextDouble();
                        System.out.print("Ingrese numero 2 :");
                        num2 = reader.nextDouble();
                    } else {
                    	if(first)
                    		num1 = result;
                    	else {
                    		num1 = selectedMemory;
                    		useMemory = false;
                    	}
                    		
                        System.out.print("Ingrese numero 2 :");
                        num2 = reader.nextDouble();
                    }
                    first = true;
                    break;
                case 6:
                    if (!first && !useMemory) {
                        System.out.print("Ingrese el numero que desee sacarle raiz cuadrada  :");
                        num1 = reader.nextDouble();
                    } else {
                    	if(first)
                    		num1 = result;
                    	else {
                    		num1 = selectedMemory;
                    		useMemory = false;
                    	}
                    }

                    first = true;
                    break;

                case 7:
                    if (!first && !useMemory) {
                        System.out.print("Ingrese base la potencia  :");
                        num1 = reader.nextDouble();
                        System.out.print("Ingrese exponente al cual va a ser elevado la potencia: ");
                        num2 = reader.nextDouble();
                    } else {
                    	if(first)
                            num1 = result;
                    	else {
                    		num1 = selectedMemory;
                    		useMemory = false;
                    	}
                        System.out.print("Ingrese exponente al cual va a ser elevado la potencia: ");
                        num2 = reader.nextDouble();
                    }

                    first = true;
                    break;

                case 8:
                    if (!first && !useMemory) {
                        System.out.print("Ingrese el numero para sacarle factorial :");
                        num1 = reader.nextDouble();
                    } else {
                    	if(first)
                            num1 = result;
                    	else {
                    		num1 = selectedMemory;
                    		useMemory = false;
                    	}
                    }
                    first = true;
                    break;

                case 9:
                    if (!first && !useMemory) {
                        System.out.println(" Ingrese los grados para sacar el seno : ");
                        num1 = reader.nextDouble();
                    } else {
                    	if(first)
                            num1 = result;
                    	else {
                    		num1 = selectedMemory;
                    		useMemory = false;
                    	}
                    }
                    first = true;
                    break;

                case 10:
                    if (!first && !useMemory) {
                        System.out.println(" Ingrese los grados para sacar el coseno : ");
                        num1 = reader.nextDouble();
                    } else {
                    	if(first)
                            num1 = result;
                    	else {
                    		num1 = selectedMemory;
                    		useMemory = false;
                    	}
                    }

                    first = true;
                    break;

                case 11:
                    if (!first && !useMemory) {
                        System.out.println(" Ingrese los grados para sacar el tangente : ");
                        num1 = reader.nextDouble();
                    } else {
                    	if(first)
                            num1 = result;
                    	else {
                    		num1 = selectedMemory;
                    		useMemory = false;
                    	}
                    }

                    first = true;
                    break;

                case 12:
                    System.out.println("Para utilizar un número de la memoria escriba su indice");
                    break;
                case 13:
                    end = true;
                    break;

                default:
                    System.out.println("Numero invalido");
                    break;

            }
            ResultoperationsMemoria(op);
        }
    }

    // metodo flujo de operaciones
    public static int ResultoperationsMemoria(int op) {
    	Scanner reader = new Scanner(System.in);
        switch (op) {
            case 1:

                result = suma(num1, num2);

                System.out.println(num1 + " +  " + num2 + " = " + result);
                break;

            case 2:
                result = resta(num1, num2);
                System.out.println(num1 + " -  " + num2 + " = " + result);
                break;
            case 3:
                result = division(num1, num2);
                System.out.println(num1 + " /  " + num2 + " = " + result);
                break;
            case 4:
                result = multiplicacion(num1, num2);
                System.out.println(num1 + " *  " + num2 + " = " + result);
                break;
            case 5:
                result = modulo(num1, num2);
                System.out.println(num1 + " % " + num2 + " = " + result);
                break;
            case 6:

                result = squareRoot(num1);
                System.out.println(result);
                break;
            case 7:
                result = potencia(num1, num2);
                System.out.println(num1 + " ^  " + num2 + " = " + result
                );
                break;

            case 8:
                result = factorial(num1);
                System.out.println("El factorial de " + num1 + " es :  " + result);
                break;

            case 9:
                result = seno(result);

                break;

            case 10:
                result = coseno(result);

                break;
            case 11:
                result = tangente(result);

                break;
            case 12:
            	System.out.println(showMemory()+"\n");
                int i = reader.nextInt();
                selectedMemory = memory[i];
                useMemory = true;
                Menu2();
                break;
        }
        addToMemory(result);
        return op;
    }

    // CONTRATO SUM
    /**
     * description sum of two integers. <br>
     * <b>pre: </b> Parameters num1, num2 are entered as integers . <br>
     *
     * @param num1 integer to operate
     * @param num2 Entero to operate
     * @return result
     */
    public static double suma(double num1, double num2) {

        result = num1 + num2;

        return result;
    }
// CONTRATO subtraction 

    /**
     * description subtraction of two integers. <br>
     * <b>pre: </b> Parameters num1, num2 are entered as integers . <br>
     *
     * @param num1 integer to operate.
     * @param num2 integer to operate.
     * @return result
     */
    public static double resta(double num1, double num2) {

        result = num1 - num2;

        return result;
    }
// CONTRATO MULTIPLICATION

    /**
     * description multiplication of two integers. <br>
     * <b>pre: </b> Parameters num1, num2 are entered as integers . <br>
     *
     * @param num1 integer to operate.
     * @param num2 integer to operate.
     * @return result
     */
    public static double multiplicacion(double num1, double num2) {

        result = num1 * num2;

        return result;
    }
//CONTRATO DIVISION

    /**
     * description division of two integers. <br>
     * <b>pre: </b> Parameters num1, num2 are entered as integers . <br>
     *
     * @param num1 integer to operate.
     * @param num2 integer to operate. throws Exception the parameters entered
     * are not double type, this exception will be executed
     * @return result
     */
    public static double division(double num1, double num2) {

        result = num1 / num2;

        return result;
    }
//CONTRATO MODULE

    /**
     * description: module of two integers. <br>
     * <b>pre: </b> Parameters num1, num2 are entered as integers . <br>
     *
     * @param num1 integer to operate.
     * @param num2 integer to operate.
     *
     * @return result
     */
    public static double modulo(double num1, double num2) {

        result = num1 % num2;

        return result;
    }
    // CONTRATO SQUARE ROOT 

    /**
     * description: returns the correctly rounded positive square root of a
     * double value.
     *
     * @param x integer
     * @return This method returns the positive square root of a. If the
     * argument is NaN or less than zero, the result is NaN. exception: that x
     * is not number negative
     *
     *
     */
    public static double squareRoot(double x) {
// creation and assignment of variables
// -------------------------
        double cotaSup, cotaInf = 0, puntoM = 0, root = 0, previous = 0;
        boolean end = false;
        cotaSup = (x > 1) ? x : 1;

        if (x != 0 && x != 1) {
            while (!end) {
                puntoM = (cotaSup + cotaInf) / 2;
                if ((puntoM * puntoM) > x) {
                    cotaSup = puntoM;
                } else if ((puntoM * puntoM) < x) {
                    cotaInf = puntoM;
                } else if ((puntoM * puntoM) == x) {
                    root = puntoM;
                }
                if (puntoM == previous) {
                    root = puntoM;
                    end = true;
                }
                if (!(Math.abs((x - (puntoM * puntoM))) > 0.00000000000001)) {
                    root = puntoM;
                    end = true;
                }
                previous = puntoM;
            }
        } else {
            if (x == 0) {
                return 0;
            } else {
                return 1;
            }
        }
        return root;
    }

    // CONTRATO POTENTIATION
    /**
     * description: Here we multiply a number by itself the times indicated by
     * the exponent.<br>
     * <b>pre: </b> Parameters num1, num2 are entered as integers . <br>
     *
     * @param num1 base.
     * @param num2 exponent.
     * @return result, base ^ exponent.
     */
    public static double potencia(double num1, double num2) {
        // num1 = base de la potencia 
        // num2 = exponente

        double potencia = 1;
        for (int i = 0; i < num2; i++) {
            potencia *= num1;
            result = potencia;
        }

        return potencia;
    }

    // CONTRATO FACTORIAL
    /**
     * description: The factorial of any number is: the number by the factorial
     * of (1 less than the number) .<br>
     * <b>pre: </b> Parameters num1 are entered as integer . <br>
     *
     * @param num1.
     *
     * @return result.
     */
    public static double factorial(double num1) {

        int result = 1;
        for (int i = 1; i <= num1; i++) {
            result *= i;
        }

        return result;

    }

    //CONTRATO DECIMAL TO BINARY
    /**
     * description: convert decimal to binary .<br>
     * <b>pre: </b> num1 is integer positive . <br>
     *
     * @param num1.
     *
     * @return binario.
     */
    public static String decimaltoBinary(double num1) {

        String binario = "";
        if (num1 > 0) {
            while (num1 > 0) {
                if (num1 % 2 == 0) {
                    binario = "0" + binario;
                } else {
                    binario = "1" + binario;
                }
                num1 = (int) num1 / 2;
            }
        } else if (num1 == 0) {
            binario = "0";
        } else {
            binario = "No se pudo convertir el numero. Ingrese solo números positivos";
        }

        return binario;
    }

    //CONTRATO DECIMAL TO HEX
    /**
     * description: convert decimal to hexadecimal It is used to convert the
     * numbers from 10 to 15 to its equivalent in Hexadecimal (A, B, C, D, E or
     * F). If it is a number less than 10, it returns the same number. .<br>
     * <b>pre: </b> num1 is integer positive . <br>
     *
     * @param num1.
     *
     * @return hexadecimal.
     */
    public static String decimaltoHex(double num1) {
        char digitosH[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        String hexadecimal2 = " ";
        int resto;
        while (cifra > 0) {
            resto = cifra % 16;
            hexadecimal2 = digitosH[resto] + hexadecimal2;
            cifra /= 16;
        }

        return hexadecimal2;
    }

    // CONTRATO DEGREES TO RADIANS _ RADIANS TO DEGREES
    /**
     * description: The java.lang.Math.toRadians(double angdeg) converts an
     * angle measured in degrees to an approximately equivalent angle measured
     * in radians. The conversion from degrees to radians is generally inexact.
     * .<br>
     * The java.lang.Math.toDegrees(double angrad) converts an angle measured in
     * radians to an approximately equivalent angle measured in degrees. The
     * conversion from radians to degrees is generally inexact; users should not
     * expect cos(toRadians(90.0)) to exactly equal 0.0. <br>
     *
     * @param num1 angle degree and radians.
     *
     * @return This method returns the measurement of the angle angdeg in
     * radians and inversely (result).
     */
    public static double degretoradians_radTodegrees(double num1) {

        double angRadianes = Math.toRadians(num1);
        System.out.println("Deg a Rad: " + num1 + "º = " + angRadianes + " rad");

        num1 = Math.toDegrees(angRadianes);
        System.out.println("Rad a Deg: " + angRadianes + " rad = " + num1 + "º");

        return result;
    }
// CONTRATO SENO

    /**
     * description: The java.lang.Math.sin(double num1) the trigonometric sine
     * of an angle. Special cases - If the argument is NaN or an infinity, then
     * the result is NaN. If the argument is zero, then the result is a zero
     * with the same sign as the argument.
     *
     * @param num1 an angle, in radians.
     * @return sen of param (result).
     */
    public static double seno(double num1) {
        double angulo = num1; //grados

        result = Math.sin(angulo);
        System.out.println("Seno de " + angulo + "º = " + result + " " + " radianes ");

        return result;
    }
// CONTRATO COSENO

    /**
     * description: The java.lang.Math.cos(double num1) returns the
     * trigonometric cosine of an angle.If the argument is NaN or an infinity,
     * then the result is NaN.The computed result must be within 1 ulp of the
     * exact result. Results must be semi-monotonic.
     *
     * @param num1 an angle, in radians.
     * @return This method returns the cosine of the param (result).
     */
    public static double coseno(double num1) {

        double angulo = num1; //grados

        result = Math.cos(angulo);
        System.out.println("Coseno de " + angulo + "º = " + result + " " + " radianes ");
        return result;
    }

    // CONTRATO TANGENTE 
    /**
     * description:The java.lang.Math.tan(num1) returns the trigonometric
     * tangent of an angle. Special cases -If the argument is NaN or an
     * infinity, then the result is NaN.
     *
     * If the argument is zero, then the result is a zero with the same sign as
     * the argument. The computed result must be within 1 ulp of the exact
     * result.
     *
     * @param num1 an angle, in radians
     * @return This method returns the tangent of the param (result).
     */
    public static double tangente(double num1) {
        double angulo = num1; //grados

        result = Math.tan(angulo);
        System.out.println("Tangente de " + angulo + "º = " + result + " " + "radianes");
        return result;
    }

// CONTRATO  LOGARITMOBASE 10
    /**
     * description:java.lang.Math.log10(double num1) returns the base 10
     * logarithm of a double value. Special cases:
     *
     * If the argument is NaN or less than zero, then the result is NaN. If the
     * argument is positive infinity, then the result is positive infinity. If
     * the argument is positive zero or negative zero, then the result is
     * negative infinity. If the argument is equal to 10n for integer n, then
     * the result is n.
     *
     * @param num1 value
     * @return This method returns the base 10 logarithm of num1 (result).
     */
    public static double logaritmoBase10(double num1) {

        if (num1 > 0) {
            System.out.println(Math.log10(num1));
        } else {
            System.out.println("numero invalido");

        }
        return result;
    }

    // CONTRATO  LOGARITMOBASE n
    public static double logaritmoBaseN(double num1) {

        result = Math.log(num1);
        return result;
    }

    // CONTRATO RAIZ N-ESIMA
    /**
     * description the nth root is what is multiplied n times to have the
     * original value
     *
     * @param num1 integer
     * @param num2 integer
     * @return root of the n (result)
     */
    public static double raizNesima(double num1, double num2) {

        result = Math.pow(num1, 1.0 / num2);

        return result;

    }

}
// fin de llave Lab
