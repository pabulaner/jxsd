package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.LayoutTargetValueModel;
import org.docx4j.dml.chart.STLayoutTarget;

/**
 * This is a generated enum class.
 */
public class LayoutTargetValueConverter {
  private LayoutTargetValueConverter() {
  }

  public static LayoutTargetValueModel fromDocx4j(STLayoutTarget value) {
    if (value == null) return null;
    if (value == STLayoutTarget.INNER) return LayoutTargetValueModel.INNER;
    if (value == STLayoutTarget.OUTER) return LayoutTargetValueModel.OUTER;
    return null;
  }

  public static STLayoutTarget toDocx4j(LayoutTargetValueModel value) {
    if (value == null) return null;
    if (value == LayoutTargetValueModel.INNER) return STLayoutTarget.INNER;
    if (value == LayoutTargetValueModel.OUTER) return STLayoutTarget.OUTER;
    return null;
  }
}
