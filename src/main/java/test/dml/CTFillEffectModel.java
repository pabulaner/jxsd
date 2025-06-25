package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTFillEffectModel.*;
import test.officeDocument.relationships.*;

public class CTFillEffectModel
{
	
	private final Object value;
	
	public CTFillEffectModel() {
		this.value = null;
	}
	
	public CTFillEffectModel(CTNoFillPropertiesModel value) {
		this.value = value;
	}
	public CTFillEffectModel(CTSolidColorFillPropertiesModel value) {
		this.value = value;
	}
	public CTFillEffectModel(CTGradientFillPropertiesModel value) {
		this.value = value;
	}
	public CTFillEffectModel(CTBlipFillPropertiesModel value) {
		this.value = value;
	}
	public CTFillEffectModel(CTPatternFillPropertiesModel value) {
		this.value = value;
	}
	public CTFillEffectModel(CTGroupFillPropertiesModel value) {
		this.value = value;
	}
	
	public Object getRaw() {
		return this.value;
	}
	
	public CTNoFillPropertiesModel getNoFill() {
		return (CTNoFillPropertiesModel) value;
	}
	public CTSolidColorFillPropertiesModel getSolidFill() {
		return (CTSolidColorFillPropertiesModel) value;
	}
	public CTGradientFillPropertiesModel getGradFill() {
		return (CTGradientFillPropertiesModel) value;
	}
	public CTBlipFillPropertiesModel getBlipFill() {
		return (CTBlipFillPropertiesModel) value;
	}
	public CTPatternFillPropertiesModel getPattFill() {
		return (CTPatternFillPropertiesModel) value;
	}
	public CTGroupFillPropertiesModel getGrpFill() {
		return (CTGroupFillPropertiesModel) value;
	}
}
