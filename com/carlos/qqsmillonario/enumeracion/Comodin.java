package com.carlos.qqsmillonario.enumeracion;

public enum Comodin {

  MITAD(1, "50/50"),
  LLAMADA_AMIGO(2, "Llamada a un amigo"),
  AYUDA_PUBLICO(3, "Ayuda del publico");

  private int codigoComodin;

  private String nombreComodin;

  public String nombreComodin() {
    return nombreComodin;
  }

  public int codigoComodin() {
    return codigoComodin;
  }

  Comodin(int codigoComodin, String nombreComodin) {
    this.nombreComodin = nombreComodin;
    this.codigoComodin = codigoComodin;
  }

}