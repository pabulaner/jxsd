package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.drawingml.main.NonVisualDrawingPropsConverter;
import com.scell.converter.drawingml.main.NonVisualPicturePropertiesConverter;
import com.scell.model.drawingml.chartDrawing.PictureNonVisualModel;
import org.docx4j.dml.chartDrawing.CTPictureNonVisual;

public class PictureNonVisualConverter {
  private PictureNonVisualConverter() {
  }

  public static PictureNonVisualModel fromDocx4J(CTPictureNonVisual value) {
    if (value == null) return null;
    return new PictureNonVisualModel(NonVisualDrawingPropsConverter.fromDocx4J(value.getCNvPr()), NonVisualPicturePropertiesConverter.fromDocx4J(value.getCNvPicPr()));
  }
}
