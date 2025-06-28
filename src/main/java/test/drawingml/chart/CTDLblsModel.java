package test.drawingml.chart;

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
import test.drawingml.chart.CTDLblsModel.DeleteOrNumFmtModel.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chart.CTDLblsModel.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTDLblsModel
{
	
	// CHOICE MODEL
	public static class DeleteOrNumFmtModel
	{
		
		private final int type;
		
		private final Object value;
		
		public DeleteOrNumFmtModel() {
			this(-1, null);
		}
		
		private DeleteOrNumFmtModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static DeleteOrNumFmtModel createDelete(CTBooleanModel value) {
			return new DeleteOrNumFmtModel(0, value);
		}
		public static DeleteOrNumFmtModel createNumFmt(CTNumFmtModel value) {
			return new DeleteOrNumFmtModel(1, value);
		}
		public static DeleteOrNumFmtModel createSpPr(CTShapePropertiesModel value) {
			return new DeleteOrNumFmtModel(2, value);
		}
		public static DeleteOrNumFmtModel createTxPr(CTTextBodyModel value) {
			return new DeleteOrNumFmtModel(3, value);
		}
		public static DeleteOrNumFmtModel createDLblPos(CTDLblPosModel value) {
			return new DeleteOrNumFmtModel(4, value);
		}
		public static DeleteOrNumFmtModel createShowLegendKey(CTBooleanModel value) {
			return new DeleteOrNumFmtModel(5, value);
		}
		public static DeleteOrNumFmtModel createShowVal(CTBooleanModel value) {
			return new DeleteOrNumFmtModel(6, value);
		}
		public static DeleteOrNumFmtModel createShowCatName(CTBooleanModel value) {
			return new DeleteOrNumFmtModel(7, value);
		}
		public static DeleteOrNumFmtModel createShowSerName(CTBooleanModel value) {
			return new DeleteOrNumFmtModel(8, value);
		}
		public static DeleteOrNumFmtModel createShowPercent(CTBooleanModel value) {
			return new DeleteOrNumFmtModel(9, value);
		}
		public static DeleteOrNumFmtModel createShowBubbleSize(CTBooleanModel value) {
			return new DeleteOrNumFmtModel(10, value);
		}
		public static DeleteOrNumFmtModel createSeparator(StringModel value) {
			return new DeleteOrNumFmtModel(11, value);
		}
		public static DeleteOrNumFmtModel createShowLeaderLines(CTBooleanModel value) {
			return new DeleteOrNumFmtModel(12, value);
		}
		public static DeleteOrNumFmtModel createLeaderLines(CTChartLinesModel value) {
			return new DeleteOrNumFmtModel(13, value);
		}
		
		public Object getRaw() {
			return this.value;
		}
		
		public boolean isDelete() {
			return this.type == 0;
		}
		
		public CTBooleanModel getDelete() {
			if (this.type != 0) throw new ClassCastException();
			return (CTBooleanModel) value;
		}
		public boolean isNumFmt() {
			return this.type == 1;
		}
		
		public CTNumFmtModel getNumFmt() {
			if (this.type != 1) throw new ClassCastException();
			return (CTNumFmtModel) value;
		}
		public boolean isSpPr() {
			return this.type == 2;
		}
		
		public CTShapePropertiesModel getSpPr() {
			if (this.type != 2) throw new ClassCastException();
			return (CTShapePropertiesModel) value;
		}
		public boolean isTxPr() {
			return this.type == 3;
		}
		
		public CTTextBodyModel getTxPr() {
			if (this.type != 3) throw new ClassCastException();
			return (CTTextBodyModel) value;
		}
		public boolean isDLblPos() {
			return this.type == 4;
		}
		
		public CTDLblPosModel getDLblPos() {
			if (this.type != 4) throw new ClassCastException();
			return (CTDLblPosModel) value;
		}
		public boolean isShowLegendKey() {
			return this.type == 5;
		}
		
		public CTBooleanModel getShowLegendKey() {
			if (this.type != 5) throw new ClassCastException();
			return (CTBooleanModel) value;
		}
		public boolean isShowVal() {
			return this.type == 6;
		}
		
		public CTBooleanModel getShowVal() {
			if (this.type != 6) throw new ClassCastException();
			return (CTBooleanModel) value;
		}
		public boolean isShowCatName() {
			return this.type == 7;
		}
		
		public CTBooleanModel getShowCatName() {
			if (this.type != 7) throw new ClassCastException();
			return (CTBooleanModel) value;
		}
		public boolean isShowSerName() {
			return this.type == 8;
		}
		
		public CTBooleanModel getShowSerName() {
			if (this.type != 8) throw new ClassCastException();
			return (CTBooleanModel) value;
		}
		public boolean isShowPercent() {
			return this.type == 9;
		}
		
		public CTBooleanModel getShowPercent() {
			if (this.type != 9) throw new ClassCastException();
			return (CTBooleanModel) value;
		}
		public boolean isShowBubbleSize() {
			return this.type == 10;
		}
		
		public CTBooleanModel getShowBubbleSize() {
			if (this.type != 10) throw new ClassCastException();
			return (CTBooleanModel) value;
		}
		public boolean isSeparator() {
			return this.type == 11;
		}
		
		public StringModel getSeparator() {
			if (this.type != 11) throw new ClassCastException();
			return (StringModel) value;
		}
		public boolean isShowLeaderLines() {
			return this.type == 12;
		}
		
		public CTBooleanModel getShowLeaderLines() {
			if (this.type != 12) throw new ClassCastException();
			return (CTBooleanModel) value;
		}
		public boolean isLeaderLines() {
			return this.type == 13;
		}
		
		public CTChartLinesModel getLeaderLines() {
			if (this.type != 13) throw new ClassCastException();
			return (CTChartLinesModel) value;
		}
	}
	private final List<CTDLblModel> dLbl;
	private final DeleteOrNumFmtModel deleteOrNumFmt;
	private final CTExtensionListModel extLst;
	
	public CTDLblsModel(List<CTDLblModel> dLbl, DeleteOrNumFmtModel deleteOrNumFmt, CTExtensionListModel extLst) {
		this.dLbl = dLbl;
		this.deleteOrNumFmt = deleteOrNumFmt;
		this.extLst = extLst;
	}
	
	public List<CTDLblModel> getDLbl() {
		return this.dLbl;
	}
	public DeleteOrNumFmtModel getDeleteOrNumFmt() {
		return this.deleteOrNumFmt;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
