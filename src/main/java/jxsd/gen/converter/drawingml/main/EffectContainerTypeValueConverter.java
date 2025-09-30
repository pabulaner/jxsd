package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.EffectContainerTypeValueModel;
import org.docx4j.dml.STEffectContainerType;

/**
 * This is a generated enum class.
 */
public class EffectContainerTypeValueConverter {
  private EffectContainerTypeValueConverter() {
  }

  public static EffectContainerTypeValueModel fromDocx4j(STEffectContainerType value) {
    if (value == null) return null;
    if (value == STEffectContainerType.SIB) return EffectContainerTypeValueModel.SIB;
    if (value == STEffectContainerType.TREE) return EffectContainerTypeValueModel.TREE;
    return null;
  }

  public static STEffectContainerType toDocx4j(EffectContainerTypeValueModel value) {
    if (value == null) return null;
    if (value == EffectContainerTypeValueModel.SIB) return STEffectContainerType.SIB;
    if (value == EffectContainerTypeValueModel.TREE) return STEffectContainerType.TREE;
    return null;
  }
}
