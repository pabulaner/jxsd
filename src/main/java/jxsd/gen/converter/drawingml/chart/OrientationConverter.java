package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.OrientationModel;
import org.docx4j.dml.chart.CTOrientation;

/**
 * This is a generated sequence class.
 */
public class OrientationConverter {
  private OrientationConverter() {
  }

  public static OrientationModel fromDocx4j(CTOrientation value) {
    if (value == null) return null;
    return new OrientationModel(OrientationValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTOrientation toDocx4j(OrientationModel value) {
    if (value == null) return null;
    CTOrientation result = new CTOrientation();
    result.setVal(OrientationValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
