package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.model.drawingml.main.NonVisualPicturePropertiesModel;
import org.docx4j.dml.CTNonVisualPictureProperties;

/**
 * This is a generated sequence class.
 */
public class NonVisualPicturePropertiesConverter {
  private NonVisualPicturePropertiesConverter() {
  }

  public static NonVisualPicturePropertiesModel fromDocx4j(CTNonVisualPictureProperties value) {
    if (value == null) return null;
    return new NonVisualPicturePropertiesModel(BooleanValueConverter.fromDocx4j(value.getPreferRelativeResize()), PictureLockingConverter.fromDocx4j(value.getPicLocks()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTNonVisualPictureProperties toDocx4j(NonVisualPicturePropertiesModel value) {
    if (value == null) return null;
    CTNonVisualPictureProperties result = new CTNonVisualPictureProperties();
    result.setPreferRelativeResize(BooleanValueConverter.toDocx4j(value.getPreferRelativeResize()));
    result.setPicLocks(PictureLockingConverter.toDocx4j(value.getPicLocks()));
    result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
