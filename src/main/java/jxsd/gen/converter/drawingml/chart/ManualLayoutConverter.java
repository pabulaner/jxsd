package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ManualLayoutModel;
import org.docx4j.dml.chart.CTManualLayout;

/**
 * This is a generated sequence class.
 */
public class ManualLayoutConverter {
  private ManualLayoutConverter() {
  }

  public static ManualLayoutModel fromDocx4j(CTManualLayout value) {
    if (value == null) return null;
    return new ManualLayoutModel(LayoutTargetConverter.fromDocx4j(value.getLayoutTarget()), LayoutModeConverter.fromDocx4j(value.getXMode()), LayoutModeConverter.fromDocx4j(value.getYMode()), LayoutModeConverter.fromDocx4j(value.getWMode()), LayoutModeConverter.fromDocx4j(value.getHMode()), DoubleConverter.fromDocx4j(value.getX()), DoubleConverter.fromDocx4j(value.getY()), DoubleConverter.fromDocx4j(value.getW()), DoubleConverter.fromDocx4j(value.getH()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTManualLayout toDocx4j(ManualLayoutModel value) {
    if (value == null) return null;
    CTManualLayout result = new CTManualLayout();
    result.setLayoutTarget(LayoutTargetConverter.toDocx4j(value.getLayoutTarget()));
    result.setXMode(LayoutModeConverter.toDocx4j(value.getXMode()));
    result.setYMode(LayoutModeConverter.toDocx4j(value.getYMode()));
    result.setWMode(LayoutModeConverter.toDocx4j(value.getWMode()));
    result.setHMode(LayoutModeConverter.toDocx4j(value.getHMode()));
    result.setX(DoubleConverter.toDocx4j(value.getX()));
    result.setY(DoubleConverter.toDocx4j(value.getY()));
    result.setW(DoubleConverter.toDocx4j(value.getW()));
    result.setH(DoubleConverter.toDocx4j(value.getH()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
