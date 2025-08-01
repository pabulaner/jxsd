package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.DateValueModel;
import java.time.LocalDate;

public class DateValueBuilder {
  private LocalDate value;

  public DateValueBuilder() {
  }

  public DateValueBuilder setValue(LocalDate value) {
    this.value = value;
    return this;
  }

  public DateValueBuilder from(DateValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public DateValueModel build() {
    return new DateValueModel(this.value);
  }
}
