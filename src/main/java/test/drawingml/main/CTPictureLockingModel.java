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
import test.drawingml.main.CTPictureLockingModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTPictureLockingModel
{
	
	private final BooleanModel noResize;
	private final BooleanModel noChangeAspect;
	private final BooleanModel noEditPoints;
	private final BooleanModel noChangeArrowheads;
	private final BooleanModel noCrop;
	private final BooleanModel noSelect;
	private final BooleanModel noGrp;
	private final BooleanModel noMove;
	private final BooleanModel noRot;
	private final BooleanModel noChangeShapeType;
	private final BooleanModel noAdjustHandles;
	private final CTOfficeArtExtensionListModel extLst;
	
	public CTPictureLockingModel(BooleanModel noResize, BooleanModel noChangeAspect, BooleanModel noEditPoints, BooleanModel noChangeArrowheads, BooleanModel noCrop, BooleanModel noSelect, BooleanModel noGrp, BooleanModel noMove, BooleanModel noRot, BooleanModel noChangeShapeType, BooleanModel noAdjustHandles, CTOfficeArtExtensionListModel extLst) {
		this.noResize = noResize;
		this.noChangeAspect = noChangeAspect;
		this.noEditPoints = noEditPoints;
		this.noChangeArrowheads = noChangeArrowheads;
		this.noCrop = noCrop;
		this.noSelect = noSelect;
		this.noGrp = noGrp;
		this.noMove = noMove;
		this.noRot = noRot;
		this.noChangeShapeType = noChangeShapeType;
		this.noAdjustHandles = noAdjustHandles;
		this.extLst = extLst;
	}
	
	public BooleanModel getNoResize() {
		return this.noResize;
	}
	public BooleanModel getNoChangeAspect() {
		return this.noChangeAspect;
	}
	public BooleanModel getNoEditPoints() {
		return this.noEditPoints;
	}
	public BooleanModel getNoChangeArrowheads() {
		return this.noChangeArrowheads;
	}
	public BooleanModel getNoCrop() {
		return this.noCrop;
	}
	public BooleanModel getNoSelect() {
		return this.noSelect;
	}
	public BooleanModel getNoGrp() {
		return this.noGrp;
	}
	public BooleanModel getNoMove() {
		return this.noMove;
	}
	public BooleanModel getNoRot() {
		return this.noRot;
	}
	public BooleanModel getNoChangeShapeType() {
		return this.noChangeShapeType;
	}
	public BooleanModel getNoAdjustHandles() {
		return this.noAdjustHandles;
	}
	public CTOfficeArtExtensionListModel getExtLst() {
		return this.extLst;
	}
}
