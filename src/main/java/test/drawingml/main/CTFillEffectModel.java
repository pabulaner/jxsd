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
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.main.CTFillEffectModel.*;
import test.officeDocument.relationships.*;

// CHOICE MODEL
public class CTFillEffectModel
{
	
	private final int type;
	
	private final Object value;
	
	public CTFillEffectModel() {
		this(-1, null);
	}
	
	private CTFillEffectModel(int type, Object value) {
		this.type = type;
		this.value = value;
	}
	
	public static CTFillEffectModel createNoFill(CTNoFillPropertiesModel value) {
		return new CTFillEffectModel(0, value);
	}
	public static CTFillEffectModel createSolidFill(CTSolidColorFillPropertiesModel value) {
		return new CTFillEffectModel(1, value);
	}
	public static CTFillEffectModel createGradFill(CTGradientFillPropertiesModel value) {
		return new CTFillEffectModel(2, value);
	}
	public static CTFillEffectModel createBlipFill(CTBlipFillPropertiesModel value) {
		return new CTFillEffectModel(3, value);
	}
	public static CTFillEffectModel createPattFill(CTPatternFillPropertiesModel value) {
		return new CTFillEffectModel(4, value);
	}
	public static CTFillEffectModel createGrpFill(CTGroupFillPropertiesModel value) {
		return new CTFillEffectModel(5, value);
	}
	
	public Object getRaw() {
		return this.value;
	}
	
	public boolean isNoFill() {
		return this.type == 0;
	}
	
	public CTNoFillPropertiesModel getNoFill() {
		if (this.type != 0) throw new ClassCastException();
		return (CTNoFillPropertiesModel) value;
	}
	public boolean isSolidFill() {
		return this.type == 1;
	}
	
	public CTSolidColorFillPropertiesModel getSolidFill() {
		if (this.type != 1) throw new ClassCastException();
		return (CTSolidColorFillPropertiesModel) value;
	}
	public boolean isGradFill() {
		return this.type == 2;
	}
	
	public CTGradientFillPropertiesModel getGradFill() {
		if (this.type != 2) throw new ClassCastException();
		return (CTGradientFillPropertiesModel) value;
	}
	public boolean isBlipFill() {
		return this.type == 3;
	}
	
	public CTBlipFillPropertiesModel getBlipFill() {
		if (this.type != 3) throw new ClassCastException();
		return (CTBlipFillPropertiesModel) value;
	}
	public boolean isPattFill() {
		return this.type == 4;
	}
	
	public CTPatternFillPropertiesModel getPattFill() {
		if (this.type != 4) throw new ClassCastException();
		return (CTPatternFillPropertiesModel) value;
	}
	public boolean isGrpFill() {
		return this.type == 5;
	}
	
	public CTGroupFillPropertiesModel getGrpFill() {
		if (this.type != 5) throw new ClassCastException();
		return (CTGroupFillPropertiesModel) value;
	}
}
