package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_AxDataSourceModel;
import org.docx4j.dml.chart.CTAxDataSource;

public class CT_AxDataSourceConverter {
  private CT_AxDataSourceConverter() {
  }

  public static CT_AxDataSourceModel fromDocx4j(CTAxDataSource value) {
    if (value == null) return null;
  }

  public static CTAxDataSource toDocx4j(CT_AxDataSourceModel value) {
    return null;
  }
}
