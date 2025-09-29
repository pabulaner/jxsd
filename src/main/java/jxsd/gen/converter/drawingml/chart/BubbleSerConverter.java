package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.model.drawingml.chart.BubbleSerModel;
import org.docx4j.dml.chart.CTBubbleSer;

/**
 * This is a generated sequence class.
 */
public class BubbleSerConverter {
  private BubbleSerConverter() {
  }

  public static BubbleSerModel fromDocx4j(CTBubbleSer value) {
    if (value == null) return null;
    return new BubbleSerModel(UnsignedIntConverter.fromDocx4j(value.getIdx()), UnsignedIntConverter.fromDocx4j(value.getOrder()), SerTxConverter.fromDocx4j(value.getTx()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()), BooleanConverter.fromDocx4j(value.getInvertIfNegative()), value.getDPt().stream().map(DPtConverter::fromDocx4j).collect(Collectors.toList()), DLblsConverter.fromDocx4j(value.getDLbls()), value.getTrendline().stream().map(TrendlineConverter::fromDocx4j).collect(Collectors.toList()), value.getErrBars().stream().map(ErrBarsConverter::fromDocx4j).collect(Collectors.toList()), AxDataSourceConverter.fromDocx4j(value.getXVal()), NumDataSourceConverter.fromDocx4j(value.getYVal()), NumDataSourceConverter.fromDocx4j(value.getBubbleSize()), BooleanConverter.fromDocx4j(value.getBubble3D()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTBubbleSer toDocx4j(BubbleSerModel value) {
    if (value == null) return null;
    CTBubbleSer result = new CTBubbleSer();
    result.setIdx(UnsignedIntConverter.toDocx4j(value.getIdx()));
    result.setOrder(UnsignedIntConverter.toDocx4j(value.getOrder()));
    result.setTx(SerTxConverter.toDocx4j(value.getTx()));
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    result.setInvertIfNegative(BooleanConverter.toDocx4j(value.getInvertIfNegative()));
    result.getDPt().addAll(value.getDPt().stream().map(DPtConverter::toDocx4j).collect(Collectors.toList()));
    result.setDLbls(DLblsConverter.toDocx4j(value.getDLbls()));
    result.getTrendline().addAll(value.getTrendline().stream().map(TrendlineConverter::toDocx4j).collect(Collectors.toList()));
    result.getErrBars().addAll(value.getErrBars().stream().map(ErrBarsConverter::toDocx4j).collect(Collectors.toList()));
    result.setXVal(AxDataSourceConverter.toDocx4j(value.getXVal()));
    result.setYVal(NumDataSourceConverter.toDocx4j(value.getYVal()));
    result.setBubbleSize(NumDataSourceConverter.toDocx4j(value.getBubbleSize()));
    result.setBubble3D(BooleanConverter.toDocx4j(value.getBubble3D()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
