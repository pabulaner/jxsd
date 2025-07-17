package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.converter.XMLSchema.StringConverter;
import com.scell.converter.drawingml.main.CT_BlipFillPropertiesConverter;
import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.converter.drawingml.main.CT_ShapeStyleConverter;
import com.scell.model.drawingml.chartDrawing.CT_PictureModel;
import org.docx4j.dml.chartDrawing.CTPicture;

public class CT_PictureConverter {
  private CT_PictureConverter() {
  }

  public static CT_PictureModel fromDocx4j(CTPicture value) {
    if (value == null) return null;
    return new CT_PictureModel(BooleanConverter.fromDocx4j(value.getFPublished()), StringConverter.fromDocx4j(value.getMacro()), CT_PictureNonVisualConverter.fromDocx4j(value.getNvPicPr()), CT_BlipFillPropertiesConverter.fromDocx4j(value.getBlipFill()), CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_ShapeStyleConverter.fromDocx4j(value.getStyle()));
  }

  public static CTPicture toDocx4j(CT_PictureModel value) {
    return null;
  }
}
