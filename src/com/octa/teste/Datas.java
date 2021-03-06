package com.octa.teste;

public class Datas {

  public static void main(String[] args) {
    String dataInicial;
    String dataFinal;
    int resultadoEsperado;
    int resultado;

    /***** Teste 01 *****/
    dataInicial = "2018-01-01";
    dataFinal = "2018-01-02";
    resultadoEsperado = 1;
    resultado = calculaDias(dataInicial, dataFinal);
    verificaResultado("01", resultadoEsperado, resultado);

/***** Teste 02 *****/
    dataInicial = "2018-01-01";
    dataFinal = "2018-02-01";
    resultadoEsperado = 31;
    resultado = calculaDias(dataInicial, dataFinal);
    verificaResultado("02", resultadoEsperado, resultado);

/***** Teste 03 *****/
    dataInicial = "2018-01-01";
    dataFinal = "2018-02-02";
    resultadoEsperado = 32;
    resultado = calculaDias(dataInicial, dataFinal);
    verificaResultado("03", resultadoEsperado, resultado);

/***** Teste 04 *****/
    dataInicial = "2018-01-01";
    dataFinal = "2018-02-28";
    resultadoEsperado = 58;
    resultado = calculaDias(dataInicial, dataFinal);
    verificaResultado("04", resultadoEsperado, resultado);

/***** Teste 05 *****/
    dataInicial = "2018-01-15";
    dataFinal = "2018-03-15";
    resultadoEsperado = 59;
    resultado = calculaDias(dataInicial, dataFinal);
    verificaResultado("05", resultadoEsperado, resultado);

/***** Teste 06 *****/
    dataInicial = "2018-01-01";
    dataFinal = "2019-01-01";
    resultadoEsperado = 365;
    resultado = calculaDias(dataInicial, dataFinal);
    verificaResultado("06", resultadoEsperado, resultado);

/***** Teste 07 *****/
    dataInicial = "2018-01-01";
    dataFinal = "2020-01-01";
    resultadoEsperado = 730;
    resultado = calculaDias(dataInicial, dataFinal);
    verificaResultado("07", resultadoEsperado, resultado);

/***** Teste 08 *****/
    dataInicial = "2018-12-31";
    dataFinal = "2019-01-01";
    resultadoEsperado = 1;
    resultado = calculaDias(dataInicial, dataFinal);
    verificaResultado("08", resultadoEsperado, resultado);

/***** Teste 09 *****/
    dataInicial = "2018-05-31";
    dataFinal = "2018-06-01";
    resultadoEsperado = 1;
    resultado = calculaDias(dataInicial, dataFinal);
    verificaResultado("09", resultadoEsperado, resultado);

/***** Teste 10 *****/
    dataInicial = "2018-05-31";
    dataFinal = "2019-06-01";
    resultadoEsperado = 366;
    resultado = calculaDias(dataInicial, dataFinal);
    verificaResultado("10", resultadoEsperado, resultado);

/***** Teste 11 *****/
    dataInicial = "2016-02-01";
    dataFinal = "2016-03-01";
    resultadoEsperado = 29;
    resultado = calculaDias(dataInicial, dataFinal);
    verificaResultado("11", resultadoEsperado, resultado);

/***** Teste 12 *****/
    dataInicial = "2016-01-01";
    dataFinal = "2016-03-01";
    resultadoEsperado = 60;
    resultado = calculaDias(dataInicial, dataFinal);
    verificaResultado("12", resultadoEsperado, resultado);

/***** Teste 13 *****/
    dataInicial = "1981-09-21";
    dataFinal = "2009-02-12";
    resultadoEsperado = 10006;
    resultado = calculaDias(dataInicial, dataFinal);
    verificaResultado("13", resultadoEsperado, resultado);

/***** Teste 14 *****/
    dataInicial = "1981-07-31";
    dataFinal = "2009-02-12";
    resultadoEsperado = 10058;
    resultado = calculaDias(dataInicial, dataFinal);
    verificaResultado("14", resultadoEsperado, resultado);

/***** Teste 15 *****/
    dataInicial = "2004-03-01";
    dataFinal = "2009-02-12";
    resultadoEsperado = 1809;
    resultado = calculaDias(dataInicial, dataFinal);
    verificaResultado("15", resultadoEsperado, resultado);

/***** Teste 16 *****/
    dataInicial = "2004-03-01";
    dataFinal = "2009-02-12";
    resultadoEsperado = 1809;
    resultado = calculaDias(dataInicial, dataFinal);
    verificaResultado("16", resultadoEsperado, resultado);

/***** Teste 17 *****/
    dataInicial = "1900-02-01";
    dataFinal = "1900-03-01";
    resultadoEsperado = 28;
    resultado = calculaDias(dataInicial, dataFinal);
    verificaResultado("17", resultadoEsperado, resultado);

/***** Teste 18 *****/
    dataInicial = "1899-01-01";
    dataFinal = "1901-01-01";
    resultadoEsperado = 730;
    resultado = calculaDias(dataInicial, dataFinal);
    verificaResultado("18", resultadoEsperado, resultado);

/***** Teste 19 *****/
    dataInicial = "2000-02-01";
    dataFinal = "2000-03-01";
    resultadoEsperado = 29;
    resultado = calculaDias(dataInicial, dataFinal);
    verificaResultado("19", resultadoEsperado, resultado);

/***** Teste 20 *****/
    dataInicial = "1999-01-01";
    dataFinal = "2001-01-01";
    resultadoEsperado = 731;
    resultado = calculaDias(dataInicial, dataFinal);
    verificaResultado("20", resultadoEsperado, resultado);
  }

