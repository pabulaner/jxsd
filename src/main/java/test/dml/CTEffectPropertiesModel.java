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
import test.dml.CTEffectPropertiesModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTEffectPropertiesModel
{
	
	private final Object value;
	
	public CTEffectPropertiesModel() {
		this.value = null;
	}
	
	public CTEffectPropertiesModel(CTEffectListModel value) {
		this.value = value;
	}
	public CTEffectPropertiesModel(CTEffectContainerModel value) {
		this.value = value;
	}
	
	public Object getRaw() {
		return this.value;
	}
	
	public CTEffectListModel getEffectLst() {
		return (CTEffectListModel) value;
	}
	public CTEffectContainerModel getEffectDag() {
		return (CTEffectContainerModel) value;
	}
}
