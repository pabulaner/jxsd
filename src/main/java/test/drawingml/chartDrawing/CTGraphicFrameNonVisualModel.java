package test.drawingml.chartDrawing;

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
import test.drawingml.chartDrawing.CTGraphicFrameNonVisualModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTGraphicFrameNonVisualModel
{
	
	private final CTNonVisualDrawingPropsModel cNvPr;
	private final CTNonVisualGraphicFramePropertiesModel cNvGraphicFramePr;
	
	public CTGraphicFrameNonVisualModel(CTNonVisualDrawingPropsModel cNvPr, CTNonVisualGraphicFramePropertiesModel cNvGraphicFramePr) {
		this.cNvPr = cNvPr;
		this.cNvGraphicFramePr = cNvGraphicFramePr;
	}
	
	public CTNonVisualDrawingPropsModel getCNvPr() {
		return this.cNvPr;
	}
	public CTNonVisualGraphicFramePropertiesModel getCNvGraphicFramePr() {
		return this.cNvGraphicFramePr;
	}
}
