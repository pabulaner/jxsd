package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.converter.drawingml.main.TextBodyConverter;
import jxsd.gen.model.drawingml.chart.PivotFmtModel;
import org.docx4j.dml.chart.CTPivotFmt;

/**
 * This is a generated sequence class.
 */
public class PivotFmtConverter {
  private PivotFmtConverter() {
  }

  public static PivotFmtModel fromDocx4j(CTPivotFmt value) {
    if (value == null) return null;
    return new PivotFmtModel(UnsignedIntConverter.fromDocx4j(value.getIdx()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()), TextBodyConverter.fromDocx4j(value.getTxPr()), MarkerConverter.fromDocx4j(value.getMarker()), DLblConverter.fromDocx4j(value.getDLbl()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTPivotFmt toDocx4j(PivotFmtModel value) {
    if (value == null) return null;
    CTPivotFmt result = new CTPivotFmt();
    result.setIdx(UnsignedIntConverter.toDocx4j(value.getIdx()));
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    result.setTxPr(TextBodyConverter.toDocx4j(value.getTxPr()));
    result.setMarker(MarkerConverter.toDocx4j(value.getMarker()));
    result.setDLbl(DLblConverter.toDocx4j(value.getDLbl()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
