package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.LightRigTypeValueBuilder;
import jxsd.gen.model.drawingml.main.LightRigTypeValueModel;
import org.docx4j.dml.STLightRigType;

/**
 * This is a generated enum class.
 */
public class LightRigTypeValueConverter {
  private LightRigTypeValueConverter() {
  }

  public static LightRigTypeValueModel fromDocx4j(STLightRigType value) {
    if (value == null) return null;
    if (value == LightRigTypeValueBuilder.LEGACY_FLAT_1) return LightRigTypeValueModel.LEGACY_FLAT_1;
    if (value == LightRigTypeValueBuilder.LEGACY_FLAT_2) return LightRigTypeValueModel.LEGACY_FLAT_2;
    if (value == LightRigTypeValueBuilder.LEGACY_FLAT_3) return LightRigTypeValueModel.LEGACY_FLAT_3;
    if (value == LightRigTypeValueBuilder.LEGACY_FLAT_4) return LightRigTypeValueModel.LEGACY_FLAT_4;
    if (value == LightRigTypeValueBuilder.LEGACY_NORMAL_1) return LightRigTypeValueModel.LEGACY_NORMAL_1;
    if (value == LightRigTypeValueBuilder.LEGACY_NORMAL_2) return LightRigTypeValueModel.LEGACY_NORMAL_2;
    if (value == LightRigTypeValueBuilder.LEGACY_NORMAL_3) return LightRigTypeValueModel.LEGACY_NORMAL_3;
    if (value == LightRigTypeValueBuilder.LEGACY_NORMAL_4) return LightRigTypeValueModel.LEGACY_NORMAL_4;
    if (value == LightRigTypeValueBuilder.LEGACY_HARSH_1) return LightRigTypeValueModel.LEGACY_HARSH_1;
    if (value == LightRigTypeValueBuilder.LEGACY_HARSH_2) return LightRigTypeValueModel.LEGACY_HARSH_2;
    if (value == LightRigTypeValueBuilder.LEGACY_HARSH_3) return LightRigTypeValueModel.LEGACY_HARSH_3;
    if (value == LightRigTypeValueBuilder.LEGACY_HARSH_4) return LightRigTypeValueModel.LEGACY_HARSH_4;
    if (value == LightRigTypeValueBuilder.THREE_PT) return LightRigTypeValueModel.THREE_PT;
    if (value == LightRigTypeValueBuilder.BALANCED) return LightRigTypeValueModel.BALANCED;
    if (value == LightRigTypeValueBuilder.SOFT) return LightRigTypeValueModel.SOFT;
    if (value == LightRigTypeValueBuilder.HARSH) return LightRigTypeValueModel.HARSH;
    if (value == LightRigTypeValueBuilder.FLOOD) return LightRigTypeValueModel.FLOOD;
    if (value == LightRigTypeValueBuilder.CONTRASTING) return LightRigTypeValueModel.CONTRASTING;
    if (value == LightRigTypeValueBuilder.MORNING) return LightRigTypeValueModel.MORNING;
    if (value == LightRigTypeValueBuilder.SUNRISE) return LightRigTypeValueModel.SUNRISE;
    if (value == LightRigTypeValueBuilder.SUNSET) return LightRigTypeValueModel.SUNSET;
    if (value == LightRigTypeValueBuilder.CHILLY) return LightRigTypeValueModel.CHILLY;
    if (value == LightRigTypeValueBuilder.FREEZING) return LightRigTypeValueModel.FREEZING;
    if (value == LightRigTypeValueBuilder.FLAT) return LightRigTypeValueModel.FLAT;
    if (value == LightRigTypeValueBuilder.TWO_PT) return LightRigTypeValueModel.TWO_PT;
    if (value == LightRigTypeValueBuilder.GLOW) return LightRigTypeValueModel.GLOW;
    if (value == LightRigTypeValueBuilder.BRIGHT_ROOM) return LightRigTypeValueModel.BRIGHT_ROOM;
    return null;
  }

  public static STLightRigType toDocx4j(LightRigTypeValueModel value) {
    if (value == null) return null;
    if (value == LightRigTypeValueModel.LEGACY_FLAT_1) return LightRigTypeValueBuilder.LEGACY_FLAT_1;
    if (value == LightRigTypeValueModel.LEGACY_FLAT_2) return LightRigTypeValueBuilder.LEGACY_FLAT_2;
    if (value == LightRigTypeValueModel.LEGACY_FLAT_3) return LightRigTypeValueBuilder.LEGACY_FLAT_3;
    if (value == LightRigTypeValueModel.LEGACY_FLAT_4) return LightRigTypeValueBuilder.LEGACY_FLAT_4;
    if (value == LightRigTypeValueModel.LEGACY_NORMAL_1) return LightRigTypeValueBuilder.LEGACY_NORMAL_1;
    if (value == LightRigTypeValueModel.LEGACY_NORMAL_2) return LightRigTypeValueBuilder.LEGACY_NORMAL_2;
    if (value == LightRigTypeValueModel.LEGACY_NORMAL_3) return LightRigTypeValueBuilder.LEGACY_NORMAL_3;
    if (value == LightRigTypeValueModel.LEGACY_NORMAL_4) return LightRigTypeValueBuilder.LEGACY_NORMAL_4;
    if (value == LightRigTypeValueModel.LEGACY_HARSH_1) return LightRigTypeValueBuilder.LEGACY_HARSH_1;
    if (value == LightRigTypeValueModel.LEGACY_HARSH_2) return LightRigTypeValueBuilder.LEGACY_HARSH_2;
    if (value == LightRigTypeValueModel.LEGACY_HARSH_3) return LightRigTypeValueBuilder.LEGACY_HARSH_3;
    if (value == LightRigTypeValueModel.LEGACY_HARSH_4) return LightRigTypeValueBuilder.LEGACY_HARSH_4;
    if (value == LightRigTypeValueModel.THREE_PT) return LightRigTypeValueBuilder.THREE_PT;
    if (value == LightRigTypeValueModel.BALANCED) return LightRigTypeValueBuilder.BALANCED;
    if (value == LightRigTypeValueModel.SOFT) return LightRigTypeValueBuilder.SOFT;
    if (value == LightRigTypeValueModel.HARSH) return LightRigTypeValueBuilder.HARSH;
    if (value == LightRigTypeValueModel.FLOOD) return LightRigTypeValueBuilder.FLOOD;
    if (value == LightRigTypeValueModel.CONTRASTING) return LightRigTypeValueBuilder.CONTRASTING;
    if (value == LightRigTypeValueModel.MORNING) return LightRigTypeValueBuilder.MORNING;
    if (value == LightRigTypeValueModel.SUNRISE) return LightRigTypeValueBuilder.SUNRISE;
    if (value == LightRigTypeValueModel.SUNSET) return LightRigTypeValueBuilder.SUNSET;
    if (value == LightRigTypeValueModel.CHILLY) return LightRigTypeValueBuilder.CHILLY;
    if (value == LightRigTypeValueModel.FREEZING) return LightRigTypeValueBuilder.FREEZING;
    if (value == LightRigTypeValueModel.FLAT) return LightRigTypeValueBuilder.FLAT;
    if (value == LightRigTypeValueModel.TWO_PT) return LightRigTypeValueBuilder.TWO_PT;
    if (value == LightRigTypeValueModel.GLOW) return LightRigTypeValueBuilder.GLOW;
    if (value == LightRigTypeValueModel.BRIGHT_ROOM) return LightRigTypeValueBuilder.BRIGHT_ROOM;
    return null;
  }
}
