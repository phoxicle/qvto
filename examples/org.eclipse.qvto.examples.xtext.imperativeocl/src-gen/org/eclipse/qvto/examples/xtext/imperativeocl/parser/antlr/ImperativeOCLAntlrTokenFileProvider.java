/*
* generated by Xtext
*/
package org.eclipse.qvto.examples.xtext.imperativeocl.parser.antlr;

import java.io.InputStream;

import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ImperativeOCLAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.tokens");
	}
}