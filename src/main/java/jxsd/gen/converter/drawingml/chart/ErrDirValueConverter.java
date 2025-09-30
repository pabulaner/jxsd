package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ErrDirValueModel;
import org.docx4j.dml.chart.STErrDir;

/**
 * This is a generated enum class.
 */
public class ErrDirValueConverter {
  private ErrDirValueConverter() {
  }

  public static ErrDirValueModel fromDocx4j(STErrDir value) {
    if (value == null) return null;
    if (value == STErrDir.X) return ErrDirValueModel.X;
    if (value == STErrDir.Y) return ErrDirValueModel.Y;
    return null;
  }

  public static STErrDir toDocx4j(ErrDirValueModel value) {
    if (value == null) return null;
    if (value == ErrDirValueModel.X) return STErrDir.X;
    if (value == ErrDirValueModel.Y) return STErrDir.Y;
    return null;
  }
}
