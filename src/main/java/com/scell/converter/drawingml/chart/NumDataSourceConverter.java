package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.NumDataSourceModel;
import org.docx4j.dml.chart.CTNumDataSource;

public class NumDataSourceConverter {
  private NumDataSourceConverter() {
  }

  public static NumDataSourceModel fromDocx4J(CTNumDataSource value) {
    if (value == null) return null;
    if (value.getNumRef() != null) return NumDataSourceModel.newNumRef(NumRefConverter.fromDocx4J(value.getNumRef()));
    if (value.getNumLit() != null) return NumDataSourceModel.newNumLit(NumDataConverter.fromDocx4J(value.getNumLit()));
    return new NumDataSourceModel();
  }
}
