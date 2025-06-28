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
import test.drawingml.main.CTBackdropModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTBackdropModel
{
	
	private final CTPoint3DModel anchor;
	private final CTVector3DModel norm;
	private final CTVector3DModel up;
	private final CTOfficeArtExtensionListModel extLst;
	
	public CTBackdropModel(CTPoint3DModel anchor, CTVector3DModel norm, CTVector3DModel up, CTOfficeArtExtensionListModel extLst) {
		this.anchor = anchor;
		this.norm = norm;
		this.up = up;
		this.extLst = extLst;
	}
	
	public CTPoint3DModel getAnchor() {
		return this.anchor;
	}
	public CTVector3DModel getNorm() {
		return this.norm;
	}
	public CTVector3DModel getUp() {
		return this.up;
	}
	public CTOfficeArtExtensionListModel getExtLst() {
		return this.extLst;
	}
}
