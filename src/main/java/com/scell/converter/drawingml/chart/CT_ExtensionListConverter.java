package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTExtensionList;

public class CT_ExtensionListConverter {
  private CT_ExtensionListConverter() {
  }

  public static CT_ExtensionListModel fromDocx4J(CTExtensionList value) {
    if (value == null) return null;
    return new CT_ExtensionListModel(value.getExt().stream().map(CT_ExtensionConverter::fromDocx4J).collect(Collectors.toList()));
  }

  public static CTExtensionList toDocx4J(CT_ExtensionListModel value) {
    return null;
  }
}
