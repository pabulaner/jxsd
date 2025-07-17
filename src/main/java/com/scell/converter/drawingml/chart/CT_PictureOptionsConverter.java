package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_PictureOptionsModel;
import org.docx4j.dml.chart.CTPictureOptions;

public class CT_PictureOptionsConverter {
  private CT_PictureOptionsConverter() {
  }

  public static CT_PictureOptionsModel fromDocx4j(CTPictureOptions value) {
    if (value == null) return null;
    return new CT_PictureOptionsModel(CT_BooleanConverter.fromDocx4j(value.getApplyToFront()), CT_BooleanConverter.fromDocx4j(value.getApplyToSides()), CT_BooleanConverter.fromDocx4j(value.getApplyToEnd()), CT_PictureFormatConverter.fromDocx4j(value.getPictureFormat()), CT_PictureStackUnitConverter.fromDocx4j(value.getPictureStackUnit()));
  }

  public static CTPictureOptions toDocx4j(CT_PictureOptionsModel value) {
    return null;
  }
}
