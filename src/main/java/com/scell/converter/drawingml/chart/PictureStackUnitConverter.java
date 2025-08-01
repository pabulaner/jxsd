package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.PictureStackUnitModel;
import org.docx4j.dml.chart.CTPictureStackUnit;

public class PictureStackUnitConverter {
  private PictureStackUnitConverter() {
  }

  public static PictureStackUnitModel fromDocx4J(CTPictureStackUnit value) {
    if (value == null) return null;
    return new PictureStackUnitModel(PictureStackUnitValueConverter.fromDocx4J(value.getVal()));
  }
}
