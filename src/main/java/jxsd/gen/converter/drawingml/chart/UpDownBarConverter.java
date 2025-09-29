package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.model.drawingml.chart.UpDownBarModel;
import org.docx4j.dml.chart.CTUpDownBar;

/**
 * This is a generated sequence class.
 */
public class UpDownBarConverter {
  private UpDownBarConverter() {
  }

  public static UpDownBarModel fromDocx4j(CTUpDownBar value) {
    if (value == null) return null;
    return new UpDownBarModel(ShapePropertiesConverter.fromDocx4j(value.getSpPr()));
  }

  public static CTUpDownBar toDocx4j(UpDownBarModel value) {
    if (value == null) return null;
    CTUpDownBar result = new CTUpDownBar();
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    return result;
  }
}
