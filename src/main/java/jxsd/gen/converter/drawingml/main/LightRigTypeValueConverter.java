package jxsd.gen.converter.drawingml.main;

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
    if (value == STLightRigType.LEGACY_FLAT_1) return LightRigTypeValueModel.LEGACY_FLAT_1;
    if (value == STLightRigType.LEGACY_FLAT_2) return LightRigTypeValueModel.LEGACY_FLAT_2;
    if (value == STLightRigType.LEGACY_FLAT_3) return LightRigTypeValueModel.LEGACY_FLAT_3;
    if (value == STLightRigType.LEGACY_FLAT_4) return LightRigTypeValueModel.LEGACY_FLAT_4;
    if (value == STLightRigType.LEGACY_NORMAL_1) return LightRigTypeValueModel.LEGACY_NORMAL_1;
    if (value == STLightRigType.LEGACY_NORMAL_2) return LightRigTypeValueModel.LEGACY_NORMAL_2;
    if (value == STLightRigType.LEGACY_NORMAL_3) return LightRigTypeValueModel.LEGACY_NORMAL_3;
    if (value == STLightRigType.LEGACY_NORMAL_4) return LightRigTypeValueModel.LEGACY_NORMAL_4;
    if (value == STLightRigType.LEGACY_HARSH_1) return LightRigTypeValueModel.LEGACY_HARSH_1;
    if (value == STLightRigType.LEGACY_HARSH_2) return LightRigTypeValueModel.LEGACY_HARSH_2;
    if (value == STLightRigType.LEGACY_HARSH_3) return LightRigTypeValueModel.LEGACY_HARSH_3;
    if (value == STLightRigType.LEGACY_HARSH_4) return LightRigTypeValueModel.LEGACY_HARSH_4;
    if (value == STLightRigType.THREE_PT) return LightRigTypeValueModel.THREE_PT;
    if (value == STLightRigType.BALANCED) return LightRigTypeValueModel.BALANCED;
    if (value == STLightRigType.SOFT) return LightRigTypeValueModel.SOFT;
    if (value == STLightRigType.HARSH) return LightRigTypeValueModel.HARSH;
    if (value == STLightRigType.FLOOD) return LightRigTypeValueModel.FLOOD;
    if (value == STLightRigType.CONTRASTING) return LightRigTypeValueModel.CONTRASTING;
    if (value == STLightRigType.MORNING) return LightRigTypeValueModel.MORNING;
    if (value == STLightRigType.SUNRISE) return LightRigTypeValueModel.SUNRISE;
    if (value == STLightRigType.SUNSET) return LightRigTypeValueModel.SUNSET;
    if (value == STLightRigType.CHILLY) return LightRigTypeValueModel.CHILLY;
    if (value == STLightRigType.FREEZING) return LightRigTypeValueModel.FREEZING;
    if (value == STLightRigType.FLAT) return LightRigTypeValueModel.FLAT;
    if (value == STLightRigType.TWO_PT) return LightRigTypeValueModel.TWO_PT;
    if (value == STLightRigType.GLOW) return LightRigTypeValueModel.GLOW;
    if (value == STLightRigType.BRIGHT_ROOM) return LightRigTypeValueModel.BRIGHT_ROOM;
    return null;
  }

  public static STLightRigType toDocx4j(LightRigTypeValueModel value) {
    if (value == null) return null;
    if (value == LightRigTypeValueModel.LEGACY_FLAT_1) return STLightRigType.LEGACY_FLAT_1;
    if (value == LightRigTypeValueModel.LEGACY_FLAT_2) return STLightRigType.LEGACY_FLAT_2;
    if (value == LightRigTypeValueModel.LEGACY_FLAT_3) return STLightRigType.LEGACY_FLAT_3;
    if (value == LightRigTypeValueModel.LEGACY_FLAT_4) return STLightRigType.LEGACY_FLAT_4;
    if (value == LightRigTypeValueModel.LEGACY_NORMAL_1) return STLightRigType.LEGACY_NORMAL_1;
    if (value == LightRigTypeValueModel.LEGACY_NORMAL_2) return STLightRigType.LEGACY_NORMAL_2;
    if (value == LightRigTypeValueModel.LEGACY_NORMAL_3) return STLightRigType.LEGACY_NORMAL_3;
    if (value == LightRigTypeValueModel.LEGACY_NORMAL_4) return STLightRigType.LEGACY_NORMAL_4;
    if (value == LightRigTypeValueModel.LEGACY_HARSH_1) return STLightRigType.LEGACY_HARSH_1;
    if (value == LightRigTypeValueModel.LEGACY_HARSH_2) return STLightRigType.LEGACY_HARSH_2;
    if (value == LightRigTypeValueModel.LEGACY_HARSH_3) return STLightRigType.LEGACY_HARSH_3;
    if (value == LightRigTypeValueModel.LEGACY_HARSH_4) return STLightRigType.LEGACY_HARSH_4;
    if (value == LightRigTypeValueModel.THREE_PT) return STLightRigType.THREE_PT;
    if (value == LightRigTypeValueModel.BALANCED) return STLightRigType.BALANCED;
    if (value == LightRigTypeValueModel.SOFT) return STLightRigType.SOFT;
    if (value == LightRigTypeValueModel.HARSH) return STLightRigType.HARSH;
    if (value == LightRigTypeValueModel.FLOOD) return STLightRigType.FLOOD;
    if (value == LightRigTypeValueModel.CONTRASTING) return STLightRigType.CONTRASTING;
    if (value == LightRigTypeValueModel.MORNING) return STLightRigType.MORNING;
    if (value == LightRigTypeValueModel.SUNRISE) return STLightRigType.SUNRISE;
    if (value == LightRigTypeValueModel.SUNSET) return STLightRigType.SUNSET;
    if (value == LightRigTypeValueModel.CHILLY) return STLightRigType.CHILLY;
    if (value == LightRigTypeValueModel.FREEZING) return STLightRigType.FREEZING;
    if (value == LightRigTypeValueModel.FLAT) return STLightRigType.FLAT;
    if (value == LightRigTypeValueModel.TWO_PT) return STLightRigType.TWO_PT;
    if (value == LightRigTypeValueModel.GLOW) return STLightRigType.GLOW;
    if (value == LightRigTypeValueModel.BRIGHT_ROOM) return STLightRigType.BRIGHT_ROOM;
    return null;
  }
}
