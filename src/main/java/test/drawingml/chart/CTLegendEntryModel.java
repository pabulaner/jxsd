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
import test.drawingml.chart.CTLegendEntryModel.DeleteOrTxPrModel.*;
import test.drawingml.chart.CTLegendEntryModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTLegendEntryModel
{
	
	// CHOICE MODEL
	public static class DeleteOrTxPrModel
	{
		
		private final int type;
		
		private final Object value;
		
		public DeleteOrTxPrModel() {
			this(-1, null);
		}
		
		private DeleteOrTxPrModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static DeleteOrTxPrModel createDelete(CTBooleanModel value) {
			return new DeleteOrTxPrModel(0, value);
		}
		public static DeleteOrTxPrModel createTxPr(CTTextBodyModel value) {
			return new DeleteOrTxPrModel(1, value);
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
		public boolean isTxPr() {
			return this.type == 1;
		}
		
		public CTTextBodyModel getTxPr() {
			if (this.type != 1) throw new ClassCastException();
			return (CTTextBodyModel) value;
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
