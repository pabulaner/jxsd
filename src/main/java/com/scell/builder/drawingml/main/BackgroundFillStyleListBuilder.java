package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.BackgroundFillStyleListModel;
import com.scell.model.drawingml.main.BlipFillPropertiesModel;
import com.scell.model.drawingml.main.GradientFillPropertiesModel;
import com.scell.model.drawingml.main.GroupFillPropertiesModel;
import com.scell.model.drawingml.main.NoFillPropertiesModel;
import com.scell.model.drawingml.main.PatternFillPropertiesModel;
import com.scell.model.drawingml.main.SolidColorFillPropertiesModel;
import java.lang.Object;
import java.util.List;

public class BackgroundFillStyleListBuilder {
  private List<BackgroundFillStyleListModel.FillPropertiesModel> egFillProperties;

  public BackgroundFillStyleListBuilder() {
  }

  public BackgroundFillStyleListBuilder setEGFillProperties(
      List<BackgroundFillStyleListModel.FillPropertiesModel> egFillProperties) {
    this.egFillProperties = egFillProperties;
    return this;
  }

  public BackgroundFillStyleListModel build() {
    return new BackgroundFillStyleListModel(this.egFillProperties);
  }

  public BackgroundFillStyleListBuilder from(BackgroundFillStyleListModel value) {
    this.egFillProperties = value.getEGFillProperties();
    return this;
  }

  public static class FillPropertiesBuilder {
    private int type;

    private Object value;

    public FillPropertiesBuilder() {
      this.type = -1;
      this.value = null;
    }

    public FillPropertiesBuilder setNoFill(NoFillPropertiesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public FillPropertiesBuilder setSolidFill(SolidColorFillPropertiesModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public FillPropertiesBuilder setGradFill(GradientFillPropertiesModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public FillPropertiesBuilder setBlipFill(BlipFillPropertiesModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public FillPropertiesBuilder setPattFill(PatternFillPropertiesModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public FillPropertiesBuilder setGrpFill(GroupFillPropertiesModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public BackgroundFillStyleListModel.FillPropertiesModel build() {
      if (this.type == -1) return new BackgroundFillStyleListModel.FillPropertiesModel();
      if (this.type == 0) return BackgroundFillStyleListModel.FillPropertiesModel.newNoFill((NoFillPropertiesModel) this.value);
      if (this.type == 1) return BackgroundFillStyleListModel.FillPropertiesModel.newSolidFill((SolidColorFillPropertiesModel) this.value);
      if (this.type == 2) return BackgroundFillStyleListModel.FillPropertiesModel.newGradFill((GradientFillPropertiesModel) this.value);
      if (this.type == 3) return BackgroundFillStyleListModel.FillPropertiesModel.newBlipFill((BlipFillPropertiesModel) this.value);
      if (this.type == 4) return BackgroundFillStyleListModel.FillPropertiesModel.newPattFill((PatternFillPropertiesModel) this.value);
      if (this.type == 5) return BackgroundFillStyleListModel.FillPropertiesModel.newGrpFill((GroupFillPropertiesModel) this.value);
      return null;
    }

    public FillPropertiesBuilder from(BackgroundFillStyleListModel.FillPropertiesModel value) {
      this.type = -1;
      this.value = null;
      if (value.isNoFill()) {
        this.type = 0;
        this.value = value.getNoFill();
      }
      if (value.isSolidFill()) {
        this.type = 1;
        this.value = value.getSolidFill();
      }
      if (value.isGradFill()) {
        this.type = 2;
        this.value = value.getGradFill();
      }
      if (value.isBlipFill()) {
        this.type = 3;
        this.value = value.getBlipFill();
      }
      if (value.isPattFill()) {
        this.type = 4;
        this.value = value.getPattFill();
      }
      if (value.isGrpFill()) {
        this.type = 5;
        this.value = value.getGrpFill();
      }
      return this;
    }
  }
}
