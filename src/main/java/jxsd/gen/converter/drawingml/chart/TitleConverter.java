package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.converter.drawingml.main.TextBodyConverter;
import jxsd.gen.model.drawingml.chart.TitleModel;
import org.docx4j.dml.chart.CTTitle;

/**
 * This is a generated sequence class.
 */
public class TitleConverter {
  private TitleConverter() {
  }

  public static TitleModel fromDocx4j(CTTitle value) {
    if (value == null) return null;
    return new TitleModel(TxConverter.fromDocx4j(value.getTx()), LayoutConverter.fromDocx4j(value.getLayout()), BooleanConverter.fromDocx4j(value.getOverlay()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()), TextBodyConverter.fromDocx4j(value.getTxPr()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTTitle toDocx4j(TitleModel value) {
    if (value == null) return null;
    CTTitle result = new CTTitle();
    result.setTx(TxConverter.toDocx4j(value.getTx()));
    result.setLayout(LayoutConverter.toDocx4j(value.getLayout()));
    result.setOverlay(BooleanConverter.toDocx4j(value.getOverlay()));
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    result.setTxPr(TextBodyConverter.toDocx4j(value.getTxPr()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
