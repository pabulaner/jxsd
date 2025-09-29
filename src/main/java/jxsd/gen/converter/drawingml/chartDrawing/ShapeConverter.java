package jxsd.gen.converter.drawingml.chartDrawing;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.converter.XMLSchema.StringValueConverter;
import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.converter.drawingml.main.ShapeStyleConverter;
import jxsd.gen.converter.drawingml.main.TextBodyConverter;
import jxsd.gen.model.drawingml.chartDrawing.ShapeModel;
import org.docx4j.dml.chartDrawing.CTShape;

/**
 * This is a generated sequence class.
 */
public class ShapeConverter {
  private ShapeConverter() {
  }

  public static ShapeModel fromDocx4j(CTShape value) {
    if (value == null) return null;
    return new ShapeModel(BooleanValueConverter.fromDocx4j(value.getFPublished()), StringValueConverter.fromDocx4j(value.getMacro()), BooleanValueConverter.fromDocx4j(value.getFLocksText()), StringValueConverter.fromDocx4j(value.getTextlink()), ShapeNonVisualConverter.fromDocx4j(value.getNvSpPr()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()), ShapeStyleConverter.fromDocx4j(value.getStyle()), TextBodyConverter.fromDocx4j(value.getTxBody()));
  }

  public static CTShape toDocx4j(ShapeModel value) {
    if (value == null) return null;
    CTShape result = new CTShape();
    result.setFPublished(BooleanValueConverter.toDocx4j(value.getFPublished()));
    result.setMacro(StringValueConverter.toDocx4j(value.getMacro()));
    result.setFLocksText(BooleanValueConverter.toDocx4j(value.getFLocksText()));
    result.setTextlink(StringValueConverter.toDocx4j(value.getTextlink()));
    result.setNvSpPr(ShapeNonVisualConverter.toDocx4j(value.getNvSpPr()));
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    result.setStyle(ShapeStyleConverter.toDocx4j(value.getStyle()));
    result.setTxBody(TextBodyConverter.toDocx4j(value.getTxBody()));
    return result;
  }
}
