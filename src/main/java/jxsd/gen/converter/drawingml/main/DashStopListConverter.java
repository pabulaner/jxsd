package jxsd.gen.converter.drawingml.main;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.main.DashStopListModel;
import org.docx4j.dml.CTDashStopList;

/**
 * This is a generated sequence class.
 */
public class DashStopListConverter {
  private DashStopListConverter() {
  }

  public static DashStopListModel fromDocx4j(CTDashStopList value) {
    if (value == null) return null;
    return new DashStopListModel(value.getDs().stream().map(DashStopConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTDashStopList toDocx4j(DashStopListModel value) {
    if (value == null) return null;
    CTDashStopList result = new CTDashStopList();
    result.getDs().addAll(value.getDs().stream().map(DashStopConverter::toDocx4j).collect(Collectors.toList()));
    return result;
  }
}
