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
import test.drawingml.main.CTGraphicalObjectFrameLockingModel.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTGraphicalObjectFrameLockingModel
{
	
	private final BooleanModel noDrilldown;
	private final BooleanModel noResize;
	private final BooleanModel noChangeAspect;
	private final BooleanModel noSelect;
	private final BooleanModel noGrp;
	private final BooleanModel noMove;
	private final CTOfficeArtExtensionListModel extLst;
	
	public CTGraphicalObjectFrameLockingModel(BooleanModel noDrilldown, BooleanModel noResize, BooleanModel noChangeAspect, BooleanModel noSelect, BooleanModel noGrp, BooleanModel noMove, CTOfficeArtExtensionListModel extLst) {
		this.noDrilldown = noDrilldown;
		this.noResize = noResize;
		this.noChangeAspect = noChangeAspect;
		this.noSelect = noSelect;
		this.noGrp = noGrp;
		this.noMove = noMove;
		this.extLst = extLst;
	}
	
	public BooleanModel getNoDrilldown() {
		return this.noDrilldown;
	}
	public BooleanModel getNoResize() {
		return this.noResize;
	}
	public BooleanModel getNoChangeAspect() {
		return this.noChangeAspect;
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
	public CTOfficeArtExtensionListModel getExtLst() {
		return this.extLst;
	}
}
