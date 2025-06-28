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
import test.drawingml.main.CTEffectPropertiesModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// CHOICE MODEL
public class CTEffectPropertiesModel
{
	
	private final int type;
	
	private final Object value;
	
	public CTEffectPropertiesModel() {
		this(-1, null);
	}
	
	private CTEffectPropertiesModel(int type, Object value) {
		this.type = type;
		this.value = value;
	}
	
	public static CTEffectPropertiesModel createEffectLst(CTEffectListModel value) {
		return new CTEffectPropertiesModel(0, value);
	}
	public static CTEffectPropertiesModel createEffectDag(CTEffectContainerModel value) {
		return new CTEffectPropertiesModel(1, value);
	}
	
	public Object getRaw() {
		return this.value;
	}
	
	public boolean isEffectLst() {
		return this.type == 0;
	}
	
	public CTEffectListModel getEffectLst() {
		if (this.type != 0) throw new ClassCastException();
		return (CTEffectListModel) value;
	}
	public boolean isEffectDag() {
		return this.type == 1;
	}
	
	public CTEffectContainerModel getEffectDag() {
		if (this.type != 1) throw new ClassCastException();
		return (CTEffectContainerModel) value;
	}
}
