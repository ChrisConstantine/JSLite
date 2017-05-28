package com.jslite.runtime;

import com.jslite.$;
import com.jslite.ast.Node;
import com.jslite.ast.Statement;
import com.jslite.ast.StatementList;
import com.jslite.parser.JSLiteLexer;
import com.jslite.parser.JSLiteParser;
import com.jslite.parser.JSLiteVisitorImpl;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class Boot
{
	public static void start(String filePath)
	{
		String code= $.readStringFromFile(filePath);

		ANTLRInputStream inputStream=new ANTLRInputStream(code);

		JSLiteLexer lexer=new JSLiteLexer(inputStream);

		CommonTokenStream commonTokenStream=new CommonTokenStream(lexer);

		JSLiteParser parser=new JSLiteParser(commonTokenStream);

		ParseTree parseTree=parser.start();

		JSLiteVisitorImpl visitor=new JSLiteVisitorImpl();

		StatementList statementList= (StatementList) visitor.visit(parseTree);

		Statement[] statements = statementList.getStatements();

		ScopeNode scopeNode=SystemEnvironment.getSystemEnvironment();

		for (int i = 0; i < statements.length; i++)
		{
			statements[i].execute(scopeNode);
		}

		System.out.println();
		System.out.println("Done");
	}
}
