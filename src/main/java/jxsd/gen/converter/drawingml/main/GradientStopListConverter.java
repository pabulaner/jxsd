package jxsd.gen.converter.drawingml.main;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.main.GradientStopListModel;
import org.docx4j.dml.CTGradientStopList;

/**
 * This is a generated sequence class.
 */
public class GradientStopListConverter {
  private GradientStopListConverter() {
  }

  public static GradientStopListModel fromDocx4j(CTGradientStopList value) {
    if (value == null) return null;
    return new GradientStopListModel(value.getGs().stream().map(GradientStopConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTGradientStopList toDocx4j(GradientStopListModel value) {
    if (value == null) return null;
    CTGradientStopList result = new CTGradientStopList();
    result.getGs().addAll(value.getGs().stream().map(GradientStopConverter::toDocx4j).collect(Collectors.toList()));
    return result;
  }
}
