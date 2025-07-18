package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.chart.CT_MultiLvlStrRefModel;
import org.docx4j.dml.chart.CTMultiLvlStrRef;

public class CT_MultiLvlStrRefConverter {
  private CT_MultiLvlStrRefConverter() {
  }

  public static CT_MultiLvlStrRefModel fromDocx4J(CTMultiLvlStrRef value) {
    if (value == null) return null;
    return new CT_MultiLvlStrRefModel(StringConverter.fromDocx4J(value.getF()), CT_MultiLvlStrDataConverter.fromDocx4J(value.getMultiLvlStrCache()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTMultiLvlStrRef toDocx4J(CT_MultiLvlStrRefModel value) {
    return null;
  }
}