  static int calculaDias(String dataInicial, String dataFinal) {
    int anoInicial = Integer.parseInt(dataInicial.substring(0, 4));
    int mesInicial = Integer.parseInt(dataInicial.substring(5, 7));
    int diaInicial = Integer.parseInt(dataInicial.substring(8, 10));
    int anoFinal = Integer.parseInt(dataFinal.substring(0, 4));
    int mesFinal = Integer.parseInt(dataFinal.substring(5, 7));
    int diaFinal = Integer.parseInt(dataFinal.substring(8, 10));
    int dias = 0;
    while (true) {

      if (anoInicial == anoFinal && mesInicial == mesFinal && diaInicial == diaFinal)
        break;

      if (diaInicial == 30 && (mesInicial == 4 || mesInicial == 6 || mesInicial == 9 || mesInicial == 11)) {
        diaInicial = 1;
        mesInicial++;
      } else if (diaInicial == 28 && mesInicial == 2 && ((anoInicial % 100 != 0 && anoInicial % 4 != 0) || (anoInicial % 100 == 0 && anoInicial % 400 != 0))) {
        diaInicial = 1;
        mesInicial++;
      }else if (diaInicial == 29 && mesInicial == 2 && ((anoInicial % 100 != 0 && anoInicial % 4 == 0) || (anoInicial % 100 == 0 && anoInicial % 400 == 0))) {
        diaInicial = 1;
        mesInicial++;
      }
      else {
        diaInicial++;
        if (diaInicial == 32) {
          diaInicial = 1;
          mesInicial++;
          if (mesInicial == 13) {
            mesInicial = 1;
            anoInicial++;
          }
        }
      }
      dias++;
//      System.out.println(diaInicial);
    }
    return dias;
  }

  static void verificaResultado(String nTeste, int resultadoEsperado, int resultado) {
    if (resultadoEsperado == resultado) {
      System.out.println("Teste " + nTeste + " passou.\n");
    } else {
      System.out.println("Teste " + nTeste + " NAO passou (Resultado esperado = " + resultadoEsperado + ", Resultado obtido = " + resultado + ").\n");
    }
  }


}
