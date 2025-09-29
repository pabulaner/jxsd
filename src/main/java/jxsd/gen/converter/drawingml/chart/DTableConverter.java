package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.converter.drawingml.main.TextBodyConverter;
import jxsd.gen.model.drawingml.chart.DTableModel;
import org.docx4j.dml.chart.CTDTable;

/**
 * This is a generated sequence class.
 */
public class DTableConverter {
  private DTableConverter() {
  }

  public static DTableModel fromDocx4j(CTDTable value) {
    if (value == null) return null;
    return new DTableModel(BooleanConverter.fromDocx4j(value.getShowHorzBorder()), BooleanConverter.fromDocx4j(value.getShowVertBorder()), BooleanConverter.fromDocx4j(value.getShowOutline()), BooleanConverter.fromDocx4j(value.getShowKeys()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()), TextBodyConverter.fromDocx4j(value.getTxPr()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTDTable toDocx4j(DTableModel value) {
    if (value == null) return null;
    CTDTable result = new CTDTable();
    result.setShowHorzBorder(BooleanConverter.toDocx4j(value.getShowHorzBorder()));
    result.setShowVertBorder(BooleanConverter.toDocx4j(value.getShowVertBorder()));
    result.setShowOutline(BooleanConverter.toDocx4j(value.getShowOutline()));
    result.setShowKeys(BooleanConverter.toDocx4j(value.getShowKeys()));
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    result.setTxPr(TextBodyConverter.toDocx4j(value.getTxPr()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
