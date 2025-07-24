package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.converter.drawingml.main.TextBodyConverter;
import com.scell.model.drawingml.chart.DTableModel;
import org.docx4j.dml.chart.CTDTable;

public class DTableConverter {
  private DTableConverter() {
  }

  public static DTableModel fromDocx4J(CTDTable value) {
    if (value == null) return null;
    return new DTableModel(BooleanConverter.fromDocx4J(value.getShowHorzBorder()), BooleanConverter.fromDocx4J(value.getShowVertBorder()), BooleanConverter.fromDocx4J(value.getShowOutline()), BooleanConverter.fromDocx4J(value.getShowKeys()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), TextBodyConverter.fromDocx4J(value.getTxPr()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
