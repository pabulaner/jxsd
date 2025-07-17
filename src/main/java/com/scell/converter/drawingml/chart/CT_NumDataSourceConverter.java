package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_NumDataSourceModel;
import org.docx4j.dml.chart.CTNumDataSource;

public class CT_NumDataSourceConverter {
  private CT_NumDataSourceConverter() {
  }

  public static CT_NumDataSourceModel fromDocx4j(CTNumDataSource value) {
    if (value == null) return null;
  }

  public static CTNumDataSource toDocx4j(CT_NumDataSourceModel value) {
    return null;
  }
}
