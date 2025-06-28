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
import test.drawingml.main.CTPresetGeometry2DModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTPresetGeometry2DModel
{
	
	private final STShapeTypeModel prst;
	private final CTGeomGuideListModel avLst;
	
	public CTPresetGeometry2DModel(STShapeTypeModel prst, CTGeomGuideListModel avLst) {
		this.prst = prst;
		this.avLst = avLst;
	}
	
	public STShapeTypeModel getPrst() {
		return this.prst;
	}
	public CTGeomGuideListModel getAvLst() {
		return this.avLst;
	}
}
