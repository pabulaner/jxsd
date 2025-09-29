package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.model.drawingml.chart.AreaSerModel;
import org.docx4j.dml.chart.CTAreaSer;

/**
 * This is a generated sequence class.
 */
public class AreaSerConverter {
  private AreaSerConverter() {
  }

  public static AreaSerModel fromDocx4j(CTAreaSer value) {
    if (value == null) return null;
    return new AreaSerModel(UnsignedIntConverter.fromDocx4j(value.getIdx()), UnsignedIntConverter.fromDocx4j(value.getOrder()), SerTxConverter.fromDocx4j(value.getTx()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()), PictureOptionsConverter.fromDocx4j(value.getPictureOptions()), value.getDPt().stream().map(DPtConverter::fromDocx4j).collect(Collectors.toList()), DLblsConverter.fromDocx4j(value.getDLbls()), value.getTrendline().stream().map(TrendlineConverter::fromDocx4j).collect(Collectors.toList()), value.getErrBars().stream().map(ErrBarsConverter::fromDocx4j).collect(Collectors.toList()), AxDataSourceConverter.fromDocx4j(value.getCat()), NumDataSourceConverter.fromDocx4j(value.getVal()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTAreaSer toDocx4j(AreaSerModel value) {
    if (value == null) return null;
    CTAreaSer result = new CTAreaSer();
    result.setIdx(UnsignedIntConverter.toDocx4j(value.getIdx()));
    result.setOrder(UnsignedIntConverter.toDocx4j(value.getOrder()));
    result.setTx(SerTxConverter.toDocx4j(value.getTx()));
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    result.setPictureOptions(PictureOptionsConverter.toDocx4j(value.getPictureOptions()));
    result.getDPt().addAll(value.getDPt().stream().map(DPtConverter::toDocx4j).collect(Collectors.toList()));
    result.setDLbls(DLblsConverter.toDocx4j(value.getDLbls()));
    result.getTrendline().addAll(value.getTrendline().stream().map(TrendlineConverter::toDocx4j).collect(Collectors.toList()));
    result.getErrBars().addAll(value.getErrBars().stream().map(ErrBarsConverter::toDocx4j).collect(Collectors.toList()));
    result.setCat(AxDataSourceConverter.toDocx4j(value.getCat()));
    result.setVal(NumDataSourceConverter.toDocx4j(value.getVal()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
