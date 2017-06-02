// Generated from E:/Home/Workspace/IntelliJ/JSLite/src/main/resources\JSLite.g4 by ANTLR 4.7
package com.jslite.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSLiteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, IntegerLiteral=15, DecimalLiteral=16, 
		VAR=17, DEF=18, RETURN=19, BREAK=20, IF=21, ELSE=22, WHILE=23, TRUE=24, 
		FALSE=25, CONTINUE=26, LAMBDA=27, ASSIGN=28, COMMA=29, SEMICOMMA=30, LP=31, 
		RP=32, LBRACE=33, RBRACE=34, LBRACKET=35, RBRACKET=36, WS=37, Identifier=38, 
		StringLiteral=39;
	public static final int
		RULE_expression = 0, RULE_lambdaExpression = 1, RULE_start = 2, RULE_statement = 3, 
		RULE_variableDefinitionsStatement = 4, RULE_variableDefinition = 5, RULE_assignStatement = 6, 
		RULE_functionDefinitionStatement = 7, RULE_functionBody = 8, RULE_argumentList = 9, 
		RULE_emptyStatement = 10, RULE_returnStatement = 11, RULE_breakStatement = 12, 
		RULE_continueStatement = 13, RULE_callStatement = 14, RULE_call = 15, 
		RULE_callArgumentList = 16, RULE_blockStatement = 17, RULE_ifStatement = 18, 
		RULE_whileStatement = 19;
	public static final String[] ruleNames = {
		"expression", "lambdaExpression", "start", "statement", "variableDefinitionsStatement", 
		"variableDefinition", "assignStatement", "functionDefinitionStatement", 
		"functionBody", "argumentList", "emptyStatement", "returnStatement", "breakStatement", 
		"continueStatement", "callStatement", "call", "callArgumentList", "blockStatement", 
		"ifStatement", "whileStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!'", "'*'", "'/'", "'%'", "'+'", "'-'", "'<'", "'>'", "'<='", 
		"'>='", "'=='", "'!='", "'&&'", "'||'", null, null, "'var'", "'def'", 
		"'return'", "'break'", "'if'", "'else'", "'while'", "'true'", "'false'", 
		"'continue'", "'lambda'", "'='", "','", "';'", "'('", "')'", "'{'", "'}'", 
		"'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "IntegerLiteral", "DecimalLiteral", "VAR", "DEF", "RETURN", 
		"BREAK", "IF", "ELSE", "WHILE", "TRUE", "FALSE", "CONTINUE", "LAMBDA", 
		"ASSIGN", "COMMA", "SEMICOMMA", "LP", "RP", "LBRACE", "RBRACE", "LBRACKET", 
		"RBRACKET", "WS", "Identifier", "StringLiteral"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JSLite.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JSLiteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralExpContext extends ExpressionContext {
		public TerminalNode DecimalLiteral() { return getToken(JSLiteParser.DecimalLiteral, 0); }
		public DecimalLiteralExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterDecimalLiteralExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitDecimalLiteralExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitDecimalLiteralExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralExpContext extends ExpressionContext {
		public TerminalNode StringLiteral() { return getToken(JSLiteParser.StringLiteral, 0); }
		public StringLiteralExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterStringLiteralExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitStringLiteralExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitStringLiteralExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesesExpContext extends ExpressionContext {
		public TerminalNode LP() { return getToken(JSLiteParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(JSLiteParser.RP, 0); }
		public ParenthesesExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterParenthesesExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitParenthesesExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitParenthesesExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class L1BinaryExpContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public L1BinaryExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterL1BinaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitL1BinaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitL1BinaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallExpContext extends ExpressionContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public CallExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterCallExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitCallExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitCallExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class L4BinaryExpContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public L4BinaryExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterL4BinaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitL4BinaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitL4BinaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class L2BinaryExpContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public L2BinaryExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterL2BinaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitL2BinaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitL2BinaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralExpContext extends ExpressionContext {
		public TerminalNode IntegerLiteral() { return getToken(JSLiteParser.IntegerLiteral, 0); }
		public IntegerLiteralExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterIntegerLiteralExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitIntegerLiteralExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitIntegerLiteralExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaExprContext extends ExpressionContext {
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public LambdaExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterLambdaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitLambdaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitLambdaExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class L3BinaryExpContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public L3BinaryExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterL3BinaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitL3BinaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitL3BinaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierLiteralExpContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(JSLiteParser.Identifier, 0); }
		public IdentifierLiteralExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterIdentifierLiteralExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitIdentifierLiteralExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitIdentifierLiteralExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ExpressionContext {
		public TerminalNode TRUE() { return getToken(JSLiteParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JSLiteParser.FALSE, 0); }
		public BooleanLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesesExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(41);
				match(LP);
				setState(42);
				expression(0);
				setState(43);
				match(RP);
				}
				break;
			case 2:
				{
				_localctx = new IntegerLiteralExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				match(IntegerLiteral);
				}
				break;
			case 3:
				{
				_localctx = new DecimalLiteralExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				match(DecimalLiteral);
				}
				break;
			case 4:
				{
				_localctx = new IdentifierLiteralExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				match(Identifier);
				}
				break;
			case 5:
				{
				_localctx = new StringLiteralExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				match(StringLiteral);
				}
				break;
			case 6:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 7:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				match(T__0);
				setState(51);
				expression(7);
				}
				break;
			case 8:
				{
				_localctx = new CallExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				call();
				}
				break;
			case 9:
				{
				_localctx = new LambdaExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				lambdaExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(68);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new L1BinaryExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(56);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(57);
						((L1BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
							((L1BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(58);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new L2BinaryExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(59);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(60);
						((L2BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5) ) {
							((L2BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(61);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new L3BinaryExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(62);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(63);
						((L3BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
							((L3BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(64);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new L4BinaryExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(65);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(66);
						((L4BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==T__13) ) {
							((L4BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(67);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public TerminalNode LAMBDA() { return getToken(JSLiteParser.LAMBDA, 0); }
		public TerminalNode LP() { return getToken(JSLiteParser.LP, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode RP() { return getToken(JSLiteParser.RP, 0); }
		public TerminalNode LBRACE() { return getToken(JSLiteParser.LBRACE, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(JSLiteParser.RBRACE, 0); }
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(LAMBDA);
			setState(74);
			match(LP);
			setState(75);
			argumentList();
			setState(76);
			match(RP);
			setState(77);
			match(LBRACE);
			setState(78);
			functionBody();
			setState(79);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << DEF) | (1L << RETURN) | (1L << BREAK) | (1L << IF) | (1L << WHILE) | (1L << CONTINUE) | (1L << SEMICOMMA) | (1L << LBRACE) | (1L << Identifier))) != 0)) {
				{
				{
				setState(81);
				statement();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public VariableDefinitionsStatementContext variableDefinitionsStatement() {
			return getRuleContext(VariableDefinitionsStatementContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public FunctionDefinitionStatementContext functionDefinitionStatement() {
			return getRuleContext(FunctionDefinitionStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public CallStatementContext callStatement() {
			return getRuleContext(CallStatementContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				variableDefinitionsStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				assignStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				functionDefinitionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				emptyStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				returnStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				callStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(93);
				blockStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(94);
				ifStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(95);
				whileStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(96);
				breakStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(97);
				continueStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDefinitionsStatementContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(JSLiteParser.VAR, 0); }
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public TerminalNode SEMICOMMA() { return getToken(JSLiteParser.SEMICOMMA, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JSLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JSLiteParser.COMMA, i);
		}
		public VariableDefinitionsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinitionsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterVariableDefinitionsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitVariableDefinitionsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitVariableDefinitionsStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefinitionsStatementContext variableDefinitionsStatement() throws RecognitionException {
		VariableDefinitionsStatementContext _localctx = new VariableDefinitionsStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableDefinitionsStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(VAR);
			setState(101);
			variableDefinition();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(102);
				match(COMMA);
				setState(103);
				variableDefinition();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(SEMICOMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDefinitionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JSLiteParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(JSLiteParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterVariableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitVariableDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitVariableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(Identifier);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(112);
				match(ASSIGN);
				setState(113);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JSLiteParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(JSLiteParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOMMA() { return getToken(JSLiteParser.SEMICOMMA, 0); }
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(Identifier);
			setState(117);
			match(ASSIGN);
			setState(118);
			expression(0);
			setState(119);
			match(SEMICOMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionStatementContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(JSLiteParser.DEF, 0); }
		public TerminalNode Identifier() { return getToken(JSLiteParser.Identifier, 0); }
		public TerminalNode LP() { return getToken(JSLiteParser.LP, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode RP() { return getToken(JSLiteParser.RP, 0); }
		public TerminalNode LBRACE() { return getToken(JSLiteParser.LBRACE, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(JSLiteParser.RBRACE, 0); }
		public FunctionDefinitionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinitionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterFunctionDefinitionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitFunctionDefinitionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitFunctionDefinitionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionStatementContext functionDefinitionStatement() throws RecognitionException {
		FunctionDefinitionStatementContext _localctx = new FunctionDefinitionStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionDefinitionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(DEF);
			setState(122);
			match(Identifier);
			setState(123);
			match(LP);
			setState(124);
			argumentList();
			setState(125);
			match(RP);
			setState(126);
			match(LBRACE);
			setState(127);
			functionBody();
			setState(128);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << DEF) | (1L << RETURN) | (1L << BREAK) | (1L << IF) | (1L << WHILE) | (1L << CONTINUE) | (1L << SEMICOMMA) | (1L << LBRACE) | (1L << Identifier))) != 0)) {
				{
				{
				setState(130);
				statement();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JSLiteParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JSLiteParser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JSLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JSLiteParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_argumentList);
		int _la;
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(Identifier);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(137);
					match(COMMA);
					setState(138);
					match(Identifier);
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RP:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SEMICOMMA() { return getToken(JSLiteParser.SEMICOMMA, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(SEMICOMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JSLiteParser.RETURN, 0); }
		public TerminalNode SEMICOMMA() { return getToken(JSLiteParser.SEMICOMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(RETURN);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IntegerLiteral) | (1L << DecimalLiteral) | (1L << TRUE) | (1L << FALSE) | (1L << LAMBDA) | (1L << LP) | (1L << Identifier) | (1L << StringLiteral))) != 0)) {
				{
				setState(150);
				expression(0);
				}
			}

			setState(153);
			match(SEMICOMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(JSLiteParser.BREAK, 0); }
		public TerminalNode SEMICOMMA() { return getToken(JSLiteParser.SEMICOMMA, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(BREAK);
			setState(156);
			match(SEMICOMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(JSLiteParser.CONTINUE, 0); }
		public TerminalNode SEMICOMMA() { return getToken(JSLiteParser.SEMICOMMA, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(CONTINUE);
			setState(159);
			match(SEMICOMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallStatementContext extends ParserRuleContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode SEMICOMMA() { return getToken(JSLiteParser.SEMICOMMA, 0); }
		public CallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallStatementContext callStatement() throws RecognitionException {
		CallStatementContext _localctx = new CallStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_callStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			call();
			setState(162);
			match(SEMICOMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JSLiteParser.Identifier, 0); }
		public TerminalNode LP() { return getToken(JSLiteParser.LP, 0); }
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public TerminalNode RP() { return getToken(JSLiteParser.RP, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(Identifier);
			setState(165);
			match(LP);
			setState(166);
			callArgumentList();
			setState(167);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JSLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JSLiteParser.COMMA, i);
		}
		public CallArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterCallArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitCallArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitCallArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgumentListContext callArgumentList() throws RecognitionException {
		CallArgumentListContext _localctx = new CallArgumentListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_callArgumentList);
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RP:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__0:
			case IntegerLiteral:
			case DecimalLiteral:
			case TRUE:
			case FALSE:
			case LAMBDA:
			case LP:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				expression(0);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(171);
					match(COMMA);
					setState(172);
					expression(0);
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JSLiteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JSLiteParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(LBRACE);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << DEF) | (1L << RETURN) | (1L << BREAK) | (1L << IF) | (1L << WHILE) | (1L << CONTINUE) | (1L << SEMICOMMA) | (1L << LBRACE) | (1L << Identifier))) != 0)) {
				{
				{
				setState(181);
				statement();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JSLiteParser.IF, 0); }
		public TerminalNode LP() { return getToken(JSLiteParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(JSLiteParser.RP, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JSLiteParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(IF);
			setState(190);
			match(LP);
			setState(191);
			expression(0);
			setState(192);
			match(RP);
			setState(193);
			statement();
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(194);
				match(ELSE);
				setState(195);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JSLiteParser.WHILE, 0); }
		public TerminalNode LP() { return getToken(JSLiteParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(JSLiteParser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSLiteListener ) ((JSLiteListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSLiteVisitor ) return ((JSLiteVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(WHILE);
			setState(199);
			match(LP);
			setState(200);
			expression(0);
			setState(201);
			match(RP);
			setState(202);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00cf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\5\29\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\7\2G\n\2\f\2\16\2J\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\7\4U"+
		"\n\4\f\4\16\4X\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5e\n"+
		"\5\3\6\3\6\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6\3\6\3\6\3\7\3\7\3\7\5\7u\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\7\n\u0086"+
		"\n\n\f\n\16\n\u0089\13\n\3\13\3\13\3\13\7\13\u008e\n\13\f\13\16\13\u0091"+
		"\13\13\3\13\5\13\u0094\n\13\3\f\3\f\3\r\3\r\5\r\u009a\n\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\7\22\u00b0\n\22\f\22\16\22\u00b3\13\22\5\22\u00b5\n\22"+
		"\3\23\3\23\7\23\u00b9\n\23\f\23\16\23\u00bc\13\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u00c7\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\2\3\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\7\3\2\32"+
		"\33\3\2\4\6\3\2\7\b\3\2\t\16\3\2\17\20\2\u00db\28\3\2\2\2\4K\3\2\2\2\6"+
		"V\3\2\2\2\bd\3\2\2\2\nf\3\2\2\2\fq\3\2\2\2\16v\3\2\2\2\20{\3\2\2\2\22"+
		"\u0087\3\2\2\2\24\u0093\3\2\2\2\26\u0095\3\2\2\2\30\u0097\3\2\2\2\32\u009d"+
		"\3\2\2\2\34\u00a0\3\2\2\2\36\u00a3\3\2\2\2 \u00a6\3\2\2\2\"\u00b4\3\2"+
		"\2\2$\u00b6\3\2\2\2&\u00bf\3\2\2\2(\u00c8\3\2\2\2*+\b\2\1\2+,\7!\2\2,"+
		"-\5\2\2\2-.\7\"\2\2.9\3\2\2\2/9\7\21\2\2\609\7\22\2\2\619\7(\2\2\629\7"+
		")\2\2\639\t\2\2\2\64\65\7\3\2\2\659\5\2\2\t\669\5 \21\2\679\5\4\3\28*"+
		"\3\2\2\28/\3\2\2\28\60\3\2\2\28\61\3\2\2\28\62\3\2\2\28\63\3\2\2\28\64"+
		"\3\2\2\28\66\3\2\2\28\67\3\2\2\29H\3\2\2\2:;\f\b\2\2;<\t\3\2\2<G\5\2\2"+
		"\t=>\f\7\2\2>?\t\4\2\2?G\5\2\2\b@A\f\6\2\2AB\t\5\2\2BG\5\2\2\7CD\f\5\2"+
		"\2DE\t\6\2\2EG\5\2\2\6F:\3\2\2\2F=\3\2\2\2F@\3\2\2\2FC\3\2\2\2GJ\3\2\2"+
		"\2HF\3\2\2\2HI\3\2\2\2I\3\3\2\2\2JH\3\2\2\2KL\7\35\2\2LM\7!\2\2MN\5\24"+
		"\13\2NO\7\"\2\2OP\7#\2\2PQ\5\22\n\2QR\7$\2\2R\5\3\2\2\2SU\5\b\5\2TS\3"+
		"\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\7\3\2\2\2XV\3\2\2\2Ye\5\n\6\2Ze"+
		"\5\16\b\2[e\5\20\t\2\\e\5\26\f\2]e\5\30\r\2^e\5\36\20\2_e\5$\23\2`e\5"+
		"&\24\2ae\5(\25\2be\5\32\16\2ce\5\34\17\2dY\3\2\2\2dZ\3\2\2\2d[\3\2\2\2"+
		"d\\\3\2\2\2d]\3\2\2\2d^\3\2\2\2d_\3\2\2\2d`\3\2\2\2da\3\2\2\2db\3\2\2"+
		"\2dc\3\2\2\2e\t\3\2\2\2fg\7\23\2\2gl\5\f\7\2hi\7\37\2\2ik\5\f\7\2jh\3"+
		"\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7 \2\2p\13"+
		"\3\2\2\2qt\7(\2\2rs\7\36\2\2su\5\2\2\2tr\3\2\2\2tu\3\2\2\2u\r\3\2\2\2"+
		"vw\7(\2\2wx\7\36\2\2xy\5\2\2\2yz\7 \2\2z\17\3\2\2\2{|\7\24\2\2|}\7(\2"+
		"\2}~\7!\2\2~\177\5\24\13\2\177\u0080\7\"\2\2\u0080\u0081\7#\2\2\u0081"+
		"\u0082\5\22\n\2\u0082\u0083\7$\2\2\u0083\21\3\2\2\2\u0084\u0086\5\b\5"+
		"\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\23\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008f\7(\2\2\u008b"+
		"\u008c\7\37\2\2\u008c\u008e\7(\2\2\u008d\u008b\3\2\2\2\u008e\u0091\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0094\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u008a\3\2\2\2\u0093\u0092\3\2"+
		"\2\2\u0094\25\3\2\2\2\u0095\u0096\7 \2\2\u0096\27\3\2\2\2\u0097\u0099"+
		"\7\25\2\2\u0098\u009a\5\2\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2"+
		"\u009a\u009b\3\2\2\2\u009b\u009c\7 \2\2\u009c\31\3\2\2\2\u009d\u009e\7"+
		"\26\2\2\u009e\u009f\7 \2\2\u009f\33\3\2\2\2\u00a0\u00a1\7\34\2\2\u00a1"+
		"\u00a2\7 \2\2\u00a2\35\3\2\2\2\u00a3\u00a4\5 \21\2\u00a4\u00a5\7 \2\2"+
		"\u00a5\37\3\2\2\2\u00a6\u00a7\7(\2\2\u00a7\u00a8\7!\2\2\u00a8\u00a9\5"+
		"\"\22\2\u00a9\u00aa\7\"\2\2\u00aa!\3\2\2\2\u00ab\u00b5\3\2\2\2\u00ac\u00b1"+
		"\5\2\2\2\u00ad\u00ae\7\37\2\2\u00ae\u00b0\5\2\2\2\u00af\u00ad\3\2\2\2"+
		"\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b5"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00ab\3\2\2\2\u00b4\u00ac\3\2\2\2\u00b5"+
		"#\3\2\2\2\u00b6\u00ba\7#\2\2\u00b7\u00b9\5\b\5\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7$\2\2\u00be%\3\2\2\2\u00bf\u00c0"+
		"\7\27\2\2\u00c0\u00c1\7!\2\2\u00c1\u00c2\5\2\2\2\u00c2\u00c3\7\"\2\2\u00c3"+
		"\u00c6\5\b\5\2\u00c4\u00c5\7\30\2\2\u00c5\u00c7\5\b\5\2\u00c6\u00c4\3"+
		"\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\'\3\2\2\2\u00c8\u00c9\7\31\2\2\u00c9"+
		"\u00ca\7!\2\2\u00ca\u00cb\5\2\2\2\u00cb\u00cc\7\"\2\2\u00cc\u00cd\5\b"+
		"\5\2\u00cd)\3\2\2\2\218FHVdlt\u0087\u008f\u0093\u0099\u00b1\u00b4\u00ba"+
		"\u00c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}