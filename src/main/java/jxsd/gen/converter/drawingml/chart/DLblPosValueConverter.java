package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.DLblPosValueBuilder;
import jxsd.gen.model.drawingml.chart.DLblPosValueModel;
import org.docx4j.dml.chart.STDLblPos;

/**
 * This is a generated enum class.
 */
public class DLblPosValueConverter {
  private DLblPosValueConverter() {
  }

  public static DLblPosValueModel fromDocx4j(STDLblPos value) {
    if (value == null) return null;
    if (value == DLblPosValueBuilder.BEST_FIT) return DLblPosValueModel.BEST_FIT;
    if (value == DLblPosValueBuilder.B) return DLblPosValueModel.B;
    if (value == DLblPosValueBuilder.CTR) return DLblPosValueModel.CTR;
    if (value == DLblPosValueBuilder.IN_BASE) return DLblPosValueModel.IN_BASE;
    if (value == DLblPosValueBuilder.IN_END) return DLblPosValueModel.IN_END;
    if (value == DLblPosValueBuilder.L) return DLblPosValueModel.L;
    if (value == DLblPosValueBuilder.OUT_END) return DLblPosValueModel.OUT_END;
    if (value == DLblPosValueBuilder.R) return DLblPosValueModel.R;
    if (value == DLblPosValueBuilder.T) return DLblPosValueModel.T;
    return null;
  }

  public static STDLblPos toDocx4j(DLblPosValueModel value) {
    if (value == null) return null;
    if (value == DLblPosValueModel.BEST_FIT) return DLblPosValueBuilder.BEST_FIT;
    if (value == DLblPosValueModel.B) return DLblPosValueBuilder.B;
    if (value == DLblPosValueModel.CTR) return DLblPosValueBuilder.CTR;
    if (value == DLblPosValueModel.IN_BASE) return DLblPosValueBuilder.IN_BASE;
    if (value == DLblPosValueModel.IN_END) return DLblPosValueBuilder.IN_END;
    if (value == DLblPosValueModel.L) return DLblPosValueBuilder.L;
    if (value == DLblPosValueModel.OUT_END) return DLblPosValueBuilder.OUT_END;
    if (value == DLblPosValueModel.R) return DLblPosValueBuilder.R;
    if (value == DLblPosValueModel.T) return DLblPosValueBuilder.T;
    return null;
  }
}
