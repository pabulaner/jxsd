package test.dml;

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
import test.dml.CTNonVisualConnectorPropertiesModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTNonVisualConnectorPropertiesModel
{
	
	private final CTConnectorLockingModel cxnSpLocks;
	private final CTConnectionModel stCxn;
	private final CTConnectionModel endCxn;
	private final CTOfficeArtExtensionListModel extLst;
	
	public CTNonVisualConnectorPropertiesModel(CTConnectorLockingModel cxnSpLocks, CTConnectionModel stCxn, CTConnectionModel endCxn, CTOfficeArtExtensionListModel extLst) {
		this.cxnSpLocks = cxnSpLocks;
		this.stCxn = stCxn;
		this.endCxn = endCxn;
		this.extLst = extLst;
	}
	
	public CTConnectorLockingModel getCxnSpLocks() {
		return this.cxnSpLocks;
	}
	public CTConnectionModel getStCxn() {
		return this.stCxn;
	}
	public CTConnectionModel getEndCxn() {
		return this.endCxn;
	}
	public CTOfficeArtExtensionListModel getExtLst() {
		return this.extLst;
	}
}
