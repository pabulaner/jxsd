package jxsd.gen.converter.drawingml.main;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.main.GeomGuideListModel;
import org.docx4j.dml.CTGeomGuideList;

/**
 * This is a generated sequence class.
 */
public class GeomGuideListConverter {
  private GeomGuideListConverter() {
  }

  public static GeomGuideListModel fromDocx4j(CTGeomGuideList value) {
    if (value == null) return null;
    return new GeomGuideListModel(value.getGd().stream().map(GeomGuideConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTGeomGuideList toDocx4j(GeomGuideListModel value) {
    if (value == null) return null;
    CTGeomGuideList result = new CTGeomGuideList();
    result.getGd().addAll(value.getGd().stream().map(GeomGuideConverter::toDocx4j).collect(Collectors.toList()));
    return result;
  }
}
