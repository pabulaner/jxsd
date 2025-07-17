package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTOfficeArtExtensionList;

public class CT_OfficeArtExtensionListConverter {
  private CT_OfficeArtExtensionListConverter() {
  }

  public static CT_OfficeArtExtensionListModel fromDocx4j(CTOfficeArtExtensionList value) {
    if (value == null) return null;
    return new CT_OfficeArtExtensionListModel(value.getExt().stream().map(CT_OfficeArtExtensionConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTOfficeArtExtensionList toDocx4j(CT_OfficeArtExtensionListModel value) {
    return null;
  }
}
