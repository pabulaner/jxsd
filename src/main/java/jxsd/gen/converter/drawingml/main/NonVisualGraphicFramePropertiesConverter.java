package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.NonVisualGraphicFramePropertiesModel;
import org.docx4j.dml.CTNonVisualGraphicFrameProperties;

/**
 * This is a generated sequence class.
 */
public class NonVisualGraphicFramePropertiesConverter {
  private NonVisualGraphicFramePropertiesConverter() {
  }

  public static NonVisualGraphicFramePropertiesModel fromDocx4j(
      CTNonVisualGraphicFrameProperties value) {
    if (value == null) return null;
    return new NonVisualGraphicFramePropertiesModel(GraphicalObjectFrameLockingConverter.fromDocx4j(value.getGraphicFrameLocks()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTNonVisualGraphicFrameProperties toDocx4j(
      NonVisualGraphicFramePropertiesModel value) {
    if (value == null) return null;
    CTNonVisualGraphicFrameProperties result = new CTNonVisualGraphicFrameProperties();
    result.setGraphicFrameLocks(GraphicalObjectFrameLockingConverter.toDocx4j(value.getGraphicFrameLocks()));
    result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
