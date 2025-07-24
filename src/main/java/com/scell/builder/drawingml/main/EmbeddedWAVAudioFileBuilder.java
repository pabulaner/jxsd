package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.EmbeddedWAVAudioFileModel;
import com.scell.model.officeDocument.relationships.RelationshipIdModel;

public class EmbeddedWAVAudioFileBuilder {
  private RelationshipIdModel embed;

  private BooleanModel builtIn;

  private StringModel name;

  public EmbeddedWAVAudioFileBuilder() {
  }

  public EmbeddedWAVAudioFileBuilder setEmbed(RelationshipIdModel embed) {
    this.embed = embed;
    return this;
  }

  public EmbeddedWAVAudioFileBuilder setBuiltIn(BooleanModel builtIn) {
    this.builtIn = builtIn;
    return this;
  }

  public EmbeddedWAVAudioFileBuilder setName(StringModel name) {
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
