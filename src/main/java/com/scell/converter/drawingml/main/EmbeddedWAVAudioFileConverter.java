package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.converter.XMLSchema.StringConverter;
import com.scell.converter.officeDocument.relationships.RelationshipIdConverter;
import com.scell.model.drawingml.main.EmbeddedWAVAudioFileModel;
import org.docx4j.dml.CTEmbeddedWAVAudioFile;

public class EmbeddedWAVAudioFileConverter {
  private EmbeddedWAVAudioFileConverter() {
  }

  public static EmbeddedWAVAudioFileModel fromDocx4J(CTEmbeddedWAVAudioFile value) {
    if (value == null) return null;
    return new EmbeddedWAVAudioFileModel(RelationshipIdConverter.fromDocx4J(value.getEmbed()), BooleanConverter.fromDocx4J(value.isBuiltIn()), StringConverter.fromDocx4J(value.getName()));
  }
}
