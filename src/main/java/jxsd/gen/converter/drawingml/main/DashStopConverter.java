package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.DashStopModel;
import org.docx4j.dml.CTDashStop;

/**
 * This is a generated sequence class.
 */
public class DashStopConverter {
  private DashStopConverter() {
  }

  public static DashStopModel fromDocx4j(CTDashStop value) {
    if (value == null) return null;
    return new DashStopModel(PositivePercentageValueConverter.fromDocx4j(value.getSp()), PositivePercentageValueConverter.fromDocx4j(value.getD()));
  }

  public static CTDashStop toDocx4j(DashStopModel value) {
    if (value == null) return null;
    CTDashStop result = new CTDashStop();
    result.setSp(PositivePercentageValueConverter.toDocx4j(value.getSp()));
    result.setD(PositivePercentageValueConverter.toDocx4j(value.getD()));
    return result;
  }
}
