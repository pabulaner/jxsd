package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.XMLSchema.StringValueModel;
import com.scell.model.drawingml.main.EmbeddedWAVAudioFileModel;
import com.scell.model.officeDocument.relationships.RelationshipIdValueModel;

public class EmbeddedWAVAudioFileBuilder {
  private RelationshipIdValueModel embed;

  private BooleanValueModel builtIn;

  private StringValueModel name;

  public EmbeddedWAVAudioFileBuilder() {
  }

  public EmbeddedWAVAudioFileBuilder setEmbed(RelationshipIdValueModel embed) {
    this.embed = embed;
    return this;
  }

  public EmbeddedWAVAudioFileBuilder setBuiltIn(BooleanValueModel builtIn) {
    this.builtIn = builtIn;
    return this;
  }

  public EmbeddedWAVAudioFileBuilder setName(StringValueModel name) {
    this.name = name;
    return this;
  }

  public EmbeddedWAVAudioFileModel build() {
    return new EmbeddedWAVAudioFileModel(this.embed, this.builtIn, this.name);
  }

  public EmbeddedWAVAudioFileBuilder from(EmbeddedWAVAudioFileModel value) {
    this.embed = value.getEmbed();
    this.builtIn = value.getBuiltIn();
    this.name = value.getName();
    return this;
  }
}
