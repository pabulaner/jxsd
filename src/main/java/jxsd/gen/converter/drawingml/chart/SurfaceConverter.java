package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.model.drawingml.chart.SurfaceModel;
import org.docx4j.dml.chart.CTSurface;

/**
 * This is a generated sequence class.
 */
public class SurfaceConverter {
  private SurfaceConverter() {
  }

  public static SurfaceModel fromDocx4j(CTSurface value) {
    if (value == null) return null;
    return new SurfaceModel(UnsignedIntConverter.fromDocx4j(value.getThickness()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()), PictureOptionsConverter.fromDocx4j(value.getPictureOptions()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTSurface toDocx4j(SurfaceModel value) {
    if (value == null) return null;
    CTSurface result = new CTSurface();
    result.setThickness(UnsignedIntConverter.toDocx4j(value.getThickness()));
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    result.setPictureOptions(PictureOptionsConverter.toDocx4j(value.getPictureOptions()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
