package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_EffectContainerTypeModel;
import org.docx4j.dml.STEffectContainerType;

public class ST_EffectContainerTypeConverter {
  private ST_EffectContainerTypeConverter() {
  }

  public static ST_EffectContainerTypeModel fromDocx4j(STEffectContainerType value) {
    if (value == null) return null;
    if (value == STEffectContainerType.SIB) return ST_EffectContainerTypeModel.SIB;
    if (value == STEffectContainerType.TREE) return ST_EffectContainerTypeModel.TREE;
    return null;
  }

  public static STEffectContainerType toDocx4j(ST_EffectContainerTypeModel value) {
    return null;
  }
}
