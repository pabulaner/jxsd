package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.converter.drawingml.main.TextBodyConverter;
import jxsd.gen.model.drawingml.chart.DispUnitsLblModel;
import org.docx4j.dml.chart.CTDispUnitsLbl;

/**
 * This is a generated sequence class.
 */
public class DispUnitsLblConverter {
  private DispUnitsLblConverter() {
  }

  public static DispUnitsLblModel fromDocx4j(CTDispUnitsLbl value) {
    if (value == null) return null;
    return new DispUnitsLblModel(LayoutConverter.fromDocx4j(value.getLayout()), TxConverter.fromDocx4j(value.getTx()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()), TextBodyConverter.fromDocx4j(value.getTxPr()));
  }

  public static CTDispUnitsLbl toDocx4j(DispUnitsLblModel value) {
    if (value == null) return null;
    CTDispUnitsLbl result = new CTDispUnitsLbl();
    result.setLayout(LayoutConverter.toDocx4j(value.getLayout()));
    result.setTx(TxConverter.toDocx4j(value.getTx()));
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    result.setTxPr(TextBodyConverter.toDocx4j(value.getTxPr()));
    return result;
  }
}
