package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_OrderModel;
import org.docx4j.dml.chart.CTOrder;

public class CT_OrderConverter {
  private CT_OrderConverter() {
  }

  public static CT_OrderModel fromDocx4j(CTOrder value) {
    if (value == null) return null;
    return new CT_OrderModel(ST_OrderConverter.fromDocx4j(value.getVal()));
  }

  public static CTOrder toDocx4j(CT_OrderModel value) {
    return null;
  }
}
