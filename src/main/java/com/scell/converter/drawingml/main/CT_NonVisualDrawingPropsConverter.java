package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.main.CT_NonVisualDrawingPropsModel;
import org.docx4j.dml.CTNonVisualDrawingProps;

public class CT_NonVisualDrawingPropsConverter {
  private CT_NonVisualDrawingPropsConverter() {
  }

  public static CT_NonVisualDrawingPropsModel fromDocx4j(CTNonVisualDrawingProps value) {
    if (value == null) return null;
    return new CT_NonVisualDrawingPropsModel(BooleanConverter.fromDocx4j(value.getHidden()), StringConverter.fromDocx4j(value.getDescr()), ST_DrawingElementIdConverter.fromDocx4j(value.getId()), StringConverter.fromDocx4j(value.getName()), CT_HyperlinkConverter.fromDocx4j(value.getHlinkClick()), CT_HyperlinkConverter.fromDocx4j(value.getHlinkHover()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTNonVisualDrawingProps toDocx4j(CT_NonVisualDrawingPropsModel value) {
    return null;
  }
}
