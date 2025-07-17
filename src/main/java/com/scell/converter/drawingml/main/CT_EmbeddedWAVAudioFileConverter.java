package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.converter.XMLSchema.StringConverter;
import com.scell.converter.officeDocument.relationships.ST_RelationshipIdConverter;
import com.scell.model.drawingml.main.CT_EmbeddedWAVAudioFileModel;
import org.docx4j.dml.CTEmbeddedWAVAudioFile;

public class CT_EmbeddedWAVAudioFileConverter {
  private CT_EmbeddedWAVAudioFileConverter() {
  }

  public static CT_EmbeddedWAVAudioFileModel fromDocx4j(CTEmbeddedWAVAudioFile value) {
    if (value == null) return null;
    return new CT_EmbeddedWAVAudioFileModel(ST_RelationshipIdConverter.fromDocx4j(value.getEmbed()), BooleanConverter.fromDocx4j(value.getBuiltIn()), StringConverter.fromDocx4j(value.getName()));
  }

  public static CTEmbeddedWAVAudioFile toDocx4j(CT_EmbeddedWAVAudioFileModel value) {
    return null;
  }
}
