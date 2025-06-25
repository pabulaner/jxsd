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
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTLightRigModel.*;
import test.officeDocument.relationships.*;

public class CTLightRigModel
{
	
	private final STLightRigTypeModel rig;
	private final STLightRigDirectionModel dir;
	private final CTSphereCoordsModel rot;
	
	public CTLightRigModel(STLightRigTypeModel rig, STLightRigDirectionModel dir, CTSphereCoordsModel rot) {
		this.rig = rig;
		this.dir = dir;
		this.rot = rot;
	}
	
	public STLightRigTypeModel getRig() {
		return this.rig;
	}
	public STLightRigDirectionModel getDir() {
		return this.dir;
	}
	public CTSphereCoordsModel getRot() {
		return this.rot;
	}
}
