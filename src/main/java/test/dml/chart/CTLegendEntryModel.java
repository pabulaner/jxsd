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
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import test.dml.chart.CTLegendEntryModel.*;
import test.dml.chart.CTLegendEntryModel.DeleteOrTxPrModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTLegendEntryModel
{
	
	public static class DeleteOrTxPrModel
	{
		
		private final CTBooleanModel delete;
		private final CTTextBodyModel txPr;
		
		public DeleteOrTxPrModel(CTBooleanModel delete, CTTextBodyModel txPr) {
			this.delete = delete;
			this.txPr = txPr;
		}
		
		public CTBooleanModel getDelete() {
			return this.delete;
		}
		public CTTextBodyModel getTxPr() {
			return this.txPr;
		}
	}
	private final CTUnsignedIntModel idx;
	private final DeleteOrTxPrModel deleteOrTxPr;
	private final CTExtensionListModel extLst;
	
	public CTLegendEntryModel(CTUnsignedIntModel idx, DeleteOrTxPrModel deleteOrTxPr, CTExtensionListModel extLst) {
		this.idx = idx;
		this.deleteOrTxPr = deleteOrTxPr;
		this.extLst = extLst;
	}
	
	public CTUnsignedIntModel getIdx() {
		return this.idx;
	}
	public DeleteOrTxPrModel getDeleteOrTxPr() {
		return this.deleteOrTxPr;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
