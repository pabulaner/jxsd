package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.model.drawingml.chart.BooleanModel;
import org.docx4j.dml.chart.CTBoolean;

/**
 * This is a generated sequence class.
 */
public class BooleanConverter {
  private BooleanConverter() {
  }

  public static BooleanModel fromDocx4j(CTBoolean value) {
    if (value == null) return null;
    return new BooleanModel(BooleanValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTBoolean toDocx4j(BooleanModel value) {
    if (value == null) return null;
    CTBoolean result = new CTBoolean();
    result.setVal(BooleanValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
