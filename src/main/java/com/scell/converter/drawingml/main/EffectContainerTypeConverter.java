package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.EffectContainerTypeModel;
import org.docx4j.dml.STEffectContainerType;

public class EffectContainerTypeConverter {
  private EffectContainerTypeConverter() {
  }

  public static EffectContainerTypeModel fromDocx4J(STEffectContainerType value) {
    if (value == null) return null;
    if (value == STEffectContainerType.SIB) return EffectContainerTypeModel.SIB;
    if (value == STEffectContainerType.TREE) return EffectContainerTypeModel.TREE;
    return null;
  }
}
