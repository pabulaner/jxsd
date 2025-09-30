package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.model.drawingml.main.GradientFillPropertiesModel;
import org.docx4j.dml.CTGradientFillProperties;

/**
 * This is a generated sequence class.
 */
public class GradientFillPropertiesConverter {
  private GradientFillPropertiesConverter() {
  }

  public static GradientFillPropertiesModel fromDocx4j(CTGradientFillProperties value) {
    if (value == null) return null;
    GradientFillPropertiesModel.EG_ShadeProperties egShadeProperties = new GradientFillPropertiesModel.EG_ShadeProperties();
    if (value.getLin() != null) egShadeProperties = GradientFillPropertiesModel.EG_ShadeProperties.newLin(LinearShadePropertiesConverter.fromDocx4j(value.getLin()));
    if (value.getPath() != null) egShadeProperties = GradientFillPropertiesModel.EG_ShadeProperties.newPath(PathShadePropertiesConverter.fromDocx4j(value.getPath()));
    return new GradientFillPropertiesModel(BooleanValueConverter.fromDocx4j(value.isRotWithShape()), TileFlipModeValueConverter.fromDocx4j(value.getFlip()), GradientStopListConverter.fromDocx4j(value.getGsLst()), egShadeProperties, RelativeRectConverter.fromDocx4j(value.getTileRect()));
  }

  public static CTGradientFillProperties toDocx4j(GradientFillPropertiesModel value) {
    if (value == null) return null;
    CTGradientFillProperties result = new CTGradientFillProperties();
    result.setRotWithShape(BooleanValueConverter.toDocx4j(value.getRotWithShape()));
    result.setFlip(TileFlipModeValueConverter.toDocx4j(value.getFlip()));
    result.setGsLst(GradientStopListConverter.toDocx4j(value.getGsLst()));
    result.setTileRect(RelativeRectConverter.toDocx4j(value.getTileRect()));
    if (value.getEGShadeProperties().isLin()) result.setLin(LinearShadePropertiesConverter.toDocx4j(value.getEGShadeProperties().getLin()));
    if (value.getEGShadeProperties().isPath()) result.setPath(PathShadePropertiesConverter.toDocx4j(value.getEGShadeProperties().getPath()));
    return result;
  }
}
