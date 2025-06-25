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
import test.dml.CTGroupLockingModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTGroupLockingModel
{
	
	private final BooleanModel noResize;
	private final BooleanModel noChangeAspect;
	private final BooleanModel noSelect;
	private final BooleanModel noUngrp;
	private final BooleanModel noGrp;
	private final BooleanModel noMove;
	private final BooleanModel noRot;
	private final CTOfficeArtExtensionListModel extLst;
	
	public CTGroupLockingModel(BooleanModel noResize, BooleanModel noChangeAspect, BooleanModel noSelect, BooleanModel noUngrp, BooleanModel noGrp, BooleanModel noMove, BooleanModel noRot, CTOfficeArtExtensionListModel extLst) {
		this.noResize = noResize;
		this.noChangeAspect = noChangeAspect;
		this.noSelect = noSelect;
		this.noUngrp = noUngrp;
		this.noGrp = noGrp;
		this.noMove = noMove;
		this.noRot = noRot;
		this.extLst = extLst;
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
	public BooleanModel getNoUngrp() {
		return this.noUngrp;
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
	public CTOfficeArtExtensionListModel getExtLst() {
		return this.extLst;
	}
}
