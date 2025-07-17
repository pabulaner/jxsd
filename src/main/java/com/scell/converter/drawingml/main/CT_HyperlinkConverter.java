package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.converter.XMLSchema.StringConverter;
import com.scell.converter.officeDocument.relationships.ST_RelationshipIdConverter;
import com.scell.model.drawingml.main.CT_HyperlinkModel;
import org.docx4j.dml.CTHyperlink;

public class CT_HyperlinkConverter {
  private CT_HyperlinkConverter() {
  }

  public static CT_HyperlinkModel fromDocx4j(CTHyperlink value) {
    if (value == null) return null;
    return new CT_HyperlinkModel(StringConverter.fromDocx4j(value.getInvalidUrl()), StringConverter.fromDocx4j(value.getTgtFrame()), ST_RelationshipIdConverter.fromDocx4j(value.getId()), BooleanConverter.fromDocx4j(value.getHistory()), StringConverter.fromDocx4j(value.getTooltip()), BooleanConverter.fromDocx4j(value.getHighlightClick()), StringConverter.fromDocx4j(value.getAction()), BooleanConverter.fromDocx4j(value.getEndSnd()), CT_EmbeddedWAVAudioFileConverter.fromDocx4j(value.getSnd()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTHyperlink toDocx4j(CT_HyperlinkModel value) {
    return null;
  }
}
