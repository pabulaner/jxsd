package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.docx4j.dml.chart.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import test.drawingml.main.CTColorMappingOverrideModel.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// CHOICE MODEL
public class CTColorMappingOverrideModel
{
	
	private final int type;
	
	private final Object value;
	
	public CTColorMappingOverrideModel() {
		this(-1, null);
	}
	
	private CTColorMappingOverrideModel(int type, Object value) {
		this.type = type;
		this.value = value;
	}
	
	public static CTColorMappingOverrideModel createMasterClrMapping(CTEmptyElementModel value) {
		return new CTColorMappingOverrideModel(0, value);
	}
	public static CTColorMappingOverrideModel createOverrideClrMapping(CTColorMappingModel value) {
		return new CTColorMappingOverrideModel(1, value);
	}
	
	public Object getRaw() {
		return this.value;
	}
	
	public boolean isMasterClrMapping() {
		return this.type == 0;
	}
	
	public CTEmptyElementModel getMasterClrMapping() {
		if (this.type != 0) throw new ClassCastException();
		return (CTEmptyElementModel) value;
	}
	public boolean isOverrideClrMapping() {
		return this.type == 1;
	}
	
	public CTColorMappingModel getOverrideClrMapping() {
		if (this.type != 1) throw new ClassCastException();
		return (CTColorMappingModel) value;
	}
}
