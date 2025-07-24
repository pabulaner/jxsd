package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.GeomGuideListModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTGeomGuideList;

public class GeomGuideListConverter {
  private GeomGuideListConverter() {
  }

  public static GeomGuideListModel fromDocx4J(CTGeomGuideList value) {
    if (value == null) return null;
    return new GeomGuideListModel(value.getGd().stream().map(GeomGuideConverter::fromDocx4J).collect(Collectors.toList()));
  }
}
