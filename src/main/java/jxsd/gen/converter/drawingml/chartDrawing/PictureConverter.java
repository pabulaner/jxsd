package jxsd.gen.converter.drawingml.chartDrawing;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.converter.XMLSchema.StringValueConverter;
import jxsd.gen.converter.drawingml.main.BlipFillPropertiesConverter;
import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.converter.drawingml.main.ShapeStyleConverter;
import jxsd.gen.model.drawingml.chartDrawing.PictureModel;
import org.docx4j.dml.chartDrawing.CTPicture;

/**
 * This is a generated sequence class.
 */
public class PictureConverter {
  private PictureConverter() {
  }

  public static PictureModel fromDocx4j(CTPicture value) {
    if (value == null) return null;
    return new PictureModel(BooleanValueConverter.fromDocx4j(value.isFPublished()), StringValueConverter.fromDocx4j(value.getMacro()), PictureNonVisualConverter.fromDocx4j(value.getNvPicPr()), BlipFillPropertiesConverter.fromDocx4j(value.getBlipFill()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()), ShapeStyleConverter.fromDocx4j(value.getStyle()));
  }

  public static CTPicture toDocx4j(PictureModel value) {
    if (value == null) return null;
    CTPicture result = new CTPicture();
    result.setFPublished(BooleanValueConverter.toDocx4j(value.getFPublished()));
    result.setMacro(StringValueConverter.toDocx4j(value.getMacro()));
    result.setNvPicPr(PictureNonVisualConverter.toDocx4j(value.getNvPicPr()));
    result.setBlipFill(BlipFillPropertiesConverter.toDocx4j(value.getBlipFill()));
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    result.setStyle(ShapeStyleConverter.toDocx4j(value.getStyle()));
    return result;
  }
}
