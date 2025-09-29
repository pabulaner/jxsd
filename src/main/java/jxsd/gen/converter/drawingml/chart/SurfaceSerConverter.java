package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.model.drawingml.chart.SurfaceSerModel;
import org.docx4j.dml.chart.CTSurfaceSer;

/**
 * This is a generated sequence class.
 */
public class SurfaceSerConverter {
  private SurfaceSerConverter() {
  }

  public static SurfaceSerModel fromDocx4j(CTSurfaceSer value) {
    if (value == null) return null;
    return new SurfaceSerModel(UnsignedIntConverter.fromDocx4j(value.getIdx()), UnsignedIntConverter.fromDocx4j(value.getOrder()), SerTxConverter.fromDocx4j(value.getTx()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()), AxDataSourceConverter.fromDocx4j(value.getCat()), NumDataSourceConverter.fromDocx4j(value.getVal()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTSurfaceSer toDocx4j(SurfaceSerModel value) {
    if (value == null) return null;
    CTSurfaceSer result = new CTSurfaceSer();
    result.setIdx(UnsignedIntConverter.toDocx4j(value.getIdx()));
    result.setOrder(UnsignedIntConverter.toDocx4j(value.getOrder()));
    result.setTx(SerTxConverter.toDocx4j(value.getTx()));
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    result.setCat(AxDataSourceConverter.toDocx4j(value.getCat()));
    result.setVal(NumDataSourceConverter.toDocx4j(value.getVal()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
