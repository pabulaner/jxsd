package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.model.drawingml.chart.RadarSerModel;
import org.docx4j.dml.chart.CTRadarSer;

/**
 * This is a generated sequence class.
 */
public class RadarSerConverter {
  private RadarSerConverter() {
  }

  public static RadarSerModel fromDocx4j(CTRadarSer value) {
    if (value == null) return null;
    return new RadarSerModel(UnsignedIntConverter.fromDocx4j(value.getIdx()), UnsignedIntConverter.fromDocx4j(value.getOrder()), SerTxConverter.fromDocx4j(value.getTx()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()), MarkerConverter.fromDocx4j(value.getMarker()), value.getDPt().stream().map(DPtConverter::fromDocx4j).collect(Collectors.toList()), DLblsConverter.fromDocx4j(value.getDLbls()), AxDataSourceConverter.fromDocx4j(value.getCat()), NumDataSourceConverter.fromDocx4j(value.getVal()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTRadarSer toDocx4j(RadarSerModel value) {
    if (value == null) return null;
    CTRadarSer result = new CTRadarSer();
    result.setIdx(UnsignedIntConverter.toDocx4j(value.getIdx()));
    result.setOrder(UnsignedIntConverter.toDocx4j(value.getOrder()));
    result.setTx(SerTxConverter.toDocx4j(value.getTx()));
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    result.setMarker(MarkerConverter.toDocx4j(value.getMarker()));
    result.getDPt().addAll(value.getDPt().stream().map(DPtConverter::toDocx4j).collect(Collectors.toList()));
    result.setDLbls(DLblsConverter.toDocx4j(value.getDLbls()));
    result.setCat(AxDataSourceConverter.toDocx4j(value.getCat()));
    result.setVal(NumDataSourceConverter.toDocx4j(value.getVal()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
