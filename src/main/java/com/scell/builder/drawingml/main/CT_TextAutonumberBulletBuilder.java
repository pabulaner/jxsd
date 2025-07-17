package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_TextAutonumberBulletModel;
import com.scell.model.drawingml.main.ST_TextAutonumberSchemeModel;
import com.scell.model.drawingml.main.ST_TextBulletStartAtNumModel;

public class CT_TextAutonumberBulletBuilder {
  private ST_TextAutonumberSchemeModel type;

  private ST_TextBulletStartAtNumModel startAt;

  public CT_TextAutonumberBulletBuilder() {
  }

  public CT_TextAutonumberBulletBuilder setType(ST_TextAutonumberSchemeModel type) {
    this.type = type;
    return this;
  }

  public CT_TextAutonumberBulletBuilder setStartAt(ST_TextBulletStartAtNumModel startAt) {
    this.startAt = startAt;
    return this;
  }

  public CT_TextAutonumberBulletModel build() {
    return new CT_TextAutonumberBulletModel(this.type, this.startAt);
  }

  public CT_TextAutonumberBulletBuilder from(CT_TextAutonumberBulletModel value) {
    this.type = value.getType();
    this.startAt = value.getStartAt();
    return this;
  }
}
