package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.EffectStyleItemModel;
import org.docx4j.dml.CTEffectStyleItem;

/**
 * This is a generated sequence class.
 */
public class EffectStyleItemConverter {
  private EffectStyleItemConverter() {
  }

  public static EffectStyleItemModel fromDocx4j(CTEffectStyleItem value) {
    if (value == null) return null;
    EffectStyleItemModel.EG_EffectProperties egEffectProperties = new EffectStyleItemModel.EG_EffectProperties();
    if (value.getEffectLst() != null) egEffectProperties = EffectStyleItemConverter.newEGEffectProperties(EffectStyleItemConverter.fromDocx4j(value.getEffectLst()));
    if (value.getEffectDag() != null) egEffectProperties = EffectStyleItemConverter.newEGEffectProperties(EffectStyleItemConverter.fromDocx4j(value.getEffectDag()));
    return new EffectStyleItemModel(egEffectProperties, Scene3DConverter.fromDocx4j(value.getScene3D()), Shape3DConverter.fromDocx4j(value.getSp3D()));
  }

  public static CTEffectStyleItem toDocx4j(EffectStyleItemModel value) {
    if (value == null) return null;
    CTEffectStyleItem result = new CTEffectStyleItem();
    result.setScene3D(Scene3DConverter.toDocx4j(value.getScene3D()));
    result.setSp3D(Shape3DConverter.toDocx4j(value.getSp3D()));
    if (value.getEGEffectProperties().isEffectLst()) result.setEffectLst(EffectListConverter.toDocx4j(value.getEGEffectProperties().getEffectLst()));
    if (value.getEGEffectProperties().isEffectDag()) result.setEffectDag(EffectContainerConverter.toDocx4j(value.getEGEffectProperties().getEffectDag()));
    return result;
  }
}
