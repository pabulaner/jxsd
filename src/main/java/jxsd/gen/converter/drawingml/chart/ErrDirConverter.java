package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ErrDirModel;
import org.docx4j.dml.chart.CTErrDir;

/**
 * This is a generated sequence class.
 */
public class ErrDirConverter {
  private ErrDirConverter() {
  }

  public static ErrDirModel fromDocx4j(CTErrDir value) {
    if (value == null) return null;
    return new ErrDirModel(ErrDirValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTErrDir toDocx4j(ErrDirModel value) {
    if (value == null) return null;
    CTErrDir result = new CTErrDir();
    result.setVal(ErrDirValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
