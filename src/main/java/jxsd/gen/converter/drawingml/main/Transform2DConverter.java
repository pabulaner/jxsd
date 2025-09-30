package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.model.drawingml.main.Transform2DModel;
import org.docx4j.dml.CTTransform2D;

/**
 * This is a generated sequence class.
 */
public class Transform2DConverter {
  private Transform2DConverter() {
  }

  public static Transform2DModel fromDocx4j(CTTransform2D value) {
    if (value == null) return null;
    return new Transform2DModel(BooleanValueConverter.fromDocx4j(value.isFlipV()), AngleValueConverter.fromDocx4j(value.getRot()), BooleanValueConverter.fromDocx4j(value.isFlipH()), Point2DConverter.fromDocx4j(value.getOff()), PositiveSize2DConverter.fromDocx4j(value.getExt()));
  }

  public static CTTransform2D toDocx4j(Transform2DModel value) {
    if (value == null) return null;
    CTTransform2D result = new CTTransform2D();
    result.setFlipV(BooleanValueConverter.toDocx4j(value.getFlipV()));
    result.setRot(AngleValueConverter.toDocx4j(value.getRot()));
    result.setFlipH(BooleanValueConverter.toDocx4j(value.getFlipH()));
    result.setOff(Point2DConverter.toDocx4j(value.getOff()));
    result.setExt(PositiveSize2DConverter.toDocx4j(value.getExt()));
    return result;
  }
}
