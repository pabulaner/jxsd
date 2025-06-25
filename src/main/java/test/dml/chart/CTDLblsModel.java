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
import test.dml.chart.CTDLblsModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import test.dml.chart.CTDLblsModel.DeleteOrNumFmtModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTDLblsModel
{
	
	public static class DeleteOrNumFmtModel
	{
		
		private final CTBooleanModel delete;
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
		private final CTBooleanModel showLeaderLines;
		private final CTChartLinesModel leaderLines;
		
		public DeleteOrNumFmtModel(CTBooleanModel delete, CTNumFmtModel numFmt, CTShapePropertiesModel spPr, CTTextBodyModel txPr, CTDLblPosModel dLblPos, CTBooleanModel showLegendKey, CTBooleanModel showVal, CTBooleanModel showCatName, CTBooleanModel showSerName, CTBooleanModel showPercent, CTBooleanModel showBubbleSize, StringModel separator, CTBooleanModel showLeaderLines, CTChartLinesModel leaderLines) {
			this.delete = delete;
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
			this.showLeaderLines = showLeaderLines;
			this.leaderLines = leaderLines;
		}
		
		public CTBooleanModel getDelete() {
			return this.delete;
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
		public CTBooleanModel getShowLeaderLines() {
			return this.showLeaderLines;
		}
		public CTChartLinesModel getLeaderLines() {
			return this.leaderLines;
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
