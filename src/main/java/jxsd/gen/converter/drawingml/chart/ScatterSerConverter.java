package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.model.drawingml.chart.ScatterSerModel;
import org.docx4j.dml.chart.CTScatterSer;

/**
 * This is a generated sequence class.
 */
public class ScatterSerConverter {
  private ScatterSerConverter() {
  }

  public static ScatterSerModel fromDocx4j(CTScatterSer value) {
    if (value == null) return null;
    return new ScatterSerModel(UnsignedIntConverter.fromDocx4j(value.getIdx()), UnsignedIntConverter.fromDocx4j(value.getOrder()), SerTxConverter.fromDocx4j(value.getTx()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()), MarkerConverter.fromDocx4j(value.getMarker()), value.getDPt().stream().map(DPtConverter::fromDocx4j).collect(Collectors.toList()), DLblsConverter.fromDocx4j(value.getDLbls()), value.getTrendline().stream().map(TrendlineConverter::fromDocx4j).collect(Collectors.toList()), value.getErrBars().stream().map(ErrBarsConverter::fromDocx4j).collect(Collectors.toList()), AxDataSourceConverter.fromDocx4j(value.getXVal()), NumDataSourceConverter.fromDocx4j(value.getYVal()), BooleanConverter.fromDocx4j(value.getSmooth()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTScatterSer toDocx4j(ScatterSerModel value) {
    if (value == null) return null;
    CTScatterSer result = new CTScatterSer();
    result.setIdx(UnsignedIntConverter.toDocx4j(value.getIdx()));
    result.setOrder(UnsignedIntConverter.toDocx4j(value.getOrder()));
    result.setTx(SerTxConverter.toDocx4j(value.getTx()));
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    result.setMarker(MarkerConverter.toDocx4j(value.getMarker()));
    result.getDPt().addAll(value.getDPt().stream().map(DPtConverter::toDocx4j).collect(Collectors.toList()));
    result.setDLbls(DLblsConverter.toDocx4j(value.getDLbls()));
    result.getTrendline().addAll(value.getTrendline().stream().map(TrendlineConverter::toDocx4j).collect(Collectors.toList()));
    result.getErrBars().addAll(value.getErrBars().stream().map(ErrBarsConverter::toDocx4j).collect(Collectors.toList()));
    result.setXVal(AxDataSourceConverter.toDocx4j(value.getXVal()));
    result.setYVal(NumDataSourceConverter.toDocx4j(value.getYVal()));
    result.setSmooth(BooleanConverter.toDocx4j(value.getSmooth()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
