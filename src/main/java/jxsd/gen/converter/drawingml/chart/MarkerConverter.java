package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.model.drawingml.chart.MarkerModel;
import org.docx4j.dml.chart.CTMarker;

/**
 * This is a generated sequence class.
 */
public class MarkerConverter {
  private MarkerConverter() {
  }

  public static MarkerModel fromDocx4j(CTMarker value) {
    if (value == null) return null;
    return new MarkerModel(MarkerStyleConverter.fromDocx4j(value.getSymbol()), MarkerSizeConverter.fromDocx4j(value.getSize()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTMarker toDocx4j(MarkerModel value) {
    if (value == null) return null;
    CTMarker result = new CTMarker();
    result.setSymbol(MarkerStyleConverter.toDocx4j(value.getSymbol()));
    result.setSize(MarkerSizeConverter.toDocx4j(value.getSize()));
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
