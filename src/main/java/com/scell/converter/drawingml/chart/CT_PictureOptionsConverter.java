package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_PictureOptionsModel;
import org.docx4j.dml.chart.CTPictureOptions;

public class CT_PictureOptionsConverter {
  private CT_PictureOptionsConverter() {
  }

  public static CT_PictureOptionsModel fromDocx4J(CTPictureOptions value) {
    if (value == null) return null;
    return new CT_PictureOptionsModel(CT_BooleanConverter.fromDocx4J(value.getApplyToFront()), CT_BooleanConverter.fromDocx4J(value.getApplyToSides()), CT_BooleanConverter.fromDocx4J(value.getApplyToEnd()), CT_PictureFormatConverter.fromDocx4J(value.getPictureFormat()), CT_PictureStackUnitConverter.fromDocx4J(value.getPictureStackUnit()));
  }

  public static CTPictureOptions toDocx4J(CT_PictureOptionsModel value) {
    return null;
  }
}
