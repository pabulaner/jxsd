package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.converter.XMLSchema.StringConverter;
import com.scell.converter.officeDocument.relationships.ST_RelationshipIdConverter;
import com.scell.model.drawingml.main.CT_HyperlinkModel;
import org.docx4j.dml.CTHyperlink;

public class CT_HyperlinkConverter {
  private CT_HyperlinkConverter() {
  }

  public static CT_HyperlinkModel fromDocx4J(CTHyperlink value) {
    if (value == null) return null;
    return new CT_HyperlinkModel(StringConverter.fromDocx4J(value.getInvalidUrl()), StringConverter.fromDocx4J(value.getTgtFrame()), ST_RelationshipIdConverter.fromDocx4J(value.getId()), BooleanConverter.fromDocx4J(value.getHistory()), StringConverter.fromDocx4J(value.getTooltip()), BooleanConverter.fromDocx4J(value.getHighlightClick()), StringConverter.fromDocx4J(value.getAction()), BooleanConverter.fromDocx4J(value.getEndSnd()), CT_EmbeddedWAVAudioFileConverter.fromDocx4J(value.getSnd()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTHyperlink toDocx4J(CT_HyperlinkModel value) {
    return null;
  }
}
