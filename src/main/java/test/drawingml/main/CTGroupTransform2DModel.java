package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.drawingml.main.CTGroupTransform2DModel.*;
import org.docx4j.dml.chart.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTGroupTransform2DModel
{
	
	private final BooleanModel flipV;
	private final STAngleModel rot;
	private final BooleanModel flipH;
	private final CTPoint2DModel off;
	private final CTPositiveSize2DModel ext;
	private final CTPoint2DModel chOff;
	private final CTPositiveSize2DModel chExt;
	
	public CTGroupTransform2DModel(BooleanModel flipV, STAngleModel rot, BooleanModel flipH, CTPoint2DModel off, CTPositiveSize2DModel ext, CTPoint2DModel chOff, CTPositiveSize2DModel chExt) {
		this.flipV = flipV;
		this.rot = rot;
		this.flipH = flipH;
		this.off = off;
		this.ext = ext;
		this.chOff = chOff;
		this.chExt = chExt;
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
	public CTPoint2DModel getChOff() {
		return this.chOff;
	}
	public CTPositiveSize2DModel getChExt() {
		return this.chExt;
	}
}
