package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.AxDataSourceModel;
import org.docx4j.dml.chart.CTAxDataSource;

public class AxDataSourceConverter {
  private AxDataSourceConverter() {
  }

  public static AxDataSourceModel fromDocx4J(CTAxDataSource value) {
    if (value == null) return null;
    if (value.getMultiLvlStrRef() != null) return AxDataSourceModel.newMultiLvlStrRef(MultiLvlStrRefConverter.fromDocx4J(value.getMultiLvlStrRef()));
    if (value.getNumRef() != null) return AxDataSourceModel.newNumRef(NumRefConverter.fromDocx4J(value.getNumRef()));
    if (value.getNumLit() != null) return AxDataSourceModel.newNumLit(NumDataConverter.fromDocx4J(value.getNumLit()));
    if (value.getStrRef() != null) return AxDataSourceModel.newStrRef(StrRefConverter.fromDocx4J(value.getStrRef()));
    if (value.getStrLit() != null) return AxDataSourceModel.newStrLit(StrDataConverter.fromDocx4J(value.getStrLit()));
    return new AxDataSourceModel();
  }
}
