package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.converter.drawingml.main.TextBodyConverter;
import jxsd.gen.model.drawingml.chart.TrendlineLblModel;
import org.docx4j.dml.chart.CTTrendlineLbl;

/**
 * This is a generated sequence class.
 */
public class TrendlineLblConverter {
  private TrendlineLblConverter() {
  }

  public static TrendlineLblModel fromDocx4j(CTTrendlineLbl value) {
    if (value == null) return null;
    return new TrendlineLblModel(LayoutConverter.fromDocx4j(value.getLayout()), TxConverter.fromDocx4j(value.getTx()), NumFmtConverter.fromDocx4j(value.getNumFmt()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()), TextBodyConverter.fromDocx4j(value.getTxPr()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTTrendlineLbl toDocx4j(TrendlineLblModel value) {
    if (value == null) return null;
    CTTrendlineLbl result = new CTTrendlineLbl();
    result.setLayout(LayoutConverter.toDocx4j(value.getLayout()));
    result.setTx(TxConverter.toDocx4j(value.getTx()));
    result.setNumFmt(NumFmtConverter.toDocx4j(value.getNumFmt()));
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    result.setTxPr(TextBodyConverter.toDocx4j(value.getTxPr()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
