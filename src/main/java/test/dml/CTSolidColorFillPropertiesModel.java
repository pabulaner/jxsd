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
import test.dml.CTSolidColorFillPropertiesModel.*;
import test.officeDocument.relationships.*;

public class CTSolidColorFillPropertiesModel
{
	
	private final Object value;
	
	public CTSolidColorFillPropertiesModel() {
		this.value = null;
	}
	
	public CTSolidColorFillPropertiesModel(CTScRgbColorModel value) {
		this.value = value;
	}
	public CTSolidColorFillPropertiesModel(CTSRgbColorModel value) {
		this.value = value;
	}
	public CTSolidColorFillPropertiesModel(CTHslColorModel value) {
		this.value = value;
	}
	public CTSolidColorFillPropertiesModel(CTSystemColorModel value) {
		this.value = value;
	}
	public CTSolidColorFillPropertiesModel(CTSchemeColorModel value) {
		this.value = value;
	}
	public CTSolidColorFillPropertiesModel(CTPresetColorModel value) {
		this.value = value;
	}
	
	public Object getRaw() {
		return this.value;
	}
	
	public CTScRgbColorModel getScrgbClr() {
		return (CTScRgbColorModel) value;
	}
	public CTSRgbColorModel getSrgbClr() {
		return (CTSRgbColorModel) value;
	}
	public CTHslColorModel getHslClr() {
		return (CTHslColorModel) value;
	}
	public CTSystemColorModel getSysClr() {
		return (CTSystemColorModel) value;
	}
	public CTSchemeColorModel getSchemeClr() {
		return (CTSchemeColorModel) value;
	}
	public CTPresetColorModel getPrstClr() {
		return (CTPresetColorModel) value;
	}
}
