package com.octa.teste;

public class temperaturas {
    public static void main(String[] args) {
        int[] temperaturas;
        int resultadoEsperado;
        int resultado;
        /***** Teste 01 *****/
        temperaturas = new int[]{17, 32, 14, 21};
        resultadoEsperado = 14;
        resultado = menorTemperatura(temperaturas);
        verificaResultado("01", resultadoEsperado, resultado);


/***** Teste 02 *****/
        temperaturas = new int[]{27, -8, -12, 9};
        resultadoEsperado = -8;
        resultado = menorTemperatura(temperaturas);
        verificaResultado("02", resultadoEsperado, resultado);


/***** Teste 03 *****/
        temperaturas = new int[]{-6, 14, 42, 6, 25, -18};
        resultadoEsperado = 6;
        resultado = menorTemperatura(temperaturas);
        verificaResultado("03", resultadoEsperado, resultado);


/***** Teste 04 *****/
        temperaturas = new int[]{34, 11, 13, -23, -11, 18};
        resultadoEsperado = 11;
        resultado = menorTemperatura(temperaturas);
        verificaResultado("04", resultadoEsperado, resultado);


/***** Teste 05 *****/
        temperaturas = new int[]{17, 0, 28, -4};
        resultadoEsperado = 0;
        resultado = menorTemperatura(temperaturas);
        verificaResultado("05", resultadoEsperado, resultado);

/***** Teste 06 *****/
        temperaturas = new int[]{-10, 27, 9, -12};
        resultadoEsperado = 9;
        resultado = menorTemperatura(temperaturas);
        verificaResultado("06", resultadoEsperado, resultado);

/***** Teste 07 *****/
        temperaturas = new int[]{-47, -14, -5, -12, -8};
        resultadoEsperado = -5;
        resultado = menorTemperatura(temperaturas);
        verificaResultado("07", resultadoEsperado, resultado);

/***** Teste 08 *****/
        temperaturas = new int[]{-47, -14, -5, -12, -5};
        resultadoEsperado = -5;
        resultado = menorTemperatura(temperaturas);
        verificaResultado("08", resultadoEsperado, resultado);

/***** Teste 09 *****/
        temperaturas = new int[]{-7, 12, -13, 8};
        resultadoEsperado = -7;
        resultado = menorTemperatura(temperaturas);
        verificaResultado("09", resultadoEsperado, resultado);
    }

    static int menorTemperatura(int[] temperaturas) {
        int temperatur;
        int temperaturPositiva = 1000000000;
        int temperaturNegativa = -1000000000;
        for (int temperatura : temperaturas) {
            if ((temperatura + "").contains("-") && temperatura > temperaturNegativa) {
                temperaturNegativa = temperatura;
            } else if (!(temperatura + "").contains("-") && temperatura < temperaturPositiva) {
                temperaturPositiva = temperatura;
            }
        }
        int tempNegatToPosi = Integer.parseInt((temperaturNegativa + "").substring(1));
        if (tempNegatToPosi<temperaturPositiva){
            temperatur = -tempNegatToPosi;
        }else{
            temperatur = temperaturPositiva;
        }

        return temperatur;
    }

    static void verificaResultado(String nTeste, int resultadoEsperado, int resultado) {
        if (resultadoEsperado == resultado) {
            System.out.println("Teste " + nTeste + " passou.\n");
        } else {
            System.out.println("Teste " + nTeste + " NAO passou (Resultado esperado = " + resultadoEsperado + ", Resultado obtido = " + resultado + ").\n");
        }
    }
}
