package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.converter.XMLSchema.UnsignedIntValueConverter;
import jxsd.gen.model.drawingml.main.BlipFillPropertiesModel;
import org.docx4j.dml.CTBlipFillProperties;

/**
 * This is a generated sequence class.
 */
public class BlipFillPropertiesConverter {
  private BlipFillPropertiesConverter() {
  }

  public static BlipFillPropertiesModel fromDocx4j(CTBlipFillProperties value) {
    if (value == null) return null;
    BlipFillPropertiesModel.EG_FillModeProperties egFillModeProperties = new BlipFillPropertiesModel.EG_FillModeProperties();
    if (value.getTile() != null) egFillModeProperties = BlipFillPropertiesModel.EG_FillModeProperties.newTile(TileInfoPropertiesConverter.fromDocx4j(value.getTile()));
    if (value.getStretch() != null) egFillModeProperties = BlipFillPropertiesModel.EG_FillModeProperties.newStretch(StretchInfoPropertiesConverter.fromDocx4j(value.getStretch()));
    return new BlipFillPropertiesModel(BooleanValueConverter.fromDocx4j(value.isRotWithShape()), UnsignedIntValueConverter.fromDocx4j(value.getDpi()), BlipConverter.fromDocx4j(value.getBlip()), RelativeRectConverter.fromDocx4j(value.getSrcRect()), egFillModeProperties);
  }

  public static CTBlipFillProperties toDocx4j(BlipFillPropertiesModel value) {
    if (value == null) return null;
    CTBlipFillProperties result = new CTBlipFillProperties();
    result.setRotWithShape(BooleanValueConverter.toDocx4j(value.getRotWithShape()));
    result.setDpi(UnsignedIntValueConverter.toDocx4j(value.getDpi()));
    result.setBlip(BlipConverter.toDocx4j(value.getBlip()));
    result.setSrcRect(RelativeRectConverter.toDocx4j(value.getSrcRect()));
    if (value.getEGFillModeProperties().isTile()) result.setTile(TileInfoPropertiesConverter.toDocx4j(value.getEGFillModeProperties().getTile()));
    if (value.getEGFillModeProperties().isStretch()) result.setStretch(StretchInfoPropertiesConverter.toDocx4j(value.getEGFillModeProperties().getStretch()));
    return result;
  }
}
