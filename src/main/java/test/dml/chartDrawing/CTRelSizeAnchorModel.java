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
import test.dml.chartDrawing.CTRelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.chartDrawing.CTRelSizeAnchorModel.*;
import test.officeDocument.relationships.*;

public class CTRelSizeAnchorModel
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
	private final CTMarkerModel from;
	private final CTMarkerModel to;
	private final SpOrGrpSpOrGraphicFrameModel spOrGrpSpOrGraphicFrame;
	
	public CTRelSizeAnchorModel(CTMarkerModel from, CTMarkerModel to, SpOrGrpSpOrGraphicFrameModel spOrGrpSpOrGraphicFrame) {
		this.from = from;
		this.to = to;
		this.spOrGrpSpOrGraphicFrame = spOrGrpSpOrGraphicFrame;
	}
	
	public CTMarkerModel getFrom() {
		return this.from;
	}
	public CTMarkerModel getTo() {
		return this.to;
	}
	public SpOrGrpSpOrGraphicFrameModel getSpOrGrpSpOrGraphicFrame() {
		return this.spOrGrpSpOrGraphicFrame;
	}
}
