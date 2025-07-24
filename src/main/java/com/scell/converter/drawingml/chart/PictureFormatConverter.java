package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.PictureFormatModel;
import org.docx4j.dml.chart.CTPictureFormat;

public class PictureFormatConverter {
  private PictureFormatConverter() {
  }

  public static PictureFormatModel fromDocx4J(CTPictureFormat value) {
    if (value == null) return null;
    return new PictureFormatModel(PictureFormatConverter.fromDocx4J(value.getVal()));
  }
}
