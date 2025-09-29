package jxsd.gen.converter.drawingml.main;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;
import org.docx4j.dml.CTOfficeArtExtensionList;

/**
 * This is a generated sequence class.
 */
public class OfficeArtExtensionListConverter {
  private OfficeArtExtensionListConverter() {
  }

  public static OfficeArtExtensionListModel fromDocx4j(CTOfficeArtExtensionList value) {
    if (value == null) return null;
    return new OfficeArtExtensionListModel(value.getExt().stream().map(OfficeArtExtensionConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTOfficeArtExtensionList toDocx4j(OfficeArtExtensionListModel value) {
    if (value == null) return null;
    CTOfficeArtExtensionList result = new CTOfficeArtExtensionList();
    result.getExt().addAll(value.getExt().stream().map(OfficeArtExtensionConverter::toDocx4j).collect(Collectors.toList()));
    return result;
  }
}
