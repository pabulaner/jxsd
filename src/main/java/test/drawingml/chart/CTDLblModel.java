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
import test.drawingml.chart.CTDLblModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chart.CTDLblModel.DeleteOrLayoutModel.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTDLblModel
{
	
	// CHOICE MODEL
	public static class DeleteOrLayoutModel
	{
		
		private final int type;
		
		private final Object value;
		
		public DeleteOrLayoutModel() {
			this(-1, null);
		}
		
		private DeleteOrLayoutModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static DeleteOrLayoutModel createDelete(CTBooleanModel value) {
			return new DeleteOrLayoutModel(0, value);
		}
		public static DeleteOrLayoutModel createLayout(CTLayoutModel value) {
			return new DeleteOrLayoutModel(1, value);
		}
		public static DeleteOrLayoutModel createTx(CTTxModel value) {
			return new DeleteOrLayoutModel(2, value);
		}
		public static DeleteOrLayoutModel createNumFmt(CTNumFmtModel value) {
			return new DeleteOrLayoutModel(3, value);
		}
		public static DeleteOrLayoutModel createSpPr(CTShapePropertiesModel value) {
			return new DeleteOrLayoutModel(4, value);
		}
		public static DeleteOrLayoutModel createTxPr(CTTextBodyModel value) {
			return new DeleteOrLayoutModel(5, value);
		}
		public static DeleteOrLayoutModel createDLblPos(CTDLblPosModel value) {
			return new DeleteOrLayoutModel(6, value);
		}
		public static DeleteOrLayoutModel createShowLegendKey(CTBooleanModel value) {
			return new DeleteOrLayoutModel(7, value);
		}
		public static DeleteOrLayoutModel createShowVal(CTBooleanModel value) {
			return new DeleteOrLayoutModel(8, value);
		}
		public static DeleteOrLayoutModel createShowCatName(CTBooleanModel value) {
			return new DeleteOrLayoutModel(9, value);
		}
		public static DeleteOrLayoutModel createShowSerName(CTBooleanModel value) {
			return new DeleteOrLayoutModel(10, value);
		}
		public static DeleteOrLayoutModel createShowPercent(CTBooleanModel value) {
			return new DeleteOrLayoutModel(11, value);
		}
		public static DeleteOrLayoutModel createShowBubbleSize(CTBooleanModel value) {
			return new DeleteOrLayoutModel(12, value);
		}
		public static DeleteOrLayoutModel createSeparator(StringModel value) {
			return new DeleteOrLayoutModel(13, value);
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
		public boolean isLayout() {
			return this.type == 1;
		}
		
		public CTLayoutModel getLayout() {
			if (this.type != 1) throw new ClassCastException();
			return (CTLayoutModel) value;
		}
		public boolean isTx() {
			return this.type == 2;
		}
		
		public CTTxModel getTx() {
			if (this.type != 2) throw new ClassCastException();
			return (CTTxModel) value;
		}
		public boolean isNumFmt() {
			return this.type == 3;
		}
		
		public CTNumFmtModel getNumFmt() {
			if (this.type != 3) throw new ClassCastException();
			return (CTNumFmtModel) value;
		}
		public boolean isSpPr() {
			return this.type == 4;
		}
		
		public CTShapePropertiesModel getSpPr() {
			if (this.type != 4) throw new ClassCastException();
			return (CTShapePropertiesModel) value;
		}
		public boolean isTxPr() {
			return this.type == 5;
		}
		
		public CTTextBodyModel getTxPr() {
			if (this.type != 5) throw new ClassCastException();
			return (CTTextBodyModel) value;
		}
		public boolean isDLblPos() {
			return this.type == 6;
		}
		
		public CTDLblPosModel getDLblPos() {
			if (this.type != 6) throw new ClassCastException();
			return (CTDLblPosModel) value;
		}
		public boolean isShowLegendKey() {
			return this.type == 7;
		}
		
		public CTBooleanModel getShowLegendKey() {
			if (this.type != 7) throw new ClassCastException();
			return (CTBooleanModel) value;
		}
		public boolean isShowVal() {
			return this.type == 8;
		}
		
		public CTBooleanModel getShowVal() {
			if (this.type != 8) throw new ClassCastException();
			return (CTBooleanModel) value;
		}
		public boolean isShowCatName() {
			return this.type == 9;
		}
		
		public CTBooleanModel getShowCatName() {
			if (this.type != 9) throw new ClassCastException();
			return (CTBooleanModel) value;
		}
		public boolean isShowSerName() {
			return this.type == 10;
		}
		
		public CTBooleanModel getShowSerName() {
			if (this.type != 10) throw new ClassCastException();
			return (CTBooleanModel) value;
		}
		public boolean isShowPercent() {
			return this.type == 11;
		}
		
		public CTBooleanModel getShowPercent() {
			if (this.type != 11) throw new ClassCastException();
			return (CTBooleanModel) value;
		}
		public boolean isShowBubbleSize() {
			return this.type == 12;
		}
		
		public CTBooleanModel getShowBubbleSize() {
			if (this.type != 12) throw new ClassCastException();
			return (CTBooleanModel) value;
		}
		public boolean isSeparator() {
			return this.type == 13;
		}
		
		public StringModel getSeparator() {
			if (this.type != 13) throw new ClassCastException();
			return (StringModel) value;
		}
	}
	private final CTUnsignedIntModel idx;
	private final DeleteOrLayoutModel deleteOrLayout;
	private final CTExtensionListModel extLst;
	
	public CTDLblModel(CTUnsignedIntModel idx, DeleteOrLayoutModel deleteOrLayout, CTExtensionListModel extLst) {
		this.idx = idx;
		this.deleteOrLayout = deleteOrLayout;
		this.extLst = extLst;
	}
	
	public CTUnsignedIntModel getIdx() {
		return this.idx;
	}
	public DeleteOrLayoutModel getDeleteOrLayout() {
		return this.deleteOrLayout;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
