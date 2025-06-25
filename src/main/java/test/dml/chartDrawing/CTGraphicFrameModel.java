package test.dml.chartDrawing;

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
import test.dml.chartDrawing.*;
import test.dml.chartDrawing.CTGraphicFrameModel.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

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
