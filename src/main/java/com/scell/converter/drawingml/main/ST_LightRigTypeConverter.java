package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_LightRigTypeModel;
import org.docx4j.dml.STLightRigType;

public class ST_LightRigTypeConverter {
  private ST_LightRigTypeConverter() {
  }

  public static ST_LightRigTypeModel fromDocx4J(STLightRigType value) {
    if (value == null) return null;
    if (value == STLightRigType.LEGACY_FLAT_1) return ST_LightRigTypeModel.LEGACY_FLAT_1;
    if (value == STLightRigType.LEGACY_FLAT_2) return ST_LightRigTypeModel.LEGACY_FLAT_2;
    if (value == STLightRigType.LEGACY_FLAT_3) return ST_LightRigTypeModel.LEGACY_FLAT_3;
    if (value == STLightRigType.LEGACY_FLAT_4) return ST_LightRigTypeModel.LEGACY_FLAT_4;
    if (value == STLightRigType.LEGACY_NORMAL_1) return ST_LightRigTypeModel.LEGACY_NORMAL_1;
    if (value == STLightRigType.LEGACY_NORMAL_2) return ST_LightRigTypeModel.LEGACY_NORMAL_2;
    if (value == STLightRigType.LEGACY_NORMAL_3) return ST_LightRigTypeModel.LEGACY_NORMAL_3;
    if (value == STLightRigType.LEGACY_NORMAL_4) return ST_LightRigTypeModel.LEGACY_NORMAL_4;
    if (value == STLightRigType.LEGACY_HARSH_1) return ST_LightRigTypeModel.LEGACY_HARSH_1;
    if (value == STLightRigType.LEGACY_HARSH_2) return ST_LightRigTypeModel.LEGACY_HARSH_2;
    if (value == STLightRigType.LEGACY_HARSH_3) return ST_LightRigTypeModel.LEGACY_HARSH_3;
    if (value == STLightRigType.LEGACY_HARSH_4) return ST_LightRigTypeModel.LEGACY_HARSH_4;
    if (value == STLightRigType.THREE_PT) return ST_LightRigTypeModel.THREE_PT;
    if (value == STLightRigType.BALANCED) return ST_LightRigTypeModel.BALANCED;
    if (value == STLightRigType.SOFT) return ST_LightRigTypeModel.SOFT;
    if (value == STLightRigType.HARSH) return ST_LightRigTypeModel.HARSH;
    if (value == STLightRigType.FLOOD) return ST_LightRigTypeModel.FLOOD;
    if (value == STLightRigType.CONTRASTING) return ST_LightRigTypeModel.CONTRASTING;
    if (value == STLightRigType.MORNING) return ST_LightRigTypeModel.MORNING;
    if (value == STLightRigType.SUNRISE) return ST_LightRigTypeModel.SUNRISE;
    if (value == STLightRigType.SUNSET) return ST_LightRigTypeModel.SUNSET;
    if (value == STLightRigType.CHILLY) return ST_LightRigTypeModel.CHILLY;
    if (value == STLightRigType.FREEZING) return ST_LightRigTypeModel.FREEZING;
    if (value == STLightRigType.FLAT) return ST_LightRigTypeModel.FLAT;
    if (value == STLightRigType.TWO_PT) return ST_LightRigTypeModel.TWO_PT;
    if (value == STLightRigType.GLOW) return ST_LightRigTypeModel.GLOW;
    if (value == STLightRigType.BRIGHT_ROOM) return ST_LightRigTypeModel.BRIGHT_ROOM;
    return null;
  }

  public static STLightRigType toDocx4J(ST_LightRigTypeModel value) {
    return null;
  }
}
