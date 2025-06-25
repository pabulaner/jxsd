package test.dml.chart;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.chart.CTDispUnitsModel.CustUnitOrBuiltInUnitModel.*;
import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.chart.CTDispUnitsModel.*;
import test.officeDocument.relationships.*;

public class CTDispUnitsModel
{
	
	public static class CustUnitOrBuiltInUnitModel
	{
		
		private final CTDoubleModel custUnit;
		private final CTBuiltInUnitModel builtInUnit;
		
		public CustUnitOrBuiltInUnitModel(CTDoubleModel custUnit, CTBuiltInUnitModel builtInUnit) {
			this.custUnit = custUnit;
			this.builtInUnit = builtInUnit;
		}
		
		public CTDoubleModel getCustUnit() {
			return this.custUnit;
		}
		public CTBuiltInUnitModel getBuiltInUnit() {
			return this.builtInUnit;
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
