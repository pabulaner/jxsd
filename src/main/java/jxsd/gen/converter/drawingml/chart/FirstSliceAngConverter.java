package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.FirstSliceAngModel;
import org.docx4j.dml.chart.CTFirstSliceAng;

/**
 * This is a generated sequence class.
 */
public class FirstSliceAngConverter {
  private FirstSliceAngConverter() {
  }

  public static FirstSliceAngModel fromDocx4j(CTFirstSliceAng value) {
    if (value == null) return null;
    return new FirstSliceAngModel(FirstSliceAngValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTFirstSliceAng toDocx4j(FirstSliceAngModel value) {
    if (value == null) return null;
    CTFirstSliceAng result = new CTFirstSliceAng();
    result.setVal(FirstSliceAngValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
