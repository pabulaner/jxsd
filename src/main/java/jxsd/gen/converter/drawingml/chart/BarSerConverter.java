package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.model.drawingml.chart.BarSerModel;
import org.docx4j.dml.chart.CTBarSer;

/**
 * This is a generated sequence class.
 */
public class BarSerConverter {
  private BarSerConverter() {
  }

  public static BarSerModel fromDocx4j(CTBarSer value) {
    if (value == null) return null;
    return new BarSerModel(UnsignedIntConverter.fromDocx4j(value.getIdx()), UnsignedIntConverter.fromDocx4j(value.getOrder()), SerTxConverter.fromDocx4j(value.getTx()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()), BooleanConverter.fromDocx4j(value.getInvertIfNegative()), PictureOptionsConverter.fromDocx4j(value.getPictureOptions()), value.getDPt().stream().map(DPtConverter::fromDocx4j).collect(Collectors.toList()), DLblsConverter.fromDocx4j(value.getDLbls()), value.getTrendline().stream().map(TrendlineConverter::fromDocx4j).collect(Collectors.toList()), ErrBarsConverter.fromDocx4j(value.getErrBars()), AxDataSourceConverter.fromDocx4j(value.getCat()), NumDataSourceConverter.fromDocx4j(value.getVal()), ShapeConverter.fromDocx4j(value.getShape()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTBarSer toDocx4j(BarSerModel value) {
    if (value == null) return null;
    CTBarSer result = new CTBarSer();
    result.setIdx(UnsignedIntConverter.toDocx4j(value.getIdx()));
    result.setOrder(UnsignedIntConverter.toDocx4j(value.getOrder()));
    result.setTx(SerTxConverter.toDocx4j(value.getTx()));
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    result.setInvertIfNegative(BooleanConverter.toDocx4j(value.getInvertIfNegative()));
    result.setPictureOptions(PictureOptionsConverter.toDocx4j(value.getPictureOptions()));
    result.getDPt().addAll(value.getDPt().stream().map(DPtConverter::toDocx4j).collect(Collectors.toList()));
    result.setDLbls(DLblsConverter.toDocx4j(value.getDLbls()));
    result.getTrendline().addAll(value.getTrendline().stream().map(TrendlineConverter::toDocx4j).collect(Collectors.toList()));
    result.setErrBars(ErrBarsConverter.toDocx4j(value.getErrBars()));
    result.setCat(AxDataSourceConverter.toDocx4j(value.getCat()));
    result.setVal(NumDataSourceConverter.toDocx4j(value.getVal()));
    result.setShape(ShapeConverter.toDocx4j(value.getShape()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
