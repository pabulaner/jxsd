package jxsd.gen.converter.drawingml.chart;

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
    if (value == STDispBlanksAs.SPAN) return DispBlanksAsValueModel.SPAN;
    if (value == STDispBlanksAs.GAP) return DispBlanksAsValueModel.GAP;
    if (value == STDispBlanksAs.ZERO) return DispBlanksAsValueModel.ZERO;
    return null;
  }

  public static STDispBlanksAs toDocx4j(DispBlanksAsValueModel value) {
    if (value == null) return null;
    if (value == DispBlanksAsValueModel.SPAN) return STDispBlanksAs.SPAN;
    if (value == DispBlanksAsValueModel.GAP) return STDispBlanksAs.GAP;
    if (value == DispBlanksAsValueModel.ZERO) return STDispBlanksAs.ZERO;
    return null;
  }
}
