package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.UpDownBarsModel;
import org.docx4j.dml.chart.CTUpDownBars;

/**
 * This is a generated sequence class.
 */
public class UpDownBarsConverter {
  private UpDownBarsConverter() {
  }

  public static UpDownBarsModel fromDocx4j(CTUpDownBars value) {
    if (value == null) return null;
    return new UpDownBarsModel(GapAmountConverter.fromDocx4j(value.getGapWidth()), UpDownBarConverter.fromDocx4j(value.getUpBars()), UpDownBarConverter.fromDocx4j(value.getDownBars()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTUpDownBars toDocx4j(UpDownBarsModel value) {
    if (value == null) return null;
    CTUpDownBars result = new CTUpDownBars();
    result.setGapWidth(GapAmountConverter.toDocx4j(value.getGapWidth()));
    result.setUpBars(UpDownBarConverter.toDocx4j(value.getUpBars()));
    result.setDownBars(UpDownBarConverter.toDocx4j(value.getDownBars()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
