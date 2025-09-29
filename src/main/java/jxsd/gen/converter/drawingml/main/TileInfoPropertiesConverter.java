package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TileInfoPropertiesModel;
import org.docx4j.dml.CTTileInfoProperties;

/**
 * This is a generated sequence class.
 */
public class TileInfoPropertiesConverter {
  private TileInfoPropertiesConverter() {
  }

  public static TileInfoPropertiesModel fromDocx4j(CTTileInfoProperties value) {
    if (value == null) return null;
    return new TileInfoPropertiesModel(PercentageValueConverter.fromDocx4j(value.getSy()), CoordinateValueConverter.fromDocx4j(value.getTy()), PercentageValueConverter.fromDocx4j(value.getSx()), TileFlipModeValueConverter.fromDocx4j(value.getFlip()), CoordinateValueConverter.fromDocx4j(value.getTx()), RectAlignmentValueConverter.fromDocx4j(value.getAlgn()));
  }

  public static CTTileInfoProperties toDocx4j(TileInfoPropertiesModel value) {
    if (value == null) return null;
    CTTileInfoProperties result = new CTTileInfoProperties();
    result.setSy(PercentageValueConverter.toDocx4j(value.getSy()));
    result.setTy(CoordinateValueConverter.toDocx4j(value.getTy()));
    result.setSx(PercentageValueConverter.toDocx4j(value.getSx()));
    result.setFlip(TileFlipModeValueConverter.toDocx4j(value.getFlip()));
    result.setTx(CoordinateValueConverter.toDocx4j(value.getTx()));
    result.setAlgn(RectAlignmentValueConverter.toDocx4j(value.getAlgn()));
    return result;
  }
}
