package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_ConnectionSiteListModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTConnectionSiteList;

public class CT_ConnectionSiteListConverter {
  private CT_ConnectionSiteListConverter() {
  }

  public static CT_ConnectionSiteListModel fromDocx4j(CTConnectionSiteList value) {
    if (value == null) return null;
    return new CT_ConnectionSiteListModel(value.getCxn().stream().map(CT_ConnectionSiteConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTConnectionSiteList toDocx4j(CT_ConnectionSiteListModel value) {
    return null;
  }
}
