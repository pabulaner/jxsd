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
import test.drawingml.main.CTTransform2DModel.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTTransform2DModel
{
	
	private final BooleanModel flipV;
	private final STAngleModel rot;
	private final BooleanModel flipH;
	private final CTPoint2DModel off;
	private final CTPositiveSize2DModel ext;
	
	public CTTransform2DModel(BooleanModel flipV, STAngleModel rot, BooleanModel flipH, CTPoint2DModel off, CTPositiveSize2DModel ext) {
		this.flipV = flipV;
		this.rot = rot;
		this.flipH = flipH;
		this.off = off;
		this.ext = ext;
	}
	
	public BooleanModel getFlipV() {
		return this.flipV;
	}
	public STAngleModel getRot() {
		return this.rot;
	}
	public BooleanModel getFlipH() {
		return this.flipH;
	}
	public CTPoint2DModel getOff() {
		return this.off;
	}
	public CTPositiveSize2DModel getExt() {
		return this.ext;
	}
}
