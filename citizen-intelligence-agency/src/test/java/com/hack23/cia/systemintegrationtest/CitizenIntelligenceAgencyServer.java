/*
 * Copyright 2014 James Pether Sörling
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

package com.hack23.cia.systemintegrationtest;

import java.lang.management.ManagementFactory;
import java.util.logging.Level;
import java.util.logging.LogManager;

import org.eclipse.jetty.jmx.MBeanContainer;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.webapp.WebAppContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.bridge.SLF4JBridgeHandler;

/**
 * The Class CitizenIntelligenceAgencyServer.
 */
public class CitizenIntelligenceAgencyServer {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory
			.getLogger(CitizenIntelligenceAgencyServer.class);

	/** The Constant PORT. */
	public static final int PORT = 8080;

	/** The Constant ACCESS_URL. */
	public static final String ACCESS_URL = "http://localhost:" + PORT + "/";

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(final String[] args) {

		final CitizenIntelligenceAgencyServer testServer = new CitizenIntelligenceAgencyServer();
		testServer.startServer();
	}

	/**
	 * Start server.
	 */
	public void startServer() {
		try {
			initLogger();
			init();
			start();
			while (!server.isStarted()) {
				Thread.sleep(50);
			}
		} catch (final Exception e) {
			LOGGER.error("Application Exception", e);
		}
	}

	/**
	 * Inits the logger.
	 */
	private static void initLogger() {
		System.setProperty("logback.configurationFile",
				"src/main/resources/logback.xml");
		System.setProperty("slf4j", "true");
		System.setProperty("org.eclipse.jetty.util.log.class",
				"org.eclipse.jetty.util.log.Slf4jLog");

		LogManager.getLogManager().reset();
		SLF4JBridgeHandler.install();
		java.util.logging.Logger.getLogger("global").setLevel(Level.FINEST);
	}

	/**
	 * Instantiates a new citizen intelligence agency server.
	 */
	public CitizenIntelligenceAgencyServer() {
		super();
		initLogger();
	}

	/** The initialised. */
	private boolean initialised = false;

	/** The server. */
	private Server server;

	/**
	 * Inits the.
	 *
	 * @throws Exception
	 *             the exception
	 */
	public final void init() throws Exception {
		initialised = true;
		server = new Server();
		// Setup JMX
		final MBeanContainer mbContainer = new MBeanContainer(
				ManagementFactory.getPlatformMBeanServer());
		server.addBean(mbContainer);

		// Enable parsing of jndi-related parts of web.xml and jetty-env.xml
		final org.eclipse.jetty.webapp.Configuration.ClassList classlist = org.eclipse.jetty.webapp.Configuration.ClassList
				.setServerDefault(server);
		classlist.addAfter("org.eclipse.jetty.webapp.FragmentConfiguration",
				"org.eclipse.jetty.plus.webapp.EnvConfiguration",
				"org.eclipse.jetty.plus.webapp.PlusConfiguration");
		classlist.addBefore(
				"org.eclipse.jetty.webapp.JettyWebXmlConfiguration",
				"org.eclipse.jetty.annotations.AnnotationConfiguration");

		final ServerConnector connector = new ServerConnector(server);
		connector.setPort(PORT);
		server.setConnectors(new ServerConnector[] { connector });
		final WebAppContext handler = new WebAppContext("src/main/webapp", "/");
		handler.setExtraClasspath("target/classes");
		handler.setParentLoaderPriority(true);
		handler.setConfigurationDiscovered(true);
		handler.setClassLoader(Thread.currentThread().getContextClassLoader());
		final HandlerList handlers = new HandlerList();

		handlers.setHandlers(new Handler[] { handler, new DefaultHandler() });
		server.setHandler(handlers);

	}

	/**
	 * Start.
	 *
	 * @throws Exception
	 *             the exception
	 */
	public final void start() throws Exception {
		if (!initialised) {
			LOGGER.info("Exiting init not called before start"); //$NON-NLS-1$
			System.exit(-1);
		}

		try {
			server.start();
			// server.join();
		} catch (final Exception e) {
			LOGGER.error("Problem starting server", e);
		}
	}

	/**
	 * Stop.
	 *
	 * @throws Exception
	 *             the exception
	 */
	public final void stop() throws Exception {
		Thread.sleep(8000);
		server.stop();
		while (!server.isStopped()) {
			Thread.sleep(50);
		}

	}
}
