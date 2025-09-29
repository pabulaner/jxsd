package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.EffectContainerTypeValueBuilder;
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
    if (value == EffectContainerTypeValueBuilder.SIB) return EffectContainerTypeValueModel.SIB;
    if (value == EffectContainerTypeValueBuilder.TREE) return EffectContainerTypeValueModel.TREE;
    return null;
  }

  public static STEffectContainerType toDocx4j(EffectContainerTypeValueModel value) {
    if (value == null) return null;
    if (value == EffectContainerTypeValueModel.SIB) return EffectContainerTypeValueBuilder.SIB;
    if (value == EffectContainerTypeValueModel.TREE) return EffectContainerTypeValueBuilder.TREE;
    return null;
  }
}
