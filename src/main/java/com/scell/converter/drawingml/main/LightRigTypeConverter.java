package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.LightRigTypeModel;
import org.docx4j.dml.STLightRigType;

public class LightRigTypeConverter {
  private LightRigTypeConverter() {
  }

  public static LightRigTypeModel fromDocx4J(STLightRigType value) {
    if (value == null) return null;
    if (value == STLightRigType.LEGACY_FLAT_1) return LightRigTypeModel.LEGACY_FLAT_1;
    if (value == STLightRigType.LEGACY_FLAT_2) return LightRigTypeModel.LEGACY_FLAT_2;
    if (value == STLightRigType.LEGACY_FLAT_3) return LightRigTypeModel.LEGACY_FLAT_3;
    if (value == STLightRigType.LEGACY_FLAT_4) return LightRigTypeModel.LEGACY_FLAT_4;
    if (value == STLightRigType.LEGACY_NORMAL_1) return LightRigTypeModel.LEGACY_NORMAL_1;
    if (value == STLightRigType.LEGACY_NORMAL_2) return LightRigTypeModel.LEGACY_NORMAL_2;
    if (value == STLightRigType.LEGACY_NORMAL_3) return LightRigTypeModel.LEGACY_NORMAL_3;
    if (value == STLightRigType.LEGACY_NORMAL_4) return LightRigTypeModel.LEGACY_NORMAL_4;
    if (value == STLightRigType.LEGACY_HARSH_1) return LightRigTypeModel.LEGACY_HARSH_1;
    if (value == STLightRigType.LEGACY_HARSH_2) return LightRigTypeModel.LEGACY_HARSH_2;
    if (value == STLightRigType.LEGACY_HARSH_3) return LightRigTypeModel.LEGACY_HARSH_3;
    if (value == STLightRigType.LEGACY_HARSH_4) return LightRigTypeModel.LEGACY_HARSH_4;
    if (value == STLightRigType.THREE_PT) return LightRigTypeModel.THREE_PT;
    if (value == STLightRigType.BALANCED) return LightRigTypeModel.BALANCED;
    if (value == STLightRigType.SOFT) return LightRigTypeModel.SOFT;
    if (value == STLightRigType.HARSH) return LightRigTypeModel.HARSH;
    if (value == STLightRigType.FLOOD) return LightRigTypeModel.FLOOD;
    if (value == STLightRigType.CONTRASTING) return LightRigTypeModel.CONTRASTING;
    if (value == STLightRigType.MORNING) return LightRigTypeModel.MORNING;
    if (value == STLightRigType.SUNRISE) return LightRigTypeModel.SUNRISE;
    if (value == STLightRigType.SUNSET) return LightRigTypeModel.SUNSET;
    if (value == STLightRigType.CHILLY) return LightRigTypeModel.CHILLY;
    if (value == STLightRigType.FREEZING) return LightRigTypeModel.FREEZING;
    if (value == STLightRigType.FLAT) return LightRigTypeModel.FLAT;
    if (value == STLightRigType.TWO_PT) return LightRigTypeModel.TWO_PT;
    if (value == STLightRigType.GLOW) return LightRigTypeModel.GLOW;
    if (value == STLightRigType.BRIGHT_ROOM) return LightRigTypeModel.BRIGHT_ROOM;
    return null;
  }
}
