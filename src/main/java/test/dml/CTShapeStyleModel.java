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
import test.officeDocument.relationships.*;
import test.dml.CTShapeStyleModel.*;

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
