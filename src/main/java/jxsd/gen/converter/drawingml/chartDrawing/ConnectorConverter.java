package jxsd.gen.converter.drawingml.chartDrawing;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.converter.XMLSchema.StringValueConverter;
import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.converter.drawingml.main.ShapeStyleConverter;
import jxsd.gen.model.drawingml.chartDrawing.ConnectorModel;
import org.docx4j.dml.chartDrawing.CTConnector;

/**
 * This is a generated sequence class.
 */
public class ConnectorConverter {
  private ConnectorConverter() {
  }

  public static ConnectorModel fromDocx4j(CTConnector value) {
    if (value == null) return null;
    return new ConnectorModel(BooleanValueConverter.fromDocx4j(value.getFPublished()), StringValueConverter.fromDocx4j(value.getMacro()), ConnectorNonVisualConverter.fromDocx4j(value.getNvCxnSpPr()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()), ShapeStyleConverter.fromDocx4j(value.getStyle()));
  }

  public static CTConnector toDocx4j(ConnectorModel value) {
    if (value == null) return null;
    CTConnector result = new CTConnector();
    result.setFPublished(BooleanValueConverter.toDocx4j(value.getFPublished()));
    result.setMacro(StringValueConverter.toDocx4j(value.getMacro()));
    result.setNvCxnSpPr(ConnectorNonVisualConverter.toDocx4j(value.getNvCxnSpPr()));
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    result.setStyle(ShapeStyleConverter.toDocx4j(value.getStyle()));
    return result;
  }
}
