package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.drawingml.main.CT_NonVisualDrawingPropsConverter;
import com.scell.converter.drawingml.main.CT_NonVisualPicturePropertiesConverter;
import com.scell.model.drawingml.chartDrawing.CT_PictureNonVisualModel;
import org.docx4j.dml.chartDrawing.CTPictureNonVisual;

public class CT_PictureNonVisualConverter {
  private CT_PictureNonVisualConverter() {
  }

  public static CT_PictureNonVisualModel fromDocx4j(CTPictureNonVisual value) {
    if (value == null) return null;
    return new CT_PictureNonVisualModel(CT_NonVisualDrawingPropsConverter.fromDocx4j(value.getCNvPr()), CT_NonVisualPicturePropertiesConverter.fromDocx4j(value.getCNvPicPr()));
  }

  public static CTPictureNonVisual toDocx4j(CT_PictureNonVisualModel value) {
    return null;
  }
}
