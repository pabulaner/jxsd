package jxsd.gen.converter.drawingml.chart;

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
    if (value == STLblAlgn.CTR) return LblAlgnValueModel.CTR;
    if (value == STLblAlgn.L) return LblAlgnValueModel.L;
    if (value == STLblAlgn.R) return LblAlgnValueModel.R;
    return null;
  }

  public static STLblAlgn toDocx4j(LblAlgnValueModel value) {
    if (value == null) return null;
    if (value == LblAlgnValueModel.CTR) return STLblAlgn.CTR;
    if (value == LblAlgnValueModel.L) return STLblAlgn.L;
    if (value == LblAlgnValueModel.R) return STLblAlgn.R;
    return null;
  }
}
