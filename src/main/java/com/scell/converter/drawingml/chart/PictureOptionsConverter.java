package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.PictureOptionsModel;
import org.docx4j.dml.chart.CTPictureOptions;

public class PictureOptionsConverter {
  private PictureOptionsConverter() {
  }

  public static PictureOptionsModel fromDocx4J(CTPictureOptions value) {
    if (value == null) return null;
    return new PictureOptionsModel(BooleanConverter.fromDocx4J(value.getApplyToFront()), BooleanConverter.fromDocx4J(value.getApplyToSides()), BooleanConverter.fromDocx4J(value.getApplyToEnd()), PictureFormatConverter.fromDocx4J(value.getPictureFormat()), PictureStackUnitConverter.fromDocx4J(value.getPictureStackUnit()));
  }
}
