package jxsd.gen.converter.drawingml.chartDrawing;

import jxsd.gen.converter.drawingml.main.NonVisualDrawingPropsConverter;
import jxsd.gen.converter.drawingml.main.NonVisualPicturePropertiesConverter;
import jxsd.gen.model.drawingml.chartDrawing.PictureNonVisualModel;
import org.docx4j.dml.chartDrawing.CTPictureNonVisual;

/**
 * This is a generated sequence class.
 */
public class PictureNonVisualConverter {
  private PictureNonVisualConverter() {
  }

  public static PictureNonVisualModel fromDocx4j(CTPictureNonVisual value) {
    if (value == null) return null;
    return new PictureNonVisualModel(NonVisualDrawingPropsConverter.fromDocx4j(value.getCNvPr()), NonVisualPicturePropertiesConverter.fromDocx4j(value.getCNvPicPr()));
  }

  public static CTPictureNonVisual toDocx4j(PictureNonVisualModel value) {
    if (value == null) return null;
    CTPictureNonVisual result = new CTPictureNonVisual();
    result.setCNvPr(NonVisualDrawingPropsConverter.toDocx4j(value.getCNvPr()));
    result.setCNvPicPr(NonVisualPicturePropertiesConverter.toDocx4j(value.getCNvPicPr()));
    return result;
  }
}
