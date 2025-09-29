package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.model.drawingml.chart.LineSerModel;
import org.docx4j.dml.chart.CTLineSer;

/**
 * This is a generated sequence class.
 */
public class LineSerConverter {
  private LineSerConverter() {
  }

  public static LineSerModel fromDocx4j(CTLineSer value) {
    if (value == null) return null;
    return new LineSerModel(UnsignedIntConverter.fromDocx4j(value.getIdx()), UnsignedIntConverter.fromDocx4j(value.getOrder()), SerTxConverter.fromDocx4j(value.getTx()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()), MarkerConverter.fromDocx4j(value.getMarker()), value.getDPt().stream().map(DPtConverter::fromDocx4j).collect(Collectors.toList()), DLblsConverter.fromDocx4j(value.getDLbls()), value.getTrendline().stream().map(TrendlineConverter::fromDocx4j).collect(Collectors.toList()), ErrBarsConverter.fromDocx4j(value.getErrBars()), AxDataSourceConverter.fromDocx4j(value.getCat()), NumDataSourceConverter.fromDocx4j(value.getVal()), BooleanConverter.fromDocx4j(value.getSmooth()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTLineSer toDocx4j(LineSerModel value) {
    if (value == null) return null;
    CTLineSer result = new CTLineSer();
    result.setIdx(UnsignedIntConverter.toDocx4j(value.getIdx()));
    result.setOrder(UnsignedIntConverter.toDocx4j(value.getOrder()));
    result.setTx(SerTxConverter.toDocx4j(value.getTx()));
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    result.setMarker(MarkerConverter.toDocx4j(value.getMarker()));
    result.getDPt().addAll(value.getDPt().stream().map(DPtConverter::toDocx4j).collect(Collectors.toList()));
    result.setDLbls(DLblsConverter.toDocx4j(value.getDLbls()));
    result.getTrendline().addAll(value.getTrendline().stream().map(TrendlineConverter::toDocx4j).collect(Collectors.toList()));
    result.setErrBars(ErrBarsConverter.toDocx4j(value.getErrBars()));
    result.setCat(AxDataSourceConverter.toDocx4j(value.getCat()));
    result.setVal(NumDataSourceConverter.toDocx4j(value.getVal()));
    result.setSmooth(BooleanConverter.toDocx4j(value.getSmooth()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
