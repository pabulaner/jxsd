package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_SizeRepresentsModel;
import org.docx4j.dml.chart.STSizeRepresents;

public class ST_SizeRepresentsConverter {
  private ST_SizeRepresentsConverter() {
  }

  public static ST_SizeRepresentsModel fromDocx4j(STSizeRepresents value) {
    if (value == null) return null;
    if (value == STSizeRepresents.AREA) return ST_SizeRepresentsModel.AREA;
    if (value == STSizeRepresents.W) return ST_SizeRepresentsModel.W;
    return null;
  }

  public static STSizeRepresents toDocx4j(ST_SizeRepresentsModel value) {
    return null;
  }
}
