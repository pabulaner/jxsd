package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.chart.CT_StrRefModel;
import org.docx4j.dml.chart.CTStrRef;

public class CT_StrRefConverter {
  private CT_StrRefConverter() {
  }

  public static CT_StrRefModel fromDocx4J(CTStrRef value) {
    if (value == null) return null;
    return new CT_StrRefModel(StringConverter.fromDocx4J(value.getF()), CT_StrDataConverter.fromDocx4J(value.getStrCache()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTStrRef toDocx4J(CT_StrRefModel value) {
    return null;
  }
}
