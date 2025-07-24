package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTOfficeArtExtensionList;

public class OfficeArtExtensionListConverter {
  private OfficeArtExtensionListConverter() {
  }

  public static OfficeArtExtensionListModel fromDocx4J(CTOfficeArtExtensionList value) {
    if (value == null) return null;
    return new OfficeArtExtensionListModel(value.getExt().stream().map(OfficeArtExtensionConverter::fromDocx4J).collect(Collectors.toList()));
  }
}
