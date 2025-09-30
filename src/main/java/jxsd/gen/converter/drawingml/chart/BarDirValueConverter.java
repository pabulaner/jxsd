package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.BarDirValueModel;
import org.docx4j.dml.chart.STBarDir;

/**
 * This is a generated enum class.
 */
public class BarDirValueConverter {
  private BarDirValueConverter() {
  }

  public static BarDirValueModel fromDocx4j(STBarDir value) {
    if (value == null) return null;
    if (value == STBarDir.BAR) return BarDirValueModel.BAR;
    if (value == STBarDir.COL) return BarDirValueModel.COL;
    return null;
  }

  public static STBarDir toDocx4j(BarDirValueModel value) {
    if (value == null) return null;
    if (value == BarDirValueModel.BAR) return STBarDir.BAR;
    if (value == BarDirValueModel.COL) return STBarDir.COL;
    return null;
  }
}
