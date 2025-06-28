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
import test.drawingml.chartDrawing.CTAbsSizeAnchorModel.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.chartDrawing.CTAbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTAbsSizeAnchorModel
{
	
	// CHOICE MODEL
	public static class SpOrGrpSpOrGraphicFrameModel
	{
		
		private final int type;
		
		private final Object value;
		
		public SpOrGrpSpOrGraphicFrameModel() {
			this(-1, null);
		}
		
		private SpOrGrpSpOrGraphicFrameModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static SpOrGrpSpOrGraphicFrameModel createSp(CTShapeModel value) {
			return new SpOrGrpSpOrGraphicFrameModel(0, value);
		}
		public static SpOrGrpSpOrGraphicFrameModel createGrpSp(CTGroupShapeModel value) {
			return new SpOrGrpSpOrGraphicFrameModel(1, value);
		}
		public static SpOrGrpSpOrGraphicFrameModel createGraphicFrame(CTGraphicFrameModel value) {
			return new SpOrGrpSpOrGraphicFrameModel(2, value);
		}
		public static SpOrGrpSpOrGraphicFrameModel createCxnSp(CTConnectorModel value) {
			return new SpOrGrpSpOrGraphicFrameModel(3, value);
		}
		public static SpOrGrpSpOrGraphicFrameModel createPic(CTPictureModel value) {
			return new SpOrGrpSpOrGraphicFrameModel(4, value);
		}
		
		public Object getRaw() {
			return this.value;
		}
		
		public boolean isSp() {
			return this.type == 0;
		}
		
		public CTShapeModel getSp() {
			if (this.type != 0) throw new ClassCastException();
			return (CTShapeModel) value;
		}
		public boolean isGrpSp() {
			return this.type == 1;
		}
		
		public CTGroupShapeModel getGrpSp() {
			if (this.type != 1) throw new ClassCastException();
			return (CTGroupShapeModel) value;
		}
		public boolean isGraphicFrame() {
			return this.type == 2;
		}
		
		public CTGraphicFrameModel getGraphicFrame() {
			if (this.type != 2) throw new ClassCastException();
			return (CTGraphicFrameModel) value;
		}
		public boolean isCxnSp() {
			return this.type == 3;
		}
		
		public CTConnectorModel getCxnSp() {
			if (this.type != 3) throw new ClassCastException();
			return (CTConnectorModel) value;
		}
		public boolean isPic() {
			return this.type == 4;
		}
		
		public CTPictureModel getPic() {
			if (this.type != 4) throw new ClassCastException();
			return (CTPictureModel) value;
		}
	}
	private final CTMarkerModel from;
	private final CTPositiveSize2DModel ext;
	private final SpOrGrpSpOrGraphicFrameModel spOrGrpSpOrGraphicFrame;
	
	public CTAbsSizeAnchorModel(CTMarkerModel from, CTPositiveSize2DModel ext, SpOrGrpSpOrGraphicFrameModel spOrGrpSpOrGraphicFrame) {
		this.from = from;
		this.ext = ext;
		this.spOrGrpSpOrGraphicFrame = spOrGrpSpOrGraphicFrame;
	}
	
	public CTMarkerModel getFrom() {
		return this.from;
	}
	public CTPositiveSize2DModel getExt() {
		return this.ext;
	}
	public SpOrGrpSpOrGraphicFrameModel getSpOrGrpSpOrGraphicFrame() {
		return this.spOrGrpSpOrGraphicFrame;
	}
}
