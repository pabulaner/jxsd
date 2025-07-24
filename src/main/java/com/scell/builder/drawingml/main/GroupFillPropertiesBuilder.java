package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.GroupFillPropertiesModel;

public class GroupFillPropertiesBuilder {
  public GroupFillPropertiesBuilder() {
  }

  public GroupFillPropertiesModel build() {
    return new GroupFillPropertiesModel();
  }

  public GroupFillPropertiesBuilder from(GroupFillPropertiesModel value) {
    return this;
  }
}
