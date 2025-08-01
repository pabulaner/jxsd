package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.StringValueConverter;
import com.scell.model.drawingml.chart.MultiLvlStrRefModel;
import org.docx4j.dml.chart.CTMultiLvlStrRef;

public class MultiLvlStrRefConverter {
  private MultiLvlStrRefConverter() {
  }

  public static MultiLvlStrRefModel fromDocx4J(CTMultiLvlStrRef value) {
    if (value == null) return null;
    return new MultiLvlStrRefModel(StringValueConverter.fromDocx4J(value.getF()), MultiLvlStrDataConverter.fromDocx4J(value.getMultiLvlStrCache()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
