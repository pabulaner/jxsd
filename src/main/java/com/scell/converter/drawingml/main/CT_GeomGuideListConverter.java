package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_GeomGuideListModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTGeomGuideList;

public class CT_GeomGuideListConverter {
  private CT_GeomGuideListConverter() {
  }

  public static CT_GeomGuideListModel fromDocx4J(CTGeomGuideList value) {
    if (value == null) return null;
    return new CT_GeomGuideListModel(value.getGd().stream().map(CT_GeomGuideConverter::fromDocx4J).collect(Collectors.toList()));
  }

  public static CTGeomGuideList toDocx4J(CT_GeomGuideListModel value) {
    return null;
  }
}
