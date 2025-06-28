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
import test.officeDocument.relationships.*;
import test.drawingml.main.CTNonVisualDrawingShapePropsModel.*;

// SEQUENCE MODEL
public class CTNonVisualDrawingShapePropsModel
{
	
	private final BooleanModel txBox;
	private final CTShapeLockingModel spLocks;
	private final CTOfficeArtExtensionListModel extLst;
	
	public CTNonVisualDrawingShapePropsModel(BooleanModel txBox, CTShapeLockingModel spLocks, CTOfficeArtExtensionListModel extLst) {
		this.txBox = txBox;
		this.spLocks = spLocks;
		this.extLst = extLst;
	}
	
	public BooleanModel getTxBox() {
		return this.txBox;
	}
	public CTShapeLockingModel getSpLocks() {
		return this.spLocks;
	}
	public CTOfficeArtExtensionListModel getExtLst() {
		return this.extLst;
	}
}
