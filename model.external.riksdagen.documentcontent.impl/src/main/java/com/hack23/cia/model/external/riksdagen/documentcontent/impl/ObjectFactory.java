//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.24 at 11:40:05 PM CET 
//


package com.hack23.cia.model.external.riksdagen.documentcontent.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hack23.cia.model.external.riksdagen.documentcontent.impl package. 
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

    private final static QName _Documentcontentdata_QNAME = new QName("http://documentcontent.riksdagen.external.model.cia.hack23.com/impl", "documentcontentdata");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hack23.cia.model.external.riksdagen.documentcontent.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DocumentContentData }
     * 
     */
    public DocumentContentData createDocumentContentData() {
        return new DocumentContentData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentContentData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://documentcontent.riksdagen.external.model.cia.hack23.com/impl", name = "documentcontentdata")
    public JAXBElement<DocumentContentData> createDocumentcontentdata(DocumentContentData value) {
        return new JAXBElement<DocumentContentData>(_Documentcontentdata_QNAME, DocumentContentData.class, null, value);
    }

}