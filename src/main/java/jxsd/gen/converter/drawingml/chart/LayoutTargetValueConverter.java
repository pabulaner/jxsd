package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.LayoutTargetValueBuilder;
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
    if (value == LayoutTargetValueBuilder.INNER) return LayoutTargetValueModel.INNER;
    if (value == LayoutTargetValueBuilder.OUTER) return LayoutTargetValueModel.OUTER;
    return null;
  }

  public static STLayoutTarget toDocx4j(LayoutTargetValueModel value) {
    if (value == null) return null;
    if (value == LayoutTargetValueModel.INNER) return LayoutTargetValueBuilder.INNER;
    if (value == LayoutTargetValueModel.OUTER) return LayoutTargetValueBuilder.OUTER;
    return null;
  }
}
