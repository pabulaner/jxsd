package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.model.drawingml.chart.BandFmtModel;
import org.docx4j.dml.chart.CTBandFmt;

/**
 * This is a generated sequence class.
 */
public class BandFmtConverter {
  private BandFmtConverter() {
  }

  public static BandFmtModel fromDocx4j(CTBandFmt value) {
    if (value == null) return null;
    return new BandFmtModel(UnsignedIntConverter.fromDocx4j(value.getIdx()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()));
  }

  public static CTBandFmt toDocx4j(BandFmtModel value) {
    if (value == null) return null;
    CTBandFmt result = new CTBandFmt();
    result.setIdx(UnsignedIntConverter.toDocx4j(value.getIdx()));
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    return result;
  }
}
