package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.BarDirModel;
import org.docx4j.dml.chart.CTBarDir;

/**
 * This is a generated sequence class.
 */
public class BarDirConverter {
  private BarDirConverter() {
  }

  public static BarDirModel fromDocx4j(CTBarDir value) {
    if (value == null) return null;
    return new BarDirModel(BarDirValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTBarDir toDocx4j(BarDirModel value) {
    if (value == null) return null;
    CTBarDir result = new CTBarDir();
    result.setVal(BarDirValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
