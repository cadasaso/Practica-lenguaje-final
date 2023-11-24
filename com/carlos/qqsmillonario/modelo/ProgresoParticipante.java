package com.carlos.qqsmillonario.modelo;

import com.carlos.qqsmillonario.enumeracion.Comodin;
import com.carlos.qqsmillonario.enumeracion.PremiosPorPregunta;

import java.util.List;

public class ProgresoParticipante {

  private Participante participante;

  private int tiempoRespPregClasificatoria;

  private int valorPremioPesos;

  private int ultimaPreguntaRespondida;

  private List<Comodin> comodinesUsados;

  public Participante getParticipante() {
    return participante;
  }

  public void setParticipante(Participante participante) {
    this.participante = participante;
  }

  public int getTiempoRespPregClasificatoria() {
    return tiempoRespPregClasificatoria;
  }

  public void setTiempoRespPregClasificatoria(int tiempoRespPregClasificatoria) {
    this.tiempoRespPregClasificatoria = tiempoRespPregClasificatoria;
  }

  public int getValorPremioPesos() {
    return valorPremioPesos;
  }

  public void setValorPremioPesos(int valorPremioPesos) {
    this.valorPremioPesos = valorPremioPesos;
  }

  public int getUltimaPreguntaRespondida() {
    return ultimaPreguntaRespondida;
  }

  public void setUltimaPreguntaRespondida(int ultimaPreguntaRespondida) {
    this.ultimaPreguntaRespondida = ultimaPreguntaRespondida;
  }

  public List<Comodin> getComodinesUsados() {
    return comodinesUsados;
  }

  public void setComodinesUsados(List<Comodin> comodinesUsados) {
    this.comodinesUsados = comodinesUsados;
  }

  public int calcularPremio(int numeroPregunta) {
    int valorPremio = 0;
    for (PremiosPorPregunta premios : PremiosPorPregunta.values()) {
      if (premios.numeroPregunta() == numeroPregunta) {
        valorPremio = premios.premioPregunta();
      }
    }
    return valorPremio;
  }

  public Comodin cargarComodinPorCodigo(int codigo) {
    for (Comodin comodin : Comodin.values()) {
      if (comodin.codigoComodin() == codigo) {
        return comodin;
      }
    }
    return null;
  }

}