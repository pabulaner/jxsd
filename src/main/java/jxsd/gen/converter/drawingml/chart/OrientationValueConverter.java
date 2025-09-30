package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.OrientationValueModel;
import org.docx4j.dml.chart.STOrientation;

/**
 * This is a generated enum class.
 */
public class OrientationValueConverter {
  private OrientationValueConverter() {
  }

  public static OrientationValueModel fromDocx4j(STOrientation value) {
    if (value == null) return null;
    if (value == STOrientation.MAX_MIN) return OrientationValueModel.MAX_MIN;
    if (value == STOrientation.MIN_MAX) return OrientationValueModel.MIN_MAX;
    return null;
  }

  public static STOrientation toDocx4j(OrientationValueModel value) {
    if (value == null) return null;
    if (value == OrientationValueModel.MAX_MIN) return STOrientation.MAX_MIN;
    if (value == OrientationValueModel.MIN_MAX) return STOrientation.MIN_MAX;
    return null;
  }
}
