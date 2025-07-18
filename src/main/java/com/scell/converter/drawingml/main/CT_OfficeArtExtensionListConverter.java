package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTOfficeArtExtensionList;

public class CT_OfficeArtExtensionListConverter {
  private CT_OfficeArtExtensionListConverter() {
  }

  public static CT_OfficeArtExtensionListModel fromDocx4J(CTOfficeArtExtensionList value) {
    if (value == null) return null;
    return new CT_OfficeArtExtensionListModel(value.getExt().stream().map(CT_OfficeArtExtensionConverter::fromDocx4J).collect(Collectors.toList()));
  }

  public static CTOfficeArtExtensionList toDocx4J(CT_OfficeArtExtensionListModel value) {
    return null;
  }
}
