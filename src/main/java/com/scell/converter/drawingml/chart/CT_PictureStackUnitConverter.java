package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_PictureStackUnitModel;
import org.docx4j.dml.chart.CTPictureStackUnit;

public class CT_PictureStackUnitConverter {
  private CT_PictureStackUnitConverter() {
  }

  public static CT_PictureStackUnitModel fromDocx4J(CTPictureStackUnit value) {
    if (value == null) return null;
    return new CT_PictureStackUnitModel(ST_PictureStackUnitConverter.fromDocx4J(value.getVal()));
  }

  public static CTPictureStackUnit toDocx4J(CT_PictureStackUnitModel value) {
    return null;
  }
}
