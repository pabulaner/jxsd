# JXsd

JXsd is a code generator for xsd files.
It allows to generate java classes for the defined schema in xsd files.

# Usage

See the Main.java file for an example.

# Packages

### xsd

The xsd package parses the raw xsd files into a format that can be used to extract names, properties, etc. of the schema.

### java

The java package makes use of the output of the xsd package and converts it into a format close to java classes.
It outputs classes representing java classes, interfaces and enums. 

### spec

The spec package makes use of the output of the java package and converts it into a spec.
A spec is a representation of a java class, interface or enum that can be written into a java file.
This java file is then a valid java class, interface or enum.

### gen

The gen package makes use of the output of the spec package and creates the actual java files.

### transform

The transform package provides the functionality to transform the generated java classes.
This includes changing names of types or adding interfaces to certain classes.

### util

The util package contains some utility classes and functions.