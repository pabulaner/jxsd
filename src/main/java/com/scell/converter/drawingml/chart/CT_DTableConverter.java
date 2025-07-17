package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.converter.drawingml.main.CT_TextBodyConverter;
import com.scell.model.drawingml.chart.CT_DTableModel;
import org.docx4j.dml.chart.CTDTable;

public class CT_DTableConverter {
  private CT_DTableConverter() {
  }

  public static CT_DTableModel fromDocx4j(CTDTable value) {
    if (value == null) return null;
    return new CT_DTableModel(CT_BooleanConverter.fromDocx4j(value.getShowHorzBorder()), CT_BooleanConverter.fromDocx4j(value.getShowVertBorder()), CT_BooleanConverter.fromDocx4j(value.getShowOutline()), CT_BooleanConverter.fromDocx4j(value.getShowKeys()), CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_TextBodyConverter.fromDocx4j(value.getTxPr()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTDTable toDocx4j(CT_DTableModel value) {
    return null;
  }
}
