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
import test.drawingml.main.CTShapeStyleModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTShapeStyleModel
{
	
	private final CTStyleMatrixReferenceModel lnRef;
	private final CTStyleMatrixReferenceModel fillRef;
	private final CTStyleMatrixReferenceModel effectRef;
	private final CTFontReferenceModel fontRef;
	
	public CTShapeStyleModel(CTStyleMatrixReferenceModel lnRef, CTStyleMatrixReferenceModel fillRef, CTStyleMatrixReferenceModel effectRef, CTFontReferenceModel fontRef) {
		this.lnRef = lnRef;
		this.fillRef = fillRef;
		this.effectRef = effectRef;
		this.fontRef = fontRef;
	}
	
	public CTStyleMatrixReferenceModel getLnRef() {
		return this.lnRef;
	}
	public CTStyleMatrixReferenceModel getFillRef() {
		return this.fillRef;
	}
	public CTStyleMatrixReferenceModel getEffectRef() {
		return this.effectRef;
	}
	public CTFontReferenceModel getFontRef() {
		return this.fontRef;
	}
}
