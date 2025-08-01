package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.EffectContainerTypeValueModel;
import org.docx4j.dml.STEffectContainerType;

public class EffectContainerTypeValueConverter {
  private EffectContainerTypeValueConverter() {
  }

  public static EffectContainerTypeValueModel fromDocx4J(STEffectContainerType value) {
    if (value == null) return null;
    if (value == STEffectContainerType.SIB) return EffectContainerTypeValueModel.SIB;
    if (value == STEffectContainerType.TREE) return EffectContainerTypeValueModel.TREE;
    return null;
  }
}
