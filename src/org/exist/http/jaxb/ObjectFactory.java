//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.01 at 08:56:54 PM GMT 
//


package org.exist.http.jaxb;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.exist.http.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.exist.http.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link Query }
     * 
     */
    public Query createQuery() {
        return new Query();
    }

    /**
     * Create an instance of {@link Sequence }
     * 
     */
    public Sequence createSequence() {
        return new Sequence();
    }

    /**
     * Create an instance of {@link Query.Properties }
     * 
     */
    public Query.Properties createQueryProperties() {
        return new Query.Properties();
    }

    /**
     * Create an instance of {@link Query.Variables }
     * 
     */
    public Query.Variables createQueryVariables() {
        return new Query.Variables();
    }

    /**
     * Create an instance of {@link Query.Variables.Variable }
     * 
     */
    public Query.Variables.Variable createQueryVariablesVariable() {
        return new Query.Variables.Variable();
    }

    /**
     * Create an instance of {@link Collection }
     * 
     */
    public Collection createCollection() {
        return new Collection();
    }

    /**
     * Create an instance of {@link Result.Value }
     * 
     */
    public Result.Value createResultValue() {
        return new Result.Value();
    }

    /**
     * Create an instance of {@link Sequence.Value }
     * 
     */
    public Sequence.Value createSequenceValue() {
        return new Sequence.Value();
    }

    /**
     * Create an instance of {@link Query.Properties.Property }
     * 
     */
    public Query.Properties.Property createQueryPropertiesProperty() {
        return new Query.Properties.Property();
    }

    /**
     * Create an instance of {@link Query.Variables.Variable.Qname }
     * 
     */
    public Query.Variables.Variable.Qname createQueryVariablesVariableQname() {
        return new Query.Variables.Variable.Qname();
    }

}
