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
import test.dml.chartDrawing.CTGroupShapeModel.SpOrGrpSpOrGraphicFrameModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.chartDrawing.CTGroupShapeModel.*;
import test.officeDocument.relationships.*;

public class CTGroupShapeModel
{
	
	public static class SpOrGrpSpOrGraphicFrameModel
	{
		
		private final CTShapeModel sp;
		private final CTGroupShapeModel grpSp;
		private final CTGraphicFrameModel graphicFrame;
		private final CTConnectorModel cxnSp;
		private final CTPictureModel pic;
		
		public SpOrGrpSpOrGraphicFrameModel(CTShapeModel sp, CTGroupShapeModel grpSp, CTGraphicFrameModel graphicFrame, CTConnectorModel cxnSp, CTPictureModel pic) {
			this.sp = sp;
			this.grpSp = grpSp;
			this.graphicFrame = graphicFrame;
			this.cxnSp = cxnSp;
			this.pic = pic;
		}
		
		public CTShapeModel getSp() {
			return this.sp;
		}
		public CTGroupShapeModel getGrpSp() {
			return this.grpSp;
		}
		public CTGraphicFrameModel getGraphicFrame() {
			return this.graphicFrame;
		}
		public CTConnectorModel getCxnSp() {
			return this.cxnSp;
		}
		public CTPictureModel getPic() {
			return this.pic;
		}
	}
	private final CTGroupShapeNonVisualModel nvGrpSpPr;
	private final CTGroupShapePropertiesModel grpSpPr;
	private final List<SpOrGrpSpOrGraphicFrameModel> spOrGrpSpOrGraphicFrame;
	
	public CTGroupShapeModel(CTGroupShapeNonVisualModel nvGrpSpPr, CTGroupShapePropertiesModel grpSpPr, List<SpOrGrpSpOrGraphicFrameModel> spOrGrpSpOrGraphicFrame) {
		this.nvGrpSpPr = nvGrpSpPr;
		this.grpSpPr = grpSpPr;
		this.spOrGrpSpOrGraphicFrame = spOrGrpSpOrGraphicFrame;
	}
	
	public CTGroupShapeNonVisualModel getNvGrpSpPr() {
		return this.nvGrpSpPr;
	}
	public CTGroupShapePropertiesModel getGrpSpPr() {
		return this.grpSpPr;
	}
	public List<SpOrGrpSpOrGraphicFrameModel> getSpOrGrpSpOrGraphicFrame() {
		return this.spOrGrpSpOrGraphicFrame;
	}
}
