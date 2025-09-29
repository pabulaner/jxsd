package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.LblAlgnValueBuilder;
import jxsd.gen.model.drawingml.chart.LblAlgnValueModel;
import org.docx4j.dml.chart.STLblAlgn;

/**
 * This is a generated enum class.
 */
public class LblAlgnValueConverter {
  private LblAlgnValueConverter() {
  }

  public static LblAlgnValueModel fromDocx4j(STLblAlgn value) {
    if (value == null) return null;
    if (value == LblAlgnValueBuilder.CTR) return LblAlgnValueModel.CTR;
    if (value == LblAlgnValueBuilder.L) return LblAlgnValueModel.L;
    if (value == LblAlgnValueBuilder.R) return LblAlgnValueModel.R;
    return null;
  }

  public static STLblAlgn toDocx4j(LblAlgnValueModel value) {
    if (value == null) return null;
    if (value == LblAlgnValueModel.CTR) return LblAlgnValueBuilder.CTR;
    if (value == LblAlgnValueModel.L) return LblAlgnValueBuilder.L;
    if (value == LblAlgnValueModel.R) return LblAlgnValueBuilder.R;
    return null;
  }
}
