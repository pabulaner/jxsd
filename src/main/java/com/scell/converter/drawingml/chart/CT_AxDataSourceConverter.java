package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_AxDataSourceModel;
import org.docx4j.dml.chart.CTAxDataSource;

public class CT_AxDataSourceConverter {
  private CT_AxDataSourceConverter() {
  }

  public static CT_AxDataSourceModel fromDocx4J(CTAxDataSource value) {
    if (value == null) return null;
    if (value.getMultiLvlStrRef() != null) return CT_AxDataSourceModel.newMultiLvlStrRef(CT_MultiLvlStrRefConverter.fromDocx4J(value.getMultiLvlStrRef()));
    if (value.getNumRef() != null) return CT_AxDataSourceModel.newNumRef(CT_NumRefConverter.fromDocx4J(value.getNumRef()));
    if (value.getNumLit() != null) return CT_AxDataSourceModel.newNumLit(CT_NumDataConverter.fromDocx4J(value.getNumLit()));
    if (value.getStrRef() != null) return CT_AxDataSourceModel.newStrRef(CT_StrRefConverter.fromDocx4J(value.getStrRef()));
    if (value.getStrLit() != null) return CT_AxDataSourceModel.newStrLit(CT_StrDataConverter.fromDocx4J(value.getStrLit()));
    return new CT_AxDataSourceModel();
  }

  public static CTAxDataSource toDocx4J(CT_AxDataSourceModel value) {
    return null;
  }
}
