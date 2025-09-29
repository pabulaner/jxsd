package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.XMLSchema.UnsignedIntValueConverter;
import jxsd.gen.model.drawingml.chart.UnsignedIntModel;
import org.docx4j.dml.chart.CTUnsignedInt;

/**
 * This is a generated sequence class.
 */
public class UnsignedIntConverter {
  private UnsignedIntConverter() {
  }

  public static UnsignedIntModel fromDocx4j(CTUnsignedInt value) {
    if (value == null) return null;
    return new UnsignedIntModel(UnsignedIntValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTUnsignedInt toDocx4j(UnsignedIntModel value) {
    if (value == null) return null;
    CTUnsignedInt result = new CTUnsignedInt();
    result.setVal(UnsignedIntValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
