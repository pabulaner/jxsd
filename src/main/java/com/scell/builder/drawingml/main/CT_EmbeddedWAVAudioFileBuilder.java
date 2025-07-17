package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.CT_EmbeddedWAVAudioFileModel;
import com.scell.model.officeDocument.relationships.ST_RelationshipIdModel;

public class CT_EmbeddedWAVAudioFileBuilder {
  private ST_RelationshipIdModel embed;

  private BooleanModel builtIn;

  private StringModel name;

  public CT_EmbeddedWAVAudioFileBuilder() {
  }

  public CT_EmbeddedWAVAudioFileBuilder setEmbed(ST_RelationshipIdModel embed) {
    this.embed = embed;
    return this;
  }

  public CT_EmbeddedWAVAudioFileBuilder setBuiltIn(BooleanModel builtIn) {
    this.builtIn = builtIn;
    return this;
  }

  public CT_EmbeddedWAVAudioFileBuilder setName(StringModel name) {
    this.name = name;
    return this;
  }

  public CT_EmbeddedWAVAudioFileModel build() {
    return new CT_EmbeddedWAVAudioFileModel(this.embed, this.builtIn, this.name);
  }

  public CT_EmbeddedWAVAudioFileBuilder from(CT_EmbeddedWAVAudioFileModel value) {
    this.embed = value.getEmbed();
    this.builtIn = value.getBuiltIn();
    this.name = value.getName();
    return this;
  }
}
