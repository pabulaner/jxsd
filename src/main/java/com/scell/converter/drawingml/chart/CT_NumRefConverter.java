package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.chart.CT_NumRefModel;
import org.docx4j.dml.chart.CTNumRef;

public class CT_NumRefConverter {
  private CT_NumRefConverter() {
  }

  public static CT_NumRefModel fromDocx4j(CTNumRef value) {
    if (value == null) return null;
    return new CT_NumRefModel(StringConverter.fromDocx4j(value.getF()), CT_NumDataConverter.fromDocx4j(value.getNumCache()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTNumRef toDocx4j(CT_NumRefModel value) {
    return null;
  }
}
