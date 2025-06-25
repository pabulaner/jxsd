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
import test.dml.CTColorMappingOverrideModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTColorMappingOverrideModel
{
	
	private final Object value;
	
	public CTColorMappingOverrideModel() {
		this.value = null;
	}
	
	public CTColorMappingOverrideModel(CTEmptyElementModel value) {
		this.value = value;
	}
	public CTColorMappingOverrideModel(CTColorMappingModel value) {
		this.value = value;
	}
	
	public Object getRaw() {
		return this.value;
	}
	
	public CTEmptyElementModel getMasterClrMapping() {
		return (CTEmptyElementModel) value;
	}
	public CTColorMappingModel getOverrideClrMapping() {
		return (CTColorMappingModel) value;
	}
}
