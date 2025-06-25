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
import test.dml.CTFillPropertiesModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTFillPropertiesModel
{
	
	private final Object value;
	
	public CTFillPropertiesModel() {
		this.value = null;
	}
	
	public CTFillPropertiesModel(CTNoFillPropertiesModel value) {
		this.value = value;
	}
	public CTFillPropertiesModel(CTSolidColorFillPropertiesModel value) {
		this.value = value;
	}
	public CTFillPropertiesModel(CTGradientFillPropertiesModel value) {
		this.value = value;
	}
	public CTFillPropertiesModel(CTBlipFillPropertiesModel value) {
		this.value = value;
	}
	public CTFillPropertiesModel(CTPatternFillPropertiesModel value) {
		this.value = value;
	}
	public CTFillPropertiesModel(CTGroupFillPropertiesModel value) {
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
