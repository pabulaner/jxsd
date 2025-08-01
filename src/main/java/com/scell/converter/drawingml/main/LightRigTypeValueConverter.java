package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.LightRigTypeValueModel;
import org.docx4j.dml.STLightRigType;

public class LightRigTypeValueConverter {
  private LightRigTypeValueConverter() {
  }

  public static LightRigTypeValueModel fromDocx4J(STLightRigType value) {
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
}
