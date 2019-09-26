/*
 * Copyright 2010 James Pether Sörling
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *	$Id$
 *  $HeadURL$
*/
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.24 at 11:39:52 PM CET 
//


package com.hack23.cia.model.external.val.landstingvalkrets.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * A factory for creating Object objects.
 */
@XmlRegistry
public class ObjectFactory {

    /** The Constant _Root_QNAME. */
    private static final QName _Root_QNAME = new QName("http://landstingvalkrets.val.external.model.cia.hack23.com/impl", "root");

    /**
	 * Instantiates a new object factory.
	 */
    public ObjectFactory() {
    }

    /**
	 * Creates a new Object object.
	 *
	 * @return the sweden county electoral region container
	 */
    public SwedenCountyElectoralRegionContainer createSwedenCountyElectoralRegionContainer() {
        return new SwedenCountyElectoralRegionContainer();
    }

    /**
	 * Creates a new Object object.
	 *
	 * @return the sweden county electoral region
	 */
    public SwedenCountyElectoralRegion createSwedenCountyElectoralRegion() {
        return new SwedenCountyElectoralRegion();
    }

    /**
	 * Creates a new Object object.
	 *
	 * @return the sweden county electoral area
	 */
    public SwedenCountyElectoralArea createSwedenCountyElectoralArea() {
        return new SwedenCountyElectoralArea();
    }

    /**
	 * Creates a new Object object.
	 *
	 * @param value the value
	 * @return the JAXB element
	 */
    @XmlElementDecl(namespace = "http://landstingvalkrets.val.external.model.cia.hack23.com/impl", name = "root")
    public JAXBElement<SwedenCountyElectoralRegionContainer> createRoot(final SwedenCountyElectoralRegionContainer value) {
        return new JAXBElement<>(_Root_QNAME, SwedenCountyElectoralRegionContainer.class, null, value);
    }

}