package jxsd.gen.converter.drawingml.chart;

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
    if (value == STDLblPos.BEST_FIT) return DLblPosValueModel.BEST_FIT;
    if (value == STDLblPos.B) return DLblPosValueModel.B;
    if (value == STDLblPos.CTR) return DLblPosValueModel.CTR;
    if (value == STDLblPos.IN_BASE) return DLblPosValueModel.IN_BASE;
    if (value == STDLblPos.IN_END) return DLblPosValueModel.IN_END;
    if (value == STDLblPos.L) return DLblPosValueModel.L;
    if (value == STDLblPos.OUT_END) return DLblPosValueModel.OUT_END;
    if (value == STDLblPos.R) return DLblPosValueModel.R;
    if (value == STDLblPos.T) return DLblPosValueModel.T;
    return null;
  }

  public static STDLblPos toDocx4j(DLblPosValueModel value) {
    if (value == null) return null;
    if (value == DLblPosValueModel.BEST_FIT) return STDLblPos.BEST_FIT;
    if (value == DLblPosValueModel.B) return STDLblPos.B;
    if (value == DLblPosValueModel.CTR) return STDLblPos.CTR;
    if (value == DLblPosValueModel.IN_BASE) return STDLblPos.IN_BASE;
    if (value == DLblPosValueModel.IN_END) return STDLblPos.IN_END;
    if (value == DLblPosValueModel.L) return STDLblPos.L;
    if (value == DLblPosValueModel.OUT_END) return STDLblPos.OUT_END;
    if (value == DLblPosValueModel.R) return STDLblPos.R;
    if (value == DLblPosValueModel.T) return STDLblPos.T;
    return null;
  }
}
