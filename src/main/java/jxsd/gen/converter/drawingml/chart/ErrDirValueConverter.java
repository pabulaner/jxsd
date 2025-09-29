package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.ErrDirValueBuilder;
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
    if (value == ErrDirValueBuilder.X) return ErrDirValueModel.X;
    if (value == ErrDirValueBuilder.Y) return ErrDirValueModel.Y;
    return null;
  }

  public static STErrDir toDocx4j(ErrDirValueModel value) {
    if (value == null) return null;
    if (value == ErrDirValueModel.X) return ErrDirValueBuilder.X;
    if (value == ErrDirValueModel.Y) return ErrDirValueBuilder.Y;
    return null;
  }
}
