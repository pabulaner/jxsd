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
import test.dml.CTNonVisualPicturePropertiesModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTNonVisualPicturePropertiesModel
{
	
	private final BooleanModel preferRelativeResize;
	private final CTPictureLockingModel picLocks;
	private final CTOfficeArtExtensionListModel extLst;
	
	public CTNonVisualPicturePropertiesModel(BooleanModel preferRelativeResize, CTPictureLockingModel picLocks, CTOfficeArtExtensionListModel extLst) {
		this.preferRelativeResize = preferRelativeResize;
		this.picLocks = picLocks;
		this.extLst = extLst;
	}
	
	public BooleanModel getPreferRelativeResize() {
		return this.preferRelativeResize;
	}
	public CTPictureLockingModel getPicLocks() {
		return this.picLocks;
	}
	public CTOfficeArtExtensionListModel getExtLst() {
		return this.extLst;
	}
}
