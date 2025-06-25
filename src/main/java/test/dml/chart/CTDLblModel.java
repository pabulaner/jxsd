package test.dml.chart;

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
import test.dml.chart.CTDLblModel.*;
import test.dml.chart.CTDLblModel.DeleteOrLayoutModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTDLblModel
{
	
	public static class DeleteOrLayoutModel
	{
		
		private final CTBooleanModel delete;
		private final CTLayoutModel layout;
		private final CTTxModel tx;
		private final CTNumFmtModel numFmt;
		private final CTShapePropertiesModel spPr;
		private final CTTextBodyModel txPr;
		private final CTDLblPosModel dLblPos;
		private final CTBooleanModel showLegendKey;
		private final CTBooleanModel showVal;
		private final CTBooleanModel showCatName;
		private final CTBooleanModel showSerName;
		private final CTBooleanModel showPercent;
		private final CTBooleanModel showBubbleSize;
		private final StringModel separator;
		
		public DeleteOrLayoutModel(CTBooleanModel delete, CTLayoutModel layout, CTTxModel tx, CTNumFmtModel numFmt, CTShapePropertiesModel spPr, CTTextBodyModel txPr, CTDLblPosModel dLblPos, CTBooleanModel showLegendKey, CTBooleanModel showVal, CTBooleanModel showCatName, CTBooleanModel showSerName, CTBooleanModel showPercent, CTBooleanModel showBubbleSize, StringModel separator) {
			this.delete = delete;
			this.layout = layout;
			this.tx = tx;
			this.numFmt = numFmt;
			this.spPr = spPr;
			this.txPr = txPr;
			this.dLblPos = dLblPos;
			this.showLegendKey = showLegendKey;
			this.showVal = showVal;
			this.showCatName = showCatName;
			this.showSerName = showSerName;
			this.showPercent = showPercent;
			this.showBubbleSize = showBubbleSize;
			this.separator = separator;
		}
		
		public CTBooleanModel getDelete() {
			return this.delete;
		}
		public CTLayoutModel getLayout() {
			return this.layout;
		}
		public CTTxModel getTx() {
			return this.tx;
		}
		public CTNumFmtModel getNumFmt() {
			return this.numFmt;
		}
		public CTShapePropertiesModel getSpPr() {
			return this.spPr;
		}
		public CTTextBodyModel getTxPr() {
			return this.txPr;
		}
		public CTDLblPosModel getDLblPos() {
			return this.dLblPos;
		}
		public CTBooleanModel getShowLegendKey() {
			return this.showLegendKey;
		}
		public CTBooleanModel getShowVal() {
			return this.showVal;
		}
		public CTBooleanModel getShowCatName() {
			return this.showCatName;
		}
		public CTBooleanModel getShowSerName() {
			return this.showSerName;
		}
		public CTBooleanModel getShowPercent() {
			return this.showPercent;
		}
		public CTBooleanModel getShowBubbleSize() {
			return this.showBubbleSize;
		}
		public StringModel getSeparator() {
			return this.separator;
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
