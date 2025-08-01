package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.XMLSchema.StringValueModel;
import com.scell.model.officeDocument.relationships.RelationshipIdValueModel;

public class EmbeddedWAVAudioFileModel {
  private final RelationshipIdValueModel embed;

  private final BooleanValueModel builtIn;

  private final StringValueModel name;

  public EmbeddedWAVAudioFileModel(RelationshipIdValueModel embed, BooleanValueModel builtIn,
      StringValueModel name) {
    this.embed = embed;
    this.builtIn = builtIn;
    this.name = name;
  }

  public RelationshipIdValueModel getEmbed() {
    return this.embed;
  }

  public BooleanValueModel getBuiltIn() {
    return this.builtIn;
  }

  public StringValueModel getName() {
    return this.name;
  }
}
