package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.BubbleScaleModel;
import org.docx4j.dml.chart.CTBubbleScale;

/**
 * This is a generated sequence class.
 */
public class BubbleScaleConverter {
  private BubbleScaleConverter() {
  }

  public static BubbleScaleModel fromDocx4j(CTBubbleScale value) {
    if (value == null) return null;
    return new BubbleScaleModel(BubbleScaleValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTBubbleScale toDocx4j(BubbleScaleModel value) {
    if (value == null) return null;
    CTBubbleScale result = new CTBubbleScale();
    result.setVal(BubbleScaleValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
