package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanValueConverter;
import com.scell.model.drawingml.main.Path2DModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.CTPath2D;
import org.docx4j.dml.CTPath2DArcTo;
import org.docx4j.dml.CTPath2DClose;
import org.docx4j.dml.CTPath2DCubicBezierTo;
import org.docx4j.dml.CTPath2DLineTo;
import org.docx4j.dml.CTPath2DMoveTo;
import org.docx4j.dml.CTPath2DQuadBezierTo;

public class Path2DConverter {
  private Path2DConverter() {
  }

  public static Path2DModel fromDocx4J(CTPath2D value) {
    if (value == null) return null;
    List<Path2DModel.CloseOrMoveToOrLnToValueModel> closeOrMoveToOrLnTo = value.getCloseOrMoveToOrLnTo().stream().map(val -> {
      if (val instanceof CTPath2DClose) return Path2DModel.CloseOrMoveToOrLnToValueModel.newClose(Path2DCloseConverter.fromDocx4J((CTPath2DClose) val));
      if (val instanceof CTPath2DMoveTo) return Path2DModel.CloseOrMoveToOrLnToValueModel.newMoveTo(Path2DMoveToConverter.fromDocx4J((CTPath2DMoveTo) val));
      if (val instanceof CTPath2DLineTo) return Path2DModel.CloseOrMoveToOrLnToValueModel.newLnTo(Path2DLineToConverter.fromDocx4J((CTPath2DLineTo) val));
      if (val instanceof CTPath2DArcTo) return Path2DModel.CloseOrMoveToOrLnToValueModel.newArcTo(Path2DArcToConverter.fromDocx4J((CTPath2DArcTo) val));
      if (val instanceof CTPath2DQuadBezierTo) return Path2DModel.CloseOrMoveToOrLnToValueModel.newQuadBezTo(Path2DQuadBezierToConverter.fromDocx4J((CTPath2DQuadBezierTo) val));
      if (val instanceof CTPath2DCubicBezierTo) return Path2DModel.CloseOrMoveToOrLnToValueModel.newCubicBezTo(Path2DCubicBezierToConverter.fromDocx4J((CTPath2DCubicBezierTo) val));
      return new Path2DModel.CloseOrMoveToOrLnToValueModel();
    } ).collect(Collectors.toList());
    return new Path2DModel(PathFillModeValueConverter.fromDocx4J(value.getFill()), BooleanValueConverter.fromDocx4J(value.isExtrusionOk()), PositiveCoordinateValueConverter.fromDocx4J(value.getH()), PositiveCoordinateValueConverter.fromDocx4J(value.getW()), BooleanValueConverter.fromDocx4J(value.isStroke()), closeOrMoveToOrLnTo);
  }
}
