package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.model.drawingml.chart.DPtModel;
import org.docx4j.dml.chart.CTDPt;

/**
 * This is a generated sequence class.
 */
public class DPtConverter {
  private DPtConverter() {
  }

  public static DPtModel fromDocx4j(CTDPt value) {
    if (value == null) return null;
    return new DPtModel(UnsignedIntConverter.fromDocx4j(value.getIdx()), BooleanConverter.fromDocx4j(value.getInvertIfNegative()), MarkerConverter.fromDocx4j(value.getMarker()), BooleanConverter.fromDocx4j(value.getBubble3D()), UnsignedIntConverter.fromDocx4j(value.getExplosion()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()), PictureOptionsConverter.fromDocx4j(value.getPictureOptions()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTDPt toDocx4j(DPtModel value) {
    if (value == null) return null;
    CTDPt result = new CTDPt();
    result.setIdx(UnsignedIntConverter.toDocx4j(value.getIdx()));
    result.setInvertIfNegative(BooleanConverter.toDocx4j(value.getInvertIfNegative()));
    result.setMarker(MarkerConverter.toDocx4j(value.getMarker()));
    result.setBubble3D(BooleanConverter.toDocx4j(value.getBubble3D()));
    result.setExplosion(UnsignedIntConverter.toDocx4j(value.getExplosion()));
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    result.setPictureOptions(PictureOptionsConverter.toDocx4j(value.getPictureOptions()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
