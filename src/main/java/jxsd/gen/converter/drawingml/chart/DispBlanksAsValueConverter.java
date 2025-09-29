package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.DispBlanksAsValueBuilder;
import jxsd.gen.model.drawingml.chart.DispBlanksAsValueModel;
import org.docx4j.dml.chart.STDispBlanksAs;

/**
 * This is a generated enum class.
 */
public class DispBlanksAsValueConverter {
  private DispBlanksAsValueConverter() {
  }

  public static DispBlanksAsValueModel fromDocx4j(STDispBlanksAs value) {
    if (value == null) return null;
    if (value == DispBlanksAsValueBuilder.SPAN) return DispBlanksAsValueModel.SPAN;
    if (value == DispBlanksAsValueBuilder.GAP) return DispBlanksAsValueModel.GAP;
    if (value == DispBlanksAsValueBuilder.ZERO) return DispBlanksAsValueModel.ZERO;
    return null;
  }

  public static STDispBlanksAs toDocx4j(DispBlanksAsValueModel value) {
    if (value == null) return null;
    if (value == DispBlanksAsValueModel.SPAN) return DispBlanksAsValueBuilder.SPAN;
    if (value == DispBlanksAsValueModel.GAP) return DispBlanksAsValueBuilder.GAP;
    if (value == DispBlanksAsValueModel.ZERO) return DispBlanksAsValueBuilder.ZERO;
    return null;
  }
}
