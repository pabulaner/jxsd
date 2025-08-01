package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanValueConverter;
import com.scell.model.drawingml.main.NonVisualPicturePropertiesModel;
import org.docx4j.dml.CTNonVisualPictureProperties;

public class NonVisualPicturePropertiesConverter {
  private NonVisualPicturePropertiesConverter() {
  }

  public static NonVisualPicturePropertiesModel fromDocx4J(CTNonVisualPictureProperties value) {
    if (value == null) return null;
    return new NonVisualPicturePropertiesModel(BooleanValueConverter.fromDocx4J(value.isPreferRelativeResize()), PictureLockingConverter.fromDocx4J(value.getPicLocks()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
