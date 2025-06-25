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
import test.dml.CTObjectStyleDefaultsModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTObjectStyleDefaultsModel
{
	
	private final CTDefaultShapeDefinitionModel spDef;
	private final CTDefaultShapeDefinitionModel lnDef;
	private final CTDefaultShapeDefinitionModel txDef;
	private final CTOfficeArtExtensionListModel extLst;
	
	public CTObjectStyleDefaultsModel(CTDefaultShapeDefinitionModel spDef, CTDefaultShapeDefinitionModel lnDef, CTDefaultShapeDefinitionModel txDef, CTOfficeArtExtensionListModel extLst) {
		this.spDef = spDef;
		this.lnDef = lnDef;
		this.txDef = txDef;
		this.extLst = extLst;
	}
	
	public CTDefaultShapeDefinitionModel getSpDef() {
		return this.spDef;
	}
	public CTDefaultShapeDefinitionModel getLnDef() {
		return this.lnDef;
	}
	public CTDefaultShapeDefinitionModel getTxDef() {
		return this.txDef;
	}
	public CTOfficeArtExtensionListModel getExtLst() {
		return this.extLst;
	}
}
