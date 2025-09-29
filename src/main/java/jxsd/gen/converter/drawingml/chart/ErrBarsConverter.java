package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.model.drawingml.chart.ErrBarsModel;
import org.docx4j.dml.chart.CTErrBars;

/**
 * This is a generated sequence class.
 */
public class ErrBarsConverter {
  private ErrBarsConverter() {
  }

  public static ErrBarsModel fromDocx4j(CTErrBars value) {
    if (value == null) return null;
    return new ErrBarsModel(ErrDirConverter.fromDocx4j(value.getErrDir()), ErrBarTypeConverter.fromDocx4j(value.getErrBarType()), ErrValTypeConverter.fromDocx4j(value.getErrValType()), BooleanConverter.fromDocx4j(value.getNoEndCap()), NumDataSourceConverter.fromDocx4j(value.getPlus()), NumDataSourceConverter.fromDocx4j(value.getMinus()), DoubleConverter.fromDocx4j(value.getVal()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTErrBars toDocx4j(ErrBarsModel value) {
    if (value == null) return null;
    CTErrBars result = new CTErrBars();
    result.setErrDir(ErrDirConverter.toDocx4j(value.getErrDir()));
    result.setErrBarType(ErrBarTypeConverter.toDocx4j(value.getErrBarType()));
    result.setErrValType(ErrValTypeConverter.toDocx4j(value.getErrValType()));
    result.setNoEndCap(BooleanConverter.toDocx4j(value.getNoEndCap()));
    result.setPlus(NumDataSourceConverter.toDocx4j(value.getPlus()));
    result.setMinus(NumDataSourceConverter.toDocx4j(value.getMinus()));
    result.setVal(DoubleConverter.toDocx4j(value.getVal()));
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
