package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ExtensionListModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTExtensionList;

public class ExtensionListConverter {
  private ExtensionListConverter() {
  }

  public static ExtensionListModel fromDocx4J(CTExtensionList value) {
    if (value == null) return null;
    return new ExtensionListModel(value.getExt().stream().map(ExtensionConverter::fromDocx4J).collect(Collectors.toList()));
  }
}
