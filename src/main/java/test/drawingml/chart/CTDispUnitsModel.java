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
import test.drawingml.chart.CTDispUnitsModel.CustUnitOrBuiltInUnitModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.chart.CTDispUnitsModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTDispUnitsModel
{
	
	// CHOICE MODEL
	public static class CustUnitOrBuiltInUnitModel
	{
		
		private final int type;
		
		private final Object value;
		
		public CustUnitOrBuiltInUnitModel() {
			this(-1, null);
		}
		
		private CustUnitOrBuiltInUnitModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static CustUnitOrBuiltInUnitModel createCustUnit(CTDoubleModel value) {
			return new CustUnitOrBuiltInUnitModel(0, value);
		}
		public static CustUnitOrBuiltInUnitModel createBuiltInUnit(CTBuiltInUnitModel value) {
			return new CustUnitOrBuiltInUnitModel(1, value);
		}
		
		public Object getRaw() {
			return this.value;
		}
		
		public boolean isCustUnit() {
			return this.type == 0;
		}
		
		public CTDoubleModel getCustUnit() {
			if (this.type != 0) throw new ClassCastException();
			return (CTDoubleModel) value;
		}
		public boolean isBuiltInUnit() {
			return this.type == 1;
		}
		
		public CTBuiltInUnitModel getBuiltInUnit() {
			if (this.type != 1) throw new ClassCastException();
			return (CTBuiltInUnitModel) value;
		}
	}
	private final CustUnitOrBuiltInUnitModel custUnitOrBuiltInUnit;
	private final CTDispUnitsLblModel dispUnitsLbl;
	private final CTExtensionListModel extLst;
	
	public CTDispUnitsModel(CustUnitOrBuiltInUnitModel custUnitOrBuiltInUnit, CTDispUnitsLblModel dispUnitsLbl, CTExtensionListModel extLst) {
		this.custUnitOrBuiltInUnit = custUnitOrBuiltInUnit;
		this.dispUnitsLbl = dispUnitsLbl;
		this.extLst = extLst;
	}
	
	public CustUnitOrBuiltInUnitModel getCustUnitOrBuiltInUnit() {
		return this.custUnitOrBuiltInUnit;
	}
	public CTDispUnitsLblModel getDispUnitsLbl() {
		return this.dispUnitsLbl;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
