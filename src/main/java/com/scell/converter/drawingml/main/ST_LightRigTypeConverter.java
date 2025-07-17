package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_LightRigTypeModel;
import org.docx4j.dml.STLightRigType;

public class ST_LightRigTypeConverter {
  private ST_LightRigTypeConverter() {
  }

  public static ST_LightRigTypeModel fromDocx4j(STLightRigType value) {
    if (value == null) return null;
    if (value == STLightRigType.LEGACY_FLAT1) return ST_LightRigTypeModel.LEGACY_FLAT1;
    if (value == STLightRigType.LEGACY_FLAT2) return ST_LightRigTypeModel.LEGACY_FLAT2;
    if (value == STLightRigType.LEGACY_FLAT3) return ST_LightRigTypeModel.LEGACY_FLAT3;
    if (value == STLightRigType.LEGACY_FLAT4) return ST_LightRigTypeModel.LEGACY_FLAT4;
    if (value == STLightRigType.LEGACY_NORMAL1) return ST_LightRigTypeModel.LEGACY_NORMAL1;
    if (value == STLightRigType.LEGACY_NORMAL2) return ST_LightRigTypeModel.LEGACY_NORMAL2;
    if (value == STLightRigType.LEGACY_NORMAL3) return ST_LightRigTypeModel.LEGACY_NORMAL3;
    if (value == STLightRigType.LEGACY_NORMAL4) return ST_LightRigTypeModel.LEGACY_NORMAL4;
    if (value == STLightRigType.LEGACY_HARSH1) return ST_LightRigTypeModel.LEGACY_HARSH1;
    if (value == STLightRigType.LEGACY_HARSH2) return ST_LightRigTypeModel.LEGACY_HARSH2;
    if (value == STLightRigType.LEGACY_HARSH3) return ST_LightRigTypeModel.LEGACY_HARSH3;
    if (value == STLightRigType.LEGACY_HARSH4) return ST_LightRigTypeModel.LEGACY_HARSH4;
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

  public static STLightRigType toDocx4j(ST_LightRigTypeModel value) {
    return null;
  }
}
