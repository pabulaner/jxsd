package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.StringModel;
import com.scell.model.officeDocument.relationships.ST_RelationshipIdModel;

public class CT_EmbeddedWAVAudioFileModel {
  private final ST_RelationshipIdModel embed;

  private final BooleanModel builtIn;

  private final StringModel name;

  public CT_EmbeddedWAVAudioFileModel(ST_RelationshipIdModel embed, BooleanModel builtIn,
      StringModel name) {
    this.embed = embed;
    this.builtIn = builtIn;
    this.name = name;
  }

  public ST_RelationshipIdModel getEmbed() {
    return this.embed;
  }

  public BooleanModel getBuiltIn() {
    return this.builtIn;
  }

  public StringModel getName() {
    return this.name;
  }
}
