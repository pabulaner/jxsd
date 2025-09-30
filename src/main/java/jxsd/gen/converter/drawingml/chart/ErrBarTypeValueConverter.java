package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ErrBarTypeValueModel;
import org.docx4j.dml.chart.STErrBarType;

/**
 * This is a generated enum class.
 */
public class ErrBarTypeValueConverter {
  private ErrBarTypeValueConverter() {
  }

  public static ErrBarTypeValueModel fromDocx4j(STErrBarType value) {
    if (value == null) return null;
    if (value == STErrBarType.BOTH) return ErrBarTypeValueModel.BOTH;
    if (value == STErrBarType.MINUS) return ErrBarTypeValueModel.MINUS;
    if (value == STErrBarType.PLUS) return ErrBarTypeValueModel.PLUS;
    return null;
  }

  public static STErrBarType toDocx4j(ErrBarTypeValueModel value) {
    if (value == null) return null;
    if (value == ErrBarTypeValueModel.BOTH) return STErrBarType.BOTH;
    if (value == ErrBarTypeValueModel.MINUS) return STErrBarType.MINUS;
    if (value == ErrBarTypeValueModel.PLUS) return STErrBarType.PLUS;
    return null;
  }
}
