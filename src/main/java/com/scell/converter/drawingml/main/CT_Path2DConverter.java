package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_Path2DModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.CTPath2D;
import org.docx4j.dml.CTPath2DArcTo;
import org.docx4j.dml.CTPath2DClose;
import org.docx4j.dml.CTPath2DCubicBezierTo;
import org.docx4j.dml.CTPath2DLineTo;
import org.docx4j.dml.CTPath2DMoveTo;
import org.docx4j.dml.CTPath2DQuadBezierTo;

public class CT_Path2DConverter {
  private CT_Path2DConverter() {
  }

  public static CT_Path2DModel fromDocx4J(CTPath2D value) {
    if (value == null) return null;
    // look here true;
    List<CT_Path2DModel.CloseOrMoveToOrLnToModel> closeOrMoveToOrLnTo = value.getCloseOrMoveToOrLnTo().stream().map(val -> {
      if (val instanceof CTPath2DClose) return CT_Path2DModel.CloseOrMoveToOrLnToModel.newClose(CT_Path2DCloseConverter.fromDocx4J((CTPath2DClose) val));
      if (val instanceof CTPath2DMoveTo) return CT_Path2DModel.CloseOrMoveToOrLnToModel.newMoveTo(CT_Path2DMoveToConverter.fromDocx4J((CTPath2DMoveTo) val));
      if (val instanceof CTPath2DLineTo) return CT_Path2DModel.CloseOrMoveToOrLnToModel.newLnTo(CT_Path2DLineToConverter.fromDocx4J((CTPath2DLineTo) val));
      if (val instanceof CTPath2DArcTo) return CT_Path2DModel.CloseOrMoveToOrLnToModel.newArcTo(CT_Path2DArcToConverter.fromDocx4J((CTPath2DArcTo) val));
      if (val instanceof CTPath2DQuadBezierTo) return CT_Path2DModel.CloseOrMoveToOrLnToModel.newQuadBezTo(CT_Path2DQuadBezierToConverter.fromDocx4J((CTPath2DQuadBezierTo) val));
      if (val instanceof CTPath2DCubicBezierTo) return CT_Path2DModel.CloseOrMoveToOrLnToModel.newCubicBezTo(CT_Path2DCubicBezierToConverter.fromDocx4J((CTPath2DCubicBezierTo) val));
      return null;
    } ).collect(Collectors.toList());
    return new CT_Path2DModel(ST_PathFillModeConverter.fromDocx4J(value.getFill()), BooleanConverter.fromDocx4J(value.getExtrusionOk()), ST_PositiveCoordinateConverter.fromDocx4J(value.getH()), ST_PositiveCoordinateConverter.fromDocx4J(value.getW()), BooleanConverter.fromDocx4J(value.getStroke()), closeOrMoveToOrLnTo);
  }

  public static CTPath2D toDocx4J(CT_Path2DModel value) {
    return null;
  }
}
