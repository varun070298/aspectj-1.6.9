/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.aspectj.org.eclipse.jdt.internal.core.search.matching;

import org.aspectj.org.eclipse.jdt.internal.compiler.problem.ProblemReporter;

class ImportMatchLocatorParser extends MatchLocatorParser {

protected ImportMatchLocatorParser(ProblemReporter problemReporter, MatchLocator locator) {
	super(problemReporter, locator);
}
protected void consumeStaticImportOnDemandDeclarationName() {
	super.consumeStaticImportOnDemandDeclarationName();
	this.patternLocator.match(this.astStack[this.astPtr], this.nodeSet);
}
protected void consumeSingleStaticImportDeclarationName() {
	super.consumeSingleStaticImportDeclarationName();
	this.patternLocator.match(this.astStack[this.astPtr], this.nodeSet);
}
protected void consumeSingleTypeImportDeclarationName() {
	super.consumeSingleTypeImportDeclarationName();
	this.patternLocator.match(this.astStack[this.astPtr], this.nodeSet);
}
protected void consumeTypeImportOnDemandDeclarationName() {
	super.consumeTypeImportOnDemandDeclarationName();
	this.patternLocator.match(this.astStack[this.astPtr], this.nodeSet);
}

}
