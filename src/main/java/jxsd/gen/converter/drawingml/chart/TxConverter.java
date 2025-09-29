package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.drawingml.main.TextBodyConverter;
import jxsd.gen.model.drawingml.chart.TxModel;
import org.docx4j.dml.chart.CTTx;

/**
 * This is a generated choice class.
 */
public class TxConverter {
  private TxConverter() {
  }

  public static TxModel fromDocx4j(CTTx value) {
    if (value == null) return null;
    if (value.getStrRef() != null) return TxModel.newStrRef(StrRefConverter.fromDocx4j(value.getStrRef()));
    if (value.getRich() != null) return TxModel.newRich(TextBodyConverter.fromDocx4j(value.getRich()));
    return new TxModel();
  }

  public static CTTx toDocx4j(TxModel value) {
    if (value == null) return null;
    CTTx result = new CTTx();
    if (value.isStrRef()) result.setStrRef(StrRefConverter.toDocx4j(value.getStrRef()));
    if (value.isRich()) result.setRich(TextBodyConverter.toDocx4j(value.getRich()));
    return result;
  }
}
