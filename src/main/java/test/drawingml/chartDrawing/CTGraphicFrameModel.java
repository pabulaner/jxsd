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
import test.drawingml.chartDrawing.CTGraphicFrameModel.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTGraphicFrameModel
{
	
	private final BooleanModel fPublished;
	private final StringModel macro;
	private final CTGraphicFrameNonVisualModel nvGraphicFramePr;
	private final CTTransform2DModel xfrm;
	private final CTGraphicalObjectModel graphic;
	
	public CTGraphicFrameModel(BooleanModel fPublished, StringModel macro, CTGraphicFrameNonVisualModel nvGraphicFramePr, CTTransform2DModel xfrm, CTGraphicalObjectModel graphic) {
		this.fPublished = fPublished;
		this.macro = macro;
		this.nvGraphicFramePr = nvGraphicFramePr;
		this.xfrm = xfrm;
		this.graphic = graphic;
	}
	
	public BooleanModel getFPublished() {
		return this.fPublished;
	}
	public StringModel getMacro() {
		return this.macro;
	}
	public CTGraphicFrameNonVisualModel getNvGraphicFramePr() {
		return this.nvGraphicFramePr;
	}
	public CTTransform2DModel getXfrm() {
		return this.xfrm;
	}
	public CTGraphicalObjectModel getGraphic() {
		return this.graphic;
	}
}
