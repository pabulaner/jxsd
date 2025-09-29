package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.ErrBarTypeValueBuilder;
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
    if (value == ErrBarTypeValueBuilder.BOTH) return ErrBarTypeValueModel.BOTH;
    if (value == ErrBarTypeValueBuilder.MINUS) return ErrBarTypeValueModel.MINUS;
    if (value == ErrBarTypeValueBuilder.PLUS) return ErrBarTypeValueModel.PLUS;
    return null;
  }

  public static STErrBarType toDocx4j(ErrBarTypeValueModel value) {
    if (value == null) return null;
    if (value == ErrBarTypeValueModel.BOTH) return ErrBarTypeValueBuilder.BOTH;
    if (value == ErrBarTypeValueModel.MINUS) return ErrBarTypeValueBuilder.MINUS;
    if (value == ErrBarTypeValueModel.PLUS) return ErrBarTypeValueBuilder.PLUS;
    return null;
  }
}
