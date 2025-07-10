# JXsd

Example usage:

```
JXsdParser.parse(new JXsdParser.Config()
    .addPkgConverter("drawingml", "dml")
    .setBasePkg("com.example.models")
    .setXsdFile(Main.class.getResource("/xsd/dml/dml-chart.xsd"))
    .addTransformFile(Main.class.getResource("/transforms/transform.xml"))
    .setOutputPath(Path.of("path/to/dest")));
```

#### addPkgConverter

Used to rename packages.

#### setBasePkg

Used to set the base package.

#### setXsdFile

Used to set the xsd file from which the classes should be generated. 

#### addTransformFile

Used to add a transformation file which can be used to rename or replace names and types or to add interfaces to certain classes.

#### setOutputPath

Used to set the output path of all generated files.

