package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.converter.drawingml.main.CT_TextBodyConverter;
import com.scell.model.drawingml.chart.CT_DTableModel;
import org.docx4j.dml.chart.CTDTable;

public class CT_DTableConverter {
  private CT_DTableConverter() {
  }

  public static CT_DTableModel fromDocx4J(CTDTable value) {
    if (value == null) return null;
    return new CT_DTableModel(CT_BooleanConverter.fromDocx4J(value.getShowHorzBorder()), CT_BooleanConverter.fromDocx4J(value.getShowVertBorder()), CT_BooleanConverter.fromDocx4J(value.getShowOutline()), CT_BooleanConverter.fromDocx4J(value.getShowKeys()), CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()), CT_TextBodyConverter.fromDocx4J(value.getTxPr()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTDTable toDocx4J(CT_DTableModel value) {
    return null;
  }
}
