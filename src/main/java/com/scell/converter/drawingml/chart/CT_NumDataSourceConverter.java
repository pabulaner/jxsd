package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_NumDataSourceModel;
import org.docx4j.dml.chart.CTNumDataSource;

public class CT_NumDataSourceConverter {
  private CT_NumDataSourceConverter() {
  }

  public static CT_NumDataSourceModel fromDocx4J(CTNumDataSource value) {
    if (value == null) return null;
    if (value.getNumRef() != null) return CT_NumDataSourceModel.newNumRef(CT_NumRefConverter.fromDocx4J(value.getNumRef()));
    if (value.getNumLit() != null) return CT_NumDataSourceModel.newNumLit(CT_NumDataConverter.fromDocx4J(value.getNumLit()));
    return new CT_NumDataSourceModel();
  }

  public static CTNumDataSource toDocx4J(CT_NumDataSourceModel value) {
    return null;
  }
}
