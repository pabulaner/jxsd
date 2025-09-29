package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.LayoutModel;
import org.docx4j.dml.chart.CTLayout;

/**
 * This is a generated sequence class.
 */
public class LayoutConverter {
  private LayoutConverter() {
  }

  public static LayoutModel fromDocx4j(CTLayout value) {
    if (value == null) return null;
    return new LayoutModel(ManualLayoutConverter.fromDocx4j(value.getManualLayout()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTLayout toDocx4j(LayoutModel value) {
    if (value == null) return null;
    CTLayout result = new CTLayout();
    result.setManualLayout(ManualLayoutConverter.toDocx4j(value.getManualLayout()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
