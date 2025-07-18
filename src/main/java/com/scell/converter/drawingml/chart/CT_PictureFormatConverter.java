package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_PictureFormatModel;
import org.docx4j.dml.chart.CTPictureFormat;

public class CT_PictureFormatConverter {
  private CT_PictureFormatConverter() {
  }

  public static CT_PictureFormatModel fromDocx4J(CTPictureFormat value) {
    if (value == null) return null;
    return new CT_PictureFormatModel(ST_PictureFormatConverter.fromDocx4J(value.getVal()));
  }

  public static CTPictureFormat toDocx4J(CT_PictureFormatModel value) {
    return null;
  }
}
