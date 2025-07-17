package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_NonVisualPicturePropertiesModel;
import org.docx4j.dml.CTNonVisualPictureProperties;

public class CT_NonVisualPicturePropertiesConverter {
  private CT_NonVisualPicturePropertiesConverter() {
  }

  public static CT_NonVisualPicturePropertiesModel fromDocx4j(CTNonVisualPictureProperties value) {
    if (value == null) return null;
    return new CT_NonVisualPicturePropertiesModel(BooleanConverter.fromDocx4j(value.getPreferRelativeResize()), CT_PictureLockingConverter.fromDocx4j(value.getPicLocks()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTNonVisualPictureProperties toDocx4j(CT_NonVisualPicturePropertiesModel value) {
    return null;
  }
}
