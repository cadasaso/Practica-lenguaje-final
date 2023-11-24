package com.carlos.qqsmillonario.enumeracion;

public enum PremiosPorPregunta {

  UNO(1, 100000, false),
  DOS(2, 200000, false),
  TRES(3, 300000, false),
  CUATRO(4, 500000, false),
  CINCO(5, 1000000, true),
  SEIS(6, 2000000, false),
  SIETE(7, 3000000, false),
  OCHO(8, 5000000, false),
  NUEVE(9, 7000000, false),
  DIEZ(10, 10000000, true),
  ONCE(11, 12000000, false),
  DOCE(12, 20000000, false),
  TRECE(13, 50000000, false),
  CATORCE(14, 100000000, false),
  QUINCE(15, 300000000, false);

  private int numeroPregunta;

  private int premioPregunta;

  private boolean esSeguro;

  PremiosPorPregunta(int numeroPregunta, int premioPregunta, boolean esSeguro) {
    this.numeroPregunta = numeroPregunta;
    this.premioPregunta = premioPregunta;
    this.esSeguro = esSeguro;
  }

  public int numeroPregunta() {
    return numeroPregunta;
  }

  public int premioPregunta() {
    return premioPregunta;
  }

  public boolean esSeguro() {
    return esSeguro;
  }

}