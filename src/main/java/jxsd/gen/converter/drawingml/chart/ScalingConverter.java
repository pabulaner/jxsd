package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ScalingModel;
import org.docx4j.dml.chart.CTScaling;

/**
 * This is a generated sequence class.
 */
public class ScalingConverter {
  private ScalingConverter() {
  }

  public static ScalingModel fromDocx4j(CTScaling value) {
    if (value == null) return null;
    return new ScalingModel(LogBaseConverter.fromDocx4j(value.getLogBase()), OrientationConverter.fromDocx4j(value.getOrientation()), DoubleConverter.fromDocx4j(value.getMax()), DoubleConverter.fromDocx4j(value.getMin()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTScaling toDocx4j(ScalingModel value) {
    if (value == null) return null;
    CTScaling result = new CTScaling();
    result.setLogBase(LogBaseConverter.toDocx4j(value.getLogBase()));
    result.setOrientation(OrientationConverter.toDocx4j(value.getOrientation()));
    result.setMax(DoubleConverter.toDocx4j(value.getMax()));
    result.setMin(DoubleConverter.toDocx4j(value.getMin()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
