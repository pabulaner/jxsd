package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_GradientFillPropertiesModel;
import org.docx4j.dml.CTGradientFillProperties;

public class CT_GradientFillPropertiesConverter {
  private CT_GradientFillPropertiesConverter() {
  }

  public static CT_GradientFillPropertiesModel fromDocx4j(CTGradientFillProperties value) {
    if (value == null) return null;
    return new CT_GradientFillPropertiesModel(BooleanConverter.fromDocx4j(value.getRotWithShape()), ST_TileFlipModeConverter.fromDocx4j(value.getFlip()), CT_GradientStopListConverter.fromDocx4j(value.getGsLst()), LinOrPathConverter.fromDocx4j(value.getLinOrPath()), CT_RelativeRectConverter.fromDocx4j(value.getTileRect()));
  }

  public static CTGradientFillProperties toDocx4j(CT_GradientFillPropertiesModel value) {
    return null;
  }

  public static class LinOrPathConverter {
    private LinOrPathConverter() {
    }

    public static CT_GradientFillPropertiesModel.LinOrPathModel fromDocx4j(
        CTGradientFillProperties.LinOrPath value) {
      if (value == null) return null;
    }

    public static CTGradientFillProperties.LinOrPath toDocx4j(
        CT_GradientFillPropertiesModel.LinOrPathModel value) {
      return null;
    }
  }
}
